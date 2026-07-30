package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.feed.p065ui.moments.MomentActivitiesView;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class ih00 {
    /* JADX INFO: renamed from: a */
    public static void m139967a(MomentActivitiesView momentActivitiesView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        momentActivitiesView.f44511a = (FrameLayout) viewGroup.getChildAt(0);
        momentActivitiesView.f44512b = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        momentActivitiesView.f44513c = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        momentActivitiesView.f44514d = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        momentActivitiesView.f44515e = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        momentActivitiesView.f44516f = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(2);
        momentActivitiesView.f44517g = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        momentActivitiesView.f44518h = (VButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        momentActivitiesView.f44519i = viewGroup.getChildAt(1);
    }
}
