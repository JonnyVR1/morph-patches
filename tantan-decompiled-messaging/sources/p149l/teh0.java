package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.account.view.AccountView;
import p147v.VButton_FakeShadowSmall;
import p147v.VLinear;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class teh0 {
    /* JADX INFO: renamed from: a */
    public static void m188499a(seh0 seh0Var, View view) {
        seh0Var.f164006a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        seh0Var.f164007b = (VNavigationBar) viewGroup.getChildAt(0);
        seh0Var.f164008c = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        seh0Var.f164009d = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        seh0Var.f164010e = (AccountView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0);
        seh0Var.f164011f = (AccountView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1);
        seh0Var.f164012g = (VButton_FakeShadowSmall) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m188500b(seh0 seh0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.f137320R0, viewGroup, false);
        m188499a(seh0Var, viewInflate);
        return viewInflate;
    }
}
