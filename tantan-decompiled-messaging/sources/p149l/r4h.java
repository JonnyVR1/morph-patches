package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.feed.newui.group.FeedGroupEntranceItemView;
import p147v.VDraweeView;
import p147v.VFrame;

/* JADX INFO: loaded from: classes12.dex */
public class r4h {
    /* JADX INFO: renamed from: a */
    public static void m177788a(FeedGroupEntranceItemView feedGroupEntranceItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedGroupEntranceItemView.f39955a = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedGroupEntranceItemView.f39956b = (VFrame) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedGroupEntranceItemView.f39957c = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        feedGroupEntranceItemView.f39958d = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        feedGroupEntranceItemView.f39959e = (TextView) viewGroup.getChildAt(1);
    }
}
