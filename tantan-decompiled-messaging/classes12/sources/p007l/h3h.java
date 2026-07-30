package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class h3h {
    /* JADX INFO: renamed from: a */
    public static void m10516a(g3h g3hVar, View view) {
        g3hVar.f8328f = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        g3hVar.f8329g = viewGroup.getChildAt(0);
        g3hVar.f8330h = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        g3hVar.f8331i = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        g3hVar.f8332j = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m10517b(g3h g3hVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11305t0, viewGroup, false);
        m10516a(g3hVar, viewInflate);
        return viewInflate;
    }
}
