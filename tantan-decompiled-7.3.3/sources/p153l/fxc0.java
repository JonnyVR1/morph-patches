package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.account.p055ui.welcome.RememberedSigninDlgView;
import p151v.VButton;
import p151v.VCheckBox;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class fxc0 {
    /* JADX INFO: renamed from: a */
    public static void m127972a(RememberedSigninDlgView rememberedSigninDlgView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        rememberedSigninDlgView.f17751c = (VDraweeView) viewGroup.getChildAt(0);
        rememberedSigninDlgView.f17752d = (VText) viewGroup.getChildAt(1);
        rememberedSigninDlgView.f17753e = (VButton) viewGroup.getChildAt(2);
        rememberedSigninDlgView.f17754f = (VButton) viewGroup.getChildAt(3);
        rememberedSigninDlgView.f17755g = (VLinear) viewGroup.getChildAt(4);
        rememberedSigninDlgView.f17756h = (VCheckBox) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        rememberedSigninDlgView.f17757i = (VText) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
    }
}
