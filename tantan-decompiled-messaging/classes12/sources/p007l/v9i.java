package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.feed.newui.view.LiveHeadAnimView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class v9i {
    /* JADX INFO: renamed from: a */
    public static void m15397a(u9i u9iVar, View view) {
        u9iVar.f13608J = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        u9iVar.f13610K = viewGroup.getChildAt(0);
        u9iVar.f13612L = (LinearLayout) viewGroup.getChildAt(1);
        u9iVar.f13614M = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        u9iVar.f13616N = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        u9iVar.f13618O = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
        u9iVar.f13620P = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3);
        u9iVar.f13622Q = viewGroup.getChildAt(2);
        u9iVar.f13624R = viewGroup.getChildAt(3);
        u9iVar.f13626S = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        u9iVar.f13628T = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        u9iVar.f13630U = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        u9iVar.f13632V = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(3);
        u9iVar.f13634W = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(4);
        u9iVar.f13636X = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(4)).getChildAt(0);
        u9iVar.f13638Y = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(4)).getChildAt(1);
        u9iVar.f13640Z = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(5);
        u9iVar.f13652k0 = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(5)).getChildAt(0);
        u9iVar.f13657p0 = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(6);
        u9iVar.f13603E0 = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(7);
        u9iVar.f13604F0 = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(8);
        u9iVar.f13605G0 = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(9);
        u9iVar.f13606H0 = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(10);
        u9iVar.f13607I0 = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(11);
        u9iVar.f13609J0 = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(12);
        u9iVar.f13611K0 = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(13);
        u9iVar.f13613L0 = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(14);
        u9iVar.f13615M0 = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(15);
        u9iVar.f13617N0 = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(16);
        u9iVar.f13619O0 = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(17);
        u9iVar.f13621P0 = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(18);
        u9iVar.f13623Q0 = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(19);
        u9iVar.f13625R0 = (LiveHeadAnimView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(20);
        u9iVar.f13627S0 = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(21);
        u9iVar.f13629T0 = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(22);
        u9iVar.f13631U0 = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(23);
        u9iVar.f13633V0 = (LinearLayout) viewGroup.getChildAt(4);
        u9iVar.f13635W0 = (LinearLayout) viewGroup.getChildAt(4);
        u9iVar.f13637X0 = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        u9iVar.f13639Y0 = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        u9iVar.f13641Z0 = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1)).getChildAt(0);
        u9iVar.f13642a1 = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1)).getChildAt(1);
        u9iVar.f13643b1 = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m15398b(u9i u9iVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11102O2, viewGroup, false);
        m15397a(u9iVar, viewInflate);
        return viewInflate;
    }
}
