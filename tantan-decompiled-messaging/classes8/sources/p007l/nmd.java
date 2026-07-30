package p007l;

import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class nmd implements l7m.InterfaceC0600e {

    /* JADX INFO: renamed from: a */
    public l7m.InterfaceC0600e f3414a;

    /* JADX INFO: renamed from: b */
    public long f3415b = 0;

    /* JADX INFO: renamed from: c */
    public String f3416c;

    /* JADX INFO: renamed from: d */
    public int f3417d;

    @Override // p007l.l7m.InterfaceC0600e
    /* JADX INFO: renamed from: a */
    public void mo9412a(String str, int i) {
        l7m.InterfaceC0600e interfaceC0600e = this.f3414a;
        if (interfaceC0600e != null) {
            interfaceC0600e.mo9412a(str, i);
        }
        this.f3417d = i;
        this.f3416c = str;
        this.f3415b = System.currentTimeMillis();
    }

    @Override // p007l.l7m.InterfaceC0600e
    /* JADX INFO: renamed from: b */
    public void mo9413b(int i) {
        l7m.InterfaceC0600e interfaceC0600e = this.f3414a;
        if (interfaceC0600e != null) {
            interfaceC0600e.mo9413b(i);
        }
    }

    @Override // p007l.l7m.InterfaceC0600e
    /* JADX INFO: renamed from: c */
    public void mo9414c(Throwable th, String str) {
        l7m.InterfaceC0600e interfaceC0600e = this.f3414a;
        if (interfaceC0600e != null) {
            interfaceC0600e.mo9414c(th, str);
        }
        if (th != null) {
            CrashHelper.c(th);
        }
        if (this.f3417d == 0) {
            kb5.m9592e(this.f3416c, false);
        }
    }

    @Override // p007l.l7m.InterfaceC0600e
    public void onSuccess(String str) {
        l7m.InterfaceC0600e interfaceC0600e = this.f3414a;
        if (interfaceC0600e != null) {
            interfaceC0600e.onSuccess(str);
        }
        if (this.f3417d == 0) {
            kb5.m9592e(this.f3416c, true);
        }
    }
}
