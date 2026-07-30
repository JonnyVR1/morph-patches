package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.account.view.AccountViewV2;
import p151v.VButton_FakeShadowSmall;
import p151v.VImage;
import p151v.VLinear;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class unh0 {
    /* JADX INFO: renamed from: a */
    public static void m196864a(tnh0 tnh0Var, View view) {
        tnh0Var.f175263a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        tnh0Var.f175264b = (VNavigationBar) viewGroup.getChildAt(0);
        tnh0Var.f175265c = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        tnh0Var.f175266d = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        tnh0Var.f175267e = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        tnh0Var.f175268f = (AccountViewV2) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(0);
        tnh0Var.f175269g = (AccountViewV2) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1);
        tnh0Var.f175270h = (VButton_FakeShadowSmall) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m196865b(tnh0 tnh0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(sec0.f167536S0, viewGroup, false);
        m196864a(tnh0Var, viewInflate);
        return viewInflate;
    }
}
