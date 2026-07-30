package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.core.newui.newmeet.feed.nearby.MeetNearbyItemView;
import com.p051p1.mobile.putong.core.newui.newmeet.feed.view.MeetItemEntryHeadView;
import com.p051p1.mobile.putong.core.newui.newmeet.feed.view.MeetItemEntryHeadViewMyTabStyle;
import p151v.VImage;
import p151v.VPullUpRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class iey {
    /* JADX INFO: renamed from: a */
    public static void m139675a(MeetNearbyItemView meetNearbyItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        meetNearbyItemView.f26983a = (VImage) viewGroup.getChildAt(0);
        meetNearbyItemView.f26984b = (RelativeLayout) viewGroup.getChildAt(1);
        meetNearbyItemView.f26985c = (MeetItemEntryHeadView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        meetNearbyItemView.f26986d = (MeetItemEntryHeadViewMyTabStyle) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        meetNearbyItemView.f26987e = (VPullUpRecyclerView) viewGroup.getChildAt(2);
        meetNearbyItemView.f26988f = (VText) viewGroup.getChildAt(3);
    }
}
