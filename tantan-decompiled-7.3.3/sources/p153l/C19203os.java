package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.account.p055ui.camera.view.AccountMakeupSeekbarPageView;
import com.p051p1.mobile.putong.account.p055ui.camera.view.AccountTextSeekBar;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: renamed from: l.os */
/* JADX INFO: loaded from: classes9.dex */
public class C19203os {
    /* JADX INFO: renamed from: a */
    public static void m168956a(AccountMakeupSeekbarPageView accountMakeupSeekbarPageView, View view) {
        accountMakeupSeekbarPageView.f17591a = (AccountMakeupSeekbarPageView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        accountMakeupSeekbarPageView.f17592b = (ConstraintLayout) viewGroup.getChildAt(0);
        accountMakeupSeekbarPageView.f17593c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        accountMakeupSeekbarPageView.f17594d = (AccountTextSeekBar) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        accountMakeupSeekbarPageView.f17595e = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        accountMakeupSeekbarPageView.f17596f = (ConstraintLayout) viewGroup.getChildAt(1);
        accountMakeupSeekbarPageView.f17597g = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        accountMakeupSeekbarPageView.f17598h = (AccountTextSeekBar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        accountMakeupSeekbarPageView.f17599i = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }
}
