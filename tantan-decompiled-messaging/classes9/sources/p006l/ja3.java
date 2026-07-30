package p006l;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.vipfrag.view.bottom.BottomContentCoverView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ll/ja3;", "Landroidx/viewpager/widget/ViewPager$k;", "<init>", "()V", "Landroid/view/View;", "page", "", "position", "", "a", "(Landroid/view/View;F)V", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ja3 implements ViewPager.k {
    /* JADX INFO: renamed from: a */
    public void m17406a(@NotNull View page, float position) {
        page.getClass();
        if ((page instanceof BottomContentCoverView ? (BottomContentCoverView) page : null) == null) {
            return;
        }
        BottomContentCoverView bottomContentCoverView = (BottomContentCoverView) page;
        bottomContentCoverView.m10945b(0.0f);
        if (position <= -1.0f) {
            bottomContentCoverView.setAlpha(0.0f);
            bottomContentCoverView.setVisibility(8);
            return;
        }
        if (position <= 0.0f) {
            bottomContentCoverView.setVisibility(0);
            bottomContentCoverView.setTranslationX(Math.abs((position / 2.0f) * page.getWidth()));
            ((BottomContentCoverView) page).setAlpha(1.0f - (-position));
        } else if (position < 1.0f) {
            bottomContentCoverView.setVisibility(0);
            bottomContentCoverView.setTranslationX(-Math.abs((position / 2.0f) * page.getWidth()));
            ((BottomContentCoverView) page).setAlpha(1.0f - position);
        } else if (position >= 1.0f) {
            bottomContentCoverView.setAlpha(0.0f);
            bottomContentCoverView.setVisibility(8);
        }
    }
}
