package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class icn {
    /* JADX INFO: renamed from: a */
    public static void m7152a(hcn hcnVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        hcnVar._title = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        hcnVar._positive_primary = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m7153b(hcn hcnVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.E4, viewGroup, false);
        m7152a(hcnVar, viewInflate);
        return viewInflate;
    }
}
