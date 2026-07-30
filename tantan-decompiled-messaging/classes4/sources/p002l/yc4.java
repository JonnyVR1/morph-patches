package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.live.livingroom.increment.campaign.view.CampaignItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class yc4 {
    /* JADX INFO: renamed from: a */
    public static void m26504a(CampaignItemView campaignItemView, View view) {
        campaignItemView.f5529a = (CampaignItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        campaignItemView.f5530b = (FrameLayout) viewGroup.getChildAt(0);
        campaignItemView.f5531c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        campaignItemView.f5532d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
