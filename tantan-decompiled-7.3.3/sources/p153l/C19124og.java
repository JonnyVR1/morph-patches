package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.account.p055ui.camera.view.AccountBeautyMenuItemView;
import com.p051p1.mobile.putong.account.p055ui.camera.view.AccountBeautyMenuView;
import com.p051p1.mobile.putong.account.p055ui.camera.view.AccountBeautyValueTipSeekBar;

/* JADX INFO: renamed from: l.og */
/* JADX INFO: loaded from: classes9.dex */
public class C19124og {
    /* JADX INFO: renamed from: a */
    public static void m167521a(AccountBeautyMenuView accountBeautyMenuView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        accountBeautyMenuView.f17454a = viewGroup.getChildAt(0);
        accountBeautyMenuView.f17455b = (AccountBeautyMenuItemView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        accountBeautyMenuView.f17456c = (AccountBeautyMenuItemView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        accountBeautyMenuView.f17457d = (AccountBeautyMenuItemView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
        accountBeautyMenuView.f17458e = (AccountBeautyValueTipSeekBar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }
}
