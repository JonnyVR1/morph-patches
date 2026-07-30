package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.legacy.widget.Space;
import com.p046p1.mobile.putong.core.newui.newmeet.NewMeetTabItemView;
import p147v.VOnlineIndicator;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class lj30 {
    /* JADX INFO: renamed from: a */
    public static void m149954a(NewMeetTabItemView newMeetTabItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        newMeetTabItemView._content_container = (ConstraintLayout) viewGroup.getChildAt(0);
        newMeetTabItemView._title_tv = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        newMeetTabItemView._red_dot_reference_point = (Space) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        newMeetTabItemView._red_dot = (VOnlineIndicator) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        newMeetTabItemView._num_badge_tv = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
    }
}
