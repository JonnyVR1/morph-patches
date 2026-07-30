package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.feed.newui.group.FeedGroupEntranceItemView;
import p151v.VDraweeView;
import p151v.VFrame;

/* JADX INFO: loaded from: classes13.dex */
public class g6h {
    /* JADX INFO: renamed from: a */
    public static void m129250a(FeedGroupEntranceItemView feedGroupEntranceItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedGroupEntranceItemView.f40803a = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedGroupEntranceItemView.f40804b = (VFrame) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedGroupEntranceItemView.f40805c = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        feedGroupEntranceItemView.f40806d = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        feedGroupEntranceItemView.f40807e = (TextView) viewGroup.getChildAt(1);
    }
}
