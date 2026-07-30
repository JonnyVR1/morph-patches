package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import com.p051p1.mobile.putong.core.newui.home.HomeEmptyCardView;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class b9l {
    /* JADX INFO: renamed from: a */
    public static void m103108a(HomeEmptyCardView homeEmptyCardView, View view) {
        homeEmptyCardView.f22381a = (HomeEmptyCardView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        homeEmptyCardView.f22382b = (AppCompatImageView) viewGroup.getChildAt(0);
        homeEmptyCardView.f22383c = (VDraweeView) viewGroup.getChildAt(1);
        homeEmptyCardView.f22384d = (VText) viewGroup.getChildAt(2);
        homeEmptyCardView.f22385e = (VButton) viewGroup.getChildAt(3);
        homeEmptyCardView.f22386f = (VButton) viewGroup.getChildAt(4);
        homeEmptyCardView.f22387g = (VText) viewGroup.getChildAt(5);
    }
}
