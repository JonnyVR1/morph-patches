package androidx.datastore.preferences;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import p153l.l710;
import p153l.lq80;
import p153l.mfz;
import p153l.og60;

/* JADX INFO: loaded from: classes.dex */
public final class PreferencesProto$Value extends GeneratedMessageLite<PreferencesProto$Value, C0272a> implements mfz {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    private static final PreferencesProto$Value DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile og60<PreferencesProto$Value> PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int bitField0_;
    private int valueCase_ = 0;
    private Object value_;

    static {
        PreferencesProto$Value preferencesProto$Value = new PreferencesProto$Value();
        DEFAULT_INSTANCE = preferencesProto$Value;
        GeneratedMessageLite.m1623A(PreferencesProto$Value.class, preferencesProto$Value);
    }

    /* JADX INFO: renamed from: L */
    public static PreferencesProto$Value m1447L() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: T */
    public static C0272a m1448T() {
        return DEFAULT_INSTANCE.m1638l();
    }

    /* JADX INFO: renamed from: K */
    public boolean m1449K() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: M */
    public double m1450M() {
        return this.valueCase_ == 7 ? ((Double) this.value_).doubleValue() : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: N */
    public float m1451N() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: O */
    public int m1452O() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    /* JADX INFO: renamed from: P */
    public long m1453P() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: Q */
    public String m1454Q() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    /* JADX INFO: renamed from: R */
    public C0273a m1455R() {
        return this.valueCase_ == 6 ? (C0273a) this.value_ : C0273a.m1474G();
    }

    /* JADX INFO: renamed from: S */
    public ValueCase m1456S() {
        return ValueCase.forNumber(this.valueCase_);
    }

    /* JADX INFO: renamed from: U */
    public final void m1457U(boolean z) {
        this.valueCase_ = 1;
        this.value_ = Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: V */
    public final void m1458V(double d) {
        this.valueCase_ = 7;
        this.value_ = Double.valueOf(d);
    }

    /* JADX INFO: renamed from: W */
    public final void m1459W(float f) {
        this.valueCase_ = 2;
        this.value_ = Float.valueOf(f);
    }

    /* JADX INFO: renamed from: X */
    public final void m1460X(int i) {
        this.valueCase_ = 3;
        this.value_ = Integer.valueOf(i);
    }

    /* JADX INFO: renamed from: Y */
    public final void m1461Y(long j) {
        this.valueCase_ = 4;
        this.value_ = Long.valueOf(j);
    }

    /* JADX INFO: renamed from: Z */
    public final void m1462Z(String str) {
        str.getClass();
        this.valueCase_ = 5;
        this.value_ = str;
    }

    /* JADX INFO: renamed from: a0 */
    public final void m1463a0(C0273a.a aVar) {
        this.value_ = aVar.build();
        this.valueCase_ = 6;
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    /* JADX INFO: renamed from: o */
    public final Object mo1464o(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        og60 c0294b;
        int i = lq80.f133158a[methodToInvoke.ordinal()];
        lq80 lq80Var = null;
        switch (i) {
            case 1:
                return new PreferencesProto$Value();
            case 2:
                return new C0272a(lq80Var);
            case 3:
                return GeneratedMessageLite.m1630x(DEFAULT_INSTANCE, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000", new Object[]{"value_", "valueCase_", "bitField0_", C0273a.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                og60<PreferencesProto$Value> og60Var = PARSER;
                if (og60Var != null) {
                    return og60Var;
                }
                synchronized (PreferencesProto$Value.class) {
                    try {
                        c0294b = PARSER;
                        if (c0294b == null) {
                            c0294b = new GeneratedMessageLite.C0294b(DEFAULT_INSTANCE);
                            PARSER = c0294b;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return c0294b;
            case 6:
                return (byte) 1;
            default:
                l710.m153113a();
            case 7:
                return null;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.PreferencesProto$Value$a */
    public static final class C0272a extends GeneratedMessageLite.AbstractC0293a<PreferencesProto$Value, C0272a> implements mfz {
        public C0272a() {
            super(PreferencesProto$Value.DEFAULT_INSTANCE);
        }

        /* JADX INFO: renamed from: A */
        public C0272a m1465A(boolean z) {
            m1652s();
            ((PreferencesProto$Value) this.f1569b).m1457U(z);
            return this;
        }

        /* JADX INFO: renamed from: B */
        public C0272a m1466B(double d) {
            m1652s();
            ((PreferencesProto$Value) this.f1569b).m1458V(d);
            return this;
        }

        /* JADX INFO: renamed from: C */
        public C0272a m1467C(float f) {
            m1652s();
            ((PreferencesProto$Value) this.f1569b).m1459W(f);
            return this;
        }

        /* JADX INFO: renamed from: D */
        public C0272a m1468D(int i) {
            m1652s();
            ((PreferencesProto$Value) this.f1569b).m1460X(i);
            return this;
        }

        /* JADX INFO: renamed from: E */
        public C0272a m1469E(long j) {
            m1652s();
            ((PreferencesProto$Value) this.f1569b).m1461Y(j);
            return this;
        }

        /* JADX INFO: renamed from: G */
        public C0272a m1470G(String str) {
            m1652s();
            ((PreferencesProto$Value) this.f1569b).m1462Z(str);
            return this;
        }

        /* JADX INFO: renamed from: K */
        public C0272a m1471K(C0273a.a aVar) {
            m1652s();
            ((PreferencesProto$Value) this.f1569b).m1463a0(aVar);
            return this;
        }

        public /* synthetic */ C0272a(lq80 lq80Var) {
            this();
        }
    }

    public enum ValueCase {
        BOOLEAN(1),
        FLOAT(2),
        INTEGER(3),
        LONG(4),
        STRING(5),
        STRING_SET(6),
        DOUBLE(7),
        VALUE_NOT_SET(0);

        private final int value;

        ValueCase(int i) {
            this.value = i;
        }

        public static ValueCase forNumber(int i) {
            switch (i) {
                case 0:
                    return VALUE_NOT_SET;
                case 1:
                    return BOOLEAN;
                case 2:
                    return FLOAT;
                case 3:
                    return INTEGER;
                case 4:
                    return LONG;
                case 5:
                    return STRING;
                case 6:
                    return STRING_SET;
                case 7:
                    return DOUBLE;
                default:
                    return null;
            }
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static ValueCase valueOf(int i) {
            return forNumber(i);
        }
    }
}
