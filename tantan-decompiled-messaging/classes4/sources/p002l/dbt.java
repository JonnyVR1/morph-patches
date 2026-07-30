package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p1.mobile.putong.live.livingroom.view.LivePreviewTopView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class dbt {
    /* JADX INFO: renamed from: a */
    public static void m11732a(LivePreviewTopView livePreviewTopView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        livePreviewTopView.a = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        livePreviewTopView.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        livePreviewTopView.c = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        livePreviewTopView.d = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        livePreviewTopView.e = viewGroup.getChildAt(1);
        livePreviewTopView.f = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        livePreviewTopView.g = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        livePreviewTopView.h = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        livePreviewTopView.i = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(2);
        livePreviewTopView.j = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0);
    }
}
