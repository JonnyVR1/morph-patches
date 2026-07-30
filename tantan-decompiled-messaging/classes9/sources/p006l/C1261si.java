package p006l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.account.p002ui.camera.view.AccountRedDotView;

/* JADX INFO: renamed from: l.si */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C1261si {
    /* JADX INFO: renamed from: a */
    public static void m23761a(C1222ri c1222ri, View view) {
        c1222ri.f20559a = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        c1222ri.f20560b = viewGroup.getChildAt(0);
        c1222ri.f20561c = (AccountRedDotView) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m23762b(C1222ri c1222ri, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(c6c0.f9435j, viewGroup, false);
        m23761a(c1222ri, viewInflate);
        return viewInflate;
    }
}
