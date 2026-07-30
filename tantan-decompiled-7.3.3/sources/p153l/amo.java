package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.newui.intlmeet.visitor.IntlMeetVisitorsItemView;
import com.p051p1.mobile.putong.core.util.view.RoundTextView;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VRelative;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class amo {
    /* JADX INFO: renamed from: a */
    public static void m98852a(IntlMeetVisitorsItemView intlMeetVisitorsItemView, View view) {
        intlMeetVisitorsItemView._root = (IntlMeetVisitorsItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        intlMeetVisitorsItemView._comment_frame = (VRelative) viewGroup.getChildAt(0);
        intlMeetVisitorsItemView._profile = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        intlMeetVisitorsItemView._info = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        intlMeetVisitorsItemView._content_container = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        intlMeetVisitorsItemView._title = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        intlMeetVisitorsItemView._title_cover = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        intlMeetVisitorsItemView._visitor_detail = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        intlMeetVisitorsItemView._button = (RoundTextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }
}
