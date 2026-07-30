package p149l;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import okio.Okio;

/* JADX INFO: loaded from: classes.dex */
public final class gfg0 extends mpg0 {

    /* JADX INFO: renamed from: a */
    public final Context f102392a;

    /* JADX INFO: renamed from: b */
    public final Object f102393b = new Object();

    /* JADX INFO: renamed from: c */
    public AssetManager f102394c;

    public gfg0(Context context) {
        this.f102392a = context;
    }

    @Override // p149l.mpg0
    /* JADX INFO: renamed from: b */
    public final s9g0 mo113471b(dpg0 dpg0Var, int i) {
        if (this.f102394c == null) {
            synchronized (this.f102393b) {
                try {
                    if (this.f102394c == null) {
                        this.f102394c = this.f102392a.getAssets();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return new s9g0(Okio.source(this.f102394c.open(dpg0Var.f87271a.toString().substring(22))), 2);
    }

    @Override // p149l.mpg0
    /* JADX INFO: renamed from: d */
    public final boolean mo113472d(dpg0 dpg0Var) {
        Uri uri = dpg0Var.f87271a;
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }
}
