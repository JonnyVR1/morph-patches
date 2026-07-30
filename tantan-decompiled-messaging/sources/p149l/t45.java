package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.dlg.views.CityCoverSmallCardView;
import com.p046p1.mobile.putong.core.p053ui.dlg.views.CityCoverView3;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class t45 {
    /* JADX INFO: renamed from: a */
    public static void m187147a(CityCoverView3 cityCoverView3, View view) {
        cityCoverView3.f29054a = (CityCoverView3) view;
        ViewGroup viewGroup = (ViewGroup) view;
        cityCoverView3.f29055b = (CityCoverSmallCardView) viewGroup.getChildAt(0);
        cityCoverView3.f29056c = (VText) viewGroup.getChildAt(1);
        cityCoverView3.f29057d = (VText) viewGroup.getChildAt(2);
    }
}
