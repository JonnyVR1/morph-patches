package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.p053ui.account.GPBindPhoneNumberInputAct;
import p147v.VButton_FakeShadow;
import p147v.VLinear;
import p147v.VMaterialEdit;
import p147v.VMaterialEdit_FakeSpinner;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class xcj {
    /* JADX INFO: renamed from: a */
    public static void m208118a(GPBindPhoneNumberInputAct gPBindPhoneNumberInputAct, View view) {
        gPBindPhoneNumberInputAct.f28216c = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        gPBindPhoneNumberInputAct.f28217d = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        gPBindPhoneNumberInputAct.f28218e = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3);
        gPBindPhoneNumberInputAct.f28219f = (VMaterialEdit_FakeSpinner) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3)).getChildAt(0);
        gPBindPhoneNumberInputAct.f28220g = (VMaterialEdit) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3)).getChildAt(1);
        gPBindPhoneNumberInputAct.f28221h = (VButton_FakeShadow) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m208119b(GPBindPhoneNumberInputAct gPBindPhoneNumberInputAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.f137343c, viewGroup, false);
        m208118a(gPBindPhoneNumberInputAct, viewInflate);
        return viewInflate;
    }
}
