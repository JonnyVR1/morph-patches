package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.live.livingroom.common.avatar.CommonAnimMaskAvatarView;
import com.p1.mobile.putong.live.livingroom.virtual.payGuide.LiveVoiceVirtualPaymentGuideDialog;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class kbv {
    /* JADX INFO: renamed from: a */
    public static void m16598a(LiveVoiceVirtualPaymentGuideDialog liveVoiceVirtualPaymentGuideDialog, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveVoiceVirtualPaymentGuideDialog.d = (CommonAnimMaskAvatarView) viewGroup.getChildAt(0);
        liveVoiceVirtualPaymentGuideDialog.e = viewGroup.getChildAt(1);
        liveVoiceVirtualPaymentGuideDialog.f = viewGroup.getChildAt(2);
        liveVoiceVirtualPaymentGuideDialog.g = (LinearLayout) viewGroup.getChildAt(3);
        liveVoiceVirtualPaymentGuideDialog.h = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        liveVoiceVirtualPaymentGuideDialog.i = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        liveVoiceVirtualPaymentGuideDialog.j = viewGroup.getChildAt(4);
    }
}
