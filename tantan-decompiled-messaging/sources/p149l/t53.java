package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.holder.item.BooksMoviesDramasItem;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import p147v.AutoVDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class t53 {
    /* JADX INFO: renamed from: a */
    public static void m187271a(BooksMoviesDramasItem booksMoviesDramasItem, View view) {
        booksMoviesDramasItem.f22438a = (BooksMoviesDramasItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        booksMoviesDramasItem.f22439b = (RelativeLayout) viewGroup.getChildAt(0);
        booksMoviesDramasItem.f22440c = (AutoVDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        booksMoviesDramasItem.f22441d = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        booksMoviesDramasItem.f22442e = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        booksMoviesDramasItem.f22443f = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        booksMoviesDramasItem.f22444g = (VText_Bold) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        booksMoviesDramasItem.f22445h = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        booksMoviesDramasItem.f22446i = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0);
        booksMoviesDramasItem.f22447j = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1);
    }
}
