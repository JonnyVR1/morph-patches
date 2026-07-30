package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.feed.newui.status.display.statuspage.newtab.FeedStateSquareRecycle;
import com.p051p1.mobile.putong.feed.newui.status.display.statuspage.newtab.FeedStatusSquareTabFrag;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRelative;

/* JADX INFO: loaded from: classes13.dex */
public class i6i {
    /* JADX INFO: renamed from: a */
    public static void m138822a(FeedStatusSquareTabFrag feedStatusSquareTabFrag, View view) {
        feedStatusSquareTabFrag.f43718z = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedStatusSquareTabFrag.f43678A = (VRelative) viewGroup.getChildAt(0);
        feedStatusSquareTabFrag.f43679B = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedStatusSquareTabFrag.f43680C = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedStatusSquareTabFrag.f43681D = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        feedStatusSquareTabFrag.f43682E = (VLinear) viewGroup.getChildAt(1);
        feedStatusSquareTabFrag.f43684F = (FeedStateSquareRecycle) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        feedStatusSquareTabFrag.f43686G = (VLinear) viewGroup.getChildAt(2);
        feedStatusSquareTabFrag.f43688H = (Space) viewGroup.getChildAt(3);
        feedStatusSquareTabFrag.f43690I = (VLinear) viewGroup.getChildAt(4);
        feedStatusSquareTabFrag.f43692J = (RecyclerView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m138823b(FeedStatusSquareTabFrag feedStatusSquareTabFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173793y3, viewGroup, false);
        m138822a(feedStatusSquareTabFrag, viewInflate);
        return viewInflate;
    }
}
