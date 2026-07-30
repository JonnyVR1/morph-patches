package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class txa0 {
    /* JADX INFO: renamed from: a */
    public static void m193486a(sxa0 sxa0Var, View view) {
        sxa0Var.f171101f = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        sxa0Var.f171102g = (VLinear) viewGroup.getChildAt(0);
        sxa0Var.f171103h = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        sxa0Var.f171104i = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        sxa0Var.f171105j = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        sxa0Var.f171106k = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        sxa0Var.f171107l = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        sxa0Var.f171108m = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        sxa0Var.f171109n = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6);
    }

    /* JADX INFO: renamed from: b */
    public static View m193487b(sxa0 sxa0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125603Ra, viewGroup, false);
        m193486a(sxa0Var, viewInflate);
        return viewInflate;
    }
}
