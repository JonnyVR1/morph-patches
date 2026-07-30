package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class luk0 {
    /* JADX INFO: renamed from: a */
    public static void m155942a(kuk0 kuk0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        kuk0Var.f128876a = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        kuk0Var.f128877b = (AnimEffectPlayer) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        kuk0Var.f128878c = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        kuk0Var.f128879d = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        kuk0Var.f128880e = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2)).getChildAt(1)).getChildAt(0);
        kuk0Var.f128881f = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2)).getChildAt(1)).getChildAt(1);
        kuk0Var.f128882g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3);
        kuk0Var.f128883h = (FrameLayout) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m155943b(kuk0 kuk0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199051d8, viewGroup, false);
        m155942a(kuk0Var, viewInflate);
        return viewInflate;
    }
}
