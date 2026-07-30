package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.base.view.MaxSizeLayout;
import com.p051p1.mobile.putong.live.base.view.RatioLayout;
import com.p051p1.mobile.putong.live.livingroom.common.signin.main.TaskView;
import com.p051p1.mobile.putong.live.livingroom.common.signin.prize.LiveSignInProgressView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class qoi0 {
    /* JADX INFO: renamed from: a */
    public static void m177305a(TaskView taskView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        taskView.f50172a = (VImage) viewGroup.getChildAt(0);
        taskView.f50173b = (RatioLayout) viewGroup.getChildAt(1);
        taskView.f50174c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        taskView.f50175d = (HorizontalScrollView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        taskView.f50176e = (MaxSizeLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        taskView.f50177f = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        taskView.f50178g = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        taskView.f50179h = (LiveSignInProgressView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        taskView.f50180i = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(2);
        taskView.f50181j = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(2)).getChildAt(0);
        taskView.f50182k = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(2)).getChildAt(1);
        taskView.f50183l = (AnimEffectPlayer) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }
}
