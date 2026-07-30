package p149l;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* JADX INFO: loaded from: classes7.dex */
public class fje implements Interpolator {

    /* JADX INFO: renamed from: a */
    private int f97771a = 0;

    /* JADX INFO: renamed from: b */
    private final PointF f97772b;

    /* JADX INFO: renamed from: c */
    private final PointF f97773c;

    public fje(float f, float f2, float f3, float f4) {
        PointF pointF = new PointF();
        this.f97772b = pointF;
        PointF pointF2 = new PointF();
        this.f97773c = pointF2;
        pointF.x = f;
        pointF.y = f2;
        pointF2.x = f3;
        pointF2.y = f4;
    }

    /* JADX INFO: renamed from: a */
    public static double m121579a(double d, double d2, double d3, double d4, double d5) {
        double d6 = 1.0d - d;
        double d7 = d * d;
        double d8 = d6 * d6;
        return (d8 * d6 * d2) + (d8 * 3.0d * d * d3) + (d6 * 3.0d * d7 * d4) + (d7 * d * d5);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        float f2 = f;
        for (int i = this.f97771a; i < 4096; i++) {
            f2 = (i * 1.0f) / 4096.0f;
            if (m121579a(f2, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, this.f97772b.x, this.f97773c.x, 1.0d) >= f) {
                this.f97771a = i;
                break;
            }
        }
        double dM121579a = m121579a(f2, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, this.f97772b.y, this.f97773c.y, 1.0d);
        if (dM121579a > 0.999d) {
            this.f97771a = 0;
            dM121579a = 1.0d;
        }
        return (float) dM121579a;
    }
}
