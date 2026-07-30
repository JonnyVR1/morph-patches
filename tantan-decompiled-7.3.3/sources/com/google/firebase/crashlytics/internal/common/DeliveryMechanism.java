package com.google.firebase.crashlytics.internal.common;

/* JADX INFO: loaded from: classes7.dex */
public enum DeliveryMechanism {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);


    /* JADX INFO: renamed from: id */
    private final int f11480id;

    DeliveryMechanism(int i) {
        this.f11480id = i;
    }

    public static DeliveryMechanism determineFrom(String str) {
        return str != null ? APP_STORE : DEVELOPER;
    }

    public int getId() {
        return this.f11480id;
    }

    @Override // java.lang.Enum
    public String toString() {
        return Integer.toString(this.f11480id);
    }
}
