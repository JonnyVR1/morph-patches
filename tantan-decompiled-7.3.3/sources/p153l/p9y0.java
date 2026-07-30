package p153l;

import android.net.Uri;

/* JADX INFO: loaded from: classes6.dex */
public final class p9y0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f151193a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Uri f151194b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f151195c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f151196d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ k8y0 f151197e;

    public p9y0(k8y0 k8y0Var, boolean z, Uri uri, String str, String str2) {
        this.f151193a = z;
        this.f151194b = uri;
        this.f151195c = str;
        this.f151196d = str2;
        this.f151197e = k8y0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k8y0.m148784a(this.f151197e, this.f151193a, this.f151194b, this.f151195c, this.f151196d);
    }
}
