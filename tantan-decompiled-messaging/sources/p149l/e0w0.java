package p149l;

import com.alibaba.sdk.android.oss.signer.SignParameters;

/* JADX INFO: loaded from: classes6.dex */
public final class e0w0 {

    /* JADX INFO: renamed from: a */
    public final d0w0 f88684a = new d0w0();

    /* JADX INFO: renamed from: b */
    public int f88685b;

    /* JADX INFO: renamed from: c */
    public int f88686c;

    /* JADX INFO: renamed from: d */
    public int f88687d;

    /* JADX INFO: renamed from: e */
    public int f88688e;

    /* JADX INFO: renamed from: f */
    public int f88689f;

    /* JADX INFO: renamed from: a */
    public final d0w0 m114344a() {
        d0w0 d0w0Var = this.f88684a;
        d0w0 d0w0VarClone = d0w0Var.clone();
        d0w0Var.f83216a = false;
        d0w0Var.f83217b = false;
        return d0w0VarClone;
    }

    /* JADX INFO: renamed from: b */
    public final String m114345b() {
        return "\n\tPool does not exist: " + this.f88687d + "\n\tNew pools created: " + this.f88685b + "\n\tPools removed: " + this.f88686c + "\n\tEntries added: " + this.f88689f + "\n\tNo entries retrieved: " + this.f88688e + SignParameters.NEW_LINE;
    }

    /* JADX INFO: renamed from: c */
    public final void m114346c() {
        this.f88689f++;
    }

    /* JADX INFO: renamed from: d */
    public final void m114347d() {
        this.f88685b++;
        this.f88684a.f83216a = true;
    }

    /* JADX INFO: renamed from: e */
    public final void m114348e() {
        this.f88688e++;
    }

    /* JADX INFO: renamed from: f */
    public final void m114349f() {
        this.f88687d++;
    }

    /* JADX INFO: renamed from: g */
    public final void m114350g() {
        this.f88686c++;
        this.f88684a.f83217b = true;
    }
}
