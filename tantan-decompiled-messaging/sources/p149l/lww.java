package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.input.DateEditTextNew;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class lww {
    /* JADX INFO: renamed from: a */
    public static void m152017a(kww kwwVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        kwwVar.f125024c = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        kwwVar.f125025d = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        kwwVar.f125026e = (DateEditTextNew) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        kwwVar.f125027f = (DateEditTextNew) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2)).getChildAt(0);
        kwwVar.f125028g = (DateEditTextNew) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(4)).getChildAt(0);
        kwwVar.f125029h = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m152018b(kww kwwVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.f137307L, viewGroup, false);
        m152017a(kwwVar, viewInflate);
        return viewInflate;
    }
}
