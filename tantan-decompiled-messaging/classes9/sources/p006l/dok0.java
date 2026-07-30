package p006l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.account.p002ui.accountnew.VCodeCaptchaView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class dok0 {
    /* JADX INFO: renamed from: a */
    public static void m14165a(VCodeCaptchaView vCodeCaptchaView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        vCodeCaptchaView.f434d = viewGroup.getChildAt(0);
        vCodeCaptchaView.f435e = viewGroup.getChildAt(1);
        vCodeCaptchaView.f436f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        vCodeCaptchaView.f437g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        vCodeCaptchaView.f438h = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        vCodeCaptchaView.f439i = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        vCodeCaptchaView.f440j = viewGroup.getChildAt(2);
    }
}
