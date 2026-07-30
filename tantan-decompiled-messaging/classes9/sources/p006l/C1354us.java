package p006l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.account.p002ui.camera.view.AccountMakeupSeekbarPageView;
import com.p000p1.mobile.putong.account.p002ui.camera.view.AccountTextSeekBar;

/* JADX INFO: renamed from: l.us */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C1354us {
    /* JADX INFO: renamed from: a */
    public static void m25560a(AccountMakeupSeekbarPageView accountMakeupSeekbarPageView, View view) {
        accountMakeupSeekbarPageView.f861a = (AccountMakeupSeekbarPageView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        accountMakeupSeekbarPageView.f862b = viewGroup.getChildAt(0);
        accountMakeupSeekbarPageView.f863c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        accountMakeupSeekbarPageView.f864d = (AccountTextSeekBar) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        accountMakeupSeekbarPageView.f865e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        accountMakeupSeekbarPageView.f866f = viewGroup.getChildAt(1);
        accountMakeupSeekbarPageView.f867g = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        accountMakeupSeekbarPageView.f868h = (AccountTextSeekBar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        accountMakeupSeekbarPageView.f869i = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }
}
