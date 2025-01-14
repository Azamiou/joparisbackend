package com.ecommerce.service.auth;


import com.ecommerce.dto.ChangePasswordDto;
import com.ecommerce.dto.SignupRequest;
import com.ecommerce.dto.UserDto;
import com.ecommerce.entity.ContactUs;
import org.springframework.http.ResponseEntity;

import java.io.IOException;
import java.util.List;

public interface AuthService {

     UserDto createUser(SignupRequest signupRequest) throws Exception;

     Boolean hasUserWithEmail(String email);

     UserDto getUserById(Long userId);

     UserDto updateUser(UserDto userDto) throws IOException;

    ResponseEntity<?> updatePasswordById(ChangePasswordDto changePasswordDto);

    void saveContactUsForm(ContactUs contactUs);

    List<ContactUs> getAllContactUs();
}
