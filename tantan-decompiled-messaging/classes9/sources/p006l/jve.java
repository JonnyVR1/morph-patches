package p006l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class jve {
    /* JADX INFO: renamed from: a */
    public static void m17842a(ive iveVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        iveVar.f14815c = viewGroup.getChildAt(0);
        iveVar.f14816d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        iveVar.f14817e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        iveVar.f14818f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        iveVar.f14819g = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(0);
        iveVar.f14820h = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(1);
        iveVar.f14821i = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3);
        iveVar.f14822j = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3)).getChildAt(0);
        iveVar.f14823k = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3)).getChildAt(1);
        iveVar.f14824l = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3)).getChildAt(2);
        iveVar.f14825m = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(4);
        iveVar.f14826n = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(4)).getChildAt(0);
        iveVar.f14827o = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(4)).getChildAt(1);
        iveVar.f14828p = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(5)).getChildAt(0);
        iveVar.f14829q = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(5)).getChildAt(1);
        iveVar.f14830r = (LinearLayout) viewGroup.getChildAt(1);
        iveVar.f14831s = viewGroup.getChildAt(2);
        iveVar.f14832t = viewGroup.getChildAt(3);
        iveVar.f14833u = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        iveVar.f14834v = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        iveVar.f14835w = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        iveVar.f14836x = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m17843b(ive iveVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(c6c0.f9449q, viewGroup, false);
        m17842a(iveVar, viewInflate);
        return viewInflate;
    }
}
