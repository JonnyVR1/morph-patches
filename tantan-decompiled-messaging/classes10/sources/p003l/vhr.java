package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p1.mobile.putong.core.ui.vip.likers.LikersAnimationMaskView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class vhr {
    /* JADX INFO: renamed from: a */
    public static void m10229a(LikersAnimationMaskView likersAnimationMaskView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        likersAnimationMaskView.a = (FrameLayout) viewGroup.getChildAt(0);
        likersAnimationMaskView.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        likersAnimationMaskView.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        likersAnimationMaskView.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        likersAnimationMaskView.e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        likersAnimationMaskView.f = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        likersAnimationMaskView.g = viewGroup.getChildAt(1);
    }
}
