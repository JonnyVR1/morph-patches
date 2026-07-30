package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.account.p050ui.camera.view.AccountBeautyMenuItemView;
import com.p046p1.mobile.putong.account.p050ui.camera.view.AccountBeautyMenuView;
import com.p046p1.mobile.putong.account.p050ui.camera.view.AccountBeautyValueTipSeekBar;

/* JADX INFO: renamed from: l.tg */
/* JADX INFO: loaded from: classes9.dex */
public class C20166tg {
    /* JADX INFO: renamed from: a */
    public static void m188756a(AccountBeautyMenuView accountBeautyMenuView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        accountBeautyMenuView.f16735a = viewGroup.getChildAt(0);
        accountBeautyMenuView.f16736b = (AccountBeautyMenuItemView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        accountBeautyMenuView.f16737c = (AccountBeautyMenuItemView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        accountBeautyMenuView.f16738d = (AccountBeautyMenuItemView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
        accountBeautyMenuView.f16739e = (AccountBeautyValueTipSeekBar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }
}
