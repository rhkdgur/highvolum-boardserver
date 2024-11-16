package com.highvolume.boardserver.controller;

import com.highvolume.boardserver.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * packageName    : com.highvolume.boardserver.controller
 * fileName       : UserController
 * author         : GAMJA
 * date           : 2024/11/16
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024/11/16        GAMJA       최초 생성
 */
@RestController
@RequestMapping("/users")
@Log4j2
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
}
