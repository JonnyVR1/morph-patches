package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes10.dex */
public class r0b0 {
    /* JADX INFO: renamed from: a */
    public static void m177379a(q0b0 q0b0Var, View view) {
        q0b0Var._agreement_root = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        q0b0Var._check = viewGroup.getChildAt(0);
        q0b0Var._agreement = (TextView) viewGroup.getChildAt(1);
    }
}
