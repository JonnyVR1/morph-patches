package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.feed.newui.photoalbum.DiscoveryPager;
import com.p046p1.mobile.putong.feed.newui.status.display.statuspage.FeedStatusPageAct;
import com.tantanapp.media.ttmediaeffect.anim.AnimEffectPlayer;
import p147v.VImage;
import p147v.VRelative;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes12.dex */
public class c3i {
    /* JADX INFO: renamed from: a */
    public static void m105027a(FeedStatusPageAct feedStatusPageAct, View view) {
        feedStatusPageAct.f42750c = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedStatusPageAct.f42751d = (VNavigationBar) viewGroup.getChildAt(0);
        feedStatusPageAct.f42752e = (VNavigationBar) viewGroup.getChildAt(1);
        feedStatusPageAct.f42753f = (DiscoveryPager) viewGroup.getChildAt(2);
        feedStatusPageAct.f42754g = (ConstraintLayout) viewGroup.getChildAt(3);
        feedStatusPageAct.f42755h = (VImage) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        feedStatusPageAct.f42756i = (VRelative) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        feedStatusPageAct.f42757j = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0);
        feedStatusPageAct.f42758k = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(1);
        feedStatusPageAct.f42759l = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(2);
        feedStatusPageAct.f42760m = (AnimEffectPlayer) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m105028b(FeedStatusPageAct feedStatusPageAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142303v3, viewGroup, false);
        m105027a(feedStatusPageAct, viewInflate);
        return viewInflate;
    }
}
