package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.view.FeedLinearWithExtraIconsView;
import com.p000p1.mobile.putong.feed.newui.status.aquare.FeedStatusListTabFrag;
import com.p000p1.mobile.putong.feed.newui.status.display.card.VPagerWithDefaultSize;
import com.p000p1.mobile.putong.feed.newui.status.entrance.followheader.FeedVDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class p2i {
    /* JADX INFO: renamed from: a */
    public static void m12903a(FeedStatusListTabFrag feedStatusListTabFrag, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedStatusListTabFrag.f4190z = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedStatusListTabFrag.f4175A = (FeedVDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedStatusListTabFrag.f4176B = (FeedLinearWithExtraIconsView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        feedStatusListTabFrag.f4177C = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        feedStatusListTabFrag.f4178D = (VPagerWithDefaultSize) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        feedStatusListTabFrag.f4179E = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        feedStatusListTabFrag.f4180F = (RelativeLayout) viewGroup.getChildAt(1);
        feedStatusListTabFrag.f4181G = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        feedStatusListTabFrag.f4182H = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m12904b(FeedStatusListTabFrag feedStatusListTabFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11318v, viewGroup, false);
        m12903a(feedStatusListTabFrag, viewInflate);
        return viewInflate;
    }
}
