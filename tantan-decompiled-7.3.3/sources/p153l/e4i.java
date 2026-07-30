package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.view.FeedLinearWithExtraIconsView;
import com.p051p1.mobile.putong.feed.newui.status.aquare.FeedStatusListTabFrag;
import com.p051p1.mobile.putong.feed.newui.status.display.card.VPagerWithDefaultSize;
import com.p051p1.mobile.putong.feed.newui.status.entrance.followheader.FeedVDraweeView;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes13.dex */
public class e4i {
    /* JADX INFO: renamed from: a */
    public static void m119427a(FeedStatusListTabFrag feedStatusListTabFrag, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedStatusListTabFrag.f43577z = (VNavigationBar) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedStatusListTabFrag.f43562A = (FeedVDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedStatusListTabFrag.f43563B = (FeedLinearWithExtraIconsView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        feedStatusListTabFrag.f43564C = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        feedStatusListTabFrag.f43565D = (VPagerWithDefaultSize) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        feedStatusListTabFrag.f43566E = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        feedStatusListTabFrag.f43567F = (RelativeLayout) viewGroup.getChildAt(1);
        feedStatusListTabFrag.f43568G = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        feedStatusListTabFrag.f43569H = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m119428b(FeedStatusListTabFrag feedStatusListTabFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173768v, viewGroup, false);
        m119427a(feedStatusListTabFrag, viewInflate);
        return viewInflate;
    }
}
