package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.VText_Default_Bold;
import com.p051p1.mobile.putong.core.p058ui.VText_Medium;
import com.p051p1.mobile.putong.core.p058ui.verification.remind.view.SimpleUpdateAvatarView;
import p151v.VCheckBox;
import p151v.VLinear;
import p151v.VText;
import p151v.VText_NoTopPadding;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class sl1 {
    /* JADX INFO: renamed from: a */
    public static void m186550a(rl1 rl1Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        rl1Var.f163668a = (VNavigationBar) viewGroup.getChildAt(0);
        rl1Var.f163669b = (VText_Default_Bold) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        rl1Var.f163670c = (SimpleUpdateAvatarView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        rl1Var.f163671d = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(4)).getChildAt(0);
        rl1Var.f163672e = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(4)).getChildAt(1);
        rl1Var.f163673f = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(4)).getChildAt(2);
        rl1Var.f163674g = (VText_Medium) viewGroup.getChildAt(2);
        rl1Var.f163675h = (VText_Medium) viewGroup.getChildAt(3);
        rl1Var.f163676i = (VLinear) viewGroup.getChildAt(4);
        rl1Var.f163677j = (VCheckBox) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        rl1Var.f163678k = (VText_NoTopPadding) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m186551b(rl1 rl1Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125528N, viewGroup, false);
        m186550a(rl1Var, viewInflate);
        return viewInflate;
    }
}
