package p153l;

import androidx.datastore.preferences.protobuf.AbstractC0355w;
import androidx.datastore.preferences.protobuf.C0326d0;
import androidx.datastore.preferences.protobuf.C0328e0;
import androidx.datastore.preferences.protobuf.C0338j0;
import androidx.datastore.preferences.protobuf.C0351s;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.InterfaceC0336i0;
import androidx.datastore.preferences.protobuf.ProtoSyntax;

/* JADX INFO: loaded from: classes.dex */
public final class xuw implements x2e0 {

    /* JADX INFO: renamed from: b */
    public static final dez f196330b = new C21451a();

    /* JADX INFO: renamed from: a */
    public final dez f196331a;

    /* JADX INFO: renamed from: l.xuw$a */
    public static class C21451a implements dez {
        @Override // p153l.dez
        /* JADX INFO: renamed from: a */
        public cez mo115488a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // p153l.dez
        /* JADX INFO: renamed from: b */
        public boolean mo115489b(Class<?> cls) {
            return false;
        }
    }

    /* JADX INFO: renamed from: l.xuw$b */
    public static class C21452b implements dez {

        /* JADX INFO: renamed from: a */
        public dez[] f196332a;

        public C21452b(dez... dezVarArr) {
            this.f196332a = dezVarArr;
        }

        @Override // p153l.dez
        /* JADX INFO: renamed from: a */
        public cez mo115488a(Class<?> cls) {
            for (dez dezVar : this.f196332a) {
                if (dezVar.mo115489b(cls)) {
                    return dezVar.mo115488a(cls);
                }
            }
            pr3.m173429a("No factory is available for message type: ".concat(cls.getName()));
            return null;
        }

        @Override // p153l.dez
        /* JADX INFO: renamed from: b */
        public boolean mo115489b(Class<?> cls) {
            for (dez dezVar : this.f196332a) {
                if (dezVar.mo115489b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public xuw(dez dezVar) {
        this.f196331a = (dez) C0351s.m2341b(dezVar, "messageInfoFactory");
    }

    /* JADX INFO: renamed from: b */
    public static dez m213194b() {
        return new C21452b(ulj.m196557c(), m213195c());
    }

    /* JADX INFO: renamed from: c */
    public static dez m213195c() {
        try {
            return (dez) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            return f196330b;
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m213196d(cez cezVar) {
        return cezVar.mo103101c() == ProtoSyntax.PROTO2;
    }

    /* JADX INFO: renamed from: e */
    public static <T> InterfaceC0336i0<T> m213197e(Class<T> cls, cez cezVar) {
        if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
            return m213196d(cezVar) ? C0326d0.m1873R(cls, cezVar, w130.m204378b(), AbstractC0355w.m2368b(), C0338j0.m2153M(), wqf.m207515b(), zww.m221959b()) : C0326d0.m1873R(cls, cezVar, w130.m204378b(), AbstractC0355w.m2368b(), C0338j0.m2153M(), null, zww.m221959b());
        }
        return m213196d(cezVar) ? C0326d0.m1873R(cls, cezVar, w130.m204377a(), AbstractC0355w.m2367a(), C0338j0.m2148H(), wqf.m207514a(), zww.m221958a()) : C0326d0.m1873R(cls, cezVar, w130.m204377a(), AbstractC0355w.m2367a(), C0338j0.m2149I(), null, zww.m221958a());
    }

    @Override // p153l.x2e0
    /* JADX INFO: renamed from: a */
    public <T> InterfaceC0336i0<T> mo209144a(Class<T> cls) {
        C0338j0.m2150J(cls);
        cez cezVarMo115488a = this.f196331a.mo115488a(cls);
        if (cezVarMo115488a.mo103099a()) {
            return GeneratedMessageLite.class.isAssignableFrom(cls) ? C0328e0.m2011m(C0338j0.m2153M(), wqf.m207515b(), cezVarMo115488a.mo103100b()) : C0328e0.m2011m(C0338j0.m2148H(), wqf.m207514a(), cezVarMo115488a.mo103100b());
        }
        return m213197e(cls, cezVarMo115488a);
    }

    public xuw() {
        this(m213194b());
    }
}
