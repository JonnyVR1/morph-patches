package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p1.mobile.putong.core.newui.home.views.NewUserSpecialLikeBannerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ai40 {
    /* JADX INFO: renamed from: a */
    public static void m5385a(NewUserSpecialLikeBannerView newUserSpecialLikeBannerView, View view) {
        newUserSpecialLikeBannerView.d = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        newUserSpecialLikeBannerView.e = viewGroup.getChildAt(0);
        newUserSpecialLikeBannerView.f = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        newUserSpecialLikeBannerView.g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        newUserSpecialLikeBannerView.h = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        newUserSpecialLikeBannerView.i = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
    }
}
