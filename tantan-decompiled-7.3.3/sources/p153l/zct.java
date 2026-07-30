package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.livingroom.view.LivePreviewBottomView;
import p151v.VCheckBox;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class zct {
    /* JADX INFO: renamed from: a */
    public static void m219263a(LivePreviewBottomView livePreviewBottomView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        livePreviewBottomView.f52837a = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        livePreviewBottomView.f52838b = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        livePreviewBottomView.f52839c = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        livePreviewBottomView.f52840d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        livePreviewBottomView.f52841e = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        livePreviewBottomView.f52842f = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        livePreviewBottomView.f52843g = (VLinear) viewGroup.getChildAt(2);
        livePreviewBottomView.f52844h = (VCheckBox) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        livePreviewBottomView.f52845i = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }
}
