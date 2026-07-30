package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VButton_FakeShadow;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class pvf {
    /* JADX INFO: renamed from: a */
    public static void m171620a(ovf ovfVar, View view) {
        ovfVar.f145799a = (VDraweeView) view.findViewById(q4c0.f152615u);
        ViewGroup viewGroup = (ViewGroup) view;
        ovfVar.f145800b = (VText) viewGroup.getChildAt(2);
        ovfVar.f145801c = (VText) viewGroup.getChildAt(3);
        ovfVar.f145802d = (VLinear) viewGroup.getChildAt(5);
        ovfVar.f145803e = (VImage) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        ovfVar.f145804f = (VImage) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(2);
        ovfVar.f145805g = (VImage) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(4);
        ovfVar.f145806h = (VButton_FakeShadow) viewGroup.getChildAt(6);
        ovfVar.f145807i = (VText) viewGroup.getChildAt(7);
    }

    /* JADX INFO: renamed from: b */
    public static View m171621b(ovf ovfVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(c6c0.f79522t, viewGroup, false);
        m171620a(ovfVar, viewInflate);
        return viewInflate;
    }
}
