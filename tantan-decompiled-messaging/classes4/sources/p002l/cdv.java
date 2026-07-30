package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class cdv {
    /* JADX INFO: renamed from: a */
    public static void m10941a(hcv hcvVar, View view) {
        hcvVar.f11975a = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        hcvVar.f11976b = viewGroup.getChildAt(0);
        hcvVar.f11977c = viewGroup.getChildAt(1);
        hcvVar.f11978d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        hcvVar.f11979e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m10942b(hcv hcvVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f20039ub, viewGroup, false);
        m10941a(hcvVar, viewInflate);
        return viewInflate;
    }
}
