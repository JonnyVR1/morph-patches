package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.newui.intlmeet.likers.items.IntlMeetFakeTurboItem;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class qeo {
    /* JADX INFO: renamed from: a */
    public static void m176258a(IntlMeetFakeTurboItem intlMeetFakeTurboItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlMeetFakeTurboItem._icon = (VDraweeView) viewGroup.getChildAt(0);
        intlMeetFakeTurboItem._desc = (TextView) viewGroup.getChildAt(1);
    }
}
