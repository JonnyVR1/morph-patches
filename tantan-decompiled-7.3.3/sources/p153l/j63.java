package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.holder.item.BooksMoviesDramasItem;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import p151v.AutoVDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class j63 {
    /* JADX INFO: renamed from: a */
    public static void m143602a(BooksMoviesDramasItem booksMoviesDramasItem, View view) {
        booksMoviesDramasItem.f23180a = (BooksMoviesDramasItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        booksMoviesDramasItem.f23181b = (RelativeLayout) viewGroup.getChildAt(0);
        booksMoviesDramasItem.f23182c = (AutoVDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        booksMoviesDramasItem.f23183d = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        booksMoviesDramasItem.f23184e = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        booksMoviesDramasItem.f23185f = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        booksMoviesDramasItem.f23186g = (VText_Bold) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        booksMoviesDramasItem.f23187h = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        booksMoviesDramasItem.f23188i = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0);
        booksMoviesDramasItem.f23189j = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1);
    }
}
