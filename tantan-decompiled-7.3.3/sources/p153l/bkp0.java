package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p151v.VEditText;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class bkp0 {
    /* JADX INFO: renamed from: a */
    public static void m104838a(ujp0 ujp0Var, View view) {
        ujp0Var.f179309a = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        ujp0Var.f179310b = viewGroup.getChildAt(0);
        ujp0Var.f179311c = viewGroup.getChildAt(1);
        ujp0Var.f179312d = (RelativeLayout) viewGroup.getChildAt(2);
        ujp0Var.f179313e = (VLinear) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        ujp0Var.f179314f = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        ujp0Var.f179315g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
        ujp0Var.f179316h = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(2);
        ujp0Var.f179317i = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        ujp0Var.f179318j = (VEditText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0);
        ujp0Var.f179319k = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m104839b(ujp0 ujp0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199093gb, viewGroup, false);
        m104838a(ujp0Var, viewInflate);
        return viewInflate;
    }
}
