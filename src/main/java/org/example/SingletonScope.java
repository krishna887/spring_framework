package org.example;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public class SingletonScope {
    @Autowired
private PrototypeScope prototypeScope;
    @Lookup
PrototypeScope createPrototypeScopeObject(){
    return null;
}
    public PrototypeScope getPrototypeScope() {
        return createPrototypeScopeObject();
    }

    public void setPrototypeScope(PrototypeScope prototypeScope) {
        this.prototypeScope = prototypeScope;
    }

    public SingletonScope() {
        System.out.println("singleton scope bean has created:   ");
    }
}
