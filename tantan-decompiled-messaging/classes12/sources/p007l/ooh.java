package p007l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.poi.view.FeedPoiDialogLocationItem;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class ooh {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static void m12728a(FeedPoiDialogLocationItem feedPoiDialogLocationItem, View view) {
        feedPoiDialogLocationItem.f3744c = (FeedPoiDialogLocationItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedPoiDialogLocationItem.f3745d = (ImageView) viewGroup.getChildAt(0);
        feedPoiDialogLocationItem.f3746e = viewGroup.getChildAt(1);
    }
}
