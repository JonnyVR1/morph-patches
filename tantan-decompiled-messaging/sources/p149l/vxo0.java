package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import com.p046p1.mobile.putong.live.livingroom.common.usercard.CommonMedalView;
import com.p046p1.mobile.putong.live.livingroom.royal.LiveGradientTextView;
import com.p046p1.mobile.putong.live.livingroom.voice.usercard.view.VoiceUserCardMedalAndNameView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class vxo0 {
    /* JADX INFO: renamed from: a */
    public static void m200576a(VoiceUserCardMedalAndNameView voiceUserCardMedalAndNameView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceUserCardMedalAndNameView.f53924a = (LiveGradientTextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        voiceUserCardMedalAndNameView.f53925b = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        voiceUserCardMedalAndNameView.f53926c = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        voiceUserCardMedalAndNameView.f53927d = (VText) viewGroup.getChildAt(1);
        voiceUserCardMedalAndNameView.f53928e = (HorizontalScrollView) viewGroup.getChildAt(2);
        voiceUserCardMedalAndNameView.f53929f = (VLinear) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        voiceUserCardMedalAndNameView.f53930g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        voiceUserCardMedalAndNameView.f53931h = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
        voiceUserCardMedalAndNameView.f53932i = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(2);
        voiceUserCardMedalAndNameView.f53933j = (CommonMedalView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(3);
        voiceUserCardMedalAndNameView.f53934k = (CommonMedalView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(4);
        voiceUserCardMedalAndNameView.f53935l = (CommonMedalView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(5);
        voiceUserCardMedalAndNameView.f53936m = (CommonMedalView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(6);
        voiceUserCardMedalAndNameView.f53937n = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(7);
    }
}
