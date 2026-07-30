package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.newui.view.BoostViewContainer;
import p147v.VFrame;

/* JADX INFO: loaded from: classes10.dex */
public class nlr {
    /* JADX INFO: renamed from: a */
    public static void m160073a(mlr mlrVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        mlrVar.f134486a = (VFrame) viewGroup.getChildAt(0);
        mlrVar.f134487b = (BoostViewContainer) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        mlrVar.f134488c = (VFrame) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m160074b(mlr mlrVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f121349X0, viewGroup, false);
        m160073a(mlrVar, viewInflate);
        return viewInflate;
    }
}
