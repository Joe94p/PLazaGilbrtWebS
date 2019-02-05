package edu.uoc.android.restservice.rest.contants;

public class ApiConstants {

    // BASE URL
    public static final String BASE_GITHUB_URL = "https://api.github.com/";

    //https://api.github.com/users/jsinix
    //https://api.github.com/users/jsinix/followers

    // ENDPOINTS
    public static final String GITHUB_USER_ENDPOINT = "users/{owner}";
    public static final String GITHUB_FOLLOWERS_ENDPOINT = "/users/{owner}/followers";
}
