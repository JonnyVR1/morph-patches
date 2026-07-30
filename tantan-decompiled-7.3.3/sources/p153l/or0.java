package p153l;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;

/* JADX INFO: loaded from: classes7.dex */
public class or0 {

    /* JADX INFO: renamed from: a */
    public static final Interpolator f148661a = new LinearInterpolator();

    /* JADX INFO: renamed from: b */
    public static final Interpolator f148662b = new zjg();

    /* JADX INFO: renamed from: c */
    public static final Interpolator f148663c = new yjg();

    /* JADX INFO: renamed from: d */
    public static final Interpolator f148664d = new lor();

    /* JADX INFO: renamed from: e */
    public static final Interpolator f148665e = new DecelerateInterpolator();

    /* JADX INFO: renamed from: f */
    public static final Interpolator f148666f = new PathInterpolator(0.3f, 0.6f, 0.0f, 1.0f);

    /* JADX INFO: renamed from: a */
    public static int m168852a(int i, int i2, float f) {
        return i + Math.round(f * (i2 - i));
    }
}
