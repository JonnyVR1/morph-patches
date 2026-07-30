package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.account.p055ui.camera.act.AccountCompactMediaPickerAct;

/* JADX INFO: renamed from: l.xj */
/* JADX INFO: loaded from: classes9.dex */
public class C21348xj {
    /* JADX INFO: renamed from: a */
    public static void m211183a(AccountCompactMediaPickerAct accountCompactMediaPickerAct, View view) {
        accountCompactMediaPickerAct.f17395l = (FrameLayout) view;
    }

    /* JADX INFO: renamed from: b */
    public static View m211184b(AccountCompactMediaPickerAct accountCompactMediaPickerAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(hec0.f109125n, viewGroup, false);
        m211183a(accountCompactMediaPickerAct, viewInflate);
        return viewInflate;
    }
}
