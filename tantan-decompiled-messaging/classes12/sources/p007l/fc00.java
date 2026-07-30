package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.CommonEmptyView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.commend.FeedItemCommendBotEmojiView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.momentdetail.feedlist.FeedMaxHeightRecyclerView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.momentdetail.feedlist.FeedWithTwoRecyclerNestedScrollView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class fc00 {
    /* JADX INFO: renamed from: a */
    public static void m10109a(ec00 ec00Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        ec00Var.f7299a = viewGroup.getChildAt(0);
        ec00Var.f7300b = viewGroup.getChildAt(1);
        ec00Var.f7301c = (FrameLayout) viewGroup.getChildAt(2);
        ec00Var.f7302d = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        ec00Var.f7303e = (FeedWithTwoRecyclerNestedScrollView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        ec00Var.f7304f = (FeedMaxHeightRecyclerView) view.findViewById(b5c0.f6105y);
        ViewGroup viewGroup2 = (ViewGroup) view;
        ec00Var.f7305g = (CommonEmptyView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        ec00Var.f7306h = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(1)).getChildAt(0)).getChildAt(2);
        ec00Var.f7307i = (FrameLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(1)).getChildAt(0)).getChildAt(3);
        ec00Var.f7308j = ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(2);
        ec00Var.f7309k = (LinearLayout) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(3);
        ec00Var.f7310l = (LinearLayout) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(3);
        ec00Var.f7311m = ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(3)).getChildAt(0);
        ec00Var.f7312n = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(3)).getChildAt(1)).getChildAt(0);
        ec00Var.f7313o = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(3)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        ec00Var.f7314p = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(3)).getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        ec00Var.f7315q = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(3)).getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        ec00Var.f7316r = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(3)).getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(2);
        ec00Var.f7317s = (FeedItemCommendBotEmojiView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(3)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        ec00Var.f7318t = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(3)).getChildAt(1)).getChildAt(1)).getChildAt(2);
        ec00Var.f7319u = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(3)).getChildAt(1)).getChildAt(1)).getChildAt(2)).getChildAt(0);
        ec00Var.f7320v = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(3)).getChildAt(1)).getChildAt(1)).getChildAt(2)).getChildAt(1);
        ec00Var.f7321w = (FeedItemCommendBotEmojiView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(3)).getChildAt(1)).getChildAt(1)).getChildAt(3);
        ec00Var.f7322x = ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(3)).getChildAt(2);
        ec00Var.f7323y = ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(3)).getChildAt(3);
        ec00Var.f7324z = ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m10110b(ec00 ec00Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11254l5, viewGroup, false);
        m10109a(ec00Var, viewInflate);
        return viewInflate;
    }
}
