package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.vip.intlPrivilege.view.IntlTopCardLayout;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class pdp {
    /* JADX INFO: renamed from: a */
    public static void m8735a(IntlTopCardLayout intlTopCardLayout, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlTopCardLayout.a = viewGroup.getChildAt(0);
        intlTopCardLayout.b = viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m8736b(IntlTopCardLayout intlTopCardLayout, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.g5, viewGroup, true);
        m8735a(intlTopCardLayout, viewInflate);
        return viewInflate;
    }
}
