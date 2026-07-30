package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.live.livingroom.common.window.inApp.LiveInAppFloatView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class txs {
    /* JADX INFO: renamed from: a */
    public static void m190974a(LiveInAppFloatView liveInAppFloatView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveInAppFloatView.f49431a = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        liveInAppFloatView.f49432b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        liveInAppFloatView.f49433c = (ViewStub) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        liveInAppFloatView.f49434d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        liveInAppFloatView.f49435e = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        liveInAppFloatView.f49436f = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
    }
}
