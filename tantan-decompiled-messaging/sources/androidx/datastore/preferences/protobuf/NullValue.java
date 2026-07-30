package androidx.datastore.preferences.protobuf;

import p149l.ig3;

/* JADX INFO: loaded from: classes.dex */
public enum NullValue implements C0350s.c {
    NULL_VALUE(0),
    UNRECOGNIZED(-1);

    public static final int NULL_VALUE_VALUE = 0;
    private static final C0350s.d<NullValue> internalValueMap = new C0350s.d<NullValue>() { // from class: androidx.datastore.preferences.protobuf.NullValue.a
        @Override // androidx.datastore.preferences.protobuf.C0350s.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NullValue findValueByNumber(int i) {
            return NullValue.forNumber(i);
        }
    };
    private final int value;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.NullValue$b */
    public static final class C0299b implements C0350s.e {
        static final C0350s.e INSTANCE = new C0299b();

        @Override // androidx.datastore.preferences.protobuf.C0350s.e
        /* JADX INFO: renamed from: a */
        public boolean mo1619a(int i) {
            return NullValue.forNumber(i) != null;
        }
    }

    NullValue(int i) {
        this.value = i;
    }

    public static NullValue forNumber(int i) {
        if (i != 0) {
            return null;
        }
        return NULL_VALUE;
    }

    public static C0350s.d<NullValue> internalGetValueMap() {
        return internalValueMap;
    }

    public static C0350s.e internalGetVerifier() {
        return C0299b.INSTANCE;
    }

    @Override // androidx.datastore.preferences.protobuf.C0350s.c
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        ig3.m135964a("Can't get the number of an unknown enum value.");
        return 0;
    }

    @Deprecated
    public static NullValue valueOf(int i) {
        return forNumber(i);
    }
}
