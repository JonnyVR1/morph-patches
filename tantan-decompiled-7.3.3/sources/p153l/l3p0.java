package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.livingroom.voice.call.view.NormalVoiceDeputyItemView;
import p151v.VLinear;

/* JADX INFO: loaded from: classes4.dex */
public class l3p0 {
    /* JADX INFO: renamed from: a */
    public static void m152732a(k3p0 k3p0Var, View view) {
        k3p0Var.f123750e = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        k3p0Var.f123751f = (VLinear) viewGroup.getChildAt(0);
        k3p0Var.f123752g = (NormalVoiceDeputyItemView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        k3p0Var.f123753h = (NormalVoiceDeputyItemView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        k3p0Var.f123754i = (NormalVoiceDeputyItemView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        k3p0Var.f123755j = (NormalVoiceDeputyItemView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        k3p0Var.f123756k = (NormalVoiceDeputyItemView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        k3p0Var.f123757l = (VLinear) viewGroup.getChildAt(1);
        k3p0Var.f123758m = (NormalVoiceDeputyItemView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        k3p0Var.f123759n = (NormalVoiceDeputyItemView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        k3p0Var.f123760o = (NormalVoiceDeputyItemView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        k3p0Var.f123761p = (NormalVoiceDeputyItemView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        k3p0Var.f123762q = (NormalVoiceDeputyItemView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m152733b(k3p0 k3p0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199064e8, viewGroup, false);
        m152732a(k3p0Var, viewInflate);
        return viewInflate;
    }
}
