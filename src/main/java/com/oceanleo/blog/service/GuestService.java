package com.oceanleo.blog.service;

import com.oceanleo.blog.domain.Guest;
import com.oceanleo.blog.dto.GuestDto;
import com.oceanleo.blog.mapper.GuestMapper;
import com.oceanleo.blog.query.BaseQuery;
import com.oceanleo.blog.utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author haiyang.li
 */
@Service
public class GuestService {

    @Autowired
    private GuestMapper guestMapper;

    public List<GuestDto> findList(BaseQuery query) {
        List<GuestDto> guestDtoList = guestMapper.selectList(query);
        return guestDtoList;
    }

    public Guest create(Guest guest) {
        guest.setCreateDate(new Date());
        if (!StringUtils.hasText(guest.getParentId())) {
            guest.setParentId(Guest.ROOT_SERIAL);
        }
        guest.setSerial(guestMapper.selectSerial(guest.getParentId()));
        guest.setAdmin(false);
        guestMapper.insert(guest);
        return guest;
    }
}
