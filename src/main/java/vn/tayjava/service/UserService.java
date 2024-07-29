package vn.tayjava.service;

import vn.tayjava.dto.request.UserRequestDTO;
import vn.tayjava.dto.response.UserDetailResponse;

import java.util.List;

public interface UserService {
    long saveUser(UserRequestDTO request);
    void updateUser(long userId, UserRequestDTO request);
    void deleteUser(long userId);
    void changeStatus(long userId, UserRequestDTO request);

    UserDetailResponse getUser(long userId);

    List<UserDetailResponse> getUserDetail(int page, int pageSize);
}
