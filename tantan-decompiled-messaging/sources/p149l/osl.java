package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.data.User;
import com.tantan.library.svga.SVGAnimationView;
import p147v.VFrame_FlipContainer;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
public interface osl {
    default int getButtonRadius() {
        return t100.m186890d(25.0f);
    }

    ViewGroup getButtonRootLayout();

    default int getButtonScrolledDistance() {
        return 0;
    }

    @Nullable
    default View getButtonsRightLayout() {
        return null;
    }

    nsl getDislikeBtn();

    default int getDislikePressBg() {
        return x2c0.f190161g4;
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
    default nsl getImmediatelyMatchButton() {
        return null;
    }

    nsl getLikeBtn();

    default int getLikePressBg() {
        return x2c0.f190605u2;
    }

    default int getNormalBg() {
        return x2c0.f189968a2;
    }

    default int getOperationBtnBg() {
        return x2c0.f190000b2;
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
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, t100.m186890d(48.0f));
        layoutParams.bottomMargin = t100.m186890d(16.0f);
        layoutParams.gravity = 81;
        return layoutParams;
    }

    @Nullable
    default View getSayHiNewLayout() {
        return null;
    }

    nsl getSuperLike();

    SVGAnimationView getSuperLikeComboSvga();

    VFrame_FlipContainer getSuperLikeLayout();

    default int getSuperLikePressBg() {
        return x2c0.f190478q3;
    }

    VText getSuperLikeRemaining();

    View getSuperLikeWarpLayout();

    @Nullable
    nsl getUndo();

    @Nullable
    VFrame_FlipContainer getUndoLayout();

    default int getUndoPressBg() {
        return x2c0.f190161g4;
    }

    void setButtonStyleType(String str);

    void setSuperLikeComboIsSlowly(boolean z);

    /* JADX INFO: renamed from: b */
    default void mo38371b(boolean z) {
    }

    default void setSuperLikeBtnGray(boolean z) {
    }

    /* JADX INFO: renamed from: a */
    default void mo38370a(boolean z, User user, CoreSuggested.UserInfo userInfo) {
    }
}
