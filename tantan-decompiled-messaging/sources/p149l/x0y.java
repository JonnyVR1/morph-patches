package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.newui.newmeet.feed.MeetFeedNoSvipItemView;

/* JADX INFO: loaded from: classes10.dex */
public class x0y {
    /* JADX INFO: renamed from: a */
    public static void m206654a(MeetFeedNoSvipItemView meetFeedNoSvipItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        meetFeedNoSvipItemView._container = (LinearLayout) viewGroup.getChildAt(0);
        meetFeedNoSvipItemView._cover = viewGroup.getChildAt(1);
        meetFeedNoSvipItemView._unlock = (Button) viewGroup.getChildAt(2);
    }
}
