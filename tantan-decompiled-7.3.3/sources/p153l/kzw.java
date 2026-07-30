package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.input.DateEditTextNew;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class kzw {
    /* JADX INFO: renamed from: a */
    public static void m152236a(jzw jzwVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        jzwVar.f123325c = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        jzwVar.f123326d = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        jzwVar.f123327e = (DateEditTextNew) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        jzwVar.f123328f = (DateEditTextNew) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2)).getChildAt(0);
        jzwVar.f123329g = (DateEditTextNew) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(4)).getChildAt(0);
        jzwVar.f123330h = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m152237b(jzw jzwVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(sec0.f167521L, viewGroup, false);
        m152236a(jzwVar, viewInflate);
        return viewInflate;
    }
}
