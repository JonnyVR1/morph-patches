package p153l;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class f30 {

    /* JADX INFO: renamed from: a */
    public Context f96937a;

    public f30(Context context) {
        this.f96937a = context;
    }

    /* JADX INFO: renamed from: b */
    public static f30 m123689b(Context context) {
        return new f30(context);
    }

    /* JADX INFO: renamed from: a */
    public boolean m123690a() {
        return this.f96937a.getApplicationInfo().targetSdkVersion < 14;
    }

    /* JADX INFO: renamed from: c */
    public int m123691c() {
        return this.f96937a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    /* JADX INFO: renamed from: d */
    public int m123692d() {
        Configuration configuration = this.f96937a.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600) {
            return 5;
        }
        if (i > 960 && i2 > 720) {
            return 5;
        }
        if (i > 720 && i2 > 960) {
            return 5;
        }
        if (i >= 500) {
            return 4;
        }
        if (i > 640 && i2 > 480) {
            return 4;
        }
        if (i <= 480 || i2 <= 640) {
            return i >= 360 ? 3 : 2;
        }
        return 4;
    }

    /* JADX INFO: renamed from: e */
    public int m123693e() {
        return this.f96937a.getResources().getDimensionPixelSize(wac0.f188105b);
    }

    /* JADX INFO: renamed from: f */
    public int m123694f() {
        TypedArray typedArrayObtainStyledAttributes = this.f96937a.obtainStyledAttributes(null, gic0.f104344a, s8c0.f166783c, 0);
        int layoutDimension = typedArrayObtainStyledAttributes.getLayoutDimension(gic0.f104389j, 0);
        Resources resources = this.f96937a.getResources();
        if (!m123695g()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(wac0.f188104a));
        }
        typedArrayObtainStyledAttributes.recycle();
        return layoutDimension;
    }

    /* JADX INFO: renamed from: g */
    public boolean m123695g() {
        return this.f96937a.getResources().getBoolean(x8c0.f192812a);
    }

    /* JADX INFO: renamed from: h */
    public boolean m123696h() {
        return true;
    }
}
