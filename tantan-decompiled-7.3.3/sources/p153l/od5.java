package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class od5 {
    /* JADX INFO: renamed from: a */
    public static void m167278a(nd5 nd5Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        nd5Var.f141426a = (LinearLayout) viewGroup.getChildAt(0);
        nd5Var.f141427b = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        nd5Var.f141428c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        nd5Var.f141429d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        nd5Var.f141430e = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        nd5Var.f141431f = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        nd5Var.f141432g = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        nd5Var.f141433h = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        nd5Var.f141434i = (VText) viewGroup.getChildAt(2);
    }
}
