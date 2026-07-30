package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VButton_FakeShadow;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class aye {
    /* JADX INFO: renamed from: a */
    public static void m100872a(zxe zxeVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        zxeVar.f206454a = (VText) viewGroup.getChildAt(2);
        zxeVar.f206455b = (VButton_FakeShadow) viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m100873b(zxe zxeVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(hec0.f109133s, viewGroup, false);
        m100872a(zxeVar, viewInflate);
        return viewInflate;
    }
}
