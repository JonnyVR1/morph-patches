package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.feed.newui.photoalbum.redpointview.FeedRedDotView;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class ha4 {
    /* JADX INFO: renamed from: a */
    public static void m134127a(ga4 ga4Var, View view) {
        ga4Var.f102954a = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        ga4Var.f102955b = (VText) viewGroup.getChildAt(0);
        ga4Var.f102956c = (FeedRedDotView) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m134128b(ga4 ga4Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173609Y, viewGroup, false);
        m134127a(ga4Var, viewInflate);
        return viewInflate;
    }
}
