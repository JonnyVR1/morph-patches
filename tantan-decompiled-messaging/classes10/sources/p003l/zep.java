package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.yep;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class zep {
    /* JADX INFO: renamed from: a */
    public static void m11391a(yep yepVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        yepVar.b = viewGroup.getChildAt(0);
        yepVar.c = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        yepVar.d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m11392b(yep yepVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f5508W, viewGroup, false);
        m11391a(yepVar, viewInflate);
        return viewInflate;
    }
}
