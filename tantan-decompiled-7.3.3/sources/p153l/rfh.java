package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.feed.newui.dialog.FeedMomentBoostDialogItemView;

/* JADX INFO: loaded from: classes13.dex */
public class rfh {
    /* JADX INFO: renamed from: a */
    public static void m181207a(FeedMomentBoostDialogItemView feedMomentBoostDialogItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedMomentBoostDialogItemView.f40782d = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedMomentBoostDialogItemView.f40783e = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m181208b(FeedMomentBoostDialogItemView feedMomentBoostDialogItemView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173728p1, viewGroup, false);
        m181207a(feedMomentBoostDialogItemView, viewInflate);
        return viewInflate;
    }
}
