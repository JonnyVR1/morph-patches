package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.view.ContributorItemView;
import p151v.VDraweeView;
import p151v.VImage;

/* JADX INFO: loaded from: classes4.dex */
public class t36 {
    /* JADX INFO: renamed from: a */
    public static void m189076a(ContributorItemView contributorItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        contributorItemView.f52484a = (VImage) viewGroup.getChildAt(0);
        contributorItemView.f52485b = (VImage) viewGroup.getChildAt(1);
        contributorItemView.f52486c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        contributorItemView.f52487d = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        contributorItemView.f52488e = (VImage) viewGroup.getChildAt(3);
    }
}
