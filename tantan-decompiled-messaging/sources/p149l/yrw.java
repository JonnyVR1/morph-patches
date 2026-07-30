package p149l;

import androidx.datastore.preferences.protobuf.AbstractC0354w;
import androidx.datastore.preferences.protobuf.C0325d0;
import androidx.datastore.preferences.protobuf.C0327e0;
import androidx.datastore.preferences.protobuf.C0337j0;
import androidx.datastore.preferences.protobuf.C0350s;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.InterfaceC0335i0;
import androidx.datastore.preferences.protobuf.ProtoSyntax;

/* JADX INFO: loaded from: classes.dex */
public final class yrw implements tud0 {

    /* JADX INFO: renamed from: b */
    public static final g5z f199721b = new C21494a();

    /* JADX INFO: renamed from: a */
    public final g5z f199722a;

    /* JADX INFO: renamed from: l.yrw$a */
    public static class C21494a implements g5z {
        @Override // p149l.g5z
        /* JADX INFO: renamed from: a */
        public f5z mo102183a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // p149l.g5z
        /* JADX INFO: renamed from: b */
        public boolean mo102184b(Class<?> cls) {
            return false;
        }
    }

    /* JADX INFO: renamed from: l.yrw$b */
    public static class C21495b implements g5z {

        /* JADX INFO: renamed from: a */
        public g5z[] f199723a;

        public C21495b(g5z... g5zVarArr) {
            this.f199723a = g5zVarArr;
        }

        @Override // p149l.g5z
        /* JADX INFO: renamed from: a */
        public f5z mo102183a(Class<?> cls) {
            for (g5z g5zVar : this.f199723a) {
                if (g5zVar.mo102184b(cls)) {
                    return g5zVar.mo102183a(cls);
                }
            }
            qq3.m175877a("No factory is available for message type: ".concat(cls.getName()));
            return null;
        }

        @Override // p149l.g5z
        /* JADX INFO: renamed from: b */
        public boolean mo102184b(Class<?> cls) {
            for (g5z g5zVar : this.f199723a) {
                if (g5zVar.mo102184b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public yrw(g5z g5zVar) {
        this.f199722a = (g5z) C0350s.m2340b(g5zVar, "messageInfoFactory");
    }

    /* JADX INFO: renamed from: b */
    public static g5z m215869b() {
        return new C21495b(bjj.m102182c(), m215870c());
    }

    /* JADX INFO: renamed from: c */
    public static g5z m215870c() {
        try {
            return (g5z) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            return f199721b;
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m215871d(f5z f5zVar) {
        return f5zVar.mo119574c() == ProtoSyntax.PROTO2;
    }

    /* JADX INFO: renamed from: e */
    public static <T> InterfaceC0335i0<T> m215872e(Class<T> cls, f5z f5zVar) {
        if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
            return m215871d(f5zVar) ? C0325d0.m1872R(cls, f5zVar, mt20.m156178b(), AbstractC0354w.m2367b(), C0337j0.m2152M(), ppf.m170715b(), auw.m99092b()) : C0325d0.m1872R(cls, f5zVar, mt20.m156178b(), AbstractC0354w.m2367b(), C0337j0.m2152M(), null, auw.m99092b());
        }
        return m215871d(f5zVar) ? C0325d0.m1872R(cls, f5zVar, mt20.m156177a(), AbstractC0354w.m2366a(), C0337j0.m2147H(), ppf.m170714a(), auw.m99091a()) : C0325d0.m1872R(cls, f5zVar, mt20.m156177a(), AbstractC0354w.m2366a(), C0337j0.m2148I(), null, auw.m99091a());
    }

    @Override // p149l.tud0
    /* JADX INFO: renamed from: a */
    public <T> InterfaceC0335i0<T> mo190687a(Class<T> cls) {
        C0337j0.m2149J(cls);
        f5z f5zVarMo102183a = this.f199722a.mo102183a(cls);
        if (f5zVarMo102183a.mo119572a()) {
            return GeneratedMessageLite.class.isAssignableFrom(cls) ? C0327e0.m2010m(C0337j0.m2152M(), ppf.m170715b(), f5zVarMo102183a.mo119573b()) : C0327e0.m2010m(C0337j0.m2147H(), ppf.m170714a(), f5zVarMo102183a.mo119573b());
        }
        return m215872e(cls, f5zVarMo102183a);
    }

    public yrw() {
        this(m215869b());
    }
}
