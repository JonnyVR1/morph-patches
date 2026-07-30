package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.profile.views.ProfileLoopActionLayout;
import p151v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class toa0 {
    /* JADX INFO: renamed from: a */
    public static void m192011a(soa0 soa0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        soa0Var.f169862a = (TextView) viewGroup.getChildAt(0);
        soa0Var.f169863b = (TextView) viewGroup.getChildAt(1);
        soa0Var.f169864c = (VLinear) viewGroup.getChildAt(2);
        soa0Var.f169865d = (ProfileLoopActionLayout) viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m192012b(soa0 soa0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(sec0.f167502B0, viewGroup, false);
        m192011a(soa0Var, viewInflate);
        return viewInflate;
    }
}
