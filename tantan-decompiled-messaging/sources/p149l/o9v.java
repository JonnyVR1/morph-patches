package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.CommonAnimMaskAvatarView;
import com.p046p1.mobile.putong.live.livingroom.virtual.payGuide.LiveVoicePayGuideBottomDialog;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class o9v {
    /* JADX INFO: renamed from: a */
    public static void m163212a(LiveVoicePayGuideBottomDialog liveVoicePayGuideBottomDialog, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveVoicePayGuideBottomDialog.f52607a = viewGroup.getChildAt(0);
        liveVoicePayGuideBottomDialog.f52608b = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        liveVoicePayGuideBottomDialog.f52609c = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        liveVoicePayGuideBottomDialog.f52610d = (CommonAnimMaskAvatarView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        liveVoicePayGuideBottomDialog.f52611e = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        liveVoicePayGuideBottomDialog.f52612f = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        liveVoicePayGuideBottomDialog.f52613g = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        liveVoicePayGuideBottomDialog.f52614h = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
    }
}
