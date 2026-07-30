package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes4.dex */
public class l0n0 {
    /* JADX INFO: renamed from: a */
    public static void m148100a(g0n0 g0n0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        g0n0Var.f100064a = (ImageView) viewGroup.getChildAt(0);
        g0n0Var.f100065b = (LinearLayout) viewGroup.getChildAt(1);
        g0n0Var.f100066c = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        g0n0Var.f100067d = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        g0n0Var.f100068e = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m148101b(g0n0 g0n0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168475p8, viewGroup, false);
        m148100a(g0n0Var, viewInflate);
        return viewInflate;
    }
}
