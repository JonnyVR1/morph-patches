package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p001ui.hideandseek.IntlHideAndSeekInfoView;
import com.p000p1.mobile.putong.core.p001ui.hideandseek.IntlHideAndSeekRoleView;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class hon {
    /* JADX INFO: renamed from: a */
    public static void m7046a(gon gonVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        gonVar.f4692a = viewGroup.getChildAt(0);
        gonVar.f4693b = viewGroup.getChildAt(1);
        gonVar.f4694c = viewGroup.getChildAt(2);
        gonVar.f4695d = viewGroup.getChildAt(3);
        gonVar.f4696e = (IntlHideAndSeekInfoView) viewGroup.getChildAt(4);
        gonVar.f4697f = (IntlHideAndSeekRoleView) viewGroup.getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m7047b(gon gonVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.T4, viewGroup, false);
        m7046a(gonVar, viewInflate);
        return viewInflate;
    }
}
