package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinprofile.FeedInsertCommentView;
import p147v.VDraweeView;
import p147v.VEditText;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class y7h {
    /* JADX INFO: renamed from: a */
    public static void m213314a(FeedInsertCommentView feedInsertCommentView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedInsertCommentView.f41717a = (VDraweeView) viewGroup.getChildAt(0);
        feedInsertCommentView.f41718b = (VText) viewGroup.getChildAt(1);
        feedInsertCommentView.f41719c = (VEditText) viewGroup.getChildAt(2);
        feedInsertCommentView.f41720d = (VText) viewGroup.getChildAt(3);
        feedInsertCommentView.f41721e = (VText) viewGroup.getChildAt(4);
        feedInsertCommentView.f41722f = (VText) viewGroup.getChildAt(5);
        feedInsertCommentView.f41723g = (VText) viewGroup.getChildAt(6);
    }

    /* JADX INFO: renamed from: b */
    public static View m213315b(FeedInsertCommentView feedInsertCommentView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142087P0, viewGroup, false);
        m213314a(feedInsertCommentView, viewInflate);
        return viewInflate;
    }
}
