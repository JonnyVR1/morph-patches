package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.feed.newui.dialog.FeedMomentBoostDialogItemView;

/* JADX INFO: loaded from: classes12.dex */
public class ceh {
    /* JADX INFO: renamed from: a */
    public static void m106317a(FeedMomentBoostDialogItemView feedMomentBoostDialogItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedMomentBoostDialogItemView.f39934d = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedMomentBoostDialogItemView.f39935e = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m106318b(FeedMomentBoostDialogItemView feedMomentBoostDialogItemView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142259p1, viewGroup, false);
        m106317a(feedMomentBoostDialogItemView, viewInflate);
        return viewInflate;
    }
}
