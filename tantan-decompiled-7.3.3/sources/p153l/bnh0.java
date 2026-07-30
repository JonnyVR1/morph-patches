package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.account.view.AccountView;
import p151v.VButton_FakeShadowSmall;
import p151v.VLinear;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class bnh0 {
    /* JADX INFO: renamed from: a */
    public static void m105396a(anh0 anh0Var, View view) {
        anh0Var.f72347a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        anh0Var.f72348b = (VNavigationBar) viewGroup.getChildAt(0);
        anh0Var.f72349c = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        anh0Var.f72350d = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        anh0Var.f72351e = (AccountView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0);
        anh0Var.f72352f = (AccountView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1);
        anh0Var.f72353g = (VButton_FakeShadowSmall) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m105397b(anh0 anh0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(sec0.f167534R0, viewGroup, false);
        m105396a(anh0Var, viewInflate);
        return viewInflate;
    }
}
