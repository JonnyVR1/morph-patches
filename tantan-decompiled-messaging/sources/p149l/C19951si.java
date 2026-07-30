package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.account.p050ui.camera.view.AccountRedDotView;
import p147v.VText;

/* JADX INFO: renamed from: l.si */
/* JADX INFO: loaded from: classes9.dex */
public class C19951si {
    /* JADX INFO: renamed from: a */
    public static void m184308a(C19707ri c19707ri, View view) {
        c19707ri.f159503a = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        c19707ri.f159504b = (VText) viewGroup.getChildAt(0);
        c19707ri.f159505c = (AccountRedDotView) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m184309b(C19707ri c19707ri, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(c6c0.f79505j, viewGroup, false);
        m184308a(c19707ri, viewInflate);
        return viewInflate;
    }
}
