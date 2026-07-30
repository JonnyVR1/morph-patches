package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import l.f6c0;
import l.ttw;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class vtw {
    /* JADX INFO: renamed from: a */
    public static void m10348a(ttw ttwVar, View view) {
        ttwVar.c = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        ttwVar.d = viewGroup.getChildAt(0);
        ttwVar.e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        ttwVar.f = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m10349b(ttw ttwVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.Kd, viewGroup, false);
        m10348a(ttwVar, viewInflate);
        return viewInflate;
    }
}
