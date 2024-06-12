package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype" , proxyMode = ScopedProxyMode.TARGET_CLASS)
public class PrototypeScope {

    public PrototypeScope() {
        System.out.println("protoType scope bean started");
    }
}
