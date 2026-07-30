package p006l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.account.p002ui.camera.act.AccountCompactMediaPickerAct;

/* JADX INFO: renamed from: l.ck */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C0609ck {
    /* JADX INFO: renamed from: a */
    public static void m13517a(AccountCompactMediaPickerAct accountCompactMediaPickerAct, View view) {
        accountCompactMediaPickerAct.f665l = (FrameLayout) view;
    }

    /* JADX INFO: renamed from: b */
    public static View m13518b(AccountCompactMediaPickerAct accountCompactMediaPickerAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(c6c0.f9443n, viewGroup, false);
        m13517a(accountCompactMediaPickerAct, viewInflate);
        return viewInflate;
    }
}
