package p149l;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.common.usercard.CommonMedalView;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public interface j2m {
    default CommonMedalView getCommonIconView() {
        return null;
    }

    VButton getCraftButton();

    FrameLayout getDescLayout();

    default AnimEffectPlayer getDynamicIcon() {
        return null;
    }

    VImage getRightArrowView();

    ViewGroup getRightContentView();

    VText getRightDescView();

    VText getRightDurationView();

    VDraweeView getRightIconView();

    VImage getRightLockIconView();

    VText getRightTitleView();
}
