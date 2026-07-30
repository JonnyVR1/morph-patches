package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.p058ui.account.GPBindPhoneNumberInputAct;
import p151v.VButton_FakeShadow;
import p151v.VLinear;
import p151v.VMaterialEdit;
import p151v.VMaterialEdit_FakeSpinner;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class rfj {
    /* JADX INFO: renamed from: a */
    public static void m181211a(GPBindPhoneNumberInputAct gPBindPhoneNumberInputAct, View view) {
        gPBindPhoneNumberInputAct.f29064c = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        gPBindPhoneNumberInputAct.f29065d = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        gPBindPhoneNumberInputAct.f29066e = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3);
        gPBindPhoneNumberInputAct.f29067f = (VMaterialEdit_FakeSpinner) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3)).getChildAt(0);
        gPBindPhoneNumberInputAct.f29068g = (VMaterialEdit) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3)).getChildAt(1);
        gPBindPhoneNumberInputAct.f29069h = (VButton_FakeShadow) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m181212b(GPBindPhoneNumberInputAct gPBindPhoneNumberInputAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(sec0.f167557c, viewGroup, false);
        m181211a(gPBindPhoneNumberInputAct, viewInflate);
        return viewInflate;
    }
}
