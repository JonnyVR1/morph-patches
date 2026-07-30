package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.poi.view.FeedPoiDialogStateItem;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes12.dex */
public class roh {
    /* JADX INFO: renamed from: a */
    public static void m180242a(FeedPoiDialogStateItem feedPoiDialogStateItem, View view) {
        feedPoiDialogStateItem.f42286c = (FeedPoiDialogStateItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedPoiDialogStateItem.f42287d = (VDraweeView) viewGroup.getChildAt(0);
        feedPoiDialogStateItem.f42288e = (TextView) viewGroup.getChildAt(1);
    }
}
