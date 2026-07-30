package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.base.view.MaxSizeLayout;
import com.p046p1.mobile.putong.live.base.view.RatioLayout;
import com.p046p1.mobile.putong.live.livingroom.common.signin.main.TaskView;
import com.p046p1.mobile.putong.live.livingroom.common.signin.prize.LiveSignInProgressView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class qfi0 {
    /* JADX INFO: renamed from: a */
    public static void m174335a(TaskView taskView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        taskView.f49324a = (VImage) viewGroup.getChildAt(0);
        taskView.f49325b = (RatioLayout) viewGroup.getChildAt(1);
        taskView.f49326c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        taskView.f49327d = (HorizontalScrollView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        taskView.f49328e = (MaxSizeLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        taskView.f49329f = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        taskView.f49330g = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        taskView.f49331h = (LiveSignInProgressView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        taskView.f49332i = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(2);
        taskView.f49333j = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(2)).getChildAt(0);
        taskView.f49334k = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(2)).getChildAt(1);
        taskView.f49335l = (AnimEffectPlayer) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }
}
