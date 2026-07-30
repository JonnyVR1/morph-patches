package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes10.dex */
public class zab0 {
    /* JADX INFO: renamed from: a */
    public static void m217732a(yab0 yab0Var, View view) {
        yab0Var._root = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        yab0Var._intro_root = (FrameLayout) viewGroup.getChildAt(0);
        yab0Var._payment_root = (FrameLayout) viewGroup.getChildAt(1);
        yab0Var._agreement_root = (FrameLayout) viewGroup.getChildAt(2);
    }
}
