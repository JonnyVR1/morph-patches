package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.feed.newui.photoalbum.bookmovie.BookMovieTopicHeaderView;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class h53 {
    /* JADX INFO: renamed from: a */
    public static void m133623a(BookMovieTopicHeaderView bookMovieTopicHeaderView, View view) {
        bookMovieTopicHeaderView.f42306d = (BookMovieTopicHeaderView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        bookMovieTopicHeaderView.f42307e = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        bookMovieTopicHeaderView.f42308f = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        bookMovieTopicHeaderView.f42309g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        bookMovieTopicHeaderView.f42310h = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        bookMovieTopicHeaderView.f42311i = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2);
        bookMovieTopicHeaderView.f42312j = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2)).getChildAt(0);
        bookMovieTopicHeaderView.f42313k = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2)).getChildAt(1);
        bookMovieTopicHeaderView.f42314l = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }
}
