package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.newui.view.BoostViewContainer;
import p151v.VFrame;

/* JADX INFO: loaded from: classes10.dex */
public class g2g {
    /* JADX INFO: renamed from: a */
    public static void m128619a(z1g z1gVar, View view) {
        z1gVar.f202527a = (VFrame) view;
        z1gVar.f202528b = (BoostViewContainer) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m128620b(z1g z1gVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(pec0.f151954W0, viewGroup, false);
        m128619a(z1gVar, viewInflate);
        return viewInflate;
    }
}
