package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import l.f6c0;
import l.kuw;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class luw {
    /* JADX INFO: renamed from: a */
    public static void m7919a(kuw kuwVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        kuwVar.a = viewGroup.getChildAt(0);
        kuwVar.b = (LinearLayout) viewGroup.getChildAt(1);
        kuwVar.c = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m7920b(kuw kuwVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.Od, viewGroup, false);
        m7919a(kuwVar, viewInflate);
        return viewInflate;
    }
}
