package p002l;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.viewpager.widget.ViewPager;
import l.t100;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ptj0 implements ViewPager.k {

    /* JADX INFO: renamed from: a */
    public float f17644a = ((xdl0.y0() - t100.d(218.0f)) / 2) / t100.d(218.0f);

    /* JADX INFO: renamed from: a */
    public void m20678a(@NonNull View view, float f) {
        float f2 = f - this.f17644a;
        if (Math.abs(f2) <= 0.01d) {
            f2 = 0.0f;
        } else if (((double) Math.abs(f2)) + 0.01d >= 1.0d) {
            f2 = f2 > 0.0f ? 1.0f : -1.0f;
        }
        if (f2 <= -1.0f) {
            view.setAlpha(0.6f);
            m20681d(view, 0.8f);
        } else if (f2 >= 1.0f) {
            view.setAlpha(0.6f);
            m20681d(view, 0.8f);
        } else if (f2 < 0.0f) {
            view.setAlpha(m20680c(f2, 0.6f));
            m20681d(view, m20680c(f2, 0.8f));
        } else {
            view.setAlpha(m20679b(f2, 0.6f));
            m20681d(view, m20679b(f2, 0.8f));
        }
    }

    /* JADX INFO: renamed from: b */
    public final float m20679b(float f, float f2) {
        return f2 + ((1.0f - f2) * (1.0f - f));
    }

    /* JADX INFO: renamed from: c */
    public final float m20680c(float f, float f2) {
        return f2 + ((1.0f - f2) * (f + 1.0f));
    }

    /* JADX INFO: renamed from: d */
    public final void m20681d(View view, float f) {
        view.setScaleX(f);
        view.setScaleY(f);
    }
}
