package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.feed.newui.status.display.statuspage.newtab.FeedStateSquareRecycle;
import com.p000p1.mobile.putong.feed.newui.status.display.statuspage.newtab.FeedStatusSquareTabFrag;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class t4i {
    /* JADX INFO: renamed from: a */
    public static void m14434a(FeedStatusSquareTabFrag feedStatusSquareTabFrag, View view) {
        feedStatusSquareTabFrag.f4331z = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedStatusSquareTabFrag.f4291A = viewGroup.getChildAt(0);
        feedStatusSquareTabFrag.f4292B = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedStatusSquareTabFrag.f4293C = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedStatusSquareTabFrag.f4294D = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        feedStatusSquareTabFrag.f4295E = viewGroup.getChildAt(1);
        feedStatusSquareTabFrag.f4297F = (FeedStateSquareRecycle) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        feedStatusSquareTabFrag.f4299G = viewGroup.getChildAt(2);
        feedStatusSquareTabFrag.f4301H = (Space) viewGroup.getChildAt(3);
        feedStatusSquareTabFrag.f4303I = viewGroup.getChildAt(4);
        feedStatusSquareTabFrag.f4305J = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m14435b(FeedStatusSquareTabFrag feedStatusSquareTabFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11343y3, viewGroup, false);
        m14434a(feedStatusSquareTabFrag, viewInflate);
        return viewInflate;
    }
}
