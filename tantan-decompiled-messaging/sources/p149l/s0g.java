package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.newui.view.BoostViewContainer;
import p147v.VFrame;

/* JADX INFO: loaded from: classes10.dex */
public class s0g {
    /* JADX INFO: renamed from: a */
    public static void m181860a(l0g l0gVar, View view) {
        l0gVar.f125511a = (VFrame) view;
        l0gVar.f125512b = (BoostViewContainer) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m181861b(l0g l0gVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f121346W0, viewGroup, false);
        m181860a(l0gVar, viewInflate);
        return viewInflate;
    }
}
