package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Guideline;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class th10 {
    /* JADX INFO: renamed from: a */
    public static void m188843a(mh10 mh10Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        mh10Var._apply_title = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        mh10Var._horizontal_line = (Guideline) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        mh10Var._vertical_line = (Guideline) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        mh10Var._reject = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        mh10Var._divider = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        mh10Var._agree = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
    }
}
