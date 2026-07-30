package com.facebook.common.util;

import p153l.wtq0;
import p153l.xtq0;

/* JADX INFO: loaded from: classes.dex */
public enum TriState {
    YES,
    NO,
    UNSET;

    /* JADX INFO: renamed from: com.facebook.common.util.TriState$a */
    public static /* synthetic */ class C1613a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f6310a;

        static {
            int[] iArr = new int[TriState.values().length];
            f6310a = iArr;
            try {
                iArr[TriState.YES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6310a[TriState.NO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6310a[TriState.UNSET.ordinal()] = 3;
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
        int i = C1613a.f6310a[ordinal()];
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        if (i != 3) {
            xtq0.m213103a("Unrecognized TriState value: ", this);
            return false;
        }
        wtq0.m207906a("No boolean equivalent for UNSET");
        return false;
    }

    public Boolean asBooleanObject() {
        int i = C1613a.f6310a[ordinal()];
        if (i == 1) {
            return Boolean.TRUE;
        }
        if (i == 2) {
            return Boolean.FALSE;
        }
        if (i == 3) {
            return null;
        }
        xtq0.m213103a("Unrecognized TriState value: ", this);
        return null;
    }

    public int getDbValue() {
        int i = C1613a.f6310a[ordinal()];
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
        int i = C1613a.f6310a[ordinal()];
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        if (i == 3) {
            return z;
        }
        xtq0.m213103a("Unrecognized TriState value: ", this);
        return false;
    }
}
