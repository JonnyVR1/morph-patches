package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinprofile.FeedInsertCommentView;
import p151v.VDraweeView;
import p151v.VEditText;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class n9h {
    /* JADX INFO: renamed from: a */
    public static void m161978a(FeedInsertCommentView feedInsertCommentView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedInsertCommentView.f42565a = (VDraweeView) viewGroup.getChildAt(0);
        feedInsertCommentView.f42566b = (VText) viewGroup.getChildAt(1);
        feedInsertCommentView.f42567c = (VEditText) viewGroup.getChildAt(2);
        feedInsertCommentView.f42568d = (VText) viewGroup.getChildAt(3);
        feedInsertCommentView.f42569e = (VText) viewGroup.getChildAt(4);
        feedInsertCommentView.f42570f = (VText) viewGroup.getChildAt(5);
        feedInsertCommentView.f42571g = (VText) viewGroup.getChildAt(6);
    }

    /* JADX INFO: renamed from: b */
    public static View m161979b(FeedInsertCommentView feedInsertCommentView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173556P0, viewGroup, false);
        m161978a(feedInsertCommentView, viewInflate);
        return viewInflate;
    }
}
