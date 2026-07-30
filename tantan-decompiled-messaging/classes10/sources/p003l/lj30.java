package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p1.mobile.putong.core.newui.newmeet.NewMeetTabItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class lj30 {
    /* JADX INFO: renamed from: a */
    public static void m7735a(NewMeetTabItemView newMeetTabItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        newMeetTabItemView.a = viewGroup.getChildAt(0);
        newMeetTabItemView.b = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        newMeetTabItemView.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        newMeetTabItemView.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        newMeetTabItemView.e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
    }
}
