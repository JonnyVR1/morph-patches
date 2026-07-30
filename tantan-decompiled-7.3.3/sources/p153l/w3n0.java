package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.voice.usercard.view.VoiceCardAnchorLevelView;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VMarqueeText;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class w3n0 {
    /* JADX INFO: renamed from: a */
    public static void m204778a(VoiceCardAnchorLevelView voiceCardAnchorLevelView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceCardAnchorLevelView.f54718a = (RelativeLayout) viewGroup.getChildAt(0);
        voiceCardAnchorLevelView.f54719b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        voiceCardAnchorLevelView.f54720c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        voiceCardAnchorLevelView.f54721d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        voiceCardAnchorLevelView.f54722e = (VMarqueeText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        voiceCardAnchorLevelView.f54723f = (RelativeLayout) viewGroup.getChildAt(1);
        voiceCardAnchorLevelView.f54724g = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        voiceCardAnchorLevelView.f54725h = (VFrame) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        voiceCardAnchorLevelView.f54726i = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        voiceCardAnchorLevelView.f54727j = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        voiceCardAnchorLevelView.f54728k = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        voiceCardAnchorLevelView.f54729l = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        voiceCardAnchorLevelView.f54730m = (AnimEffectPlayer) viewGroup.getChildAt(2);
    }
}
