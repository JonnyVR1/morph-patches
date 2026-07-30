package p002l;

import java.io.EOFException;
import okio.Buffer;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public abstract class wkf0 {

    /* JADX INFO: renamed from: a */
    public String f21812a = "default";

    /* JADX INFO: renamed from: a */
    public abstract void mo17495a(Buffer buffer, lec0 lec0Var) throws EOFException;

    /* JADX INFO: renamed from: b */
    public abstract void mo17496b(Buffer buffer, lec0 lec0Var) throws IllegalArgumentException;

    /* JADX INFO: renamed from: c */
    public abstract int mo17497c();

    /* JADX INFO: renamed from: d */
    public abstract int mo17498d();

    /* JADX INFO: renamed from: e */
    public boolean m24686e() {
        return "auth".equals(this.f21812a);
    }

    /* JADX INFO: renamed from: f */
    public boolean m24687f() {
        return "connect".equals(this.f21812a);
    }

    /* JADX INFO: renamed from: g */
    public boolean m24688g() {
        return "normal".equals(this.f21812a);
    }

    /* JADX INFO: renamed from: h */
    public boolean m24689h() {
        return "ping".equals(this.f21812a);
    }

    /* JADX INFO: renamed from: i */
    public void mo17499i(String str) {
        this.f21812a = str;
    }
}
