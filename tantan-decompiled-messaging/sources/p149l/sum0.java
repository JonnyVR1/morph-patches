package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.voice.usercard.view.VoiceCardAnchorLevelView;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VMarqueeText;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class sum0 {
    /* JADX INFO: renamed from: a */
    public static void m186015a(VoiceCardAnchorLevelView voiceCardAnchorLevelView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceCardAnchorLevelView.f53870a = (RelativeLayout) viewGroup.getChildAt(0);
        voiceCardAnchorLevelView.f53871b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        voiceCardAnchorLevelView.f53872c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        voiceCardAnchorLevelView.f53873d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        voiceCardAnchorLevelView.f53874e = (VMarqueeText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        voiceCardAnchorLevelView.f53875f = (RelativeLayout) viewGroup.getChildAt(1);
        voiceCardAnchorLevelView.f53876g = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        voiceCardAnchorLevelView.f53877h = (VFrame) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        voiceCardAnchorLevelView.f53878i = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        voiceCardAnchorLevelView.f53879j = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        voiceCardAnchorLevelView.f53880k = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        voiceCardAnchorLevelView.f53881l = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        voiceCardAnchorLevelView.f53882m = (AnimEffectPlayer) viewGroup.getChildAt(2);
    }
}
