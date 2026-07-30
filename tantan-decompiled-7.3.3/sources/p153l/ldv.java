package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonAnimMaskAvatarView;
import com.p051p1.mobile.putong.live.livingroom.virtual.payGuide.LiveVoiceVirtualPaymentGuideDialog;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class ldv {
    /* JADX INFO: renamed from: a */
    public static void m153820a(LiveVoiceVirtualPaymentGuideDialog liveVoiceVirtualPaymentGuideDialog, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveVoiceVirtualPaymentGuideDialog.f53465d = (CommonAnimMaskAvatarView) viewGroup.getChildAt(0);
        liveVoiceVirtualPaymentGuideDialog.f53466e = (VText) viewGroup.getChildAt(1);
        liveVoiceVirtualPaymentGuideDialog.f53467f = (VText) viewGroup.getChildAt(2);
        liveVoiceVirtualPaymentGuideDialog.f53468g = (LinearLayout) viewGroup.getChildAt(3);
        liveVoiceVirtualPaymentGuideDialog.f53469h = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        liveVoiceVirtualPaymentGuideDialog.f53470i = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        liveVoiceVirtualPaymentGuideDialog.f53471j = (VText) viewGroup.getChildAt(4);
    }
}
