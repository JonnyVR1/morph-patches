package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.feed.newui.photoalbum.DiscoveryPager;
import com.p051p1.mobile.putong.feed.newui.status.display.statuspage.FeedStatusPageAct;
import com.tantanapp.media.ttmediaeffect.anim.AnimEffectPlayer;
import p151v.VImage;
import p151v.VRelative;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes13.dex */
public class r4i {
    /* JADX INFO: renamed from: a */
    public static void m179767a(FeedStatusPageAct feedStatusPageAct, View view) {
        feedStatusPageAct.f43598c = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedStatusPageAct.f43599d = (VNavigationBar) viewGroup.getChildAt(0);
        feedStatusPageAct.f43600e = (VNavigationBar) viewGroup.getChildAt(1);
        feedStatusPageAct.f43601f = (DiscoveryPager) viewGroup.getChildAt(2);
        feedStatusPageAct.f43602g = (ConstraintLayout) viewGroup.getChildAt(3);
        feedStatusPageAct.f43603h = (VImage) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        feedStatusPageAct.f43604i = (VRelative) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        feedStatusPageAct.f43605j = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0);
        feedStatusPageAct.f43606k = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(1);
        feedStatusPageAct.f43607l = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(2);
        feedStatusPageAct.f43608m = (AnimEffectPlayer) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m179768b(FeedStatusPageAct feedStatusPageAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173772v3, viewGroup, false);
        m179767a(feedStatusPageAct, viewInflate);
        return viewInflate;
    }
}
