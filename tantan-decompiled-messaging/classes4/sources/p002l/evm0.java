package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.p1.mobile.putong.live.livingroom.voice.intl.medalwall.VoiceCardMedalWallEnterView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class evm0 {
    /* JADX INFO: renamed from: a */
    public static void m12721a(VoiceCardMedalWallEnterView voiceCardMedalWallEnterView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceCardMedalWallEnterView.a = (RelativeLayout) viewGroup.getChildAt(0);
        voiceCardMedalWallEnterView.b = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        voiceCardMedalWallEnterView.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        voiceCardMedalWallEnterView.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        voiceCardMedalWallEnterView.e = viewGroup.getChildAt(1);
    }
}
