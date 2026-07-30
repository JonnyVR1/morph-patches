package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.livingroom.increment.campaign.LiveCampaignView;
import p151v.VLinear;
import p151v.VPager;

/* JADX INFO: loaded from: classes4.dex */
public class x3s {
    /* JADX INFO: renamed from: a */
    public static void m209261a(LiveCampaignView liveCampaignView, View view) {
        liveCampaignView.f50319a = (LiveCampaignView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        liveCampaignView.f50320b = (VPager) viewGroup.getChildAt(0);
        liveCampaignView.f50321c = (VLinear) viewGroup.getChildAt(1);
    }
}
