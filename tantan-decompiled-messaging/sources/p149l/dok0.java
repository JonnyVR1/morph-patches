package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.account.p050ui.accountnew.VCodeCaptchaView;
import p147v.VButton;
import p147v.VImage;
import p147v.VLinear;
import p147v.VMaterialEdit;
import p147v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class dok0 {
    /* JADX INFO: renamed from: a */
    public static void m112808a(VCodeCaptchaView vCodeCaptchaView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        vCodeCaptchaView.f16445d = (VImage) viewGroup.getChildAt(0);
        vCodeCaptchaView.f16446e = (VLinear) viewGroup.getChildAt(1);
        vCodeCaptchaView.f16447f = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        vCodeCaptchaView.f16448g = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        vCodeCaptchaView.f16449h = (VMaterialEdit) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        vCodeCaptchaView.f16450i = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        vCodeCaptchaView.f16451j = (VButton) viewGroup.getChildAt(2);
    }
}
