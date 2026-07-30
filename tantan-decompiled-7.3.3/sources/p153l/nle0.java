package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.settings.log.SelectLogTimeAct;
import p151v.VButton;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class nle0 {
    /* JADX INFO: renamed from: a */
    public static void m163685a(SelectLogTimeAct selectLogTimeAct, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        selectLogTimeAct.f37154c = (VNavigationBar) viewGroup.getChildAt(0);
        selectLogTimeAct.f37155d = (VText) viewGroup.getChildAt(3);
        selectLogTimeAct.f37156e = (VButton) viewGroup.getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m163686b(SelectLogTimeAct selectLogTimeAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125591Qe, viewGroup, false);
        m163685a(selectLogTimeAct, viewInflate);
        return viewInflate;
    }
}
