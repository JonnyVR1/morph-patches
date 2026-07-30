package p149l;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.p046p1.mobile.putong.core.p053ui.vip.intlPrivilege.view.bottom.IntlBottomContentCoverView;

/* JADX INFO: loaded from: classes9.dex */
public class a3n implements ViewPager.InterfaceC0717k {
    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0717k
    /* JADX INFO: renamed from: a */
    public void mo4203a(View view, float f) {
        if (view instanceof IntlBottomContentCoverView) {
            ((IntlBottomContentCoverView) view).m56540a(0.0f);
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
