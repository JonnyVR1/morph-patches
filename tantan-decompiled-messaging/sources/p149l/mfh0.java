package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.account.view.AccountViewV2;
import p147v.VButton_FakeShadowSmall;
import p147v.VImage;
import p147v.VLinear;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class mfh0 {
    /* JADX INFO: renamed from: a */
    public static void m154389a(lfh0 lfh0Var, View view) {
        lfh0Var.f127886a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        lfh0Var.f127887b = (VNavigationBar) viewGroup.getChildAt(0);
        lfh0Var.f127888c = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        lfh0Var.f127889d = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        lfh0Var.f127890e = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        lfh0Var.f127891f = (AccountViewV2) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(0);
        lfh0Var.f127892g = (AccountViewV2) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1);
        lfh0Var.f127893h = (VButton_FakeShadowSmall) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m154390b(lfh0 lfh0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.f137322S0, viewGroup, false);
        m154389a(lfh0Var, viewInflate);
        return viewInflate;
    }
}
