package p006l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.account.p002ui.camera.view.AccountBeautyMenuItemView;
import com.p000p1.mobile.putong.account.p002ui.camera.view.AccountBeautyMenuView;
import com.p000p1.mobile.putong.account.p002ui.camera.view.AccountBeautyValueTipSeekBar;

/* JADX INFO: renamed from: l.tg */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C1307tg {
    /* JADX INFO: renamed from: a */
    public static void m24677a(AccountBeautyMenuView accountBeautyMenuView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        accountBeautyMenuView.f724a = viewGroup.getChildAt(0);
        accountBeautyMenuView.f725b = (AccountBeautyMenuItemView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        accountBeautyMenuView.f726c = (AccountBeautyMenuItemView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        accountBeautyMenuView.f727d = (AccountBeautyMenuItemView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
        accountBeautyMenuView.f728e = (AccountBeautyValueTipSeekBar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }
}
