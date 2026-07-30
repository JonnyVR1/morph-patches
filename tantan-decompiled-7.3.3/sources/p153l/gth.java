package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.feed.newui.dialog.FeedPostBaseDialogAct;

/* JADX INFO: loaded from: classes13.dex */
public class gth {
    /* JADX INFO: renamed from: a */
    public static void m132237a(FeedPostBaseDialogAct feedPostBaseDialogAct, View view) {
        feedPostBaseDialogAct.f40784c = (RelativeLayout) view;
    }

    /* JADX INFO: renamed from: b */
    public static View m132238b(FeedPostBaseDialogAct feedPostBaseDialogAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173764u2, viewGroup, false);
        m132237a(feedPostBaseDialogAct, viewInflate);
        return viewInflate;
    }
}
