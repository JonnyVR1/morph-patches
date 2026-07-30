package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.feed.newui.mediapicker.post.FeedPostAtDialogItem;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes13.dex */
public class bth {
    /* JADX INFO: renamed from: a */
    public static void m106334a(FeedPostAtDialogItem feedPostAtDialogItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedPostAtDialogItem.f41462a = (VDraweeView) viewGroup.getChildAt(0);
        feedPostAtDialogItem.f41463b = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        feedPostAtDialogItem.f41464c = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        feedPostAtDialogItem.f41465d = viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m106335b(FeedPostAtDialogItem feedPostAtDialogItem, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173757t2, viewGroup, false);
        m106334a(feedPostAtDialogItem, viewInflate);
        return viewInflate;
    }
}
