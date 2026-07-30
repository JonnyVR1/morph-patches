package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.external.internal.live.square.home.submodule.topButton.LiveSquareTopButtonLiveView;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class k4u {
    /* JADX INFO: renamed from: a */
    public static void m144513a(LiveSquareTopButtonLiveView liveSquareTopButtonLiveView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveSquareTopButtonLiveView.f45031a = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        liveSquareTopButtonLiveView.f45032b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        liveSquareTopButtonLiveView.f45033c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        liveSquareTopButtonLiveView.f45034d = viewGroup.getChildAt(1);
    }
}
