package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.p1.mobile.putong.live.livingroom.view.LivePreviewCampaignView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class cbt {
    /* JADX INFO: renamed from: a */
    public static void m10928a(LivePreviewCampaignView livePreviewCampaignView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        livePreviewCampaignView.d = (RelativeLayout) viewGroup.getChildAt(0);
        livePreviewCampaignView.e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        livePreviewCampaignView.f = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        livePreviewCampaignView.g = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }
}
