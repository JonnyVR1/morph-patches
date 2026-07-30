package p153l;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.p051p1.mobile.putong.core.p058ui.vip.intlPrivilege.view.bottom.IntlBottomContentCoverView;

/* JADX INFO: loaded from: classes12.dex */
public class a5n implements ViewPager.InterfaceC0719k {
    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0719k
    /* JADX INFO: renamed from: a */
    public void mo4205a(View view, float f) {
        if (view instanceof IntlBottomContentCoverView) {
            ((IntlBottomContentCoverView) view).m57723a(0.0f);
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
