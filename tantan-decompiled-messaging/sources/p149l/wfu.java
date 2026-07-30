package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.live.external.internal.vchat.module.campaign.view.LiveVChatCampaignItemView;
import immomo.com.mklibrary.core.base.p115ui.MKWebView;

/* JADX INFO: loaded from: classes13.dex */
public class wfu {
    /* JADX INFO: renamed from: a */
    public static void m202990a(LiveVChatCampaignItemView liveVChatCampaignItemView, View view) {
        liveVChatCampaignItemView.f45129a = (LiveVChatCampaignItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        liveVChatCampaignItemView.f45130b = (FrameLayout) viewGroup.getChildAt(0);
        liveVChatCampaignItemView.f45131c = (MKWebView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        liveVChatCampaignItemView.f45132d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
