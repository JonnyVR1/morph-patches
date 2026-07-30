package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes10.dex */
public class a1b0 {
    /* JADX INFO: renamed from: a */
    public static void m94547a(z0b0 z0b0Var, View view) {
        z0b0Var._agreement_root = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        z0b0Var._check = viewGroup.getChildAt(0);
        z0b0Var._agreement = (TextView) viewGroup.getChildAt(1);
    }
}
