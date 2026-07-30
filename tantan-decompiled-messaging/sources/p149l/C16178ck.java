package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.account.p050ui.camera.act.AccountCompactMediaPickerAct;

/* JADX INFO: renamed from: l.ck */
/* JADX INFO: loaded from: classes9.dex */
public class C16178ck {
    /* JADX INFO: renamed from: a */
    public static void m107352a(AccountCompactMediaPickerAct accountCompactMediaPickerAct, View view) {
        accountCompactMediaPickerAct.f16676l = (FrameLayout) view;
    }

    /* JADX INFO: renamed from: b */
    public static View m107353b(AccountCompactMediaPickerAct accountCompactMediaPickerAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(c6c0.f79513n, viewGroup, false);
        m107352a(accountCompactMediaPickerAct, viewInflate);
        return viewInflate;
    }
}
