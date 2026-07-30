package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import l.f6c0;
import l.r7p;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class t7p {
    /* JADX INFO: renamed from: a */
    public static void m9547a(r7p r7pVar, View view) {
        r7pVar.b = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        r7pVar.c = viewGroup.getChildAt(0);
        r7pVar.d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        r7pVar.e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        r7pVar.f = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        r7pVar.g = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        r7pVar.h = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        r7pVar.i = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        r7pVar.j = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m9548b(r7p r7pVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.C5, viewGroup, false);
        m9547a(r7pVar, viewInflate);
        return viewInflate;
    }
}
