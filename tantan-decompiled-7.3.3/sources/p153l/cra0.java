package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.profile.MediaReorderCards;
import com.p051p1.mobile.putong.core.p058ui.profile.views.ProfileLoopActionLayout;

/* JADX INFO: loaded from: classes10.dex */
public class cra0 {
    /* JADX INFO: renamed from: a */
    public static void m112042a(bra0 bra0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        bra0Var.f77993a = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        bra0Var.f77994b = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        bra0Var.f77995c = (MediaReorderCards) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        bra0Var.f77996d = (ProfileLoopActionLayout) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m112043b(bra0 bra0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(sec0.f167508E0, viewGroup, false);
        m112042a(bra0Var, viewInflate);
        return viewInflate;
    }
}
