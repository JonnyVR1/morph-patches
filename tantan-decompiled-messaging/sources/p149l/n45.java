package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.newui.main.view.LinearLayoutFixedLayout;
import com.p046p1.mobile.putong.core.p053ui.dlg.views.CityCoverMiddleCardView;
import com.p046p1.mobile.putong.core.view.diamond.BlackDiamondTagView;
import com.p046p1.mobile.putong.newui.view.ODiamondTagLabel;
import com.p046p1.mobile.putong.newui.view.VIPShimmerTag;
import com.tantan.library.svga.SVGAnimationView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class n45 {
    /* JADX INFO: renamed from: a */
    public static void m157798a(CityCoverMiddleCardView cityCoverMiddleCardView, View view) {
        cityCoverMiddleCardView.f29010a = (CityCoverMiddleCardView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        cityCoverMiddleCardView.f29011b = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        cityCoverMiddleCardView.f29012c = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        cityCoverMiddleCardView.f29013d = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3)).getChildAt(0)).getChildAt(1);
        cityCoverMiddleCardView.f29014e = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3)).getChildAt(1);
        cityCoverMiddleCardView.f29015f = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(5)).getChildAt(0);
        cityCoverMiddleCardView.f29016g = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(5)).getChildAt(1);
        cityCoverMiddleCardView.f29017h = (LinearLayoutFixedLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(5)).getChildAt(2);
        cityCoverMiddleCardView.f29018i = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(5)).getChildAt(2)).getChildAt(0);
        cityCoverMiddleCardView.f29019j = (ODiamondTagLabel) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(5)).getChildAt(2)).getChildAt(1);
        cityCoverMiddleCardView.f29020k = (VIPShimmerTag) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(5)).getChildAt(2)).getChildAt(2);
        cityCoverMiddleCardView.f29021l = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(5)).getChildAt(2)).getChildAt(3);
        cityCoverMiddleCardView.f29022m = (BlackDiamondTagView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(5)).getChildAt(2)).getChildAt(4);
        cityCoverMiddleCardView.f29023n = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(5)).getChildAt(2)).getChildAt(5);
        cityCoverMiddleCardView.f29024o = (SVGAnimationView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(7);
    }
}
