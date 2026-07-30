package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.newui.view.BoostViewContainer;
import p151v.VFrame;

/* JADX INFO: loaded from: classes10.dex */
public class rio {
    /* JADX INFO: renamed from: a */
    public static void m181599a(pio pioVar, View view) {
        pioVar.f152558a = (VFrame) view;
        pioVar.f152559b = (BoostViewContainer) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m181600b(pio pioVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(pec0.f151932P, viewGroup, false);
        m181599a(pioVar, viewInflate);
        return viewInflate;
    }
}
