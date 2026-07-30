package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.newui.view.BoostViewContainer;
import p147v.VFrame;

/* JADX INFO: loaded from: classes10.dex */
public class rgo {
    /* JADX INFO: renamed from: a */
    public static void m179178a(pgo pgoVar, View view) {
        pgoVar.f148762a = (VFrame) view;
        pgoVar.f148763b = (BoostViewContainer) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m179179b(pgo pgoVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f121324P, viewGroup, false);
        m179178a(pgoVar, viewInflate);
        return viewInflate;
    }
}
