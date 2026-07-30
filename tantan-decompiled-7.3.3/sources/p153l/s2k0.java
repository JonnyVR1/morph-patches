package p153l;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: loaded from: classes4.dex */
public class s2k0 implements ViewPager.InterfaceC0719k {

    /* JADX INFO: renamed from: a */
    public float f165902a = ((bnl0.m105592y0() - qa00.m175859d(218.0f)) / 2) / qa00.m175859d(218.0f);

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0719k
    /* JADX INFO: renamed from: a */
    public void mo4205a(@NonNull View view, float f) {
        float f2 = f - this.f165902a;
        if (Math.abs(f2) <= 0.01d) {
            f2 = 0.0f;
        } else if (((double) Math.abs(f2)) + 0.01d >= 1.0d) {
            f2 = f2 > 0.0f ? 1.0f : -1.0f;
        }
        if (f2 <= -1.0f) {
            view.setAlpha(0.6f);
            m184128d(view, 0.8f);
        } else if (f2 >= 1.0f) {
            view.setAlpha(0.6f);
            m184128d(view, 0.8f);
        } else if (f2 < 0.0f) {
            view.setAlpha(m184127c(f2, 0.6f));
            m184128d(view, m184127c(f2, 0.8f));
        } else {
            view.setAlpha(m184126b(f2, 0.6f));
            m184128d(view, m184126b(f2, 0.8f));
        }
    }

    /* JADX INFO: renamed from: b */
    public final float m184126b(float f, float f2) {
        return f2 + ((1.0f - f2) * (1.0f - f));
    }

    /* JADX INFO: renamed from: c */
    public final float m184127c(float f, float f2) {
        return f2 + ((1.0f - f2) * (f + 1.0f));
    }

    /* JADX INFO: renamed from: d */
    public final void m184128d(View view, float f) {
        view.setScaleX(f);
        view.setScaleY(f);
    }
}
