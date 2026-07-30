package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes10.dex */
public class iib0 {
    /* JADX INFO: renamed from: a */
    public static void m140062a(hib0 hib0Var, View view) {
        hib0Var._scroll = (HorizontalScrollView) view;
        hib0Var._content = (LinearLayout) ((ViewGroup) view).getChildAt(0);
    }
}
