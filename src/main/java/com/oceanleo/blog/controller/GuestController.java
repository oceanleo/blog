package com.oceanleo.blog.controller;

import com.oceanleo.blog.domain.Guest;
import com.oceanleo.blog.dto.GuestDto;
import com.oceanleo.blog.query.BaseQuery;
import com.oceanleo.blog.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/guest")
public class GuestController {

    @Autowired
    private GuestService guestService;

    @RequestMapping("/list")
    public List<GuestDto> list(BaseQuery query) {
        return guestService.findList(query);
    }

    @RequestMapping("/create")
    public Guest create(Guest guest) {
        return guestService.create(guest);
    }
}
