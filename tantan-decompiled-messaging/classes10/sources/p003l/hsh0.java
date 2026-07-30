package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p1.mobile.putong.core.ui.purchase.f;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class hsh0 {
    /* JADX INFO: renamed from: a */
    public static void m7071a(f fVar, View view) {
        fVar.h = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        fVar.i = (FrameLayout) viewGroup.getChildAt(0);
        fVar.j = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        fVar.k = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        fVar.l = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        fVar.m = (FrameLayout) viewGroup.getChildAt(1);
        fVar.n = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        fVar.o = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
