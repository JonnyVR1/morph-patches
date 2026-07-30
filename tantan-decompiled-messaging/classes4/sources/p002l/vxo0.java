package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import com.p000p1.mobile.putong.live.livingroom.common.usercard.CommonMedalView;
import com.p1.mobile.putong.live.livingroom.voice.usercard.view.VoiceUserCardMedalAndNameView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class vxo0 {
    /* JADX INFO: renamed from: a */
    public static void m24202a(VoiceUserCardMedalAndNameView voiceUserCardMedalAndNameView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceUserCardMedalAndNameView.a = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        voiceUserCardMedalAndNameView.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        voiceUserCardMedalAndNameView.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        voiceUserCardMedalAndNameView.d = viewGroup.getChildAt(1);
        voiceUserCardMedalAndNameView.e = (HorizontalScrollView) viewGroup.getChildAt(2);
        voiceUserCardMedalAndNameView.f = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        voiceUserCardMedalAndNameView.g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        voiceUserCardMedalAndNameView.h = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
        voiceUserCardMedalAndNameView.i = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(2);
        voiceUserCardMedalAndNameView.j = (CommonMedalView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(3);
        voiceUserCardMedalAndNameView.k = (CommonMedalView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(4);
        voiceUserCardMedalAndNameView.l = (CommonMedalView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(5);
        voiceUserCardMedalAndNameView.m = (CommonMedalView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(6);
        voiceUserCardMedalAndNameView.n = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(7);
    }
}
