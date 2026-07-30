package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.external.internal.live.square.home.submodule.topButton.LiveSquareTopButtonLiveView;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class l6u {
    /* JADX INFO: renamed from: a */
    public static void m153104a(LiveSquareTopButtonLiveView liveSquareTopButtonLiveView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveSquareTopButtonLiveView.f45879a = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        liveSquareTopButtonLiveView.f45880b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        liveSquareTopButtonLiveView.f45881c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        liveSquareTopButtonLiveView.f45882d = viewGroup.getChildAt(1);
    }
}
