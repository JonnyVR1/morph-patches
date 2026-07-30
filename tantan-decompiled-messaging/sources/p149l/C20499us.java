package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.account.p050ui.camera.view.AccountMakeupSeekbarPageView;
import com.p046p1.mobile.putong.account.p050ui.camera.view.AccountTextSeekBar;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: renamed from: l.us */
/* JADX INFO: loaded from: classes9.dex */
public class C20499us {
    /* JADX INFO: renamed from: a */
    public static void m195174a(AccountMakeupSeekbarPageView accountMakeupSeekbarPageView, View view) {
        accountMakeupSeekbarPageView.f16872a = (AccountMakeupSeekbarPageView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        accountMakeupSeekbarPageView.f16873b = (ConstraintLayout) viewGroup.getChildAt(0);
        accountMakeupSeekbarPageView.f16874c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        accountMakeupSeekbarPageView.f16875d = (AccountTextSeekBar) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        accountMakeupSeekbarPageView.f16876e = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        accountMakeupSeekbarPageView.f16877f = (ConstraintLayout) viewGroup.getChildAt(1);
        accountMakeupSeekbarPageView.f16878g = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        accountMakeupSeekbarPageView.f16879h = (AccountTextSeekBar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        accountMakeupSeekbarPageView.f16880i = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }
}
