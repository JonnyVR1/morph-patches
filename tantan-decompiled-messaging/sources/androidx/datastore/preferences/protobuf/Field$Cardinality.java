package androidx.datastore.preferences.protobuf;

import p149l.ig3;

/* JADX INFO: loaded from: classes.dex */
public enum Field$Cardinality implements C0350s.c {
    CARDINALITY_UNKNOWN(0),
    CARDINALITY_OPTIONAL(1),
    CARDINALITY_REQUIRED(2),
    CARDINALITY_REPEATED(3),
    UNRECOGNIZED(-1);

    public static final int CARDINALITY_OPTIONAL_VALUE = 1;
    public static final int CARDINALITY_REPEATED_VALUE = 3;
    public static final int CARDINALITY_REQUIRED_VALUE = 2;
    public static final int CARDINALITY_UNKNOWN_VALUE = 0;
    private static final C0350s.d<Field$Cardinality> internalValueMap = new C0350s.d<Field$Cardinality>() { // from class: androidx.datastore.preferences.protobuf.Field$Cardinality.a
        @Override // androidx.datastore.preferences.protobuf.C0350s.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Field$Cardinality findValueByNumber(int i) {
            return Field$Cardinality.forNumber(i);
        }
    };
    private final int value;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.Field$Cardinality$b */
    public static final class C0288b implements C0350s.e {
        static final C0350s.e INSTANCE = new C0288b();

        @Override // androidx.datastore.preferences.protobuf.C0350s.e
        /* JADX INFO: renamed from: a */
        public boolean mo1619a(int i) {
            return Field$Cardinality.forNumber(i) != null;
        }
    }

    Field$Cardinality(int i) {
        this.value = i;
    }

    public static Field$Cardinality forNumber(int i) {
        if (i == 0) {
            return CARDINALITY_UNKNOWN;
        }
        if (i == 1) {
            return CARDINALITY_OPTIONAL;
        }
        if (i == 2) {
            return CARDINALITY_REQUIRED;
        }
        if (i != 3) {
            return null;
        }
        return CARDINALITY_REPEATED;
    }

    public static C0350s.d<Field$Cardinality> internalGetValueMap() {
        return internalValueMap;
    }

    public static C0350s.e internalGetVerifier() {
        return C0288b.INSTANCE;
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
    public static Field$Cardinality valueOf(int i) {
        return forNumber(i);
    }
}
