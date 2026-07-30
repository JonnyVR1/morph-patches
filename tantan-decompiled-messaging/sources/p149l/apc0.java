package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.account.p050ui.welcome.RememberedSigninDlgView;
import p147v.VButton;
import p147v.VCheckBox;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class apc0 {
    /* JADX INFO: renamed from: a */
    public static void m98107a(RememberedSigninDlgView rememberedSigninDlgView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        rememberedSigninDlgView.f17032c = (VDraweeView) viewGroup.getChildAt(0);
        rememberedSigninDlgView.f17033d = (VText) viewGroup.getChildAt(1);
        rememberedSigninDlgView.f17034e = (VButton) viewGroup.getChildAt(2);
        rememberedSigninDlgView.f17035f = (VButton) viewGroup.getChildAt(3);
        rememberedSigninDlgView.f17036g = (VLinear) viewGroup.getChildAt(4);
        rememberedSigninDlgView.f17037h = (VCheckBox) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        rememberedSigninDlgView.f17038i = (VText) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
    }
}
