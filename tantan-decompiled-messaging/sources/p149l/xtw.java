package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.map.TouchProxyForMap;

/* JADX INFO: loaded from: classes10.dex */
public class xtw {
    /* JADX INFO: renamed from: a */
    public static void m211026a(ttw ttwVar, View view) {
        ttwVar.f172069a = (TouchProxyForMap) view;
    }

    /* JADX INFO: renamed from: b */
    public static View m211027b(ttw ttwVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95472Md, viewGroup, false);
        m211026a(ttwVar, viewInflate);
        return viewInflate;
    }
}
