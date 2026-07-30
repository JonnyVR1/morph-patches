package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.f6c0;
import l.ttw;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class wtw {
    /* JADX INFO: renamed from: a */
    public static void m10545a(ttw ttwVar, View view) {
        ttwVar.b = (VText) view;
    }

    /* JADX INFO: renamed from: b */
    public static View m10546b(ttw ttwVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.Ld, viewGroup, false);
        m10545a(ttwVar, viewInflate);
        return viewInflate;
    }
}
