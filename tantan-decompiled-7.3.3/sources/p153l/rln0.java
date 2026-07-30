package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.livingroom.view.TouchSwallowView;
import com.p051p1.mobile.putong.live.livingroom.voice.call.view.NormalVoiceDeputyItemView;

/* JADX INFO: loaded from: classes4.dex */
public class rln0 {
    /* JADX INFO: renamed from: a */
    public static void m182021a(qln0 qln0Var, View view) {
        qln0Var.f158244e = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        qln0Var.f158245f = (TouchSwallowView) viewGroup.getChildAt(0);
        qln0Var.f158246g = (HorizontalScrollView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        qln0Var.f158247h = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        qln0Var.f158248i = (NormalVoiceDeputyItemView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        qln0Var.f158249j = (NormalVoiceDeputyItemView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        qln0Var.f158250k = (NormalVoiceDeputyItemView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(2);
        qln0Var.f158251l = (NormalVoiceDeputyItemView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(3);
        qln0Var.f158252m = (NormalVoiceDeputyItemView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(4);
        qln0Var.f158253n = (NormalVoiceDeputyItemView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(5);
        qln0Var.f158254o = (NormalVoiceDeputyItemView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(6);
        qln0Var.f158255p = (NormalVoiceDeputyItemView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(7);
    }

    /* JADX INFO: renamed from: b */
    public static View m182022b(qln0 qln0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f198987Y7, viewGroup, false);
        m182021a(qln0Var, viewInflate);
        return viewInflate;
    }
}
