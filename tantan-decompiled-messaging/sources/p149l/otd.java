package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import p147v.VButton_FakeShadow;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class otd {
    /* JADX INFO: renamed from: a */
    public static void m165940a(ntd ntdVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        ntdVar.f140461a = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        ntdVar.f140462b = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        ntdVar.f140463c = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        ntdVar.f140464d = (VButton_FakeShadow) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        ntdVar.f140465e = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m165941b(ntd ntdVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.f137370p, viewGroup, false);
        m165940a(ntdVar, viewInflate);
        return viewInflate;
    }
}
