package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p000p1.mobile.putong.feed.newui.dialog.FeedPostBaseDialogAct;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class rrh {
    /* JADX INFO: renamed from: a */
    public static void m13953a(FeedPostBaseDialogAct feedPostBaseDialogAct, View view) {
        feedPostBaseDialogAct.f1397c = (RelativeLayout) view;
    }

    /* JADX INFO: renamed from: b */
    public static View m13954b(FeedPostBaseDialogAct feedPostBaseDialogAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11314u2, viewGroup, false);
        m13953a(feedPostBaseDialogAct, viewInflate);
        return viewInflate;
    }
}
