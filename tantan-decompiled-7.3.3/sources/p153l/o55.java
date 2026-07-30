package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.newui.main.view.LinearLayoutFixedLayout;
import com.p051p1.mobile.putong.core.p058ui.dlg.views.CityCoverMiddleCardView;
import com.p051p1.mobile.putong.core.view.diamond.BlackDiamondTagView;
import com.p051p1.mobile.putong.newui.view.ODiamondTagLabel;
import com.p051p1.mobile.putong.newui.view.VIPShimmerTag;
import com.tantan.library.svga.SVGAnimationView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class o55 {
    /* JADX INFO: renamed from: a */
    public static void m166090a(CityCoverMiddleCardView cityCoverMiddleCardView, View view) {
        cityCoverMiddleCardView.f29858a = (CityCoverMiddleCardView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        cityCoverMiddleCardView.f29859b = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        cityCoverMiddleCardView.f29860c = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        cityCoverMiddleCardView.f29861d = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3)).getChildAt(0)).getChildAt(1);
        cityCoverMiddleCardView.f29862e = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3)).getChildAt(1);
        cityCoverMiddleCardView.f29863f = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(5)).getChildAt(0);
        cityCoverMiddleCardView.f29864g = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(5)).getChildAt(1);
        cityCoverMiddleCardView.f29865h = (LinearLayoutFixedLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(5)).getChildAt(2);
        cityCoverMiddleCardView.f29866i = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(5)).getChildAt(2)).getChildAt(0);
        cityCoverMiddleCardView.f29867j = (ODiamondTagLabel) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(5)).getChildAt(2)).getChildAt(1);
        cityCoverMiddleCardView.f29868k = (VIPShimmerTag) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(5)).getChildAt(2)).getChildAt(2);
        cityCoverMiddleCardView.f29869l = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(5)).getChildAt(2)).getChildAt(3);
        cityCoverMiddleCardView.f29870m = (BlackDiamondTagView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(5)).getChildAt(2)).getChildAt(4);
        cityCoverMiddleCardView.f29871n = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(5)).getChildAt(2)).getChildAt(5);
        cityCoverMiddleCardView.f29872o = (SVGAnimationView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(7);
    }
}
