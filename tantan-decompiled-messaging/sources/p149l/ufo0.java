package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.player.VoiceRoomLoadingView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class ufo0 {
    /* JADX INFO: renamed from: a */
    public static void m193455a(VoiceRoomLoadingView voiceRoomLoadingView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceRoomLoadingView.f53332a = (ViewStub) viewGroup.getChildAt(0);
        voiceRoomLoadingView.f53333b = (ViewStub) viewGroup.getChildAt(1);
        voiceRoomLoadingView.f53334c = (VText) viewGroup.getChildAt(2);
    }
}
