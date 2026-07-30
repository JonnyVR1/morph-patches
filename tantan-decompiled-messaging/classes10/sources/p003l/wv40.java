package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class wv40 {
    /* JADX INFO: renamed from: a */
    public static void m10565a(vv40 vv40Var, View view) {
        vv40Var.f8050a = (RelativeLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        vv40Var.f8051b = viewGroup.getChildAt(0);
        vv40Var.f8052c = viewGroup.getChildAt(1);
        vv40Var.f8053d = viewGroup.getChildAt(2);
        vv40Var.f8054e = viewGroup.getChildAt(3);
        vv40Var.f8055f = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        vv40Var.f8056g = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        vv40Var.f8057h = viewGroup.getChildAt(5);
        vv40Var.f8058i = ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        vv40Var.f8059j = ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1);
        vv40Var.f8060k = viewGroup.getChildAt(6);
        vv40Var.f8061l = (LinearLayout) viewGroup.getChildAt(7);
        vv40Var.f8062m = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(0);
        vv40Var.f8063n = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(0)).getChildAt(0);
        vv40Var.f8064o = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(0)).getChildAt(1);
        vv40Var.f8065p = (LinearLayout) viewGroup.getChildAt(8);
        vv40Var.f8066q = ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(0);
        vv40Var.f8067r = ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(2);
        vv40Var.f8068s = viewGroup.getChildAt(9);
        vv40Var.f8069t = ((ViewGroup) viewGroup.getChildAt(9)).getChildAt(0);
        vv40Var.f8070u = (FrameLayout) viewGroup.getChildAt(10);
        vv40Var.f8071v = ((ViewGroup) viewGroup.getChildAt(10)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m10566b(vv40 vv40Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f5492Q1, viewGroup, false);
        m10565a(vv40Var, viewInflate);
        return viewInflate;
    }
}
