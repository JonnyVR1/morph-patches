package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.view.ContributorItemView;
import p147v.VDraweeView;
import p147v.VImage;

/* JADX INFO: loaded from: classes4.dex */
public class o26 {
    /* JADX INFO: renamed from: a */
    public static void m162287a(ContributorItemView contributorItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        contributorItemView.f51636a = (VImage) viewGroup.getChildAt(0);
        contributorItemView.f51637b = (VImage) viewGroup.getChildAt(1);
        contributorItemView.f51638c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        contributorItemView.f51639d = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        contributorItemView.f51640e = (VImage) viewGroup.getChildAt(3);
    }
}
