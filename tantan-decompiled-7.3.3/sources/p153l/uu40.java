package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.core.p058ui.VText_Medium;
import p151v.VImage;
import p151v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class uu40 {
    /* JADX INFO: renamed from: a */
    public static void m198149a(tu40 tu40Var, View view) {
        tu40Var.f176144e = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        tu40Var.f176145f = viewGroup.getChildAt(0);
        tu40Var.f176146g = (VLinear) viewGroup.getChildAt(1);
        tu40Var.f176147h = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        tu40Var.f176148i = (RelativeLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        tu40Var.f176149j = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        tu40Var.f176150k = (RelativeLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        tu40Var.f176151l = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        tu40Var.f176152m = (RelativeLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
        tu40Var.f176153n = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2)).getChildAt(0);
        tu40Var.f176154o = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3);
        tu40Var.f176155p = (VText_Medium) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(1);
        tu40Var.f176156q = (RelativeLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(4);
        tu40Var.f176157r = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(4)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m198150b(tu40 tu40Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f126119w9, viewGroup, false);
        m198149a(tu40Var, viewInflate);
        return viewInflate;
    }
}
