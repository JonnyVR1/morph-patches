package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.player.VoiceRoomLoadingView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class yoo0 {
    /* JADX INFO: renamed from: a */
    public static void m216978a(VoiceRoomLoadingView voiceRoomLoadingView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceRoomLoadingView.f54180a = (ViewStub) viewGroup.getChildAt(0);
        voiceRoomLoadingView.f54181b = (ViewStub) viewGroup.getChildAt(1);
        voiceRoomLoadingView.f54182c = (VText) viewGroup.getChildAt(2);
    }
}
