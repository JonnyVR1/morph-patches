package p009l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.data.User;
import com.tantan.library.svga.SVGAnimationView;
import l.t100;
import l.x2c0;
import v.VFrame_FlipContainer;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public interface osl {
    default int getButtonRadius() {
        return t100.d(25.0f);
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
        return x2c0.g4;
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
        return x2c0.u2;
    }

    default int getNormalBg() {
        return x2c0.a2;
    }

    default int getOperationBtnBg() {
        return x2c0.b2;
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
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, t100.d(48.0f));
        layoutParams.bottomMargin = t100.d(16.0f);
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
        return x2c0.q3;
    }

    VText getSuperLikeRemaining();

    View getSuperLikeWarpLayout();

    @Nullable
    nsl getUndo();

    @Nullable
    VFrame_FlipContainer getUndoLayout();

    default int getUndoPressBg() {
        return x2c0.g4;
    }

    void setButtonStyleType(String str);

    void setSuperLikeComboIsSlowly(boolean z);

    /* JADX INFO: renamed from: b */
    default void mo2349b(boolean z) {
    }

    default void setSuperLikeBtnGray(boolean z) {
    }

    /* JADX INFO: renamed from: a */
    default void mo2348a(boolean z, User user, CoreSuggested.UserInfo userInfo) {
    }
}
