package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class h3h {
    /* JADX INFO: renamed from: a */
    public static void m129170a(g3h g3hVar, View view) {
        g3hVar.f100463f = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        g3hVar.f100464g = (VLinear) viewGroup.getChildAt(0);
        g3hVar.f100465h = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        g3hVar.f100466i = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        g3hVar.f100467j = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m129171b(g3h g3hVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142286t0, viewGroup, false);
        m129170a(g3hVar, viewInflate);
        return viewInflate;
    }
}
