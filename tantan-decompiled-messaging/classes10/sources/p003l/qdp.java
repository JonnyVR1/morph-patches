package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.vip.privilegeNewUi.view.IntlTopCardLayout;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class qdp {
    /* JADX INFO: renamed from: a */
    public static void m8977a(IntlTopCardLayout intlTopCardLayout, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlTopCardLayout.a = viewGroup.getChildAt(0);
        intlTopCardLayout.b = viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m8978b(IntlTopCardLayout intlTopCardLayout, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.A5, viewGroup, true);
        m8977a(intlTopCardLayout, viewInflate);
        return viewInflate;
    }
}
