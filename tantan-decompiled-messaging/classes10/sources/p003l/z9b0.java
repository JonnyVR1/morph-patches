package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p1.mobile.putong.core.ui.purchase.mediator.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class z9b0 {
    /* JADX INFO: renamed from: a */
    public static void m11379a(c cVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cVar.d = viewGroup.getChildAt(0);
        cVar.e = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        cVar.f = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        cVar.g = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        cVar.h = viewGroup.getChildAt(1);
        cVar.i = (FrameLayout) viewGroup.getChildAt(2);
    }
}
