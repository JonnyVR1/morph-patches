package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.p046p1.mobile.putong.core.p053ui.vip.privilegeNewUi.VipNewCardPager;
import p147v.VFrame;

/* JADX INFO: loaded from: classes10.dex */
public class tjl0 {
    /* JADX INFO: renamed from: a */
    public static void m189345a(VipNewCardPager vipNewCardPager, View view) {
        vipNewCardPager.f37861a = (VFrame) view;
        vipNewCardPager.f37862b = (ViewPager) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m189346b(VipNewCardPager vipNewCardPager, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f96037uf, viewGroup, false);
        m189345a(vipNewCardPager, viewInflate);
        return viewInflate;
    }
}
