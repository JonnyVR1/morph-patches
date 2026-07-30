package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.voice.usercard.view.VoiceCardUserLevelView;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VMarqueeText;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class wvm0 {
    /* JADX INFO: renamed from: a */
    public static void m205754a(VoiceCardUserLevelView voiceCardUserLevelView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceCardUserLevelView.f53889a = (RelativeLayout) viewGroup.getChildAt(0);
        voiceCardUserLevelView.f53890b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        voiceCardUserLevelView.f53891c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        voiceCardUserLevelView.f53892d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        voiceCardUserLevelView.f53893e = (VMarqueeText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        voiceCardUserLevelView.f53894f = (RelativeLayout) viewGroup.getChildAt(1);
        voiceCardUserLevelView.f53895g = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        voiceCardUserLevelView.f53896h = (VFrame) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        voiceCardUserLevelView.f53897i = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        voiceCardUserLevelView.f53898j = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        voiceCardUserLevelView.f53899k = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        voiceCardUserLevelView.f53900l = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        voiceCardUserLevelView.f53901m = (AnimEffectPlayer) viewGroup.getChildAt(2);
    }
}
