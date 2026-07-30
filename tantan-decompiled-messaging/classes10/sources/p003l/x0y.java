package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import com.p1.mobile.putong.core.newui.newmeet.feed.MeetFeedNoSvipItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class x0y {
    /* JADX INFO: renamed from: a */
    public static void m10614a(MeetFeedNoSvipItemView meetFeedNoSvipItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        meetFeedNoSvipItemView.a = (LinearLayout) viewGroup.getChildAt(0);
        meetFeedNoSvipItemView.b = viewGroup.getChildAt(1);
        meetFeedNoSvipItemView.c = (Button) viewGroup.getChildAt(2);
    }
}
