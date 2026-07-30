package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import l.mlr;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class olr {
    /* JADX INFO: renamed from: a */
    public static void m8503a(mlr mlrVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        mlrVar.i = viewGroup.getChildAt(0);
        mlrVar.j = (FrameLayout) viewGroup.getChildAt(1);
        mlrVar.k = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        mlrVar.l = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        mlrVar.m = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        mlrVar.n = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        mlrVar.o = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        mlrVar.p = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        mlrVar.q = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        mlrVar.r = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
        mlrVar.s = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        mlrVar.t = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        mlrVar.u = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        mlrVar.v = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        mlrVar.w = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
        mlrVar.x = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5)).getChildAt(0);
        mlrVar.y = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6);
        mlrVar.z = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6)).getChildAt(0);
        mlrVar.A = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6)).getChildAt(1);
        mlrVar.B = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(7);
        mlrVar.C = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(8);
        mlrVar.D = (ViewStub) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(9);
        mlrVar.E = (Button) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(10);
    }

    /* JADX INFO: renamed from: b */
    public static View m8504b(mlr mlrVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f5579o2, viewGroup, false);
        m8503a(mlrVar, viewInflate);
        return viewInflate;
    }
}
