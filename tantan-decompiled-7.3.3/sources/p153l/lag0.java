package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.p058ui.campus.detailinfo.C8461a;
import p151v.VButton_FakeShadow;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VMaterialEdit_FakeSpinner;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class lag0 {
    /* JADX INFO: renamed from: a */
    public static void m153499a(C8461a c8461a, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        c8461a.f29526a = (VFrame) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        c8461a.f29527b = (VMaterialEdit_FakeSpinner) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        c8461a.f29528c = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        c8461a.f29529d = (VFrame) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        c8461a.f29530e = (VMaterialEdit_FakeSpinner) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(0);
        c8461a.f29531f = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3);
        c8461a.f29532g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(4);
        c8461a.f29533h = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(5);
        c8461a.f29534i = (VFrame) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(5)).getChildAt(1)).getChildAt(0);
        c8461a.f29535j = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(5)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        c8461a.f29536k = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(5)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        c8461a.f29537l = (VFrame) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(5)).getChildAt(1)).getChildAt(1);
        c8461a.f29538m = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(5)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        c8461a.f29539n = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(5)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        c8461a.f29540o = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(5)).getChildAt(2)).getChildAt(0);
        c8461a.f29541p = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(5)).getChildAt(2)).getChildAt(1);
        c8461a.f29542q = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(5)).getChildAt(3);
        c8461a.f29543r = (VButton_FakeShadow) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m153500b(C8461a c8461a, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125769bf, viewGroup, false);
        m153499a(c8461a, viewInflate);
        return viewInflate;
    }
}
