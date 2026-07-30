package org.fourthline.cling.registry.event;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.enterprise.util.AnnotationLiteral;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public interface Phase {
    public static final AnnotationLiteral<Alive> ALIVE = new AnnotationLiteral<Alive>() { // from class: org.fourthline.cling.registry.event.Phase.1
    };
    public static final AnnotationLiteral<Complete> COMPLETE = new AnnotationLiteral<Complete>() { // from class: org.fourthline.cling.registry.event.Phase.2
    };
    public static final AnnotationLiteral<Byebye> BYEBYE = new AnnotationLiteral<Byebye>() { // from class: org.fourthline.cling.registry.event.Phase.3
    };
    public static final AnnotationLiteral<Updated> UPDATED = new AnnotationLiteral<Updated>() { // from class: org.fourthline.cling.registry.event.Phase.4
    };

    @Target({ElementType.FIELD, ElementType.PARAMETER})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Alive {
    }

    @Target({ElementType.FIELD, ElementType.PARAMETER})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Byebye {
    }

    @Target({ElementType.FIELD, ElementType.PARAMETER})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Complete {
    }

    @Target({ElementType.FIELD, ElementType.PARAMETER})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Updated {
    }
}
