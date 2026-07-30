package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import l.f6c0;
import l.ndr;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class odr {
    /* JADX INFO: renamed from: a */
    public static void m8446a(ndr ndrVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        ndrVar.b = (ImageView) viewGroup.getChildAt(0);
        ndrVar.c = viewGroup.getChildAt(1);
        ndrVar.d = (TextView) viewGroup.getChildAt(2);
        ndrVar.e = (TextView) viewGroup.getChildAt(3);
        ndrVar.f = viewGroup.getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m8447b(ndr ndrVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.Q4, viewGroup, false);
        m8446a(ndrVar, viewInflate);
        return viewInflate;
    }
}
