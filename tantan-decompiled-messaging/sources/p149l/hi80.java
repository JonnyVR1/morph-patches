package p149l;

import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.datastore.preferences.protobuf.C0356y;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.MapFieldLite;
import androidx.datastore.preferences.protobuf.WireFormat;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class hi80 extends GeneratedMessageLite<hi80, C17322a> implements p6z {
    private static final hi80 DEFAULT_INSTANCE;
    private static volatile j860<hi80> PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private MapFieldLite<String, PreferencesProto$Value> preferences_ = MapFieldLite.emptyMapField();

    /* JADX INFO: renamed from: l.hi80$b */
    public static final class C17323b {

        /* JADX INFO: renamed from: a */
        public static final C0356y<String, PreferencesProto$Value> f107890a = C0356y.m2385d(WireFormat.FieldType.STRING, "", WireFormat.FieldType.MESSAGE, PreferencesProto$Value.m1446L());
    }

    static {
        hi80 hi80Var = new hi80();
        DEFAULT_INSTANCE = hi80Var;
        GeneratedMessageLite.m1622A(hi80.class, hi80Var);
    }

    /* JADX INFO: renamed from: I */
    public static C17322a m131230I() {
        return DEFAULT_INSTANCE.m1637l();
    }

    /* JADX INFO: renamed from: J */
    public static hi80 m131231J(InputStream inputStream) throws IOException {
        return (hi80) GeneratedMessageLite.m1630y(DEFAULT_INSTANCE, inputStream);
    }

    /* JADX INFO: renamed from: E */
    public final Map<String, PreferencesProto$Value> m131232E() {
        return m131234G();
    }

    /* JADX INFO: renamed from: F */
    public Map<String, PreferencesProto$Value> m131233F() {
        return Collections.unmodifiableMap(m131235H());
    }

    /* JADX INFO: renamed from: G */
    public final MapFieldLite<String, PreferencesProto$Value> m131234G() {
        if (!this.preferences_.isMutable()) {
            this.preferences_ = this.preferences_.mutableCopy();
        }
        return this.preferences_;
    }

    /* JADX INFO: renamed from: H */
    public final MapFieldLite<String, PreferencesProto$Value> m131235H() {
        return this.preferences_;
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    /* JADX INFO: renamed from: o */
    public final Object mo1463o(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        j860 c0293b;
        int i = gi80.f102857a[methodToInvoke.ordinal()];
        gi80 gi80Var = null;
        switch (i) {
            case 1:
                return new hi80();
            case 2:
                return new C17322a(gi80Var);
            case 3:
                return GeneratedMessageLite.m1629x(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", C17323b.f107890a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                j860<hi80> j860Var = PARSER;
                if (j860Var != null) {
                    return j860Var;
                }
                synchronized (hi80.class) {
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

    /* JADX INFO: renamed from: l.hi80$a */
    public static final class C17322a extends GeneratedMessageLite.AbstractC0292a<hi80, C17322a> implements p6z {
        public C17322a() {
            super(hi80.DEFAULT_INSTANCE);
        }

        /* JADX INFO: renamed from: A */
        public C17322a m131236A(String str, PreferencesProto$Value preferencesProto$Value) {
            str.getClass();
            preferencesProto$Value.getClass();
            m1651s();
            ((hi80) this.f1569b).m131232E().put(str, preferencesProto$Value);
            return this;
        }

        public /* synthetic */ C17322a(gi80 gi80Var) {
            this();
        }
    }
}
