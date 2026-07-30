package androidx.datastore.preferences;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import p149l.bz00;
import p149l.gi80;
import p149l.j860;
import p149l.p6z;

/* JADX INFO: loaded from: classes.dex */
public final class PreferencesProto$Value extends GeneratedMessageLite<PreferencesProto$Value, C0271a> implements p6z {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    private static final PreferencesProto$Value DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile j860<PreferencesProto$Value> PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int bitField0_;
    private int valueCase_ = 0;
    private Object value_;

    static {
        PreferencesProto$Value preferencesProto$Value = new PreferencesProto$Value();
        DEFAULT_INSTANCE = preferencesProto$Value;
        GeneratedMessageLite.m1622A(PreferencesProto$Value.class, preferencesProto$Value);
    }

    /* JADX INFO: renamed from: L */
    public static PreferencesProto$Value m1446L() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: T */
    public static C0271a m1447T() {
        return DEFAULT_INSTANCE.m1637l();
    }

    /* JADX INFO: renamed from: K */
    public boolean m1448K() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: M */
    public double m1449M() {
        return this.valueCase_ == 7 ? ((Double) this.value_).doubleValue() : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: N */
    public float m1450N() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: O */
    public int m1451O() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    /* JADX INFO: renamed from: P */
    public long m1452P() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: Q */
    public String m1453Q() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    /* JADX INFO: renamed from: R */
    public C0272a m1454R() {
        return this.valueCase_ == 6 ? (C0272a) this.value_ : C0272a.m1473G();
    }

    /* JADX INFO: renamed from: S */
    public ValueCase m1455S() {
        return ValueCase.forNumber(this.valueCase_);
    }

    /* JADX INFO: renamed from: U */
    public final void m1456U(boolean z) {
        this.valueCase_ = 1;
        this.value_ = Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: V */
    public final void m1457V(double d) {
        this.valueCase_ = 7;
        this.value_ = Double.valueOf(d);
    }

    /* JADX INFO: renamed from: W */
    public final void m1458W(float f) {
        this.valueCase_ = 2;
        this.value_ = Float.valueOf(f);
    }

    /* JADX INFO: renamed from: X */
    public final void m1459X(int i) {
        this.valueCase_ = 3;
        this.value_ = Integer.valueOf(i);
    }

    /* JADX INFO: renamed from: Y */
    public final void m1460Y(long j) {
        this.valueCase_ = 4;
        this.value_ = Long.valueOf(j);
    }

    /* JADX INFO: renamed from: Z */
    public final void m1461Z(String str) {
        str.getClass();
        this.valueCase_ = 5;
        this.value_ = str;
    }

    /* JADX INFO: renamed from: a0 */
    public final void m1462a0(C0272a.a aVar) {
        this.value_ = aVar.build();
        this.valueCase_ = 6;
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    /* JADX INFO: renamed from: o */
    public final Object mo1463o(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        j860 c0293b;
        int i = gi80.f102857a[methodToInvoke.ordinal()];
        gi80 gi80Var = null;
        switch (i) {
            case 1:
                return new PreferencesProto$Value();
            case 2:
                return new C0271a(gi80Var);
            case 3:
                return GeneratedMessageLite.m1629x(DEFAULT_INSTANCE, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000", new Object[]{"value_", "valueCase_", "bitField0_", C0272a.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                j860<PreferencesProto$Value> j860Var = PARSER;
                if (j860Var != null) {
                    return j860Var;
                }
                synchronized (PreferencesProto$Value.class) {
                    try {
                        c0293b = PARSER;
                        if (c0293b == null) {
                            c0293b = new GeneratedMessageLite.C0293b(DEFAULT_INSTANCE);
                            PARSER = c0293b;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return c0293b;
            case 6:
                return (byte) 1;
            default:
                bz00.m104536a();
            case 7:
                return null;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.PreferencesProto$Value$a */
    public static final class C0271a extends GeneratedMessageLite.AbstractC0292a<PreferencesProto$Value, C0271a> implements p6z {
        public C0271a() {
            super(PreferencesProto$Value.DEFAULT_INSTANCE);
        }

        /* JADX INFO: renamed from: A */
        public C0271a m1464A(boolean z) {
            m1651s();
            ((PreferencesProto$Value) this.f1569b).m1456U(z);
            return this;
        }

        /* JADX INFO: renamed from: B */
        public C0271a m1465B(double d) {
            m1651s();
            ((PreferencesProto$Value) this.f1569b).m1457V(d);
            return this;
        }

        /* JADX INFO: renamed from: C */
        public C0271a m1466C(float f) {
            m1651s();
            ((PreferencesProto$Value) this.f1569b).m1458W(f);
            return this;
        }

        /* JADX INFO: renamed from: D */
        public C0271a m1467D(int i) {
            m1651s();
            ((PreferencesProto$Value) this.f1569b).m1459X(i);
            return this;
        }

        /* JADX INFO: renamed from: E */
        public C0271a m1468E(long j) {
            m1651s();
            ((PreferencesProto$Value) this.f1569b).m1460Y(j);
            return this;
        }

        /* JADX INFO: renamed from: G */
        public C0271a m1469G(String str) {
            m1651s();
            ((PreferencesProto$Value) this.f1569b).m1461Z(str);
            return this;
        }

        /* JADX INFO: renamed from: K */
        public C0271a m1470K(C0272a.a aVar) {
            m1651s();
            ((PreferencesProto$Value) this.f1569b).m1462a0(aVar);
            return this;
        }

        public /* synthetic */ C0271a(gi80 gi80Var) {
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
