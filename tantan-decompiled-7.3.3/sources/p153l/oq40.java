package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.core.newui.home.views.NewUserSpecialLikeBannerView;
import p151v.VImage;

/* JADX INFO: loaded from: classes10.dex */
public class oq40 {
    /* JADX INFO: renamed from: a */
    public static void m168787a(NewUserSpecialLikeBannerView newUserSpecialLikeBannerView, View view) {
        newUserSpecialLikeBannerView.f24724d = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        newUserSpecialLikeBannerView.f24725e = (CardView) viewGroup.getChildAt(0);
        newUserSpecialLikeBannerView.f24726f = (ConstraintLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        newUserSpecialLikeBannerView.f24727g = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        newUserSpecialLikeBannerView.f24728h = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        newUserSpecialLikeBannerView.f24729i = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
    }
}
