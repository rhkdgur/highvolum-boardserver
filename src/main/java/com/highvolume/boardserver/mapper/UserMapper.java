package com.highvolume.boardserver.mapper;

import com.highvolume.boardserver.dto.UserDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * packageName    : com.highvolume.boardserver.mapper
 * fileName       : UserMapper
 * author         : GAMJA
 * date           : 2024/11/16
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024/11/16        GAMJA       최초 생성
 */
@Mapper
public interface UserMapper {
    public UserDTO getUser(@Param("id") String id);

    int insertUser(@Param("id") String id, @Param("password") String password, @Param("name") String name, @Param("phone") String phone, @Param("address") String address);

    int updateUser(@Param("id") String id, @Param("password") String password, @Param("name") String name, @Param("phone") String phone, @Param("address") String address);

    int deleteUser(@Param("id") String id);

    public int register(UserDTO userDTO);

    public UserDTO findByIdAndPassword(@Param("id") String id,
                                       @Param("password") String password);

    public UserDTO findByUserIdAndPassword(@Param("userId") String userId,
                                           @Param("password") String password);

    int idCheck(String id);

    public int updatePassword(UserDTO userDTO);

    public int updateAddress(UserDTO userDTO);

}
