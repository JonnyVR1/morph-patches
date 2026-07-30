package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.core.newui.newmeet.feed.weekly.MeetFeedSvipWeeklyItemView;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class may {
    /* JADX INFO: renamed from: a */
    public static void m157755a(MeetFeedSvipWeeklyItemView meetFeedSvipWeeklyItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        meetFeedSvipWeeklyItemView._header_container = (RelativeLayout) viewGroup.getChildAt(0);
        meetFeedSvipWeeklyItemView._header_privilege_ic = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        meetFeedSvipWeeklyItemView._header_title = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        meetFeedSvipWeeklyItemView._header_subtitle = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        meetFeedSvipWeeklyItemView._header_arrow_ic = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        meetFeedSvipWeeklyItemView._weekly_content_container = (VLinear) viewGroup.getChildAt(1);
        meetFeedSvipWeeklyItemView._weekly_content_root = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        meetFeedSvipWeeklyItemView._svip_renew_btn = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        meetFeedSvipWeeklyItemView._odiamond_buy_btn = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }
}
