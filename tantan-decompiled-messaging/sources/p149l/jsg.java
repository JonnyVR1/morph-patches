package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterLiveVoiceNewView;
import com.p046p1.mobile.putong.newui.view.VExpandableTextContainer;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class jsg {
    /* JADX INFO: renamed from: a */
    public static void m143045a(FeedCenterLiveVoiceNewView feedCenterLiveVoiceNewView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedCenterLiveVoiceNewView.f41851B = (VLinear) viewGroup.getChildAt(0);
        feedCenterLiveVoiceNewView.f41852C = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedCenterLiveVoiceNewView.f41853D = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedCenterLiveVoiceNewView.f41854E = (FrameLayout) viewGroup.getChildAt(1);
        feedCenterLiveVoiceNewView.f41855F = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        feedCenterLiveVoiceNewView.f41856G = (VExpandableTextContainer) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        feedCenterLiveVoiceNewView.f41857H = (ConstraintLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        feedCenterLiveVoiceNewView.f41858I = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        feedCenterLiveVoiceNewView.f41859J = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        feedCenterLiveVoiceNewView.f41860K = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(2);
        feedCenterLiveVoiceNewView.f41861L = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(3);
        feedCenterLiveVoiceNewView.f41862M = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
    }
}
