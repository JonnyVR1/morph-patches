package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.feed.newui.photoalbum.CommonEmptyView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.commend.FeedItemCommendBotEmojiView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.momentdetail.feedlist.FeedMaxHeightRecyclerView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.momentdetail.feedlist.FeedWithTwoRecyclerNestedScrollView;
import com.p051p1.mobile.putong.newui.view.MessageInputEditView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes13.dex */
public class ok00 {
    /* JADX INFO: renamed from: a */
    public static void m167973a(nk00 nk00Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        nk00Var.f142395a = (VNavigationBar) viewGroup.getChildAt(0);
        nk00Var.f142396b = viewGroup.getChildAt(1);
        nk00Var.f142397c = (FrameLayout) viewGroup.getChildAt(2);
        nk00Var.f142398d = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        nk00Var.f142399e = (FeedWithTwoRecyclerNestedScrollView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        nk00Var.f142400f = (FeedMaxHeightRecyclerView) view.findViewById(hdc0.f108977y);
        ViewGroup viewGroup2 = (ViewGroup) view;
        nk00Var.f142401g = (CommonEmptyView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        nk00Var.f142402h = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(1)).getChildAt(0)).getChildAt(2);
        nk00Var.f142403i = (FrameLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(1)).getChildAt(0)).getChildAt(3);
        nk00Var.f142404j = ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(2);
        nk00Var.f142405k = (LinearLayout) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(3);
        nk00Var.f142406l = (LinearLayout) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(3);
        nk00Var.f142407m = ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(3)).getChildAt(0);
        nk00Var.f142408n = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(3)).getChildAt(1)).getChildAt(0);
        nk00Var.f142409o = (ConstraintLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(3)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        nk00Var.f142410p = (MessageInputEditView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(3)).getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        nk00Var.f142411q = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(3)).getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        nk00Var.f142412r = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(3)).getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(2);
        nk00Var.f142413s = (FeedItemCommendBotEmojiView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(3)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        nk00Var.f142414t = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(3)).getChildAt(1)).getChildAt(1)).getChildAt(2);
        nk00Var.f142415u = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(3)).getChildAt(1)).getChildAt(1)).getChildAt(2)).getChildAt(0);
        nk00Var.f142416v = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(3)).getChildAt(1)).getChildAt(1)).getChildAt(2)).getChildAt(1);
        nk00Var.f142417w = (FeedItemCommendBotEmojiView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(3)).getChildAt(1)).getChildAt(1)).getChildAt(3);
        nk00Var.f142418x = ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(3)).getChildAt(2);
        nk00Var.f142419y = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(3)).getChildAt(3);
        nk00Var.f142420z = (VImage) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m167974b(nk00 nk00Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173704l5, viewGroup, false);
        m167973a(nk00Var, viewInflate);
        return viewInflate;
    }
}
