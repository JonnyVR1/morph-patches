package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.livingroom.view.TouchSwallowView;
import com.p051p1.mobile.putong.live.livingroom.voice.call.view.NormalVoiceDeputyItemView;

/* JADX INFO: loaded from: classes4.dex */
public class tln0 {
    /* JADX INFO: renamed from: a */
    public static void m191656a(sln0 sln0Var, View view) {
        sln0Var.f169396e = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        sln0Var.f169397f = (TouchSwallowView) viewGroup.getChildAt(0);
        sln0Var.f169398g = (HorizontalScrollView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        sln0Var.f169399h = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        sln0Var.f169400i = (NormalVoiceDeputyItemView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        sln0Var.f169401j = (NormalVoiceDeputyItemView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        sln0Var.f169402k = (NormalVoiceDeputyItemView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(2);
        sln0Var.f169403l = (NormalVoiceDeputyItemView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(3);
        sln0Var.f169404m = (NormalVoiceDeputyItemView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(4);
        sln0Var.f169405n = (NormalVoiceDeputyItemView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(5);
        sln0Var.f169406o = (NormalVoiceDeputyItemView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(6);
        sln0Var.f169407p = (NormalVoiceDeputyItemView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(7);
        sln0Var.f169408q = (NormalVoiceDeputyItemView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(8);
    }

    /* JADX INFO: renamed from: b */
    public static View m191657b(sln0 sln0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f198999Z7, viewGroup, false);
        m191656a(sln0Var, viewInflate);
        return viewInflate;
    }
}
