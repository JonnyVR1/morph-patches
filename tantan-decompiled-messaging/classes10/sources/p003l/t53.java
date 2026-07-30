package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p1.mobile.putong.core.newui.home.card.expanded.holder.item.BooksMoviesDramasItem;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class t53 {
    /* JADX INFO: renamed from: a */
    public static void m9542a(BooksMoviesDramasItem booksMoviesDramasItem, View view) {
        booksMoviesDramasItem.a = (BooksMoviesDramasItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        booksMoviesDramasItem.b = (RelativeLayout) viewGroup.getChildAt(0);
        booksMoviesDramasItem.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        booksMoviesDramasItem.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        booksMoviesDramasItem.e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        booksMoviesDramasItem.f = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        booksMoviesDramasItem.g = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        booksMoviesDramasItem.h = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        booksMoviesDramasItem.i = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0);
        booksMoviesDramasItem.j = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1);
    }
}
