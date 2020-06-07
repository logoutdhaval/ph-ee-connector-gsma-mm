package org.mifos.connector.gsma.auth.dto;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class AccessTokenStore {
    public String accessToken;
    public LocalDateTime expiresOn;

    public AccessTokenStore() {
        System.out.println("ACCESS TOKEN STORE CREATED!");
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public LocalDateTime getExpiresOn() {
        return expiresOn;
    }

    public void setExpiresOn(int expires_in) {
        this.expiresOn = LocalDateTime.now().plusSeconds(expires_in);
    }
}