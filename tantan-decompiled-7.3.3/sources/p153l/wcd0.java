package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.external.page.rights.list.view.RightProfileCardView;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class wcd0 {
    /* JADX INFO: renamed from: a */
    public static void m205796a(RightProfileCardView rightProfileCardView, View view) {
        rightProfileCardView.f46956a = (RightProfileCardView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        rightProfileCardView.f46957b = (ConstraintLayout) viewGroup.getChildAt(0);
        rightProfileCardView.f46958c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        rightProfileCardView.f46959d = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        rightProfileCardView.f46960e = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        rightProfileCardView.f46961f = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        rightProfileCardView.f46962g = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        rightProfileCardView.f46963h = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        rightProfileCardView.f46964i = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5)).getChildAt(0);
        rightProfileCardView.f46965j = (VButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6);
    }
}
