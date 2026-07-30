package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.p051p1.mobile.putong.feed.p065ui.moments.MomentHeaderLargeView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear_FillerMeasure;
import p151v.VText;
import p151v.VText_Expandable;

/* JADX INFO: loaded from: classes13.dex */
public class po00 {
    /* JADX INFO: renamed from: a */
    public static void m173094a(MomentHeaderLargeView momentHeaderLargeView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        momentHeaderLargeView.f44603d = (VLinear_FillerMeasure) viewGroup.getChildAt(0);
        momentHeaderLargeView.f44604e = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        momentHeaderLargeView.f44605f = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        momentHeaderLargeView.f44606g = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        momentHeaderLargeView.f44607h = (VText) viewGroup.getChildAt(1);
        momentHeaderLargeView.f44608i = (FrameLayout) viewGroup.getChildAt(2);
        momentHeaderLargeView.f44609j = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        momentHeaderLargeView.f44610k = (VText_Expandable) viewGroup.getChildAt(4);
    }
}
