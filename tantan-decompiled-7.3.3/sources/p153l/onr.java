package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.newui.view.BoostViewContainer;
import p151v.VFrame;

/* JADX INFO: loaded from: classes10.dex */
public class onr {
    /* JADX INFO: renamed from: a */
    public static void m168346a(nnr nnrVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        nnrVar.f142835a = (VFrame) viewGroup.getChildAt(0);
        nnrVar.f142836b = (BoostViewContainer) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        nnrVar.f142837c = (VFrame) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m168347b(nnr nnrVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(pec0.f151957X0, viewGroup, false);
        m168346a(nnrVar, viewInflate);
        return viewInflate;
    }
}
