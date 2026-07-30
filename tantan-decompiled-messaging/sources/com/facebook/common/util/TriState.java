package com.facebook.common.util;

import p149l.qkq0;
import p149l.rkq0;

/* JADX INFO: loaded from: classes.dex */
public enum TriState {
    YES,
    NO,
    UNSET;

    /* JADX INFO: renamed from: com.facebook.common.util.TriState$a */
    public static /* synthetic */ class C1590a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f6273a;

        static {
            int[] iArr = new int[TriState.values().length];
            f6273a = iArr;
            try {
                iArr[TriState.YES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6273a[TriState.NO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6273a[TriState.UNSET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static TriState fromDbValue(int i) {
        if (i != 1) {
            return i != 2 ? UNSET : NO;
        }
        return YES;
    }

    public static TriState valueOf(Boolean bool) {
        return bool != null ? valueOf(bool.booleanValue()) : UNSET;
    }

    public boolean asBoolean() {
        int i = C1590a.f6273a[ordinal()];
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        if (i != 3) {
            rkq0.m179764a("Unrecognized TriState value: ", this);
            return false;
        }
        qkq0.m175383a("No boolean equivalent for UNSET");
        return false;
    }

    public Boolean asBooleanObject() {
        int i = C1590a.f6273a[ordinal()];
        if (i == 1) {
            return Boolean.TRUE;
        }
        if (i == 2) {
            return Boolean.FALSE;
        }
        if (i == 3) {
            return null;
        }
        rkq0.m179764a("Unrecognized TriState value: ", this);
        return null;
    }

    public int getDbValue() {
        int i = C1590a.f6273a[ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 3;
            }
        }
        return i2;
    }

    public boolean isSet() {
        return this != UNSET;
    }

    public static TriState valueOf(boolean z) {
        return z ? YES : NO;
    }

    public boolean asBoolean(boolean z) {
        int i = C1590a.f6273a[ordinal()];
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        if (i == 3) {
            return z;
        }
        rkq0.m179764a("Unrecognized TriState value: ", this);
        return false;
    }
}
