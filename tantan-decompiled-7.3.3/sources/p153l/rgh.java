package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.view.FeedMomentForwardSheetItemView;
import p151v.VCheckBox;

/* JADX INFO: loaded from: classes13.dex */
public class rgh {
    /* JADX INFO: renamed from: a */
    public static void m181444a(FeedMomentForwardSheetItemView feedMomentForwardSheetItemView, View view) {
        feedMomentForwardSheetItemView.f43271d = (FeedMomentForwardSheetItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedMomentForwardSheetItemView.f43272e = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedMomentForwardSheetItemView.f43273f = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedMomentForwardSheetItemView.f43274g = (VCheckBox) viewGroup.getChildAt(1);
    }
}
