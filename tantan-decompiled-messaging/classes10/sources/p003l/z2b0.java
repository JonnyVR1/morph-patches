package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.purchase.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class z2b0 {
    /* JADX INFO: renamed from: a */
    public static void m11323a(b bVar, View view) {
        bVar.h = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        bVar.i = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        bVar.j = (FrameLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        bVar.k = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        bVar.l = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(2);
        bVar.m = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        bVar.n = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        bVar.o = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        bVar.p = viewGroup.getChildAt(1);
    }
}
