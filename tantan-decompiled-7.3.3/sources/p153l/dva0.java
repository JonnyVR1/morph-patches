package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.profile.views.ProfileLoopActionLayout;

/* JADX INFO: loaded from: classes10.dex */
public class dva0 {
    /* JADX INFO: renamed from: a */
    public static void m118270a(cva0 cva0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cva0Var.f83958a = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        cva0Var.f83959b = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        cva0Var.f83960c = (ProfileLoopActionLayout) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m118271b(cva0 cva0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(sec0.f167518J0, viewGroup, false);
        m118270a(cva0Var, viewInflate);
        return viewInflate;
    }
}
