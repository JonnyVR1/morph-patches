package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.p046p1.mobile.putong.account.p050ui.camera.view.AccountMakeUpMenuView;

/* JADX INFO: renamed from: l.yr */
/* JADX INFO: loaded from: classes9.dex */
public class C21482yr {
    /* JADX INFO: renamed from: a */
    public static void m215766a(AccountMakeUpMenuView accountMakeUpMenuView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        accountMakeUpMenuView.f16823a = viewGroup.getChildAt(0);
        accountMakeUpMenuView.f16824b = (ViewPager2) viewGroup.getChildAt(1);
        accountMakeUpMenuView.f16825c = (TabLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        accountMakeUpMenuView.f16826d = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        accountMakeUpMenuView.f16827e = (ViewPager2) viewGroup.getChildAt(3);
    }
}
