package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.newui.intlmeet.visitor.IntlMeetVisitorsItemView;
import com.p046p1.mobile.putong.core.util.view.RoundTextView;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VRelative;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ako {
    /* JADX INFO: renamed from: a */
    public static void m97162a(IntlMeetVisitorsItemView intlMeetVisitorsItemView, View view) {
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
