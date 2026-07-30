package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.external.internal.vchat.module.campaign.LiveVChatCampaignView;
import p151v.VLinear;
import p151v.VPager;

/* JADX INFO: loaded from: classes9.dex */
public class viu {
    /* JADX INFO: renamed from: a */
    public static void m201425a(LiveVChatCampaignView liveVChatCampaignView, View view) {
        liveVChatCampaignView.f45965a = (LiveVChatCampaignView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        liveVChatCampaignView.f45966b = (VPager) viewGroup.getChildAt(0);
        liveVChatCampaignView.f45967c = (VLinear) viewGroup.getChildAt(1);
    }
}
