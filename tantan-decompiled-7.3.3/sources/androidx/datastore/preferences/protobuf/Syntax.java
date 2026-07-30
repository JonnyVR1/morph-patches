package androidx.datastore.preferences.protobuf;

import p153l.wg3;

/* JADX INFO: loaded from: classes.dex */
public enum Syntax implements C0351s.c {
    SYNTAX_PROTO2(0),
    SYNTAX_PROTO3(1),
    UNRECOGNIZED(-1);

    public static final int SYNTAX_PROTO2_VALUE = 0;
    public static final int SYNTAX_PROTO3_VALUE = 1;
    private static final C0351s.d<Syntax> internalValueMap = new C0351s.d<Syntax>() { // from class: androidx.datastore.preferences.protobuf.Syntax.a
        @Override // androidx.datastore.preferences.protobuf.C0351s.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Syntax findValueByNumber(int i) {
            return Syntax.forNumber(i);
        }
    };
    private final int value;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.Syntax$b */
    public static final class C0306b implements C0351s.e {
        static final C0351s.e INSTANCE = new C0306b();

        @Override // androidx.datastore.preferences.protobuf.C0351s.e
        /* JADX INFO: renamed from: a */
        public boolean mo1620a(int i) {
            return Syntax.forNumber(i) != null;
        }
    }

    Syntax(int i) {
        this.value = i;
    }

    public static Syntax forNumber(int i) {
        if (i == 0) {
            return SYNTAX_PROTO2;
        }
        if (i != 1) {
            return null;
        }
        return SYNTAX_PROTO3;
    }

    public static C0351s.d<Syntax> internalGetValueMap() {
        return internalValueMap;
    }

    public static C0351s.e internalGetVerifier() {
        return C0306b.INSTANCE;
    }

    @Override // androidx.datastore.preferences.protobuf.C0351s.c
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        wg3.m206174a("Can't get the number of an unknown enum value.");
        return 0;
    }

    @Deprecated
    public static Syntax valueOf(int i) {
        return forNumber(i);
    }
}
