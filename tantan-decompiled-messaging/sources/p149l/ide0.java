package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.settings.log.SelectLogTimeAct;
import p147v.VButton;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class ide0 {
    /* JADX INFO: renamed from: a */
    public static void m135426a(SelectLogTimeAct selectLogTimeAct, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        selectLogTimeAct.f36306c = (VNavigationBar) viewGroup.getChildAt(0);
        selectLogTimeAct.f36307d = (VText) viewGroup.getChildAt(3);
        selectLogTimeAct.f36308e = (VButton) viewGroup.getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m135427b(SelectLogTimeAct selectLogTimeAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95425Je, viewGroup, false);
        m135426a(selectLogTimeAct, viewInflate);
        return viewInflate;
    }
}
