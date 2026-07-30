package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes10.dex */
public class e9b0 {
    /* JADX INFO: renamed from: a */
    public static void m119881a(d9b0 d9b0Var, View view) {
        d9b0Var._agreement_root = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        d9b0Var._check = viewGroup.getChildAt(0);
        d9b0Var._agreement = (TextView) viewGroup.getChildAt(1);
    }
}
