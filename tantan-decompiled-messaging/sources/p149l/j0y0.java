package p149l;

import android.net.Uri;

/* JADX INFO: loaded from: classes6.dex */
public final class j0y0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f115723a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Uri f115724b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f115725c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f115726d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ezx0 f115727e;

    public j0y0(ezx0 ezx0Var, boolean z, Uri uri, String str, String str2) {
        this.f115723a = z;
        this.f115724b = uri;
        this.f115725c = str;
        this.f115726d = str2;
        this.f115727e = ezx0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ezx0.m119027a(this.f115727e, this.f115723a, this.f115724b, this.f115725c, this.f115726d);
    }
}
