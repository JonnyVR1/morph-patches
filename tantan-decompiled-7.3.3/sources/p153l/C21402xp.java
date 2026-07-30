package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VButton_FakeShadow;
import p151v.VEditText;
import p151v.VLinear;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: renamed from: l.xp */
/* JADX INFO: loaded from: classes10.dex */
public class C21402xp {
    /* JADX INFO: renamed from: a */
    public static void m212488a(C21159wp c21159wp, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        c21159wp.f190204a = (VNavigationBar) viewGroup.getChildAt(0);
        c21159wp.f190205b = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        c21159wp.f190206c = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        c21159wp.f190207d = (VEditText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
        c21159wp.f190208e = (VButton_FakeShadow) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m212489b(C21159wp c21159wp, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(sec0.f167562e, viewGroup, false);
        m212488a(c21159wp, viewInflate);
        return viewInflate;
    }
}
