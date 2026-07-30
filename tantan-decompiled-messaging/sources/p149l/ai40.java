package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.core.newui.home.views.NewUserSpecialLikeBannerView;
import p147v.VImage;

/* JADX INFO: loaded from: classes10.dex */
public class ai40 {
    /* JADX INFO: renamed from: a */
    public static void m96786a(NewUserSpecialLikeBannerView newUserSpecialLikeBannerView, View view) {
        newUserSpecialLikeBannerView.f23982d = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        newUserSpecialLikeBannerView.f23983e = (CardView) viewGroup.getChildAt(0);
        newUserSpecialLikeBannerView.f23984f = (ConstraintLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        newUserSpecialLikeBannerView.f23985g = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        newUserSpecialLikeBannerView.f23986h = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        newUserSpecialLikeBannerView.f23987i = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
    }
}
