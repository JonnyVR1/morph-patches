package p153l;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* JADX INFO: loaded from: classes7.dex */
public class jke implements Interpolator {

    /* JADX INFO: renamed from: a */
    private int f121399a = 0;

    /* JADX INFO: renamed from: b */
    private final PointF f121400b;

    /* JADX INFO: renamed from: c */
    private final PointF f121401c;

    public jke(float f, float f2, float f3, float f4) {
        PointF pointF = new PointF();
        this.f121400b = pointF;
        PointF pointF2 = new PointF();
        this.f121401c = pointF2;
        pointF.x = f;
        pointF.y = f2;
        pointF2.x = f3;
        pointF2.y = f4;
    }

    /* JADX INFO: renamed from: a */
    public static double m145844a(double d, double d2, double d3, double d4, double d5) {
        double d6 = 1.0d - d;
        double d7 = d * d;
        double d8 = d6 * d6;
        return (d8 * d6 * d2) + (d8 * 3.0d * d * d3) + (d6 * 3.0d * d7 * d4) + (d7 * d * d5);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        float f2 = f;
        for (int i = this.f121399a; i < 4096; i++) {
            f2 = (i * 1.0f) / 4096.0f;
            if (m145844a(f2, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, this.f121400b.x, this.f121401c.x, 1.0d) >= f) {
                this.f121399a = i;
                break;
            }
        }
        double dM145844a = m145844a(f2, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, this.f121400b.y, this.f121401c.y, 1.0d);
        if (dM145844a > 0.999d) {
            this.f121399a = 0;
            dM145844a = 1.0d;
        }
        return (float) dM145844a;
    }
}
