package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.live.livingroom.common.window.inApp.LiveInAppFloatView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class uzs {
    /* JADX INFO: renamed from: a */
    public static void m198860a(LiveInAppFloatView liveInAppFloatView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveInAppFloatView.f50279a = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        liveInAppFloatView.f50280b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        liveInAppFloatView.f50281c = (ViewStub) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        liveInAppFloatView.f50282d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        liveInAppFloatView.f50283e = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        liveInAppFloatView.f50284f = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
    }
}
