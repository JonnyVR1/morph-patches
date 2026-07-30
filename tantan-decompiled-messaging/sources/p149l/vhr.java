package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.p053ui.vip.likers.LikersAnimationMaskView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class vhr {
    /* JADX INFO: renamed from: a */
    public static void m198470a(LikersAnimationMaskView likersAnimationMaskView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        likersAnimationMaskView.f37246a = (FrameLayout) viewGroup.getChildAt(0);
        likersAnimationMaskView.f37247b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        likersAnimationMaskView.f37248c = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        likersAnimationMaskView.f37249d = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        likersAnimationMaskView.f37250e = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        likersAnimationMaskView.f37251f = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        likersAnimationMaskView.f37252g = (VText) viewGroup.getChildAt(1);
    }
}
