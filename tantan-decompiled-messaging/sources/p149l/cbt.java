package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.live.livingroom.view.AutoRollView;
import com.p046p1.mobile.putong.live.livingroom.view.LivePreviewCampaignView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class cbt {
    /* JADX INFO: renamed from: a */
    public static void m106025a(LivePreviewCampaignView livePreviewCampaignView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        livePreviewCampaignView.f52003d = (RelativeLayout) viewGroup.getChildAt(0);
        livePreviewCampaignView.f52004e = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        livePreviewCampaignView.f52005f = (AutoRollView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        livePreviewCampaignView.f52006g = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }
}
