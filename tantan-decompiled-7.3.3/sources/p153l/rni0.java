package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.newui.profile.newmine.newprofile.task.C8393a;
import p151v.VFrame;
import p151v.VImage;
import p151v.VRecyclerView;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class rni0 {
    /* JADX INFO: renamed from: a */
    public static void m182235a(C8393a c8393a, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        c8393a.f27524a = (VNavigationBar) viewGroup.getChildAt(0);
        c8393a.f27525b = (VRecyclerView) viewGroup.getChildAt(1);
        c8393a.f27526c = (VFrame) viewGroup.getChildAt(2);
        c8393a.f27527d = (VImage) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        c8393a.f27528e = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m182236b(C8393a c8393a, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125488K7, viewGroup, false);
        m182235a(c8393a, viewInflate);
        return viewInflate;
    }
}
