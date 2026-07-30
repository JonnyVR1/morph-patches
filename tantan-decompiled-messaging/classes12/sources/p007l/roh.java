package p007l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.poi.view.FeedPoiDialogStateItem;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class roh {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static void m13942a(FeedPoiDialogStateItem feedPoiDialogStateItem, View view) {
        feedPoiDialogStateItem.f3747c = (FeedPoiDialogStateItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedPoiDialogStateItem.f3748d = viewGroup.getChildAt(0);
        feedPoiDialogStateItem.f3749e = (TextView) viewGroup.getChildAt(1);
    }
}
