package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonAnimMaskAvatarView;
import com.p051p1.mobile.putong.live.livingroom.virtual.payGuide.LiveVoicePayGuideBottomDialog;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class pbv {
    /* JADX INFO: renamed from: a */
    public static void m171532a(LiveVoicePayGuideBottomDialog liveVoicePayGuideBottomDialog, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveVoicePayGuideBottomDialog.f53455a = viewGroup.getChildAt(0);
        liveVoicePayGuideBottomDialog.f53456b = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        liveVoicePayGuideBottomDialog.f53457c = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        liveVoicePayGuideBottomDialog.f53458d = (CommonAnimMaskAvatarView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        liveVoicePayGuideBottomDialog.f53459e = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        liveVoicePayGuideBottomDialog.f53460f = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        liveVoicePayGuideBottomDialog.f53461g = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        liveVoicePayGuideBottomDialog.f53462h = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
    }
}
