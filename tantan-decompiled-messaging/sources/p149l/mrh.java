package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.feed.newui.mediapicker.post.FeedPostAtDialogItem;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes12.dex */
public class mrh {
    /* JADX INFO: renamed from: a */
    public static void m156026a(FeedPostAtDialogItem feedPostAtDialogItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedPostAtDialogItem.f40614a = (VDraweeView) viewGroup.getChildAt(0);
        feedPostAtDialogItem.f40615b = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        feedPostAtDialogItem.f40616c = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        feedPostAtDialogItem.f40617d = viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m156027b(FeedPostAtDialogItem feedPostAtDialogItem, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142288t2, viewGroup, false);
        m156026a(feedPostAtDialogItem, viewInflate);
        return viewInflate;
    }
}
