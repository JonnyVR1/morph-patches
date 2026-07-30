package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import l.mjr;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class njr {
    /* JADX INFO: renamed from: a */
    public static void m8339a(mjr mjrVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        mjrVar.b = viewGroup.getChildAt(0);
        mjrVar.c = viewGroup.getChildAt(1);
        mjrVar.d = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        mjrVar.e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m8340b(mjr mjrVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f5485O0, viewGroup, false);
        m8339a(mjrVar, viewInflate);
        return viewInflate;
    }
}
