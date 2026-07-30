package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class wen {
    /* JADX INFO: renamed from: a */
    public static void m206023a(ven venVar, View view) {
        venVar.f183833L = (VText) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m206024b(ven venVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199226r1, viewGroup, false);
        m206023a(venVar, viewInflate);
        return viewInflate;
    }
}
