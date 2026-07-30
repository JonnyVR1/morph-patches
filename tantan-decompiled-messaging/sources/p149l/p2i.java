package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.view.FeedLinearWithExtraIconsView;
import com.p046p1.mobile.putong.feed.newui.status.aquare.FeedStatusListTabFrag;
import com.p046p1.mobile.putong.feed.newui.status.display.card.VPagerWithDefaultSize;
import com.p046p1.mobile.putong.feed.newui.status.entrance.followheader.FeedVDraweeView;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes12.dex */
public class p2i {
    /* JADX INFO: renamed from: a */
    public static void m167179a(FeedStatusListTabFrag feedStatusListTabFrag, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedStatusListTabFrag.f42729z = (VNavigationBar) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedStatusListTabFrag.f42714A = (FeedVDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedStatusListTabFrag.f42715B = (FeedLinearWithExtraIconsView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        feedStatusListTabFrag.f42716C = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        feedStatusListTabFrag.f42717D = (VPagerWithDefaultSize) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        feedStatusListTabFrag.f42718E = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        feedStatusListTabFrag.f42719F = (RelativeLayout) viewGroup.getChildAt(1);
        feedStatusListTabFrag.f42720G = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        feedStatusListTabFrag.f42721H = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m167180b(FeedStatusListTabFrag feedStatusListTabFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142299v, viewGroup, false);
        m167179a(feedStatusListTabFrag, viewInflate);
        return viewInflate;
    }
}
