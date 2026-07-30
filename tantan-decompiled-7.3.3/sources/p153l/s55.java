package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.p051p1.mobile.putong.core.p058ui.dlg.views.CityCoverView1;
import p151v.VPagerCircleIndicator;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class s55 {
    /* JADX INFO: renamed from: a */
    public static void m184601a(CityCoverView1 cityCoverView1, View view) {
        cityCoverView1.f29879a = (CityCoverView1) view;
        ViewGroup viewGroup = (ViewGroup) view;
        cityCoverView1.f29880b = (ViewPager) viewGroup.getChildAt(0);
        cityCoverView1.f29881c = (VPagerCircleIndicator) viewGroup.getChildAt(1);
        cityCoverView1.f29882d = (VText) viewGroup.getChildAt(2);
        cityCoverView1.f29883e = (VText) viewGroup.getChildAt(3);
        cityCoverView1.f29884f = (VText) viewGroup.getChildAt(4);
    }
}
