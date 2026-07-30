package p006l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.account.p002ui.camera.view.AccountFilterMenuView;
import com.p000p1.mobile.putong.account.p002ui.camera.view.AccountTextSeekBar;

/* JADX INFO: renamed from: l.so */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C1273so {
    /* JADX INFO: renamed from: a */
    public static void m23928a(AccountFilterMenuView accountFilterMenuView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        accountFilterMenuView.f778a = viewGroup.getChildAt(0);
        accountFilterMenuView.f779b = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        accountFilterMenuView.f780c = (AccountTextSeekBar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        accountFilterMenuView.f781d = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        accountFilterMenuView.f782e = viewGroup.getChildAt(3);
    }
}
