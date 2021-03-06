package com.cafe.web.security;

import com.cafe.mybatis.domain.RaydarUserDetail;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationListener;
import org.springframework.security.authentication.event.AbstractAuthenticationEvent;
import org.springframework.security.authentication.event.AuthenticationSuccessEvent;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by asmrussel on 1/18/16.
 */
@Component
public class AuthenticationListener implements ApplicationListener<AbstractAuthenticationEvent> {


    @Override
    public void onApplicationEvent(AbstractAuthenticationEvent appEvent) {


        if (appEvent instanceof AuthenticationSuccessEvent) {
            AuthenticationSuccessEvent event = (AuthenticationSuccessEvent) appEvent;
            RaydarUserDetail raydarUserDetail = (RaydarUserDetail) event.getAuthentication().getPrincipal();
            Map<String, Object> params = new HashMap<String, Object>();
            params.put("userProfileId", null);
            params.put("logCount", 0);


            // add code here to handle successful login event
        }
    }
}