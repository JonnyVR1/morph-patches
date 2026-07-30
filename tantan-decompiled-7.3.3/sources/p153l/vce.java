package p153l;

import android.annotation.SuppressLint;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public class vce {

    /* JADX INFO: renamed from: a */
    public int f183456a = -1;

    /* JADX INFO: renamed from: b */
    public boolean f183457b = false;

    /* JADX INFO: renamed from: c */
    public ColorFilter f183458c = null;

    /* JADX INFO: renamed from: d */
    public int f183459d = -1;

    /* JADX INFO: renamed from: e */
    public int f183460e = -1;

    @SuppressLint({"Range"})
    /* JADX INFO: renamed from: a */
    public void m200797a(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        int i = this.f183456a;
        if (i != -1) {
            drawable.setAlpha(i);
        }
        if (this.f183457b) {
            drawable.setColorFilter(this.f183458c);
        }
        int i2 = this.f183459d;
        if (i2 != -1) {
            drawable.setDither(i2 != 0);
        }
        int i3 = this.f183460e;
        if (i3 != -1) {
            drawable.setFilterBitmap(i3 != 0);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m200798b(int i) {
        this.f183456a = i;
    }

    /* JADX INFO: renamed from: c */
    public void m200799c(ColorFilter colorFilter) {
        this.f183458c = colorFilter;
        this.f183457b = colorFilter != null;
    }

    /* JADX INFO: renamed from: d */
    public void m200800d(boolean z) {
        this.f183459d = z ? 1 : 0;
    }

    /* JADX INFO: renamed from: e */
    public void m200801e(boolean z) {
        this.f183460e = z ? 1 : 0;
    }
}
