package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterLiveVoiceNewView;
import com.p051p1.mobile.putong.newui.view.VExpandableTextContainer;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class ytg {
    /* JADX INFO: renamed from: a */
    public static void m217308a(FeedCenterLiveVoiceNewView feedCenterLiveVoiceNewView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedCenterLiveVoiceNewView.f42699B = (VLinear) viewGroup.getChildAt(0);
        feedCenterLiveVoiceNewView.f42700C = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedCenterLiveVoiceNewView.f42701D = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedCenterLiveVoiceNewView.f42702E = (FrameLayout) viewGroup.getChildAt(1);
        feedCenterLiveVoiceNewView.f42703F = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        feedCenterLiveVoiceNewView.f42704G = (VExpandableTextContainer) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        feedCenterLiveVoiceNewView.f42705H = (ConstraintLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        feedCenterLiveVoiceNewView.f42706I = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        feedCenterLiveVoiceNewView.f42707J = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        feedCenterLiveVoiceNewView.f42708K = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(2);
        feedCenterLiveVoiceNewView.f42709L = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(3);
        feedCenterLiveVoiceNewView.f42710M = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
    }
}
