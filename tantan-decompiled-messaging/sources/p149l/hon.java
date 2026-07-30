package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.hideandseek.IntlHideAndSeekInfoView;
import com.p046p1.mobile.putong.core.p053ui.hideandseek.IntlHideAndSeekRoleView;
import p147v.VButton;
import p147v.VFrame;

/* JADX INFO: loaded from: classes10.dex */
public class hon {
    /* JADX INFO: renamed from: a */
    public static void m132224a(gon gonVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        gonVar.f103683a = (VFrame) viewGroup.getChildAt(0);
        gonVar.f103684b = (VButton) viewGroup.getChildAt(1);
        gonVar.f103685c = (VButton) viewGroup.getChildAt(2);
        gonVar.f103686d = (VButton) viewGroup.getChildAt(3);
        gonVar.f103687e = (IntlHideAndSeekInfoView) viewGroup.getChildAt(4);
        gonVar.f103688f = (IntlHideAndSeekRoleView) viewGroup.getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m132225b(gon gonVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95575T4, viewGroup, false);
        m132224a(gonVar, viewInflate);
        return viewInflate;
    }
}
