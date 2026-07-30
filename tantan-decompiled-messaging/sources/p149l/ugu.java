package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.external.internal.vchat.module.campaign.LiveVChatCampaignView;
import p147v.VLinear;
import p147v.VPager;

/* JADX INFO: loaded from: classes13.dex */
public class ugu {
    /* JADX INFO: renamed from: a */
    public static void m193585a(LiveVChatCampaignView liveVChatCampaignView, View view) {
        liveVChatCampaignView.f45117a = (LiveVChatCampaignView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        liveVChatCampaignView.f45118b = (VPager) viewGroup.getChildAt(0);
        liveVChatCampaignView.f45119c = (VLinear) viewGroup.getChildAt(1);
    }
}
