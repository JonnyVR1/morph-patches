package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.core.newui.newmeet.feed.seecard.MeetSeeCardItem;
import com.p051p1.mobile.putong.core.newui.newmeet.feed.seecard.MeetSeeDefaultCardItem;
import com.p051p1.mobile.putong.core.newui.newmeet.feed.seecard.StrokeTextView;

/* JADX INFO: loaded from: classes10.dex */
public class cay {
    /* JADX INFO: renamed from: a */
    public static void m108516a(bay bayVar, View view) {
        bayVar.f75747a = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        bayVar.f75748b = (MeetSeeCardItem) viewGroup.getChildAt(0);
        bayVar.f75749c = (MeetSeeCardItem) viewGroup.getChildAt(1);
        bayVar.f75750d = (RelativeLayout) viewGroup.getChildAt(2);
        bayVar.f75751e = (MeetSeeCardItem) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        bayVar.f75752f = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        bayVar.f75753g = (StrokeTextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(1);
        bayVar.f75754h = (MeetSeeCardItem) viewGroup.getChildAt(3);
        bayVar.f75755i = (MeetSeeCardItem) viewGroup.getChildAt(4);
        bayVar.f75756j = (MeetSeeDefaultCardItem) viewGroup.getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m108517b(bay bayVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(pec0.f152014m0, viewGroup, false);
        m108516a(bayVar, viewInflate);
        return viewInflate;
    }
}
