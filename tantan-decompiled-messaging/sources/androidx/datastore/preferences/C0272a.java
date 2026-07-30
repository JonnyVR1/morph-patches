package androidx.datastore.preferences;

import androidx.datastore.preferences.protobuf.AbstractC0318a;
import androidx.datastore.preferences.protobuf.C0350s;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import java.util.List;
import p149l.bz00;
import p149l.gi80;
import p149l.j860;
import p149l.p6z;

/* JADX INFO: renamed from: androidx.datastore.preferences.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0272a extends GeneratedMessageLite<C0272a, a> implements p6z {
    private static final C0272a DEFAULT_INSTANCE;
    private static volatile j860<C0272a> PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private C0350s.i<String> strings_ = GeneratedMessageLite.m1624p();

    static {
        C0272a c0272a = new C0272a();
        DEFAULT_INSTANCE = c0272a;
        GeneratedMessageLite.m1622A(C0272a.class, c0272a);
    }

    /* JADX INFO: renamed from: G */
    public static C0272a m1473G() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: I */
    public static a m1474I() {
        return DEFAULT_INSTANCE.m1637l();
    }

    /* JADX INFO: renamed from: E */
    public final void m1475E(Iterable<String> iterable) {
        m1476F();
        AbstractC0318a.m1790b(iterable, this.strings_);
    }

    /* JADX INFO: renamed from: F */
    public final void m1476F() {
        if (this.strings_.mo1820q()) {
            return;
        }
        this.strings_ = GeneratedMessageLite.m1628v(this.strings_);
    }

    /* JADX INFO: renamed from: H */
    public List<String> m1477H() {
        return this.strings_;
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    /* JADX INFO: renamed from: o */
    public final Object mo1463o(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        j860 c0293b;
        int i = gi80.f102857a[methodToInvoke.ordinal()];
        gi80 gi80Var = null;
        switch (i) {
            case 1:
                return new C0272a();
            case 2:
                return new a(gi80Var);
            case 3:
                return GeneratedMessageLite.m1629x(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                j860<C0272a> j860Var = PARSER;
                if (j860Var != null) {
                    return j860Var;
                }
                synchronized (C0272a.class) {
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

    /* JADX INFO: renamed from: androidx.datastore.preferences.a$a */
    public static final class a extends GeneratedMessageLite.AbstractC0292a<C0272a, a> implements p6z {
        public a() {
            super(C0272a.DEFAULT_INSTANCE);
        }

        /* JADX INFO: renamed from: A */
        public a m1478A(Iterable<String> iterable) {
            m1651s();
            ((C0272a) this.f1569b).m1475E(iterable);
            return this;
        }

        public /* synthetic */ a(gi80 gi80Var) {
            this();
        }
    }
}
