package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.p046p1.mobile.putong.core.p053ui.dlg.views.CityCoverView1;
import p147v.VPagerCircleIndicator;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class r45 {
    /* JADX INFO: renamed from: a */
    public static void m177772a(CityCoverView1 cityCoverView1, View view) {
        cityCoverView1.f29031a = (CityCoverView1) view;
        ViewGroup viewGroup = (ViewGroup) view;
        cityCoverView1.f29032b = (ViewPager) viewGroup.getChildAt(0);
        cityCoverView1.f29033c = (VPagerCircleIndicator) viewGroup.getChildAt(1);
        cityCoverView1.f29034d = (VText) viewGroup.getChildAt(2);
        cityCoverView1.f29035e = (VText) viewGroup.getChildAt(3);
        cityCoverView1.f29036f = (VText) viewGroup.getChildAt(4);
    }
}
