package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.livingroom.view.TouchSwallowView;
import com.p051p1.mobile.putong.live.livingroom.voice.call.view.NormalVoiceDeputyItemView;

/* JADX INFO: loaded from: classes4.dex */
public class vln0 {
    /* JADX INFO: renamed from: a */
    public static void m201651a(uln0 uln0Var, View view) {
        uln0Var.f179525e = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        uln0Var.f179526f = (TouchSwallowView) viewGroup.getChildAt(0);
        uln0Var.f179527g = (HorizontalScrollView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        uln0Var.f179528h = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        uln0Var.f179529i = (NormalVoiceDeputyItemView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        uln0Var.f179530j = (NormalVoiceDeputyItemView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        uln0Var.f179531k = (NormalVoiceDeputyItemView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(2);
        uln0Var.f179532l = (NormalVoiceDeputyItemView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(3);
        uln0Var.f179533m = (NormalVoiceDeputyItemView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(4);
        uln0Var.f179534n = (NormalVoiceDeputyItemView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(5);
        uln0Var.f179535o = (NormalVoiceDeputyItemView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(6);
        uln0Var.f179536p = (NormalVoiceDeputyItemView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(7);
        uln0Var.f179537q = (NormalVoiceDeputyItemView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(8);
        uln0Var.f179538r = (NormalVoiceDeputyItemView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(9);
    }

    /* JADX INFO: renamed from: b */
    public static View m201652b(uln0 uln0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199012a8, viewGroup, false);
        m201651a(uln0Var, viewInflate);
        return viewInflate;
    }
}
