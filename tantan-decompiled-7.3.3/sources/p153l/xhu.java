package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.hellogroup.p036mk.business.base.p037ui.MKWebView;
import com.p051p1.mobile.putong.live.external.internal.vchat.module.campaign.view.LiveVChatCampaignItemView;

/* JADX INFO: loaded from: classes9.dex */
public class xhu {
    /* JADX INFO: renamed from: a */
    public static void m211075a(LiveVChatCampaignItemView liveVChatCampaignItemView, View view) {
        liveVChatCampaignItemView.f45977a = (LiveVChatCampaignItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        liveVChatCampaignItemView.f45978b = (FrameLayout) viewGroup.getChildAt(0);
        liveVChatCampaignItemView.f45979c = (MKWebView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        liveVChatCampaignItemView.f45980d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
