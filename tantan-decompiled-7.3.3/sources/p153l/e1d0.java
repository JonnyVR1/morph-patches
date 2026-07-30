package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.report.C8991e;
import p151v.VButton;
import p151v.VEditText;
import p151v.VRecycler_Fixed;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class e1d0 {
    /* JADX INFO: renamed from: a */
    public static void m118968a(C8991e c8991e, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        c8991e.f36399a = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        c8991e.f36400b = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        c8991e.f36401c = (VRecycler_Fixed) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        c8991e.f36402d = (VEditText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        c8991e.f36403e = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        c8991e.f36404f = (VButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7);
    }

    /* JADX INFO: renamed from: b */
    public static View m118969b(C8991e c8991e, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125559Oe, viewGroup, false);
        m118968a(c8991e, viewInflate);
        return viewInflate;
    }
}
