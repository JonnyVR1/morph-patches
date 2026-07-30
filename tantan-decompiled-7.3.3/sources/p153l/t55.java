package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.dlg.views.CityCoverSmallCardView;
import com.p051p1.mobile.putong.core.p058ui.dlg.views.CityCoverView2;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class t55 {
    /* JADX INFO: renamed from: a */
    public static void m189375a(CityCoverView2 cityCoverView2, View view) {
        cityCoverView2.f29895a = (CityCoverView2) view;
        ViewGroup viewGroup = (ViewGroup) view;
        cityCoverView2.f29896b = (CityCoverSmallCardView) viewGroup.getChildAt(0);
        cityCoverView2.f29897c = (VText) viewGroup.getChildAt(1);
        cityCoverView2.f29898d = (VText) viewGroup.getChildAt(2);
    }
}
