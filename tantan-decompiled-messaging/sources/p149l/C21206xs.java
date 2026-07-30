package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.material.tabs.TabLayout;
import com.p046p1.mobile.putong.account.p050ui.camera.view.AccountMaskMenuView;
import p147v.VPager;

/* JADX INFO: renamed from: l.xs */
/* JADX INFO: loaded from: classes9.dex */
public class C21206xs {
    /* JADX INFO: renamed from: a */
    public static void m210729a(AccountMaskMenuView accountMaskMenuView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        accountMaskMenuView.f16889a = viewGroup.getChildAt(0);
        accountMaskMenuView.f16890b = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        accountMaskMenuView.f16891c = (TabLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        accountMaskMenuView.f16892d = (VPager) viewGroup.getChildAt(2);
    }
}
