package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.livingroom.view.TouchSwallowView;
import com.p046p1.mobile.putong.live.livingroom.voice.call.view.NormalVoiceDeputyItemView;

/* JADX INFO: loaded from: classes4.dex */
public class ncn0 {
    /* JADX INFO: renamed from: a */
    public static void m158958a(mcn0 mcn0Var, View view) {
        mcn0Var.f133159e = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        mcn0Var.f133160f = (TouchSwallowView) viewGroup.getChildAt(0);
        mcn0Var.f133161g = (HorizontalScrollView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        mcn0Var.f133162h = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        mcn0Var.f133163i = (NormalVoiceDeputyItemView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        mcn0Var.f133164j = (NormalVoiceDeputyItemView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        mcn0Var.f133165k = (NormalVoiceDeputyItemView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(2);
        mcn0Var.f133166l = (NormalVoiceDeputyItemView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(3);
        mcn0Var.f133167m = (NormalVoiceDeputyItemView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(4);
        mcn0Var.f133168n = (NormalVoiceDeputyItemView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(5);
        mcn0Var.f133169o = (NormalVoiceDeputyItemView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(6);
        mcn0Var.f133170p = (NormalVoiceDeputyItemView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(7);
    }

    /* JADX INFO: renamed from: b */
    public static View m158959b(mcn0 mcn0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168255Y7, viewGroup, false);
        m158958a(mcn0Var, viewInflate);
        return viewInflate;
    }
}
