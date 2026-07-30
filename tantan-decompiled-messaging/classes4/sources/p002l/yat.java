package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p1.mobile.putong.live.livingroom.view.LivePreviewBottomView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class yat {
    /* JADX INFO: renamed from: a */
    public static void m26494a(LivePreviewBottomView livePreviewBottomView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        livePreviewBottomView.a = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        livePreviewBottomView.b = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        livePreviewBottomView.c = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        livePreviewBottomView.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        livePreviewBottomView.e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        livePreviewBottomView.f = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        livePreviewBottomView.g = viewGroup.getChildAt(2);
        livePreviewBottomView.h = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        livePreviewBottomView.i = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }
}
