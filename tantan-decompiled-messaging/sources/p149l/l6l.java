package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import com.p046p1.mobile.putong.core.newui.home.HomeEmptyCardView;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class l6l {
    /* JADX INFO: renamed from: a */
    public static void m148752a(HomeEmptyCardView homeEmptyCardView, View view) {
        homeEmptyCardView.f21639a = (HomeEmptyCardView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        homeEmptyCardView.f21640b = (AppCompatImageView) viewGroup.getChildAt(0);
        homeEmptyCardView.f21641c = (VDraweeView) viewGroup.getChildAt(1);
        homeEmptyCardView.f21642d = (VText) viewGroup.getChildAt(2);
        homeEmptyCardView.f21643e = (VButton) viewGroup.getChildAt(3);
        homeEmptyCardView.f21644f = (VButton) viewGroup.getChildAt(4);
        homeEmptyCardView.f21645g = (VText) viewGroup.getChildAt(5);
    }
}
