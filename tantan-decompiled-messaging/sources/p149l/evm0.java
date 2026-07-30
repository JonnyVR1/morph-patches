package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.medalwall.VoiceCardMedalWallEnterView;
import p147v.VMarqueeText;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class evm0 {
    /* JADX INFO: renamed from: a */
    public static void m118300a(VoiceCardMedalWallEnterView voiceCardMedalWallEnterView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceCardMedalWallEnterView.f53270a = (RelativeLayout) viewGroup.getChildAt(0);
        voiceCardMedalWallEnterView.f53271b = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        voiceCardMedalWallEnterView.f53272c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        voiceCardMedalWallEnterView.f53273d = (VMarqueeText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        voiceCardMedalWallEnterView.f53274e = (AnimEffectPlayer) viewGroup.getChildAt(1);
    }
}
