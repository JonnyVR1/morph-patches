package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.p051p1.mobile.putong.core.p058ui.vip.privilegeNewUi.VipNewCardPager;
import p151v.VFrame;

/* JADX INFO: loaded from: classes10.dex */
public class xsl0 {
    /* JADX INFO: renamed from: a */
    public static void m212987a(VipNewCardPager vipNewCardPager, View view) {
        vipNewCardPager.f38709a = (VFrame) view;
        vipNewCardPager.f38710b = (ViewPager) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m212988b(VipNewCardPager vipNewCardPager, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125348Bf, viewGroup, false);
        m212987a(vipNewCardPager, viewInflate);
        return viewInflate;
    }
}
