package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p001ui.dlg.views.CityCoverSmallCardView;
import com.p000p1.mobile.putong.core.p001ui.dlg.views.CityCoverView4;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class d55 {
    /* JADX INFO: renamed from: a */
    public static void m6060a(CityCoverView4 cityCoverView4, View view) {
        cityCoverView4.f1456a = (CityCoverView4) view;
        ViewGroup viewGroup = (ViewGroup) view;
        cityCoverView4.f1457b = (CityCoverSmallCardView) viewGroup.getChildAt(0);
        cityCoverView4.f1458c = viewGroup.getChildAt(1);
        cityCoverView4.f1459d = viewGroup.getChildAt(2);
        cityCoverView4.f1460e = viewGroup.getChildAt(3);
    }
}
