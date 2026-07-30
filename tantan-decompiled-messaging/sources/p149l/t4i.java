package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.feed.newui.status.display.statuspage.newtab.FeedStateSquareRecycle;
import com.p046p1.mobile.putong.feed.newui.status.display.statuspage.newtab.FeedStatusSquareTabFrag;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRelative;

/* JADX INFO: loaded from: classes12.dex */
public class t4i {
    /* JADX INFO: renamed from: a */
    public static void m187203a(FeedStatusSquareTabFrag feedStatusSquareTabFrag, View view) {
        feedStatusSquareTabFrag.f42870z = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedStatusSquareTabFrag.f42830A = (VRelative) viewGroup.getChildAt(0);
        feedStatusSquareTabFrag.f42831B = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedStatusSquareTabFrag.f42832C = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedStatusSquareTabFrag.f42833D = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        feedStatusSquareTabFrag.f42834E = (VLinear) viewGroup.getChildAt(1);
        feedStatusSquareTabFrag.f42836F = (FeedStateSquareRecycle) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        feedStatusSquareTabFrag.f42838G = (VLinear) viewGroup.getChildAt(2);
        feedStatusSquareTabFrag.f42840H = (Space) viewGroup.getChildAt(3);
        feedStatusSquareTabFrag.f42842I = (VLinear) viewGroup.getChildAt(4);
        feedStatusSquareTabFrag.f42844J = (RecyclerView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m187204b(FeedStatusSquareTabFrag feedStatusSquareTabFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142324y3, viewGroup, false);
        m187203a(feedStatusSquareTabFrag, viewInflate);
        return viewInflate;
    }
}
