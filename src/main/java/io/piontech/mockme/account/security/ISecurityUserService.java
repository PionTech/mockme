package io.piontech.mockme.account.security;

public interface ISecurityUserService {

    String validatePasswordResetToken(String token);

}
