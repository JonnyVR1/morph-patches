package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.CommonMedalView;
import com.p051p1.mobile.putong.live.livingroom.royal.LiveGradientTextView;
import com.p051p1.mobile.putong.live.livingroom.voice.usercard.view.VoiceUserCardMedalAndNameView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class z6p0 {
    /* JADX INFO: renamed from: a */
    public static void m218809a(VoiceUserCardMedalAndNameView voiceUserCardMedalAndNameView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceUserCardMedalAndNameView.f54772a = (LiveGradientTextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        voiceUserCardMedalAndNameView.f54773b = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        voiceUserCardMedalAndNameView.f54774c = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        voiceUserCardMedalAndNameView.f54775d = (VText) viewGroup.getChildAt(1);
        voiceUserCardMedalAndNameView.f54776e = (HorizontalScrollView) viewGroup.getChildAt(2);
        voiceUserCardMedalAndNameView.f54777f = (VLinear) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        voiceUserCardMedalAndNameView.f54778g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        voiceUserCardMedalAndNameView.f54779h = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
        voiceUserCardMedalAndNameView.f54780i = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(2);
        voiceUserCardMedalAndNameView.f54781j = (CommonMedalView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(3);
        voiceUserCardMedalAndNameView.f54782k = (CommonMedalView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(4);
        voiceUserCardMedalAndNameView.f54783l = (CommonMedalView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(5);
        voiceUserCardMedalAndNameView.f54784m = (CommonMedalView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(6);
        voiceUserCardMedalAndNameView.f54785n = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(7);
    }
}
