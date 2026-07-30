package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.feed.p060ui.moments.MomentActivitiesView;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class z800 {
    /* JADX INFO: renamed from: a */
    public static void m217553a(MomentActivitiesView momentActivitiesView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        momentActivitiesView.f43663a = (FrameLayout) viewGroup.getChildAt(0);
        momentActivitiesView.f43664b = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        momentActivitiesView.f43665c = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        momentActivitiesView.f43666d = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        momentActivitiesView.f43667e = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        momentActivitiesView.f43668f = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(2);
        momentActivitiesView.f43669g = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        momentActivitiesView.f43670h = (VButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        momentActivitiesView.f43671i = viewGroup.getChildAt(1);
    }
}
