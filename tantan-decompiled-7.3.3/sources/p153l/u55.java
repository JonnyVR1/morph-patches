package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.dlg.views.CityCoverSmallCardView;
import com.p051p1.mobile.putong.core.p058ui.dlg.views.CityCoverView3;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class u55 {
    /* JADX INFO: renamed from: a */
    public static void m194540a(CityCoverView3 cityCoverView3, View view) {
        cityCoverView3.f29902a = (CityCoverView3) view;
        ViewGroup viewGroup = (ViewGroup) view;
        cityCoverView3.f29903b = (CityCoverSmallCardView) viewGroup.getChildAt(0);
        cityCoverView3.f29904c = (VText) viewGroup.getChildAt(1);
        cityCoverView3.f29905d = (VText) viewGroup.getChildAt(2);
    }
}
