package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.p046p1.mobile.putong.feed.p060ui.moments.MomentHeaderLargeView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear_FillerMeasure;
import p147v.VText;
import p147v.VText_Expandable;

/* JADX INFO: loaded from: classes12.dex */
public class gg00 {
    /* JADX INFO: renamed from: a */
    public static void m125937a(MomentHeaderLargeView momentHeaderLargeView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        momentHeaderLargeView.f43755d = (VLinear_FillerMeasure) viewGroup.getChildAt(0);
        momentHeaderLargeView.f43756e = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        momentHeaderLargeView.f43757f = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        momentHeaderLargeView.f43758g = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        momentHeaderLargeView.f43759h = (VText) viewGroup.getChildAt(1);
        momentHeaderLargeView.f43760i = (FrameLayout) viewGroup.getChildAt(2);
        momentHeaderLargeView.f43761j = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        momentHeaderLargeView.f43762k = (VText_Expandable) viewGroup.getChildAt(4);
    }
}
