package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.p051p1.mobile.putong.account.p055ui.camera.view.AccountMakeUpMenuView;

/* JADX INFO: renamed from: l.sr */
/* JADX INFO: loaded from: classes9.dex */
public class C20135sr {
    /* JADX INFO: renamed from: a */
    public static void m187580a(AccountMakeUpMenuView accountMakeUpMenuView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        accountMakeUpMenuView.f17542a = viewGroup.getChildAt(0);
        accountMakeUpMenuView.f17543b = (ViewPager2) viewGroup.getChildAt(1);
        accountMakeUpMenuView.f17544c = (TabLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        accountMakeUpMenuView.f17545d = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        accountMakeUpMenuView.f17546e = (ViewPager2) viewGroup.getChildAt(3);
    }
}
