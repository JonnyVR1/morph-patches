package p006l;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.p000p1.mobile.putong.core.p004ui.vip.intlPrivilege.view.bottom.IntlBottomContentCoverView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class a3n implements ViewPager.k {
    /* JADX INFO: renamed from: a */
    public void m11717a(View view, float f) {
        if (view instanceof IntlBottomContentCoverView) {
            ((IntlBottomContentCoverView) view).m9982a(0.0f);
            if (f <= -1.0f) {
                view.setAlpha(0.0f);
                view.setVisibility(8);
                return;
            }
            if (f <= 0.0f) {
                view.setVisibility(0);
                view.setTranslationX(Math.abs((f / 2.0f) * view.getWidth()));
                view.setAlpha(1.0f - (-f));
            } else if (f < 1.0f) {
                view.setVisibility(0);
                view.setTranslationX(-Math.abs((f / 2.0f) * view.getWidth()));
                view.setAlpha(1.0f - f);
            } else if (f >= 1.0f) {
                view.setAlpha(0.0f);
                view.setVisibility(8);
            }
        }
    }
}
