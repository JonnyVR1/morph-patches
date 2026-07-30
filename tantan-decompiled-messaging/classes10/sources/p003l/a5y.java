package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import l.z4y;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class a5y {
    /* JADX INFO: renamed from: a */
    public static void m5277a(z4y z4yVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        z4yVar.b = viewGroup.getChildAt(0);
        z4yVar.c = (LinearLayout) viewGroup.getChildAt(1);
        z4yVar.d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        z4yVar.e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        z4yVar.f = (TextView) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m5278b(z4y z4yVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f5614z0, viewGroup, false);
        m5277a(z4yVar, viewInflate);
        return viewInflate;
    }
}
