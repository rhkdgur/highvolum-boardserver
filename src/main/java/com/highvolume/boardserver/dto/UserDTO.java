package com.highvolume.boardserver.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * packageName    : com.highvolume.boardserver.service
 * fileName       : UserDTO
 * author         : GAMJA
 * date           : 2024/11/16
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024/11/16        GAMJA       최초 생성
 */
@Getter
@Setter
@ToString
public class UserDTO {

    private int id;

    private String userId;

    private String password;

    private String nickName;

    private boolean isAdmin;

    private Date createDate;

    private boolean isWithDraw;

    private UserStatus userStatus;

    public enum UserStatus {
        DEFAULT,ADMIN,DELETED
    }
}
