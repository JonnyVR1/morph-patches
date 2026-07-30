package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VButton_FakeShadow;
import p151v.VMaterialEdit;
import p151v.VMaterialEdit_FakeSpinner;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class kdf0 {
    /* JADX INFO: renamed from: a */
    public static void m149202a(jdf0 jdf0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        jdf0Var.f120249c = (VMaterialEdit_FakeSpinner) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        jdf0Var.f120250d = (VMaterialEdit) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        jdf0Var.f120251e = (VMaterialEdit) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        jdf0Var.f120252f = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        jdf0Var.f120253g = (VButton_FakeShadow) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m149203b(jdf0 jdf0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(hec0.f109091S, viewGroup, false);
        m149202a(jdf0Var, viewInflate);
        return viewInflate;
    }
}
