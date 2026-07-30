package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.livingroom.view.TouchSwallowView;
import com.p046p1.mobile.putong.live.livingroom.voice.call.view.NormalVoiceDeputyItemView;

/* JADX INFO: loaded from: classes4.dex */
public class rcn0 {
    /* JADX INFO: renamed from: a */
    public static void m178809a(qcn0 qcn0Var, View view) {
        qcn0Var.f153767e = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        qcn0Var.f153768f = (TouchSwallowView) viewGroup.getChildAt(0);
        qcn0Var.f153769g = (HorizontalScrollView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        qcn0Var.f153770h = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        qcn0Var.f153771i = (NormalVoiceDeputyItemView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        qcn0Var.f153772j = (NormalVoiceDeputyItemView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        qcn0Var.f153773k = (NormalVoiceDeputyItemView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(2);
        qcn0Var.f153774l = (NormalVoiceDeputyItemView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(3);
        qcn0Var.f153775m = (NormalVoiceDeputyItemView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(4);
        qcn0Var.f153776n = (NormalVoiceDeputyItemView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(5);
        qcn0Var.f153777o = (NormalVoiceDeputyItemView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(6);
        qcn0Var.f153778p = (NormalVoiceDeputyItemView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(7);
        qcn0Var.f153779q = (NormalVoiceDeputyItemView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(8);
        qcn0Var.f153780r = (NormalVoiceDeputyItemView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(9);
    }

    /* JADX INFO: renamed from: b */
    public static View m178810b(qcn0 qcn0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168280a8, viewGroup, false);
        m178809a(qcn0Var, viewInflate);
        return viewInflate;
    }
}
