package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.hellogroup.p036mk.business.base.p037ui.MKWebView;
import com.p051p1.mobile.putong.live.livingroom.increment.campaign.view.CampaignItemView;

/* JADX INFO: loaded from: classes4.dex */
public class xd4 {
    /* JADX INFO: renamed from: a */
    public static void m210444a(CampaignItemView campaignItemView, View view) {
        campaignItemView.f50335a = (CampaignItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        campaignItemView.f50336b = (FrameLayout) viewGroup.getChildAt(0);
        campaignItemView.f50337c = (MKWebView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        campaignItemView.f50338d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
