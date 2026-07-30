package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.account.p055ui.accountai.new2021.view.NameView;
import com.p051p1.mobile.putong.account.p055ui.accountnew.loginopt.NameEditTextOpt;
import p151v.VButton_FakeShadow;
import p151v.VFrame;
import p151v.VImage;

/* JADX INFO: loaded from: classes9.dex */
public class fc20 {
    /* JADX INFO: renamed from: a */
    public static void m124982a(NameView nameView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        nameView.f17128c = (VFrame) viewGroup.getChildAt(0);
        nameView.f17129d = (NameEditTextOpt) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        nameView.f17130e = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        nameView.f17131f = (VButton_FakeShadow) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m124983b(NameView nameView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(hec0.f109106d0, viewGroup, true);
        m124982a(nameView, viewInflate);
        return viewInflate;
    }
}
