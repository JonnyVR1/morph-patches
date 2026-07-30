package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.data.User;
import com.tantan.library.svga.SVGAnimationView;
import p151v.VFrame_FlipContainer;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes11.dex */
public interface bvl {
    default int getButtonRadius() {
        return qa00.m175859d(25.0f);
    }

    ViewGroup getButtonRootLayout();

    default int getButtonScrolledDistance() {
        return 0;
    }

    @Nullable
    default View getButtonsRightLayout() {
        return null;
    }

    avl getDislikeBtn();

    default int getDislikePressBg() {
        return dbc0.f87043h4;
    }

    @Nullable
    default View getImmediatelyAndSuperLikeLayout() {
        return null;
    }

    @Nullable
    default View getImmediatelyMatch() {
        return null;
    }

    @Nullable
    default avl getImmediatelyMatchButton() {
        return null;
    }

    avl getLikeBtn();

    default int getLikePressBg() {
        return dbc0.f87500v2;
    }

    default int getNormalBg() {
        return dbc0.f86844b2;
    }

    default int getOperationBtnBg() {
        return dbc0.f86877c2;
    }

    @Nullable
    default VImage getPinImage() {
        return null;
    }

    @Nullable
    default VText getPinText() {
        return null;
    }

    default FrameLayout.LayoutParams getRootBtnLayoutParams() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, qa00.m175859d(48.0f));
        layoutParams.bottomMargin = qa00.m175859d(16.0f);
        layoutParams.gravity = 81;
        return layoutParams;
    }

    @Nullable
    default View getSayHiNewLayout() {
        return null;
    }

    avl getSuperLike();

    SVGAnimationView getSuperLikeComboSvga();

    VFrame_FlipContainer getSuperLikeLayout();

    default int getSuperLikePressBg() {
        return dbc0.f87370r3;
    }

    VText getSuperLikeRemaining();

    View getSuperLikeWarpLayout();

    @Nullable
    avl getUndo();

    @Nullable
    VFrame_FlipContainer getUndoLayout();

    default int getUndoPressBg() {
        return dbc0.f87043h4;
    }

    void setButtonStyleType(String str);

    void setSuperLikeComboIsSlowly(boolean z);

    /* JADX INFO: renamed from: b */
    default void mo39374b(boolean z) {
    }

    default void setSuperLikeBtnGray(boolean z) {
    }

    /* JADX INFO: renamed from: a */
    default void mo39373a(boolean z, User user, CoreSuggested.UserInfo userInfo) {
    }
}
