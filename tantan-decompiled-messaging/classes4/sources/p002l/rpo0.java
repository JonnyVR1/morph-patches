package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import l.qpo0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class rpo0 {
    /* JADX INFO: renamed from: a */
    public static void m22096a(qpo0 qpo0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        qpo0Var.x = (LinearLayout) viewGroup.getChildAt(0);
        qpo0Var.y = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        qpo0Var.z = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        qpo0Var.A = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        qpo0Var.B = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        qpo0Var.C = (ImageView) viewGroup.getChildAt(1);
    }
}
