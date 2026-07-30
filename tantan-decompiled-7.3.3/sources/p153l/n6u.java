package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.external.internal.live.square.home.submodule.topButton.LiveSquareTopButtonLiveView;
import com.p051p1.mobile.putong.live.external.internal.live.square.home.submodule.topButton.LiveSquareTopButtonVChatView;
import com.p051p1.mobile.putong.live.external.internal.live.square.home.submodule.topButton.LiveSquareTopButtonViewModel;
import com.p051p1.mobile.putong.live.external.internal.live.square.home.submodule.topButton.LiveSquareTopButtonVoiceView;

/* JADX INFO: loaded from: classes9.dex */
public class n6u {
    /* JADX INFO: renamed from: a */
    public static void m161804a(LiveSquareTopButtonViewModel liveSquareTopButtonViewModel, View view) {
        liveSquareTopButtonViewModel.f45884c = (LiveSquareTopButtonViewModel) view;
        ViewGroup viewGroup = (ViewGroup) view;
        liveSquareTopButtonViewModel.f45885d = (LiveSquareTopButtonLiveView) viewGroup.getChildAt(0);
        liveSquareTopButtonViewModel.f45886e = (LiveSquareTopButtonVoiceView) viewGroup.getChildAt(1);
        liveSquareTopButtonViewModel.f45887f = (LiveSquareTopButtonVChatView) viewGroup.getChildAt(2);
    }
}
