package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import l.d6n;
import l.m6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class e6n {
    /* JADX INFO: renamed from: a */
    public static void m6244a(d6n d6nVar, View view) {
        d6nVar.a = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        d6nVar.b = (TextView) viewGroup.getChildAt(0);
        d6nVar.c = (TextView) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m6245b(d6n d6nVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(m6c0.r, viewGroup, false);
        m6244a(d6nVar, viewInflate);
        return viewInflate;
    }
}
