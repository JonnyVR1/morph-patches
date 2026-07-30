package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.feed.newui.group.dialog.insert.selecteditem.FeedPostSelectedTopicsView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class fuh {
    /* JADX INFO: renamed from: a */
    public static void m10322a(FeedPostSelectedTopicsView feedPostSelectedTopicsView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedPostSelectedTopicsView.f1460a = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedPostSelectedTopicsView.f1461b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        feedPostSelectedTopicsView.f1462c = viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m10323b(FeedPostSelectedTopicsView feedPostSelectedTopicsView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11059H1, viewGroup, false);
        m10322a(feedPostSelectedTopicsView, viewInflate);
        return viewInflate;
    }
}
