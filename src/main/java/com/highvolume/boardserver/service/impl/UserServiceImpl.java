package com.highvolume.boardserver.service.impl;

import com.highvolume.boardserver.dto.UserDTO;
import com.highvolume.boardserver.service.UserService;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * packageName    : com.highvolume.boardserver.service.impl
 * fileName       : UserServiceImpl
 * author         : GAMJA
 * date           : 2024/11/16
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024/11/16        GAMJA       최초 생성
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Override
    public void register(UserDTO userDTO) {

    }

    @Override
    public UserDTO login(String id, String password) {
        return null;
    }

    @Override
    public boolean isDuplicated(String id) {
        return false;
    }

    @Override
    public UserDTO getUserInfo(String userId) {
        return null;
    }

    @Override
    public void updatePassword(String id, String bfPassword, String afPassword) {

    }

    @Override
    public void deleteId(String id, String password) {

    }
}
