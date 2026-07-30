package p153l;

import com.alibaba.sdk.android.oss.signer.SignParameters;

/* JADX INFO: loaded from: classes6.dex */
public final class k9w0 {

    /* JADX INFO: renamed from: a */
    public final j9w0 f124589a = new j9w0();

    /* JADX INFO: renamed from: b */
    public int f124590b;

    /* JADX INFO: renamed from: c */
    public int f124591c;

    /* JADX INFO: renamed from: d */
    public int f124592d;

    /* JADX INFO: renamed from: e */
    public int f124593e;

    /* JADX INFO: renamed from: f */
    public int f124594f;

    /* JADX INFO: renamed from: a */
    public final j9w0 m148893a() {
        j9w0 j9w0Var = this.f124589a;
        j9w0 j9w0VarClone = j9w0Var.clone();
        j9w0Var.f118911a = false;
        j9w0Var.f118912b = false;
        return j9w0VarClone;
    }

    /* JADX INFO: renamed from: b */
    public final String m148894b() {
        return "\n\tPool does not exist: " + this.f124592d + "\n\tNew pools created: " + this.f124590b + "\n\tPools removed: " + this.f124591c + "\n\tEntries added: " + this.f124594f + "\n\tNo entries retrieved: " + this.f124593e + SignParameters.NEW_LINE;
    }

    /* JADX INFO: renamed from: c */
    public final void m148895c() {
        this.f124594f++;
    }

    /* JADX INFO: renamed from: d */
    public final void m148896d() {
        this.f124590b++;
        this.f124589a.f118911a = true;
    }

    /* JADX INFO: renamed from: e */
    public final void m148897e() {
        this.f124593e++;
    }

    /* JADX INFO: renamed from: f */
    public final void m148898f() {
        this.f124592d++;
    }

    /* JADX INFO: renamed from: g */
    public final void m148899g() {
        this.f124591c++;
        this.f124589a.f118912b = true;
    }
}
