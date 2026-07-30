package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.legacy.widget.Space;
import com.p046p1.mobile.putong.core.newui.meet.MeetTabView;
import p147v.VOnlineIndicator;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class b7y {
    /* JADX INFO: renamed from: a */
    public static void m100702a(MeetTabView meetTabView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        meetTabView._title_tv = (TextView) viewGroup.getChildAt(0);
        meetTabView._red_dot_reference_point = (Space) viewGroup.getChildAt(1);
        meetTabView._red_dot = (VOnlineIndicator) viewGroup.getChildAt(2);
        meetTabView._num_badge_tv = (VText) viewGroup.getChildAt(3);
    }
}
