package p002l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.live.livingroom.recreation.pk.view.ContributorItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class o26 {
    /* JADX INFO: renamed from: a */
    public static void m19190a(ContributorItemView contributorItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        contributorItemView.a = viewGroup.getChildAt(0);
        contributorItemView.b = viewGroup.getChildAt(1);
        contributorItemView.c = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        contributorItemView.d = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        contributorItemView.e = viewGroup.getChildAt(3);
    }
}
