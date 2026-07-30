package p149l;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: loaded from: classes4.dex */
public class ptj0 implements ViewPager.InterfaceC0717k {

    /* JADX INFO: renamed from: a */
    public float f151169a = ((xdl0.m208412y0() - t100.m186890d(218.0f)) / 2) / t100.m186890d(218.0f);

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0717k
    /* JADX INFO: renamed from: a */
    public void mo4203a(@NonNull View view, float f) {
        float f2 = f - this.f151169a;
        if (Math.abs(f2) <= 0.01d) {
            f2 = 0.0f;
        } else if (((double) Math.abs(f2)) + 0.01d >= 1.0d) {
            f2 = f2 > 0.0f ? 1.0f : -1.0f;
        }
        if (f2 <= -1.0f) {
            view.setAlpha(0.6f);
            m171326d(view, 0.8f);
        } else if (f2 >= 1.0f) {
            view.setAlpha(0.6f);
            m171326d(view, 0.8f);
        } else if (f2 < 0.0f) {
            view.setAlpha(m171325c(f2, 0.6f));
            m171326d(view, m171325c(f2, 0.8f));
        } else {
            view.setAlpha(m171324b(f2, 0.6f));
            m171326d(view, m171324b(f2, 0.8f));
        }
    }

    /* JADX INFO: renamed from: b */
    public final float m171324b(float f, float f2) {
        return f2 + ((1.0f - f2) * (1.0f - f));
    }

    /* JADX INFO: renamed from: c */
    public final float m171325c(float f, float f2) {
        return f2 + ((1.0f - f2) * (f + 1.0f));
    }

    /* JADX INFO: renamed from: d */
    public final void m171326d(View view, float f) {
        view.setScaleX(f);
        view.setScaleY(f);
    }
}
