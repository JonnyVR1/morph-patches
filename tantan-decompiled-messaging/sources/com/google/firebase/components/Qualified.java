package com.google.firebase.components;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes7.dex */
public final class Qualified<T> {
    private final Class<? extends Annotation> qualifier;
    private final Class<T> type;

    public @interface Unqualified {
    }

    public Qualified(Class<? extends Annotation> cls, Class<T> cls2) {
        this.qualifier = cls;
        this.type = cls2;
    }

    @NonNull
    public static <T> Qualified<T> qualified(Class<? extends Annotation> cls, Class<T> cls2) {
        return new Qualified<>(cls, cls2);
    }

    @NonNull
    public static <T> Qualified<T> unqualified(Class<T> cls) {
        return new Qualified<>(Unqualified.class, cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Qualified.class != obj.getClass()) {
            return false;
        }
        Qualified qualified = (Qualified) obj;
        if (this.type.equals(qualified.type)) {
            return this.qualifier.equals(qualified.qualifier);
        }
        return false;
    }

    public int hashCode() {
        return (this.type.hashCode() * 31) + this.qualifier.hashCode();
    }

    public String toString() {
        if (this.qualifier == Unqualified.class) {
            return this.type.getName();
        }
        return "@" + this.qualifier.getName() + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + this.type.getName();
    }
}
