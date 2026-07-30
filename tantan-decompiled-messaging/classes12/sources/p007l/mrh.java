package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.newui.mediapicker.post.FeedPostAtDialogItem;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class mrh {
    /* JADX INFO: renamed from: a */
    public static void m12011a(FeedPostAtDialogItem feedPostAtDialogItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedPostAtDialogItem.f2075a = viewGroup.getChildAt(0);
        feedPostAtDialogItem.f2076b = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        feedPostAtDialogItem.f2077c = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        feedPostAtDialogItem.f2078d = viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m12012b(FeedPostAtDialogItem feedPostAtDialogItem, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11307t2, viewGroup, false);
        m12011a(feedPostAtDialogItem, viewInflate);
        return viewInflate;
    }
}
