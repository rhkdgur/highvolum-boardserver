package com.highvolume.boardserver.service;

import com.highvolume.boardserver.dto.UserDTO;

/**
 * packageName    : com.highvolume.boardserver.service
 * fileName       : UserService
 * author         : GAMJA
 * date           : 2024/11/16
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024/11/16        GAMJA       최초 생성
 */
public interface UserService {

    void register(UserDTO userDTO);


    UserDTO login(String id, String password);

    boolean isDuplicated(String id);

    UserDTO getUserInfo(String userId);

    void updatePassword(String id, String bfPassword, String afPassword);

    void deleteId(String id, String password);
}
