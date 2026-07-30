package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.poi.view.FeedPoiDialogStateItem;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes13.dex */
public class gqh {
    /* JADX INFO: renamed from: a */
    public static void m131375a(FeedPoiDialogStateItem feedPoiDialogStateItem, View view) {
        feedPoiDialogStateItem.f43134c = (FeedPoiDialogStateItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedPoiDialogStateItem.f43135d = (VDraweeView) viewGroup.getChildAt(0);
        feedPoiDialogStateItem.f43136e = (TextView) viewGroup.getChildAt(1);
    }
}
