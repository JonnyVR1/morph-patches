package p149l;

import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes8.dex */
public class nmd implements l7m.InterfaceC18162e {

    /* JADX INFO: renamed from: a */
    public l7m.InterfaceC18162e f139621a;

    /* JADX INFO: renamed from: b */
    public long f139622b = 0;

    /* JADX INFO: renamed from: c */
    public String f139623c;

    /* JADX INFO: renamed from: d */
    public int f139624d;

    @Override // p149l.l7m.InterfaceC18162e
    /* JADX INFO: renamed from: a */
    public void mo136488a(String str, int i) {
        l7m.InterfaceC18162e interfaceC18162e = this.f139621a;
        if (interfaceC18162e != null) {
            interfaceC18162e.mo136488a(str, i);
        }
        this.f139624d = i;
        this.f139623c = str;
        this.f139622b = System.currentTimeMillis();
    }

    @Override // p149l.l7m.InterfaceC18162e
    /* JADX INFO: renamed from: b */
    public void mo136489b(int i) {
        l7m.InterfaceC18162e interfaceC18162e = this.f139621a;
        if (interfaceC18162e != null) {
            interfaceC18162e.mo136489b(i);
        }
    }

    @Override // p149l.l7m.InterfaceC18162e
    /* JADX INFO: renamed from: c */
    public void mo136490c(Throwable th, String str) {
        l7m.InterfaceC18162e interfaceC18162e = this.f139621a;
        if (interfaceC18162e != null) {
            interfaceC18162e.mo136490c(th, str);
        }
        if (th != null) {
            CrashHelper.m81296c(th);
        }
        if (this.f139624d == 0) {
            kb5.m145209e(this.f139623c, false);
        }
    }

    @Override // p149l.l7m.InterfaceC18162e
    public void onSuccess(String str) {
        l7m.InterfaceC18162e interfaceC18162e = this.f139621a;
        if (interfaceC18162e != null) {
            interfaceC18162e.onSuccess(str);
        }
        if (this.f139624d == 0) {
            kb5.m145209e(this.f139623c, true);
        }
    }
}
