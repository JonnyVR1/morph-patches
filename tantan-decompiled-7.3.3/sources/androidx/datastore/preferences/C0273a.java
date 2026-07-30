package androidx.datastore.preferences;

import androidx.datastore.preferences.protobuf.AbstractC0319a;
import androidx.datastore.preferences.protobuf.C0351s;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import java.util.List;
import p153l.l710;
import p153l.lq80;
import p153l.mfz;
import p153l.og60;

/* JADX INFO: renamed from: androidx.datastore.preferences.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0273a extends GeneratedMessageLite<C0273a, a> implements mfz {
    private static final C0273a DEFAULT_INSTANCE;
    private static volatile og60<C0273a> PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private C0351s.i<String> strings_ = GeneratedMessageLite.m1625p();

    static {
        C0273a c0273a = new C0273a();
        DEFAULT_INSTANCE = c0273a;
        GeneratedMessageLite.m1623A(C0273a.class, c0273a);
    }

    /* JADX INFO: renamed from: G */
    public static C0273a m1474G() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: I */
    public static a m1475I() {
        return DEFAULT_INSTANCE.m1638l();
    }

    /* JADX INFO: renamed from: E */
    public final void m1476E(Iterable<String> iterable) {
        m1477F();
        AbstractC0319a.m1791b(iterable, this.strings_);
    }

    /* JADX INFO: renamed from: F */
    public final void m1477F() {
        if (this.strings_.mo1821q()) {
            return;
        }
        this.strings_ = GeneratedMessageLite.m1629v(this.strings_);
    }

    /* JADX INFO: renamed from: H */
    public List<String> m1478H() {
        return this.strings_;
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    /* JADX INFO: renamed from: o */
    public final Object mo1464o(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        og60 c0294b;
        int i = lq80.f133158a[methodToInvoke.ordinal()];
        lq80 lq80Var = null;
        switch (i) {
            case 1:
                return new C0273a();
            case 2:
                return new a(lq80Var);
            case 3:
                return GeneratedMessageLite.m1630x(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                og60<C0273a> og60Var = PARSER;
                if (og60Var != null) {
                    return og60Var;
                }
                synchronized (C0273a.class) {
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

    /* JADX INFO: renamed from: androidx.datastore.preferences.a$a */
    public static final class a extends GeneratedMessageLite.AbstractC0293a<C0273a, a> implements mfz {
        public a() {
            super(C0273a.DEFAULT_INSTANCE);
        }

        /* JADX INFO: renamed from: A */
        public a m1479A(Iterable<String> iterable) {
            m1652s();
            ((C0273a) this.f1569b).m1476E(iterable);
            return this;
        }

        public /* synthetic */ a(lq80 lq80Var) {
            this();
        }
    }
}
