package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.feed.newui.dialog.FeedPostBaseDialogAct;

/* JADX INFO: loaded from: classes12.dex */
public class rrh {
    /* JADX INFO: renamed from: a */
    public static void m180545a(FeedPostBaseDialogAct feedPostBaseDialogAct, View view) {
        feedPostBaseDialogAct.f39936c = (RelativeLayout) view;
    }

    /* JADX INFO: renamed from: b */
    public static View m180546b(FeedPostBaseDialogAct feedPostBaseDialogAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142295u2, viewGroup, false);
        m180545a(feedPostBaseDialogAct, viewInflate);
        return viewInflate;
    }
}
