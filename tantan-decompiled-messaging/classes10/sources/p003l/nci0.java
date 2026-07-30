package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import l.mci0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class nci0 {
    /* JADX INFO: renamed from: a */
    public static void m8323a(mci0 mci0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        mci0Var.b = viewGroup.getChildAt(0);
        mci0Var.c = viewGroup.getChildAt(1);
        mci0Var.d = viewGroup.getChildAt(2);
        mci0Var.e = (RadioGroup) viewGroup.getChildAt(3);
        mci0Var.f = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        mci0Var.g = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        mci0Var.h = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        mci0Var.i = viewGroup.getChildAt(4);
    }
}
