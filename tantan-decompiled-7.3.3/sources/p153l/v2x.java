package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VList;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class v2x {
    /* JADX INFO: renamed from: a */
    public static void m199155a(u2x u2xVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        u2xVar.f177250c = (VText) viewGroup.getChildAt(0);
        u2xVar.f177251d = (VList) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m199156b(u2x u2xVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(sec0.f167569h0, viewGroup, false);
        m199155a(u2xVar, viewInflate);
        return viewInflate;
    }
}
