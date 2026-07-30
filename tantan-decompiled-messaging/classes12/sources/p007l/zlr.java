package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class zlr {
    /* JADX INFO: renamed from: a */
    public static void m17511a(xlr xlrVar, View view) {
        xlrVar.f15036a = (LinearLayout) view;
        xlrVar.f15037b = ((ViewGroup) ((ViewGroup) view).getChildAt(0)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m17512b(xlr xlrVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11044E4, viewGroup, false);
        m17511a(xlrVar, viewInflate);
        return viewInflate;
    }
}
