package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.CommonAnimMaskAvatarView;
import com.p046p1.mobile.putong.live.livingroom.virtual.payGuide.LiveVoiceVirtualPaymentGuideDialog;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class kbv {
    /* JADX INFO: renamed from: a */
    public static void m145325a(LiveVoiceVirtualPaymentGuideDialog liveVoiceVirtualPaymentGuideDialog, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveVoiceVirtualPaymentGuideDialog.f52617d = (CommonAnimMaskAvatarView) viewGroup.getChildAt(0);
        liveVoiceVirtualPaymentGuideDialog.f52618e = (VText) viewGroup.getChildAt(1);
        liveVoiceVirtualPaymentGuideDialog.f52619f = (VText) viewGroup.getChildAt(2);
        liveVoiceVirtualPaymentGuideDialog.f52620g = (LinearLayout) viewGroup.getChildAt(3);
        liveVoiceVirtualPaymentGuideDialog.f52621h = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        liveVoiceVirtualPaymentGuideDialog.f52622i = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        liveVoiceVirtualPaymentGuideDialog.f52623j = (VText) viewGroup.getChildAt(4);
    }
}
