package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class u0a {
    /* JADX INFO: renamed from: a */
    public static void m191312a(t0a t0aVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        t0aVar.f167119a = (LinearLayout) viewGroup.getChildAt(0);
        t0aVar.f167120b = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        t0aVar.f167121c = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        t0aVar.f167122d = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(2);
        t0aVar.f167123e = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(3);
        t0aVar.f167124f = (GridView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        t0aVar.f167125g = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        t0aVar.f167126h = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        t0aVar.f167127i = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        t0aVar.f167128j = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0);
        t0aVar.f167129k = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m191313b(t0a t0aVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(l6c0.f126504k2, viewGroup, false);
        m191312a(t0aVar, viewInflate);
        return viewInflate;
    }
}
