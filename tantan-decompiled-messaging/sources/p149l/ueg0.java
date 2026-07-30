package p149l;

import android.content.Context;
import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public final class ueg0 implements e8g0 {

    /* JADX INFO: renamed from: a */
    public final o9g0 f176041a;

    public ueg0(Context context) {
        this.f176041a = new o9g0(slq0.m184844a(context));
    }

    /* JADX INFO: renamed from: a */
    public final int m193252a() {
        return this.f176041a.maxSize();
    }

    /* JADX INFO: renamed from: b */
    public final Bitmap m193253b(String str) {
        meg0 meg0Var = (meg0) this.f176041a.get(str);
        if (meg0Var != null) {
            return meg0Var.f133415a;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m193254c(String str, Bitmap bitmap) {
        if (str == null || bitmap == null) {
            jfd0.m141176a("key == null || bitmap == null");
            return;
        }
        int iM184845b = slq0.m184845b(bitmap);
        int iMaxSize = this.f176041a.maxSize();
        o9g0 o9g0Var = this.f176041a;
        if (iM184845b > iMaxSize) {
            o9g0Var.remove(str);
        } else {
            o9g0Var.put(str, new meg0(bitmap, iM184845b));
        }
    }

    /* JADX INFO: renamed from: d */
    public final int m193255d() {
        return this.f176041a.size();
    }
}
