package p153l;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.CommonMedalView;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public interface c5m {
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
