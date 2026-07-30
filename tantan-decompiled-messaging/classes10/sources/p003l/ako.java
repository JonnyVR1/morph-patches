package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.util.view.RoundTextView;
import com.p1.mobile.putong.core.newui.intlmeet.visitor.IntlMeetVisitorsItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ako {
    /* JADX INFO: renamed from: a */
    public static void m5432a(IntlMeetVisitorsItemView intlMeetVisitorsItemView, View view) {
        intlMeetVisitorsItemView.a = (IntlMeetVisitorsItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        intlMeetVisitorsItemView.b = viewGroup.getChildAt(0);
        intlMeetVisitorsItemView.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        intlMeetVisitorsItemView.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        intlMeetVisitorsItemView.e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        intlMeetVisitorsItemView.f = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        intlMeetVisitorsItemView.g = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        intlMeetVisitorsItemView.h = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        intlMeetVisitorsItemView.i = (RoundTextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }
}
