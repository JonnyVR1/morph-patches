package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.material.tabs.TabLayout;
import com.p051p1.mobile.putong.account.p055ui.camera.view.AccountMaskMenuView;
import p151v.VPager;

/* JADX INFO: renamed from: l.rs */
/* JADX INFO: loaded from: classes9.dex */
public class C19903rs {
    /* JADX INFO: renamed from: a */
    public static void m182832a(AccountMaskMenuView accountMaskMenuView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        accountMaskMenuView.f17608a = viewGroup.getChildAt(0);
        accountMaskMenuView.f17609b = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        accountMaskMenuView.f17610c = (TabLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        accountMaskMenuView.f17611d = (VPager) viewGroup.getChildAt(2);
    }
}
