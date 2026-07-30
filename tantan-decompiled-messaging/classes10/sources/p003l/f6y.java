package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p1.mobile.putong.core.newui.newmeet.feed.seecard.MeetSeeCardItem;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class f6y {
    /* JADX INFO: renamed from: a */
    public static void m6422a(MeetSeeCardItem meetSeeCardItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        meetSeeCardItem.a = viewGroup.getChildAt(0);
        meetSeeCardItem.b = (LinearLayout) viewGroup.getChildAt(1);
        meetSeeCardItem.c = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        meetSeeCardItem.d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
