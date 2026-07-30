package p153l;

import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.datastore.preferences.protobuf.C0357y;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.MapFieldLite;
import androidx.datastore.preferences.protobuf.WireFormat;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class mq80 extends GeneratedMessageLite<mq80, C18671a> implements mfz {
    private static final mq80 DEFAULT_INSTANCE;
    private static volatile og60<mq80> PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private MapFieldLite<String, PreferencesProto$Value> preferences_ = MapFieldLite.emptyMapField();

    /* JADX INFO: renamed from: l.mq80$b */
    public static final class C18672b {

        /* JADX INFO: renamed from: a */
        public static final C0357y<String, PreferencesProto$Value> f138024a = C0357y.m2386d(WireFormat.FieldType.STRING, "", WireFormat.FieldType.MESSAGE, PreferencesProto$Value.m1447L());
    }

    static {
        mq80 mq80Var = new mq80();
        DEFAULT_INSTANCE = mq80Var;
        GeneratedMessageLite.m1623A(mq80.class, mq80Var);
    }

    /* JADX INFO: renamed from: I */
    public static C18671a m159492I() {
        return DEFAULT_INSTANCE.m1638l();
    }

    /* JADX INFO: renamed from: J */
    public static mq80 m159493J(InputStream inputStream) throws IOException {
        return (mq80) GeneratedMessageLite.m1631y(DEFAULT_INSTANCE, inputStream);
    }

    /* JADX INFO: renamed from: E */
    public final Map<String, PreferencesProto$Value> m159494E() {
        return m159496G();
    }

    /* JADX INFO: renamed from: F */
    public Map<String, PreferencesProto$Value> m159495F() {
        return Collections.unmodifiableMap(m159497H());
    }

    /* JADX INFO: renamed from: G */
    public final MapFieldLite<String, PreferencesProto$Value> m159496G() {
        if (!this.preferences_.isMutable()) {
            this.preferences_ = this.preferences_.mutableCopy();
        }
        return this.preferences_;
    }

    /* JADX INFO: renamed from: H */
    public final MapFieldLite<String, PreferencesProto$Value> m159497H() {
        return this.preferences_;
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    /* JADX INFO: renamed from: o */
    public final Object mo1464o(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        og60 c0294b;
        int i = lq80.f133158a[methodToInvoke.ordinal()];
        lq80 lq80Var = null;
        switch (i) {
            case 1:
                return new mq80();
            case 2:
                return new C18671a(lq80Var);
            case 3:
                return GeneratedMessageLite.m1630x(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", C18672b.f138024a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                og60<mq80> og60Var = PARSER;
                if (og60Var != null) {
                    return og60Var;
                }
                synchronized (mq80.class) {
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

    /* JADX INFO: renamed from: l.mq80$a */
    public static final class C18671a extends GeneratedMessageLite.AbstractC0293a<mq80, C18671a> implements mfz {
        public C18671a() {
            super(mq80.DEFAULT_INSTANCE);
        }

        /* JADX INFO: renamed from: A */
        public C18671a m159498A(String str, PreferencesProto$Value preferencesProto$Value) {
            str.getClass();
            preferencesProto$Value.getClass();
            m1652s();
            ((mq80) this.f1569b).m159494E().put(str, preferencesProto$Value);
            return this;
        }

        public /* synthetic */ C18671a(lq80 lq80Var) {
            this();
        }
    }
}
