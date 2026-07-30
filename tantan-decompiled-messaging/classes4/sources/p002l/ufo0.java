package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.p1.mobile.putong.live.livingroom.voice.intl.player.VoiceRoomLoadingView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ufo0 {
    /* JADX INFO: renamed from: a */
    public static void m23446a(VoiceRoomLoadingView voiceRoomLoadingView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceRoomLoadingView.a = (ViewStub) viewGroup.getChildAt(0);
        voiceRoomLoadingView.b = (ViewStub) viewGroup.getChildAt(1);
        voiceRoomLoadingView.c = viewGroup.getChildAt(2);
    }
}
