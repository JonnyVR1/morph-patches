package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.newui.home.NewPictureContainerIndicator;
import com.p046p1.mobile.putong.core.p053ui.match.view.MatchBlackShadowView;
import com.p046p1.mobile.putong.core.p053ui.match.view.MatchEdgeTransFrameLayout;
import com.p046p1.mobile.putong.core.p053ui.match.view.MatchPicViewPager;
import com.p046p1.mobile.putong.core.p053ui.match.view.MatchTransView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class i6x {
    /* JADX INFO: renamed from: a */
    public static void m134667a(h6x h6xVar, View view) {
        h6xVar.f106123a = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        h6xVar.f106124b = (MatchPicViewPager) viewGroup.getChildAt(0);
        h6xVar.f106125c = (MatchTransView) viewGroup.getChildAt(1);
        h6xVar.f106126d = (MatchBlackShadowView) viewGroup.getChildAt(2);
        h6xVar.f106127e = (NewPictureContainerIndicator) viewGroup.getChildAt(3);
        h6xVar.f106128f = (LinearLayout) viewGroup.getChildAt(4);
        h6xVar.f106129g = (VText) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        h6xVar.f106130h = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        h6xVar.f106131i = (MatchEdgeTransFrameLayout) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2);
        h6xVar.f106132j = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        h6xVar.f106133k = (EditText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(3)).getChildAt(0);
        h6xVar.f106134l = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(3)).getChildAt(1);
        h6xVar.f106135m = (TextView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(4);
        h6xVar.f106136n = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(5);
        h6xVar.f106137o = (FrameLayout) viewGroup.getChildAt(5);
        h6xVar.f106138p = (VImage) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        h6xVar.f106139q = (VImage) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m134668b(h6x h6xVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95466M7, viewGroup, false);
        m134667a(h6xVar, viewInflate);
        return viewInflate;
    }
}
