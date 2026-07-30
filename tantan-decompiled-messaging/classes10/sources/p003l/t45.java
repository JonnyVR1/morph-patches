package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p001ui.dlg.views.CityCoverSmallCardView;
import com.p000p1.mobile.putong.core.p001ui.dlg.views.CityCoverView3;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class t45 {
    /* JADX INFO: renamed from: a */
    public static void m9525a(CityCoverView3 cityCoverView3, View view) {
        cityCoverView3.f1448a = (CityCoverView3) view;
        ViewGroup viewGroup = (ViewGroup) view;
        cityCoverView3.f1449b = (CityCoverSmallCardView) viewGroup.getChildAt(0);
        cityCoverView3.f1450c = viewGroup.getChildAt(1);
        cityCoverView3.f1451d = viewGroup.getChildAt(2);
    }
}
