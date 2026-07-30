package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.newui.newmeet.feed.likers.MeetLikersItemView;
import com.p051p1.mobile.putong.core.newui.newmeet.feed.nearby.MeetNearbyItemView;
import com.p051p1.mobile.putong.core.newui.newmeet.feed.view.MeetItemEntryHeadViewMyTabStyle;
import p151v.VFrame;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class q620 {
    /* JADX INFO: renamed from: a */
    public static void m175539a(p620 p620Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        p620Var.f150720a = (LinearLayout) viewGroup.getChildAt(0);
        p620Var.f150721b = (MeetItemEntryHeadViewMyTabStyle) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        p620Var.f150722c = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        p620Var.f150723d = (MeetLikersItemView) viewGroup.getChildAt(1);
        p620Var.f150724e = (MeetNearbyItemView) viewGroup.getChildAt(2);
        p620Var.f150725f = (VFrame) viewGroup.getChildAt(3);
        p620Var.f150726g = (VImage) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        p620Var.f150727h = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m175540b(p620 p620Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125552O7, viewGroup, false);
        m175539a(p620Var, viewInflate);
        return viewInflate;
    }
}
