package p007l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.newui.group.FeedGroupEntranceItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class r4h {
    /* JADX INFO: renamed from: a */
    public static void m13831a(FeedGroupEntranceItemView feedGroupEntranceItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedGroupEntranceItemView.f1416a = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedGroupEntranceItemView.f1417b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedGroupEntranceItemView.f1418c = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        feedGroupEntranceItemView.f1419d = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        feedGroupEntranceItemView.f1420e = (TextView) viewGroup.getChildAt(1);
    }
}
