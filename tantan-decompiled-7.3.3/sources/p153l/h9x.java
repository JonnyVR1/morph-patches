package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.newui.home.NewPictureContainerIndicator;
import com.p051p1.mobile.putong.core.p058ui.match.view.MatchBlackShadowView;
import com.p051p1.mobile.putong.core.p058ui.match.view.MatchEdgeTransFrameLayout;
import com.p051p1.mobile.putong.core.p058ui.match.view.MatchPicViewPager;
import com.p051p1.mobile.putong.core.p058ui.match.view.MatchTransView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class h9x {
    /* JADX INFO: renamed from: a */
    public static void m134091a(g9x g9xVar, View view) {
        g9xVar.f102901a = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        g9xVar.f102902b = (MatchPicViewPager) viewGroup.getChildAt(0);
        g9xVar.f102903c = (MatchTransView) viewGroup.getChildAt(1);
        g9xVar.f102904d = (MatchBlackShadowView) viewGroup.getChildAt(2);
        g9xVar.f102905e = (NewPictureContainerIndicator) viewGroup.getChildAt(3);
        g9xVar.f102906f = (LinearLayout) viewGroup.getChildAt(4);
        g9xVar.f102907g = (VText) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        g9xVar.f102908h = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        g9xVar.f102909i = (MatchEdgeTransFrameLayout) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2);
        g9xVar.f102910j = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        g9xVar.f102911k = (EditText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(3)).getChildAt(0);
        g9xVar.f102912l = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(3)).getChildAt(1);
        g9xVar.f102913m = (TextView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(4);
        g9xVar.f102914n = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(5);
        g9xVar.f102915o = (FrameLayout) viewGroup.getChildAt(5);
        g9xVar.f102916p = (VImage) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        g9xVar.f102917q = (VImage) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m134092b(g9x g9xVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125632T7, viewGroup, false);
        m134091a(g9xVar, viewInflate);
        return viewInflate;
    }
}
