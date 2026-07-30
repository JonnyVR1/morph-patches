package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinprofile.FeedInsertCommentView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class y7h {
    /* JADX INFO: renamed from: a */
    public static void m16965a(FeedInsertCommentView feedInsertCommentView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedInsertCommentView.f3178a = viewGroup.getChildAt(0);
        feedInsertCommentView.f3179b = viewGroup.getChildAt(1);
        feedInsertCommentView.f3180c = viewGroup.getChildAt(2);
        feedInsertCommentView.f3181d = viewGroup.getChildAt(3);
        feedInsertCommentView.f3182e = viewGroup.getChildAt(4);
        feedInsertCommentView.f3183f = viewGroup.getChildAt(5);
        feedInsertCommentView.f3184g = viewGroup.getChildAt(6);
    }

    /* JADX INFO: renamed from: b */
    public static View m16966b(FeedInsertCommentView feedInsertCommentView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11106P0, viewGroup, false);
        m16965a(feedInsertCommentView, viewInflate);
        return viewInflate;
    }
}
