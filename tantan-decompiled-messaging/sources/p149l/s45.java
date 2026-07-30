package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.dlg.views.CityCoverSmallCardView;
import com.p046p1.mobile.putong.core.p053ui.dlg.views.CityCoverView2;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class s45 {
    /* JADX INFO: renamed from: a */
    public static void m182207a(CityCoverView2 cityCoverView2, View view) {
        cityCoverView2.f29047a = (CityCoverView2) view;
        ViewGroup viewGroup = (ViewGroup) view;
        cityCoverView2.f29048b = (CityCoverSmallCardView) viewGroup.getChildAt(0);
        cityCoverView2.f29049c = (VText) viewGroup.getChildAt(1);
        cityCoverView2.f29050d = (VText) viewGroup.getChildAt(2);
    }
}
