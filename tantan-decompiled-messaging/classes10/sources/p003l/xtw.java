package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.map.TouchProxyForMap;
import l.f6c0;
import l.ttw;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class xtw {
    /* JADX INFO: renamed from: a */
    public static void m10956a(ttw ttwVar, View view) {
        ttwVar.a = (TouchProxyForMap) view;
    }

    /* JADX INFO: renamed from: b */
    public static View m10957b(ttw ttwVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.Md, viewGroup, false);
        m10956a(ttwVar, viewInflate);
        return viewInflate;
    }
}
