package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.live.livingroom.view.LivePreviewTopView;
import p151v.VDraweeView;
import p151v.VEditText;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class edt {
    /* JADX INFO: renamed from: a */
    public static void m120519a(LivePreviewTopView livePreviewTopView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        livePreviewTopView.f52857a = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        livePreviewTopView.f52858b = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        livePreviewTopView.f52859c = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        livePreviewTopView.f52860d = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        livePreviewTopView.f52861e = (VLinear) viewGroup.getChildAt(1);
        livePreviewTopView.f52862f = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        livePreviewTopView.f52863g = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        livePreviewTopView.f52864h = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        livePreviewTopView.f52865i = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(2);
        livePreviewTopView.f52866j = (VEditText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0);
    }
}
