package p153l;

import android.content.Intent;
import com.tantanapp.common.data.ValueObject;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes12.dex */
public abstract class hmb0 {

    /* JADX INFO: renamed from: c */
    public static InterfaceC17507a f110611c;

    /* JADX INFO: renamed from: a */
    public C22507a<String> f110612a = C22507a.m222758b();

    /* JADX INFO: renamed from: b */
    public C22507a<Boolean> f110613b = C22507a.m222758b();

    /* JADX INFO: renamed from: l.hmb0$a */
    public interface InterfaceC17507a {
        /* JADX INFO: renamed from: a */
        void mo111156a(String str, boolean z);

        /* JADX INFO: renamed from: b */
        boolean mo111157b(String str, boolean z, String str2);

        /* JADX INFO: renamed from: c */
        void mo111158c(String str, String str2);

        /* JADX INFO: renamed from: d */
        boolean mo111159d(String str, boolean z, String str2);
    }

    /* JADX INFO: renamed from: a */
    public boolean mo82614a(Intent intent) {
        return false;
    }

    /* JADX INFO: renamed from: b */
    public C22507a<Boolean> m135826b() {
        return this.f110613b;
    }

    /* JADX INFO: renamed from: c */
    public boolean m135827c(String str, boolean z) {
        InterfaceC17507a interfaceC17507a = f110611c;
        if (interfaceC17507a == null || !interfaceC17507a.mo111159d(str, z, mo82615e())) {
            return false;
        }
        return f110611c.mo111157b(str, z, mo82615e());
    }

    /* JADX INFO: renamed from: d */
    public C22507a<String> m135828d() {
        return this.f110612a;
    }

    /* JADX INFO: renamed from: e */
    public abstract String mo82615e();

    /* JADX INFO: renamed from: f */
    public void m135829f(boolean z) {
        InterfaceC17507a interfaceC17507a = f110611c;
        if (interfaceC17507a != null) {
            interfaceC17507a.mo111156a(mo82615e(), z);
        }
    }

    /* JADX INFO: renamed from: g */
    public hmb0 m135830g(InterfaceC17507a interfaceC17507a) {
        f110611c = interfaceC17507a;
        return this;
    }

    /* JADX INFO: renamed from: h */
    public void m135831h(String str) {
        InterfaceC17507a interfaceC17507a = f110611c;
        if (interfaceC17507a != null) {
            interfaceC17507a.mo111158c(mo82615e(), str);
        }
    }

    /* JADX INFO: renamed from: i */
    public abstract void mo82616i();

    /* JADX INFO: renamed from: j */
    public void m135832j(boolean z) {
        if (this.f110613b.m222761e() == null || this.f110613b.m222761e().booleanValue() != z) {
            this.f110613b.onNext(Boolean.valueOf(z));
            String str = kmk0.f127508a;
        }
    }

    /* JADX INFO: renamed from: k */
    public void m135833k(String str) {
        if (ValueObject.util_equals(str, this.f110612a.m222761e())) {
            return;
        }
        this.f110612a.onNext(str);
        if (kmk0.f127510c) {
            toString();
        }
    }
}
