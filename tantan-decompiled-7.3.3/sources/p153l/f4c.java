package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.settings.SettingsItem;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class f4c {
    /* JADX INFO: renamed from: a */
    public static void m123976a(e4c e4cVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        e4cVar.f92080a = (VNavigationBar) viewGroup.getChildAt(0);
        e4cVar.f92081b = (SettingsItem) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        e4cVar.f92082c = (SettingsItem) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        e4cVar.f92083d = (SettingsItem) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m123977b(e4c e4cVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125807e2, viewGroup, false);
        m123976a(e4cVar, viewInflate);
        return viewInflate;
    }
}
