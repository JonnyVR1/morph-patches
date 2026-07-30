package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p1.mobile.putong.core.newui.intlmeet.visitor.IntlMeetVisitorsEmptyItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class wjo {
    /* JADX INFO: renamed from: a */
    public static void m10507a(IntlMeetVisitorsEmptyItemView intlMeetVisitorsEmptyItemView, View view) {
        intlMeetVisitorsEmptyItemView.a = (IntlMeetVisitorsEmptyItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        intlMeetVisitorsEmptyItemView.b = (ImageView) viewGroup.getChildAt(0);
        intlMeetVisitorsEmptyItemView.c = viewGroup.getChildAt(1);
    }
}
