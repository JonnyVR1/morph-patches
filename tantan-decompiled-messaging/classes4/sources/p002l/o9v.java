package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.live.livingroom.common.avatar.CommonAnimMaskAvatarView;
import com.p1.mobile.putong.live.livingroom.virtual.payGuide.LiveVoicePayGuideBottomDialog;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class o9v {
    /* JADX INFO: renamed from: a */
    public static void m19330a(LiveVoicePayGuideBottomDialog liveVoicePayGuideBottomDialog, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveVoicePayGuideBottomDialog.a = viewGroup.getChildAt(0);
        liveVoicePayGuideBottomDialog.b = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        liveVoicePayGuideBottomDialog.c = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        liveVoicePayGuideBottomDialog.d = (CommonAnimMaskAvatarView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        liveVoicePayGuideBottomDialog.e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        liveVoicePayGuideBottomDialog.f = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        liveVoicePayGuideBottomDialog.g = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        liveVoicePayGuideBottomDialog.h = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
    }
}
