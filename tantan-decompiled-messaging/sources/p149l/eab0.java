package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes10.dex */
public class eab0 {
    /* JADX INFO: renamed from: a */
    public static void m115415a(dab0 dab0Var, View view) {
        dab0Var._scroll = (HorizontalScrollView) view;
        dab0Var._content = (LinearLayout) ((ViewGroup) view).getChildAt(0);
    }
}
