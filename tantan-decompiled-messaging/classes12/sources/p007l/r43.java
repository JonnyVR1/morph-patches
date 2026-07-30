package p007l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.feed.newui.photoalbum.bookmovie.BookMovieTopicHeaderView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class r43 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static void m13829a(BookMovieTopicHeaderView bookMovieTopicHeaderView, View view) {
        bookMovieTopicHeaderView.f2919d = (BookMovieTopicHeaderView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        bookMovieTopicHeaderView.f2920e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        bookMovieTopicHeaderView.f2921f = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        bookMovieTopicHeaderView.f2922g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        bookMovieTopicHeaderView.f2923h = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        bookMovieTopicHeaderView.f2924i = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2);
        bookMovieTopicHeaderView.f2925j = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2)).getChildAt(0);
        bookMovieTopicHeaderView.f2926k = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2)).getChildAt(1);
        bookMovieTopicHeaderView.f2927l = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }
}
