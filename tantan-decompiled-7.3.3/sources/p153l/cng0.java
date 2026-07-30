package p153l;

import android.content.Context;
import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public final class cng0 implements mgg0 {

    /* JADX INFO: renamed from: a */
    public final whg0 f82722a;

    public cng0(Context context) {
        this.f82722a = new whg0(yuq0.m217465a(context));
    }

    /* JADX INFO: renamed from: a */
    public final int m111515a() {
        return this.f82722a.maxSize();
    }

    /* JADX INFO: renamed from: b */
    public final Bitmap m111516b(String str) {
        umg0 umg0Var = (umg0) this.f82722a.get(str);
        if (umg0Var != null) {
            return umg0Var.f179633a;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m111517c(String str, Bitmap bitmap) {
        if (str == null || bitmap == null) {
            mnd0.m159157a("key == null || bitmap == null");
            return;
        }
        int iM217466b = yuq0.m217466b(bitmap);
        int iMaxSize = this.f82722a.maxSize();
        whg0 whg0Var = this.f82722a;
        if (iM217466b > iMaxSize) {
            whg0Var.remove(str);
        } else {
            whg0Var.put(str, new umg0(bitmap, iM217466b));
        }
    }

    /* JADX INFO: renamed from: d */
    public final int m111518d() {
        return this.f82722a.size();
    }
}
