package p149l;

import android.annotation.SuppressLint;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public class rbe {

    /* JADX INFO: renamed from: a */
    public int f158600a = -1;

    /* JADX INFO: renamed from: b */
    public boolean f158601b = false;

    /* JADX INFO: renamed from: c */
    public ColorFilter f158602c = null;

    /* JADX INFO: renamed from: d */
    public int f158603d = -1;

    /* JADX INFO: renamed from: e */
    public int f158604e = -1;

    @SuppressLint({"Range"})
    /* JADX INFO: renamed from: a */
    public void m178595a(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        int i = this.f158600a;
        if (i != -1) {
            drawable.setAlpha(i);
        }
        if (this.f158601b) {
            drawable.setColorFilter(this.f158602c);
        }
        int i2 = this.f158603d;
        if (i2 != -1) {
            drawable.setDither(i2 != 0);
        }
        int i3 = this.f158604e;
        if (i3 != -1) {
            drawable.setFilterBitmap(i3 != 0);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m178596b(int i) {
        this.f158600a = i;
    }

    /* JADX INFO: renamed from: c */
    public void m178597c(ColorFilter colorFilter) {
        this.f158602c = colorFilter;
        this.f158601b = colorFilter != null;
    }

    /* JADX INFO: renamed from: d */
    public void m178598d(boolean z) {
        this.f158603d = z ? 1 : 0;
    }

    /* JADX INFO: renamed from: e */
    public void m178599e(boolean z) {
        this.f158604e = z ? 1 : 0;
    }
}
