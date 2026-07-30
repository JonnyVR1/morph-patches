package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.live.livingroom.view.LivePreviewTopView;
import p147v.VDraweeView;
import p147v.VEditText;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class dbt {
    /* JADX INFO: renamed from: a */
    public static void m110647a(LivePreviewTopView livePreviewTopView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        livePreviewTopView.f52009a = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        livePreviewTopView.f52010b = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        livePreviewTopView.f52011c = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        livePreviewTopView.f52012d = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        livePreviewTopView.f52013e = (VLinear) viewGroup.getChildAt(1);
        livePreviewTopView.f52014f = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        livePreviewTopView.f52015g = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        livePreviewTopView.f52016h = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        livePreviewTopView.f52017i = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(2);
        livePreviewTopView.f52018j = (VEditText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0);
    }
}
