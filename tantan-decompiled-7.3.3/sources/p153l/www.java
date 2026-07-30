package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.map.TouchProxyForMap;

/* JADX INFO: loaded from: classes10.dex */
public class www {
    /* JADX INFO: renamed from: a */
    public static void m208319a(sww swwVar, View view) {
        swwVar.f171021a = (TouchProxyForMap) view;
    }

    /* JADX INFO: renamed from: b */
    public static View m208320b(sww swwVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125638Td, viewGroup, false);
        m208319a(swwVar, viewInflate);
        return viewInflate;
    }
}
