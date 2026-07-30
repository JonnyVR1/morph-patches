package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p046p1.mobile.putong.core.newui.intlmeet.visitor.IntlMeetVisitorsEmptyItemView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class wjo {
    /* JADX INFO: renamed from: a */
    public static void m203479a(IntlMeetVisitorsEmptyItemView intlMeetVisitorsEmptyItemView, View view) {
        intlMeetVisitorsEmptyItemView._root = (IntlMeetVisitorsEmptyItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        intlMeetVisitorsEmptyItemView._empty_img = (ImageView) viewGroup.getChildAt(0);
        intlMeetVisitorsEmptyItemView._empty_tv = (VText) viewGroup.getChildAt(1);
    }
}
