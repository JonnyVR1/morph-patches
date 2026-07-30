package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p001ui.dlg.views.CityCoverSmallCardView;
import com.p000p1.mobile.putong.core.p001ui.dlg.views.CityCoverView2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class s45 {
    /* JADX INFO: renamed from: a */
    public static void m9218a(CityCoverView2 cityCoverView2, View view) {
        cityCoverView2.f1441a = (CityCoverView2) view;
        ViewGroup viewGroup = (ViewGroup) view;
        cityCoverView2.f1442b = (CityCoverSmallCardView) viewGroup.getChildAt(0);
        cityCoverView2.f1443c = viewGroup.getChildAt(1);
        cityCoverView2.f1444d = viewGroup.getChildAt(2);
    }
}
