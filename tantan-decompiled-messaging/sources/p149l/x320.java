package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.account.p050ui.accountai.new2021.view.NameView;
import com.p046p1.mobile.putong.account.p050ui.accountnew.loginopt.NameEditTextOpt;
import p147v.VButton_FakeShadow;
import p147v.VFrame;
import p147v.VImage;

/* JADX INFO: loaded from: classes9.dex */
public class x320 {
    /* JADX INFO: renamed from: a */
    public static void m206894a(NameView nameView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        nameView.f16409c = (VFrame) viewGroup.getChildAt(0);
        nameView.f16410d = (NameEditTextOpt) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        nameView.f16411e = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        nameView.f16412f = (VButton_FakeShadow) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m206895b(NameView nameView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(c6c0.f79494d0, viewGroup, true);
        m206894a(nameView, viewInflate);
        return viewInflate;
    }
}
