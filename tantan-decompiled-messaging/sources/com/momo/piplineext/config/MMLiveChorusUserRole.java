package com.momo.piplineext.config;

/* JADX INFO: loaded from: classes8.dex */
public enum MMLiveChorusUserRole {
    UNKNOWUSER(1),
    BROADCASTER(2),
    AUDIENCE(3),
    LEADER_SINGER(4),
    ACCOMPANY_SINGER(5);

    private int value;

    MMLiveChorusUserRole(int i) {
        this.value = i;
    }

    public static MMLiveChorusUserRole fromId(int i) {
        for (MMLiveChorusUserRole mMLiveChorusUserRole : values()) {
            if (mMLiveChorusUserRole.value() == i) {
                return mMLiveChorusUserRole;
            }
        }
        return null;
    }

    public int value() {
        return this.value;
    }
}
