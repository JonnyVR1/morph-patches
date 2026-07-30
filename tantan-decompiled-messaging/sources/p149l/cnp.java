package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.intl.visitor.IntlVisitorsItemView;
import com.p046p1.mobile.putong.core.p053ui.roundcorners.view.RoundTextView;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VRelative;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class cnp {
    /* JADX INFO: renamed from: a */
    public static void m107820a(IntlVisitorsItemView intlVisitorsItemView, View view) {
        intlVisitorsItemView._root = (IntlVisitorsItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        intlVisitorsItemView._comment_frame = (VRelative) viewGroup.getChildAt(0);
        intlVisitorsItemView._profile = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        intlVisitorsItemView._info = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        intlVisitorsItemView._content_container = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        intlVisitorsItemView._title = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        intlVisitorsItemView._title_cover = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        intlVisitorsItemView._visitor_detail = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        intlVisitorsItemView._button = (RoundTextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }
}
