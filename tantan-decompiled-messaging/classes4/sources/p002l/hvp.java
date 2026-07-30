package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import l.gvp;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class hvp {
    /* JADX INFO: renamed from: a */
    public static void m14858a(gvp gvpVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        gvpVar.a = viewGroup.getChildAt(0);
        gvpVar.b = (LinearLayout) viewGroup.getChildAt(1);
        gvpVar.c = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        gvpVar.d = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        gvpVar.e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        gvpVar.f = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m14859b(gvp gvpVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19638P2, viewGroup, false);
        m14858a(gvpVar, viewInflate);
        return viewInflate;
    }
}
