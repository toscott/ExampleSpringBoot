package com.example.security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;

public class OpenIdConnectUserDetails implements UserDetails {

    private final String username;

    /**
     * Constructor for user details that accepts the claims from the OpenId Connect Response.
     * See http://openid.net/specs/openid-connect-core-1_0.html#IDToken for details about available attributes
     *
     * @param userInfo a map of claims with their respective values
     */
    OpenIdConnectUserDetails(Map<String, String> userInfo) {
        this.username = userInfo.get("email");
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.emptyList();
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
