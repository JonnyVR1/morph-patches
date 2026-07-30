package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.livingroom.view.LivePreviewBottomView;
import p147v.VCheckBox;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class yat {
    /* JADX INFO: renamed from: a */
    public static void m213871a(LivePreviewBottomView livePreviewBottomView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        livePreviewBottomView.f51989a = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        livePreviewBottomView.f51990b = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        livePreviewBottomView.f51991c = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        livePreviewBottomView.f51992d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        livePreviewBottomView.f51993e = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        livePreviewBottomView.f51994f = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        livePreviewBottomView.f51995g = (VLinear) viewGroup.getChildAt(2);
        livePreviewBottomView.f51996h = (VCheckBox) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        livePreviewBottomView.f51997i = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }
}
