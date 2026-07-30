package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import l.f6c0;
import l.xne;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class yne {
    /* JADX INFO: renamed from: a */
    public static void m11267a(xne xneVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        xneVar.u = (FrameLayout) viewGroup.getChildAt(0);
        xneVar.v = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        xneVar.w = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        xneVar.x = viewGroup.getChildAt(1);
        xneVar.y = (FrameLayout) viewGroup.getChildAt(2);
        xneVar.z = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        xneVar.A = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        xneVar.B = viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m11268b(xne xneVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.z9, viewGroup, false);
        m11267a(xneVar, viewInflate);
        return viewInflate;
    }
}
