package p006l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.account.p002ui.accountai.new2021.view.NameView;
import com.p000p1.mobile.putong.account.p002ui.accountnew.loginopt.NameEditTextOpt;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class x320 {
    /* JADX INFO: renamed from: a */
    public static void m27153a(NameView nameView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        nameView.f398c = viewGroup.getChildAt(0);
        nameView.f399d = (NameEditTextOpt) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        nameView.f400e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        nameView.f401f = viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m27154b(NameView nameView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(c6c0.f9424d0, viewGroup, true);
        m27153a(nameView, viewInflate);
        return viewInflate;
    }
}
