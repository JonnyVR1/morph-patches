package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.external.internal.live.square.home.submodule.topButton.LiveSquareTopButtonVoiceView;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class o6u {
    /* JADX INFO: renamed from: a */
    public static void m166292a(LiveSquareTopButtonVoiceView liveSquareTopButtonVoiceView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveSquareTopButtonVoiceView.f45888c = (VLinear) viewGroup.getChildAt(0);
        liveSquareTopButtonVoiceView.f45889d = (VDraweeView) viewGroup.getChildAt(1);
        liveSquareTopButtonVoiceView.f45890e = (VText) viewGroup.getChildAt(2);
        liveSquareTopButtonVoiceView.f45891f = viewGroup.getChildAt(3);
    }
}
