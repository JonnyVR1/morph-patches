package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.account.p055ui.accountnew.VCodeCaptchaView;
import p151v.VButton;
import p151v.VImage;
import p151v.VLinear;
import p151v.VMaterialEdit;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class jxk0 {
    /* JADX INFO: renamed from: a */
    public static void m147364a(VCodeCaptchaView vCodeCaptchaView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        vCodeCaptchaView.f17164d = (VImage) viewGroup.getChildAt(0);
        vCodeCaptchaView.f17165e = (VLinear) viewGroup.getChildAt(1);
        vCodeCaptchaView.f17166f = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        vCodeCaptchaView.f17167g = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        vCodeCaptchaView.f17168h = (VMaterialEdit) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        vCodeCaptchaView.f17169i = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        vCodeCaptchaView.f17170j = (VButton) viewGroup.getChildAt(2);
    }
}
