package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.hideandseek.IntlHideAndSeekInfoView;
import com.p051p1.mobile.putong.core.p058ui.hideandseek.IntlHideAndSeekRoleView;
import p151v.VButton;
import p151v.VFrame;

/* JADX INFO: loaded from: classes10.dex */
public class hqn {
    /* JADX INFO: renamed from: a */
    public static void m136685a(gqn gqnVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        gqnVar.f105692a = (VFrame) viewGroup.getChildAt(0);
        gqnVar.f105693b = (VButton) viewGroup.getChildAt(1);
        gqnVar.f105694c = (VButton) viewGroup.getChildAt(2);
        gqnVar.f105695d = (VButton) viewGroup.getChildAt(3);
        gqnVar.f105696e = (IntlHideAndSeekInfoView) viewGroup.getChildAt(4);
        gqnVar.f105697f = (IntlHideAndSeekRoleView) viewGroup.getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m136686b(gqn gqnVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125629T4, viewGroup, false);
        m136685a(gqnVar, viewInflate);
        return viewInflate;
    }
}
