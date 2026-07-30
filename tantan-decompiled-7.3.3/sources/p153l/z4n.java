package p153l;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.p051p1.mobile.putong.core.p058ui.vip.privilegeNewUi.view.bottom.IntlBottomContentCoverView;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m88121d2 = {"Ll/z4n;", "Landroidx/viewpager/widget/ViewPager$k;", "<init>", "()V", "Landroid/view/View;", OMSTemplateModeType.page, "", "position", "", "a", "(Landroid/view/View;F)V", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class z4n implements ViewPager.InterfaceC0719k {
    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0719k
    /* JADX INFO: renamed from: a */
    public void mo4205a(@NotNull View page, float position) {
        page.getClass();
        if (page instanceof IntlBottomContentCoverView) {
            IntlBottomContentCoverView intlBottomContentCoverView = (IntlBottomContentCoverView) page;
            intlBottomContentCoverView.m58869b(0.0f);
            if (position <= -1.0f) {
                intlBottomContentCoverView.setAlpha(0.0f);
                intlBottomContentCoverView.setVisibility(8);
                return;
            }
            if (position <= 0.0f) {
                intlBottomContentCoverView.setVisibility(0);
                intlBottomContentCoverView.setTranslationX(Math.abs((position / 2.0f) * page.getWidth()));
                intlBottomContentCoverView.setAlpha(1.0f - (-position));
            } else if (position < 1.0f) {
                intlBottomContentCoverView.setVisibility(0);
                intlBottomContentCoverView.setTranslationX(-Math.abs((position / 2.0f) * page.getWidth()));
                intlBottomContentCoverView.setAlpha(1.0f - position);
            } else if (position >= 1.0f) {
                intlBottomContentCoverView.setAlpha(0.0f);
                intlBottomContentCoverView.setVisibility(8);
            }
        }
    }
}
