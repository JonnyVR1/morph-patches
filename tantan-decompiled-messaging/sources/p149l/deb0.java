package p149l;

import android.content.Intent;
import com.tantanapp.common.data.ValueObject;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes13.dex */
public abstract class deb0 {

    /* JADX INFO: renamed from: c */
    public static InterfaceC16342a f85772c;

    /* JADX INFO: renamed from: a */
    public C22392a<String> f85773a = C22392a.m221512b();

    /* JADX INFO: renamed from: b */
    public C22392a<Boolean> f85774b = C22392a.m221512b();

    /* JADX INFO: renamed from: l.deb0$a */
    public interface InterfaceC16342a {
        /* JADX INFO: renamed from: a */
        void mo111189a(String str, boolean z);

        /* JADX INFO: renamed from: b */
        boolean mo111190b(String str, boolean z, String str2);

        /* JADX INFO: renamed from: c */
        void mo111191c(String str, String str2);

        /* JADX INFO: renamed from: d */
        boolean mo111192d(String str, boolean z, String str2);
    }

    /* JADX INFO: renamed from: a */
    public boolean mo81431a(Intent intent) {
        return false;
    }

    /* JADX INFO: renamed from: b */
    public C22392a<Boolean> m111181b() {
        return this.f85774b;
    }

    /* JADX INFO: renamed from: c */
    public boolean m111182c(String str, boolean z) {
        InterfaceC16342a interfaceC16342a = f85772c;
        if (interfaceC16342a == null || !interfaceC16342a.mo111192d(str, z, mo81432e())) {
            return false;
        }
        return f85772c.mo111190b(str, z, mo81432e());
    }

    /* JADX INFO: renamed from: d */
    public C22392a<String> m111183d() {
        return this.f85773a;
    }

    /* JADX INFO: renamed from: e */
    public abstract String mo81432e();

    /* JADX INFO: renamed from: f */
    public void m111184f(boolean z) {
        InterfaceC16342a interfaceC16342a = f85772c;
        if (interfaceC16342a != null) {
            interfaceC16342a.mo111189a(mo81432e(), z);
        }
    }

    /* JADX INFO: renamed from: g */
    public deb0 m111185g(InterfaceC16342a interfaceC16342a) {
        f85772c = interfaceC16342a;
        return this;
    }

    /* JADX INFO: renamed from: h */
    public void m111186h(String str) {
        InterfaceC16342a interfaceC16342a = f85772c;
        if (interfaceC16342a != null) {
            interfaceC16342a.mo111191c(mo81432e(), str);
        }
    }

    /* JADX INFO: renamed from: i */
    public abstract void mo81433i();

    /* JADX INFO: renamed from: j */
    public void m111187j(boolean z) {
        if (this.f85774b.m221515e() == null || this.f85774b.m221515e().booleanValue() != z) {
            this.f85774b.onNext(Boolean.valueOf(z));
            String str = edk0.f90611a;
        }
    }

    /* JADX INFO: renamed from: k */
    public void m111188k(String str) {
        if (ValueObject.util_equals(str, this.f85773a.m221515e())) {
            return;
        }
        this.f85773a.onNext(str);
        if (edk0.f90613c) {
            toString();
        }
    }
}
