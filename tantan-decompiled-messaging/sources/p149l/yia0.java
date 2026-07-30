package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.profile.MediaReorderCards;
import com.p046p1.mobile.putong.core.p053ui.profile.views.ProfileLoopActionLayout;

/* JADX INFO: loaded from: classes10.dex */
public class yia0 {
    /* JADX INFO: renamed from: a */
    public static void m214885a(xia0 xia0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        xia0Var.f193083a = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        xia0Var.f193084b = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        xia0Var.f193085c = (MediaReorderCards) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        xia0Var.f193086d = (ProfileLoopActionLayout) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m214886b(xia0 xia0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.f137294E0, viewGroup, false);
        m214885a(xia0Var, viewInflate);
        return viewInflate;
    }
}
