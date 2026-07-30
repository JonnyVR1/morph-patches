package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import p147v.VEditText;
import p147v.VLinear;
import p147v.VProgressBar;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class tdw {
    /* JADX INFO: renamed from: a */
    public static void m188462a(sdw sdwVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        sdwVar.f163899a = (VNavigationBar) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        sdwVar.f163900b = (VEditText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        sdwVar.f163901c = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
        sdwVar.f163902d = (VText_Bold) viewGroup.getChildAt(1);
        sdwVar.f163903e = (VProgressBar) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m188463b(sdw sdwVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95337E6, viewGroup, false);
        m188462a(sdwVar, viewInflate);
        return viewInflate;
    }
}
