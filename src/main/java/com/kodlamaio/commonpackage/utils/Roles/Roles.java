package com.kodlamaio.commonpackage.utils.Roles;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Roles {

    public final static String AdminOrModerator = "hasRole('admin') or hasRole('moderator')";

}
