package com.adminportal.service;

import com.adminportal.domain.Book;
import com.adminportal.domain.User;
import com.adminportal.domain.security.UserRole;

import java.util.List;
import java.util.Set;

public interface UserService {


    User createUser(User user, Set<UserRole> userRoles) throws Exception;

}
