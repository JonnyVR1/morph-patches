package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.view.FeedMomentForwardSheetItemView;
import p147v.VCheckBox;

/* JADX INFO: loaded from: classes12.dex */
public class cfh {
    /* JADX INFO: renamed from: a */
    public static void m106551a(FeedMomentForwardSheetItemView feedMomentForwardSheetItemView, View view) {
        feedMomentForwardSheetItemView.f42423d = (FeedMomentForwardSheetItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedMomentForwardSheetItemView.f42424e = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedMomentForwardSheetItemView.f42425f = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedMomentForwardSheetItemView.f42426g = (VCheckBox) viewGroup.getChildAt(1);
    }
}
