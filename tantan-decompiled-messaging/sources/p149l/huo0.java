package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.livingroom.voice.call.view.NormalVoiceDeputyItemView;
import p147v.VLinear;

/* JADX INFO: loaded from: classes4.dex */
public class huo0 {
    /* JADX INFO: renamed from: a */
    public static void m133140a(guo0 guo0Var, View view) {
        guo0Var.f104441e = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        guo0Var.f104442f = (VLinear) viewGroup.getChildAt(0);
        guo0Var.f104443g = (NormalVoiceDeputyItemView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        guo0Var.f104444h = (NormalVoiceDeputyItemView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        guo0Var.f104445i = (NormalVoiceDeputyItemView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        guo0Var.f104446j = (NormalVoiceDeputyItemView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        guo0Var.f104447k = (NormalVoiceDeputyItemView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        guo0Var.f104448l = (VLinear) viewGroup.getChildAt(1);
        guo0Var.f104449m = (NormalVoiceDeputyItemView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        guo0Var.f104450n = (NormalVoiceDeputyItemView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        guo0Var.f104451o = (NormalVoiceDeputyItemView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        guo0Var.f104452p = (NormalVoiceDeputyItemView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        guo0Var.f104453q = (NormalVoiceDeputyItemView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m133141b(guo0 guo0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168332e8, viewGroup, false);
        m133140a(guo0Var, viewInflate);
        return viewInflate;
    }
}
