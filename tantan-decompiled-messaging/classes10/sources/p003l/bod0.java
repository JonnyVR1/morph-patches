package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.p001ui.dlg.SVipSeeRecoverDlg;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class bod0 {
    /* JADX INFO: renamed from: a */
    public static void m5769a(SVipSeeRecoverDlg sVipSeeRecoverDlg, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        sVipSeeRecoverDlg.f1367a = viewGroup.getChildAt(0);
        sVipSeeRecoverDlg.f1368b = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        sVipSeeRecoverDlg.f1369c = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        sVipSeeRecoverDlg.f1370d = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        sVipSeeRecoverDlg.f1371e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        sVipSeeRecoverDlg.f1372f = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
    }
}
