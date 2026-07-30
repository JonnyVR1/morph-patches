package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.medalwall.VoiceCardMedalWallEnterView;
import p151v.VMarqueeText;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class i4n0 {
    /* JADX INFO: renamed from: a */
    public static void m138572a(VoiceCardMedalWallEnterView voiceCardMedalWallEnterView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceCardMedalWallEnterView.f54118a = (RelativeLayout) viewGroup.getChildAt(0);
        voiceCardMedalWallEnterView.f54119b = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        voiceCardMedalWallEnterView.f54120c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        voiceCardMedalWallEnterView.f54121d = (VMarqueeText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        voiceCardMedalWallEnterView.f54122e = (AnimEffectPlayer) viewGroup.getChildAt(1);
    }
}
