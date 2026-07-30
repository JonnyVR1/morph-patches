package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.newui.dialog.FeedMomentBoostDialogItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class ceh {
    /* JADX INFO: renamed from: a */
    public static void m9126a(FeedMomentBoostDialogItemView feedMomentBoostDialogItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedMomentBoostDialogItemView.f1395d = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedMomentBoostDialogItemView.f1396e = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m9127b(FeedMomentBoostDialogItemView feedMomentBoostDialogItemView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11278p1, viewGroup, false);
        m9126a(feedMomentBoostDialogItemView, viewInflate);
        return viewInflate;
    }
}
