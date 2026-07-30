package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.newui.talk.view.NewTalkProgressView;
import com.p051p1.mobile.putong.core.p058ui.quickaudio.NewVoiceCallFloatView;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class dr40 {
    /* JADX INFO: renamed from: a */
    public static void m117683a(NewVoiceCallFloatView newVoiceCallFloatView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        newVoiceCallFloatView._normal_head = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        newVoiceCallFloatView._online_match_profile = (VFrame) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        newVoiceCallFloatView._online_match_profile_progress = (NewTalkProgressView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        newVoiceCallFloatView._online_match_profile_head = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        newVoiceCallFloatView._tip = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
    }
}
