package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VButton_FakeShadow;
import p147v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class wwe {
    /* JADX INFO: renamed from: a */
    public static void m205856a(vwe vweVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        vweVar.f183327a = (VText) viewGroup.getChildAt(2);
        vweVar.f183328b = (VButton_FakeShadow) viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m205857b(vwe vweVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(c6c0.f79521s, viewGroup, false);
        m205856a(vweVar, viewInflate);
        return viewInflate;
    }
}
