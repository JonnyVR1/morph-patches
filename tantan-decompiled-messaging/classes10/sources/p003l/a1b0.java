package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import l.z0b0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class a1b0 {
    /* JADX INFO: renamed from: a */
    public static void m5268a(z0b0 z0b0Var, View view) {
        z0b0Var.f = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        z0b0Var.g = viewGroup.getChildAt(0);
        z0b0Var.h = (TextView) viewGroup.getChildAt(1);
    }
}
