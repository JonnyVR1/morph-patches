package p153l;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import okio.Okio;

/* JADX INFO: loaded from: classes.dex */
public final class ong0 extends uxg0 {

    /* JADX INFO: renamed from: a */
    public final Context f148088a;

    /* JADX INFO: renamed from: b */
    public final Object f148089b = new Object();

    /* JADX INFO: renamed from: c */
    public AssetManager f148090c;

    public ong0(Context context) {
        this.f148088a = context;
    }

    @Override // p153l.uxg0
    /* JADX INFO: renamed from: b */
    public final aig0 mo118414b(lxg0 lxg0Var, int i) {
        if (this.f148090c == null) {
            synchronized (this.f148089b) {
                try {
                    if (this.f148090c == null) {
                        this.f148090c = this.f148088a.getAssets();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return new aig0(Okio.source(this.f148090c.open(lxg0Var.f133955a.toString().substring(22))), 2);
    }

    @Override // p153l.uxg0
    /* JADX INFO: renamed from: d */
    public final boolean mo118415d(lxg0 lxg0Var) {
        Uri uri = lxg0Var.f133955a;
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }
}
