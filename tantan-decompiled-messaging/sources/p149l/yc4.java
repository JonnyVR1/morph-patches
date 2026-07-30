package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.live.livingroom.increment.campaign.view.CampaignItemView;
import immomo.com.mklibrary.core.base.p115ui.MKWebView;

/* JADX INFO: loaded from: classes4.dex */
public class yc4 {
    /* JADX INFO: renamed from: a */
    public static void m214004a(CampaignItemView campaignItemView, View view) {
        campaignItemView.f49487a = (CampaignItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        campaignItemView.f49488b = (FrameLayout) viewGroup.getChildAt(0);
        campaignItemView.f49489c = (MKWebView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        campaignItemView.f49490d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
