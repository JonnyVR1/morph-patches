package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p147v.VCheckBox;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class v0b0 {
    /* JADX INFO: renamed from: a */
    public static void m196481a(u0b0 u0b0Var, View view) {
        u0b0Var._root = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        u0b0Var._check = (VCheckBox) viewGroup.getChildAt(0);
        u0b0Var._agreement = (VText) viewGroup.getChildAt(1);
    }
}
