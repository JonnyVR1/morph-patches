package p149l;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class l30 {

    /* JADX INFO: renamed from: a */
    public Context f125831a;

    public l30(Context context) {
        this.f125831a = context;
    }

    /* JADX INFO: renamed from: b */
    public static l30 m148325b(Context context) {
        return new l30(context);
    }

    /* JADX INFO: renamed from: a */
    public boolean m148326a() {
        return this.f125831a.getApplicationInfo().targetSdkVersion < 14;
    }

    /* JADX INFO: renamed from: c */
    public int m148327c() {
        return this.f125831a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    /* JADX INFO: renamed from: d */
    public int m148328d() {
        Configuration configuration = this.f125831a.getResources().getConfiguration();
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
    public int m148329e() {
        return this.f125831a.getResources().getDimensionPixelSize(p2c0.f146833b);
    }

    /* JADX INFO: renamed from: f */
    public int m148330f() {
        TypedArray typedArrayObtainStyledAttributes = this.f125831a.obtainStyledAttributes(null, aac0.f68418a, n0c0.f136511c, 0);
        int layoutDimension = typedArrayObtainStyledAttributes.getLayoutDimension(aac0.f68463j, 0);
        Resources resources = this.f125831a.getResources();
        if (!m148331g()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(p2c0.f146832a));
        }
        typedArrayObtainStyledAttributes.recycle();
        return layoutDimension;
    }

    /* JADX INFO: renamed from: g */
    public boolean m148331g() {
        return this.f125831a.getResources().getBoolean(s0c0.f161766a);
    }

    /* JADX INFO: renamed from: h */
    public boolean m148332h() {
        return true;
    }
}
