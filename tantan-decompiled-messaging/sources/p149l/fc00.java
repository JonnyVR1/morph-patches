package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.feed.newui.photoalbum.CommonEmptyView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.commend.FeedItemCommendBotEmojiView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.momentdetail.feedlist.FeedMaxHeightRecyclerView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.momentdetail.feedlist.FeedWithTwoRecyclerNestedScrollView;
import com.p046p1.mobile.putong.newui.view.MessageInputEditView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes12.dex */
public class fc00 {
    /* JADX INFO: renamed from: a */
    public static void m120414a(ec00 ec00Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        ec00Var.f90423a = (VNavigationBar) viewGroup.getChildAt(0);
        ec00Var.f90424b = viewGroup.getChildAt(1);
        ec00Var.f90425c = (FrameLayout) viewGroup.getChildAt(2);
        ec00Var.f90426d = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        ec00Var.f90427e = (FeedWithTwoRecyclerNestedScrollView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        ec00Var.f90428f = (FeedMaxHeightRecyclerView) view.findViewById(b5c0.f73624y);
        ViewGroup viewGroup2 = (ViewGroup) view;
        ec00Var.f90429g = (CommonEmptyView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        ec00Var.f90430h = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(1)).getChildAt(0)).getChildAt(2);
        ec00Var.f90431i = (FrameLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(1)).getChildAt(0)).getChildAt(3);
        ec00Var.f90432j = ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(2);
        ec00Var.f90433k = (LinearLayout) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(3);
        ec00Var.f90434l = (LinearLayout) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(3);
        ec00Var.f90435m = ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(3)).getChildAt(0);
        ec00Var.f90436n = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(3)).getChildAt(1)).getChildAt(0);
        ec00Var.f90437o = (ConstraintLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(3)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        ec00Var.f90438p = (MessageInputEditView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(3)).getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        ec00Var.f90439q = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(3)).getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        ec00Var.f90440r = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(3)).getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(2);
        ec00Var.f90441s = (FeedItemCommendBotEmojiView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(3)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        ec00Var.f90442t = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(3)).getChildAt(1)).getChildAt(1)).getChildAt(2);
        ec00Var.f90443u = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(3)).getChildAt(1)).getChildAt(1)).getChildAt(2)).getChildAt(0);
        ec00Var.f90444v = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(3)).getChildAt(1)).getChildAt(1)).getChildAt(2)).getChildAt(1);
        ec00Var.f90445w = (FeedItemCommendBotEmojiView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(3)).getChildAt(1)).getChildAt(1)).getChildAt(3);
        ec00Var.f90446x = ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(3)).getChildAt(2);
        ec00Var.f90447y = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(3)).getChildAt(3);
        ec00Var.f90448z = (VImage) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m120415b(ec00 ec00Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142235l5, viewGroup, false);
        m120414a(ec00Var, viewInflate);
        return viewInflate;
    }
}
