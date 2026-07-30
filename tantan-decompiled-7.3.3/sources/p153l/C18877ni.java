package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.account.p055ui.camera.view.AccountRedDotView;
import p151v.VText;

/* JADX INFO: renamed from: l.ni */
/* JADX INFO: loaded from: classes9.dex */
public class C18877ni {
    /* JADX INFO: renamed from: a */
    public static void m163256a(C18618mi c18618mi, View view) {
        c18618mi.f136906a = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        c18618mi.f136907b = (VText) viewGroup.getChildAt(0);
        c18618mi.f136908c = (AccountRedDotView) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m163257b(C18618mi c18618mi, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(hec0.f109117j, viewGroup, false);
        m163256a(c18618mi, viewInflate);
        return viewInflate;
    }
}
