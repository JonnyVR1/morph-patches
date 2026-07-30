package com.immomo.mwc.sdk;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public enum EventType {
    MK_CREATE("mk.create"),
    MK_ONDRAW("mk.ondraw"),
    MK_DESTROY("mk.destroy");

    public final String value;

    EventType(String str) {
        this.value = str;
    }

    public static EventType fromTypeName(String str) {
        for (EventType eventType : values()) {
            if (eventType.value.equals(str)) {
                return eventType;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        return this.value;
    }
}
