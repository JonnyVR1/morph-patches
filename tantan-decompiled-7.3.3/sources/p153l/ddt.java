package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.live.livingroom.view.AutoRollView;
import com.p051p1.mobile.putong.live.livingroom.view.LivePreviewCampaignView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class ddt {
    /* JADX INFO: renamed from: a */
    public static void m115366a(LivePreviewCampaignView livePreviewCampaignView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        livePreviewCampaignView.f52851d = (RelativeLayout) viewGroup.getChildAt(0);
        livePreviewCampaignView.f52852e = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        livePreviewCampaignView.f52853f = (AutoRollView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        livePreviewCampaignView.f52854g = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }
}
