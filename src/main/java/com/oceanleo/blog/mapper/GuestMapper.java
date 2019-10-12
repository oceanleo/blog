package com.oceanleo.blog.mapper;

import com.oceanleo.blog.domain.Guest;
import com.oceanleo.blog.dto.GuestDto;
import com.oceanleo.blog.query.BaseQuery;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface GuestMapper {

    void deleteById(Integer id);

    void insert(Guest guest);

    List<GuestDto> selectList(BaseQuery query);

    List<GuestDto> selectDtoByParentId(String parentId);

    Integer selectSerial(String parentId);
}