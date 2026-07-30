package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.feed.newui.photoalbum.bookmovie.BookMovieTopicHeaderView;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class r43 {
    /* JADX INFO: renamed from: a */
    public static void m177768a(BookMovieTopicHeaderView bookMovieTopicHeaderView, View view) {
        bookMovieTopicHeaderView.f41458d = (BookMovieTopicHeaderView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        bookMovieTopicHeaderView.f41459e = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        bookMovieTopicHeaderView.f41460f = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        bookMovieTopicHeaderView.f41461g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        bookMovieTopicHeaderView.f41462h = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        bookMovieTopicHeaderView.f41463i = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2);
        bookMovieTopicHeaderView.f41464j = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2)).getChildAt(0);
        bookMovieTopicHeaderView.f41465k = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2)).getChildAt(1);
        bookMovieTopicHeaderView.f41466l = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }
}
