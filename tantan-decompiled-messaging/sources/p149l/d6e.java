package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class d6e {
    /* JADX INFO: renamed from: a */
    public static void m110163a(c6e c6eVar, View view) {
        c6eVar.f79530k = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        c6eVar.f79531l = (LinearLayout) viewGroup.getChildAt(0);
        c6eVar.f79532m = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        c6eVar.f79533n = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        c6eVar.f79534o = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }
}
