package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.newui.newmeet.feed.likers.MeetLikersItemView;
import com.p046p1.mobile.putong.core.newui.newmeet.feed.nearby.MeetNearbyItemView;
import com.p046p1.mobile.putong.core.newui.newmeet.feed.view.MeetItemEntryHeadViewMyTabStyle;
import p147v.VFrame;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class iy10 {
    /* JADX INFO: renamed from: a */
    public static void m138926a(hy10 hy10Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        hy10Var.f110012a = (LinearLayout) viewGroup.getChildAt(0);
        hy10Var.f110013b = (MeetItemEntryHeadViewMyTabStyle) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        hy10Var.f110014c = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        hy10Var.f110015d = (MeetLikersItemView) viewGroup.getChildAt(1);
        hy10Var.f110016e = (MeetNearbyItemView) viewGroup.getChildAt(2);
        hy10Var.f110017f = (VFrame) viewGroup.getChildAt(3);
        hy10Var.f110018g = (VImage) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        hy10Var.f110019h = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m138927b(hy10 hy10Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95386H7, viewGroup, false);
        m138926a(hy10Var, viewInflate);
        return viewInflate;
    }
}
