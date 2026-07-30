package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import l.f6c0;
import l.lbm;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class mbm {
    /* JADX INFO: renamed from: a */
    public static void m8139a(lbm lbmVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        lbmVar.h = viewGroup.getChildAt(0);
        lbmVar.i = (LinearLayout) viewGroup.getChildAt(1);
        lbmVar.j = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        lbmVar.k = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        lbmVar.l = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        lbmVar.m = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        lbmVar.n = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        lbmVar.o = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m8140b(lbm lbmVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.uc, viewGroup, false);
        m8139a(lbmVar, viewInflate);
        return viewInflate;
    }
}
