package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.core.newui.newmeet.feed.seecard.MeetSeeCardItem;
import com.p046p1.mobile.putong.core.newui.newmeet.feed.seecard.MeetSeeDefaultCardItem;
import com.p046p1.mobile.putong.core.newui.newmeet.feed.seecard.StrokeTextView;

/* JADX INFO: loaded from: classes10.dex */
public class f1y {
    /* JADX INFO: renamed from: a */
    public static void m119146a(e1y e1yVar, View view) {
        e1yVar.f88859a = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        e1yVar.f88860b = (MeetSeeCardItem) viewGroup.getChildAt(0);
        e1yVar.f88861c = (MeetSeeCardItem) viewGroup.getChildAt(1);
        e1yVar.f88862d = (RelativeLayout) viewGroup.getChildAt(2);
        e1yVar.f88863e = (MeetSeeCardItem) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        e1yVar.f88864f = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        e1yVar.f88865g = (StrokeTextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(1);
        e1yVar.f88866h = (MeetSeeCardItem) viewGroup.getChildAt(3);
        e1yVar.f88867i = (MeetSeeCardItem) viewGroup.getChildAt(4);
        e1yVar.f88868j = (MeetSeeDefaultCardItem) viewGroup.getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m119147b(e1y e1yVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f121406m0, viewGroup, false);
        m119146a(e1yVar, viewInflate);
        return viewInflate;
    }
}
