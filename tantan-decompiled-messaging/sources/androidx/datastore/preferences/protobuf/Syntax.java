package androidx.datastore.preferences.protobuf;

import p149l.ig3;

/* JADX INFO: loaded from: classes.dex */
public enum Syntax implements C0350s.c {
    SYNTAX_PROTO2(0),
    SYNTAX_PROTO3(1),
    UNRECOGNIZED(-1);

    public static final int SYNTAX_PROTO2_VALUE = 0;
    public static final int SYNTAX_PROTO3_VALUE = 1;
    private static final C0350s.d<Syntax> internalValueMap = new C0350s.d<Syntax>() { // from class: androidx.datastore.preferences.protobuf.Syntax.a
        @Override // androidx.datastore.preferences.protobuf.C0350s.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Syntax findValueByNumber(int i) {
            return Syntax.forNumber(i);
        }
    };
    private final int value;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.Syntax$b */
    public static final class C0305b implements C0350s.e {
        static final C0350s.e INSTANCE = new C0305b();

        @Override // androidx.datastore.preferences.protobuf.C0350s.e
        /* JADX INFO: renamed from: a */
        public boolean mo1619a(int i) {
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

    public static C0350s.d<Syntax> internalGetValueMap() {
        return internalValueMap;
    }

    public static C0350s.e internalGetVerifier() {
        return C0305b.INSTANCE;
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
    public static Syntax valueOf(int i) {
        return forNumber(i);
    }
}
