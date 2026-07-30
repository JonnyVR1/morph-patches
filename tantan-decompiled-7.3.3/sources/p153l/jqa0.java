package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import p151v.VButton;
import p151v.VFrame;
import p151v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class jqa0 {
    /* JADX INFO: renamed from: a */
    public static void m146567a(iqa0 iqa0Var, View view) {
        iqa0Var.f116393a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        iqa0Var.f116394b = (TextView) viewGroup.getChildAt(0);
        iqa0Var.f116395c = (TextView) viewGroup.getChildAt(1);
        iqa0Var.f116396d = (VFrame) viewGroup.getChildAt(2);
        iqa0Var.f116397e = (VButton) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m146568b(iqa0 iqa0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(sec0.f167506D0, viewGroup, false);
        m146567a(iqa0Var, viewInflate);
        return viewInflate;
    }
}
