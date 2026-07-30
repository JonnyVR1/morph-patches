package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import p151v.VFrame;
import p151v.VLinear;
import p151v.VProgressBar;
import p151v.VScroll;
import p151v.VSwitch;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class xw80 {
    /* JADX INFO: renamed from: a */
    public static void m213299a(ww80 ww80Var, View view) {
        ww80Var.f191210a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        ww80Var.f191212b = (VNavigationBar) viewGroup.getChildAt(0);
        ww80Var.f191214c = (VProgressBar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        ww80Var.f191216d = (VScroll) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        ww80Var.f191218e = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        ww80Var.f191220f = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        ww80Var.f191222g = (VFrame) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        ww80Var.f191224h = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        ww80Var.f191226i = (VSwitch) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        ww80Var.f191228j = (VFrame) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        ww80Var.f191229k = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        ww80Var.f191231l = (VSwitch) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        ww80Var.f191232m = (VFrame) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(2);
        ww80Var.f191233n = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        ww80Var.f191234o = (VSwitch) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(1);
        ww80Var.f191235p = (VFrame) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(3);
        ww80Var.f191237q = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(3)).getChildAt(0)).getChildAt(1);
        ww80Var.f191238r = (VSwitch) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(3)).getChildAt(1);
        ww80Var.f191239s = (VFrame) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(4);
        ww80Var.f191240t = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(4)).getChildAt(0)).getChildAt(1);
        ww80Var.f191241u = (VSwitch) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(4)).getChildAt(1);
        ww80Var.f191242v = (VFrame) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(5);
        ww80Var.f191243w = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(5)).getChildAt(0)).getChildAt(0);
        ww80Var.f191244x = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(5)).getChildAt(0)).getChildAt(1);
        ww80Var.f191245y = (VSwitch) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(5)).getChildAt(1);
        ww80Var.f191246z = (VFrame) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(6);
        ww80Var.f191162A = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(6)).getChildAt(0)).getChildAt(0);
        ww80Var.f191163B = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(6)).getChildAt(0)).getChildAt(1);
        ww80Var.f191164C = (VSwitch) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(6)).getChildAt(1);
        ww80Var.f191165D = (VFrame) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(7);
        ww80Var.f191166E = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(7)).getChildAt(0)).getChildAt(0);
        ww80Var.f191168F = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(7)).getChildAt(0)).getChildAt(1);
        ww80Var.f191170G = (VSwitch) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(7)).getChildAt(1);
        ww80Var.f191172H = (VFrame) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(8);
        ww80Var.f191174I = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(8)).getChildAt(0)).getChildAt(0);
        ww80Var.f191176J = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(8)).getChildAt(0)).getChildAt(1);
        ww80Var.f191178K = (VSwitch) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(8)).getChildAt(1);
        ww80Var.f191180L = (VFrame) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(9);
        ww80Var.f191182M = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(9)).getChildAt(0)).getChildAt(0);
        ww80Var.f191184N = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(9)).getChildAt(0)).getChildAt(1);
        ww80Var.f191186O = (VSwitch) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(9)).getChildAt(1);
        ww80Var.f191188P = (VFrame) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(10);
        ww80Var.f191190Q = (VFrame) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(11);
        ww80Var.f191192R = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(11)).getChildAt(0)).getChildAt(0);
        ww80Var.f191194S = (VFrame) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(12);
        ww80Var.f191196T = (VSwitch) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(12)).getChildAt(1);
        ww80Var.f191198U = (VFrame) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(13);
        ww80Var.f191200V = (VSwitch) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(13)).getChildAt(1);
        ww80Var.f191202W = (VFrame) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(14);
        ww80Var.f191204X = (VFrame) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(15);
        ww80Var.f191206Y = (VSwitch) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(15)).getChildAt(1);
        ww80Var.f191208Z = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(16);
        ww80Var.f191230k0 = (VFrame) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(17);
        ww80Var.f191236p0 = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(17)).getChildAt(0)).getChildAt(0);
        ww80Var.f191167E0 = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(17)).getChildAt(0)).getChildAt(1);
        ww80Var.f191169F0 = (VSwitch) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(17)).getChildAt(1);
        ww80Var.f191171G0 = (VFrame) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(18);
        ww80Var.f191173H0 = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(18)).getChildAt(0)).getChildAt(1);
        ww80Var.f191175I0 = (VSwitch) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(18)).getChildAt(1);
        ww80Var.f191177J0 = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(19);
        ww80Var.f191179K0 = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(19)).getChildAt(0);
        ww80Var.f191181L0 = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(19)).getChildAt(1);
        ww80Var.f191183M0 = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(2);
        ww80Var.f191185N0 = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(3);
        ww80Var.f191187O0 = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(4);
        ww80Var.f191189P0 = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(4)).getChildAt(0)).getChildAt(0);
        ww80Var.f191191Q0 = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(5);
        ww80Var.f191193R0 = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(5)).getChildAt(0);
        ww80Var.f191195S0 = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(6);
        ww80Var.f191197T0 = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(7);
        ww80Var.f191199U0 = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(8);
        ww80Var.f191201V0 = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(8)).getChildAt(0)).getChildAt(0);
        ww80Var.f191203W0 = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(9);
        ww80Var.f191205X0 = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(10);
        ww80Var.f191207Y0 = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(11);
        ww80Var.f191209Z0 = (VFrame) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(12)).getChildAt(0);
        ww80Var.f191211a1 = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(12)).getChildAt(0)).getChildAt(0);
        ww80Var.f191213b1 = (VFrame) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(12)).getChildAt(1);
        ww80Var.f191215c1 = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(12)).getChildAt(1)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m213300b(ww80 ww80Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125381De, viewGroup, false);
        m213299a(ww80Var, viewInflate);
        return viewInflate;
    }
}
