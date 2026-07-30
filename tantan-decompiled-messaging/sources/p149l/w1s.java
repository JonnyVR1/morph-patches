package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.livingroom.increment.campaign.LiveCampaignView;
import p147v.VLinear;
import p147v.VPager;

/* JADX INFO: loaded from: classes4.dex */
public class w1s {
    /* JADX INFO: renamed from: a */
    public static void m200949a(LiveCampaignView liveCampaignView, View view) {
        liveCampaignView.f49471a = (LiveCampaignView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        liveCampaignView.f49472b = (VPager) viewGroup.getChildAt(0);
        liveCampaignView.f49473c = (VLinear) viewGroup.getChildAt(1);
    }
}
