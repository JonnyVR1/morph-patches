package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.p058ui.vip.likers.LikersAnimationMaskView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class wjr {
    /* JADX INFO: renamed from: a */
    public static void m206732a(LikersAnimationMaskView likersAnimationMaskView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        likersAnimationMaskView.f38094a = (FrameLayout) viewGroup.getChildAt(0);
        likersAnimationMaskView.f38095b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        likersAnimationMaskView.f38096c = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        likersAnimationMaskView.f38097d = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        likersAnimationMaskView.f38098e = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        likersAnimationMaskView.f38099f = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        likersAnimationMaskView.f38100g = (VText) viewGroup.getChildAt(1);
    }
}
