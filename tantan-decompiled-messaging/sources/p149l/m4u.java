package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.external.internal.live.square.home.submodule.topButton.LiveSquareTopButtonLiveView;
import com.p046p1.mobile.putong.live.external.internal.live.square.home.submodule.topButton.LiveSquareTopButtonVChatView;
import com.p046p1.mobile.putong.live.external.internal.live.square.home.submodule.topButton.LiveSquareTopButtonViewModel;
import com.p046p1.mobile.putong.live.external.internal.live.square.home.submodule.topButton.LiveSquareTopButtonVoiceView;

/* JADX INFO: loaded from: classes13.dex */
public class m4u {
    /* JADX INFO: renamed from: a */
    public static void m153104a(LiveSquareTopButtonViewModel liveSquareTopButtonViewModel, View view) {
        liveSquareTopButtonViewModel.f45036c = (LiveSquareTopButtonViewModel) view;
        ViewGroup viewGroup = (ViewGroup) view;
        liveSquareTopButtonViewModel.f45037d = (LiveSquareTopButtonLiveView) viewGroup.getChildAt(0);
        liveSquareTopButtonViewModel.f45038e = (LiveSquareTopButtonVoiceView) viewGroup.getChildAt(1);
        liveSquareTopButtonViewModel.f45039f = (LiveSquareTopButtonVChatView) viewGroup.getChildAt(2);
    }
}
