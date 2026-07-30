package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.profile.views.ProfileLoopActionLayout;
import com.p051p1.mobile.putong.core.p058ui.profile.views.ProfileLoopEditActionView;

/* JADX INFO: loaded from: classes10.dex */
public class zua0 {
    /* JADX INFO: renamed from: a */
    public static void m221605a(yua0 yua0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        yua0Var.f201599a = (ProfileLoopEditActionView) viewGroup.getChildAt(0);
        yua0Var.f201600b = (ProfileLoopActionLayout) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m221606b(yua0 yua0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(sec0.f167516I0, viewGroup, false);
        m221605a(yua0Var, viewInflate);
        return viewInflate;
    }
}
