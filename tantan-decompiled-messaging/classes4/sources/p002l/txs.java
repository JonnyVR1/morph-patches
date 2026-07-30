package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.live.livingroom.common.window.inApp.LiveInAppFloatView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class txs {
    /* JADX INFO: renamed from: a */
    public static void m23231a(LiveInAppFloatView liveInAppFloatView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveInAppFloatView.f5473a = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        liveInAppFloatView.f5474b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        liveInAppFloatView.f5475c = (ViewStub) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        liveInAppFloatView.f5476d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        liveInAppFloatView.f5477e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        liveInAppFloatView.f5478f = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
    }
}
