package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p151v.VCheckBox;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class z8b0 {
    /* JADX INFO: renamed from: a */
    public static void m218962a(y8b0 y8b0Var, View view) {
        y8b0Var._root = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        y8b0Var._check = (VCheckBox) viewGroup.getChildAt(0);
        y8b0Var._agreement = (VText) viewGroup.getChildAt(1);
    }
}
