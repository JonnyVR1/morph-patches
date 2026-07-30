package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import l.bdr;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class cdr {
    /* JADX INFO: renamed from: a */
    public static void m5932a(bdr bdrVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        bdrVar.d = viewGroup.getChildAt(0);
        bdrVar.e = (TextView) viewGroup.getChildAt(1);
        bdrVar.f = (TextView) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m5933b(bdr bdrVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.R4, viewGroup, false);
        m5932a(bdrVar, viewInflate);
        return viewInflate;
    }
}
