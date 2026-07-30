package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.core.newui.newmeet.feed.nearby.MeetNearbyItemView;
import com.p046p1.mobile.putong.core.newui.newmeet.feed.view.MeetItemEntryHeadView;
import com.p046p1.mobile.putong.core.newui.newmeet.feed.view.MeetItemEntryHeadViewMyTabStyle;
import p147v.VImage;
import p147v.VPullUpRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class l5y {
    /* JADX INFO: renamed from: a */
    public static void m148681a(MeetNearbyItemView meetNearbyItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        meetNearbyItemView.f26241a = (VImage) viewGroup.getChildAt(0);
        meetNearbyItemView.f26242b = (RelativeLayout) viewGroup.getChildAt(1);
        meetNearbyItemView.f26243c = (MeetItemEntryHeadView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        meetNearbyItemView.f26244d = (MeetItemEntryHeadViewMyTabStyle) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        meetNearbyItemView.f26245e = (VPullUpRecyclerView) viewGroup.getChildAt(2);
        meetNearbyItemView.f26246f = (VText) viewGroup.getChildAt(3);
    }
}
