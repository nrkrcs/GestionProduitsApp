package com.sid.secservice.sec;

public class JWTUtil {
    public static final String SECRET = "mySecret1234";
    public static final String AUTH_HEADER = "Authorization";
    public static final long  ACCESS_TOKEN_EXPIRY_TIME= 2*60*1000;
    public static final long  REFRESH_TOKEN_EXPIRY_TIME= 10*60*1000;
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String REFRESH_TOKEN_PATH= "/refreshToken";
    public static final String DB_PATH= "/h2-console/**";
}
