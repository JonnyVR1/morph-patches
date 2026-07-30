package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.settings.SettingsItem;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class w2c {
    /* JADX INFO: renamed from: a */
    public static void m201090a(v2c v2cVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        v2cVar.f179369a = (VNavigationBar) viewGroup.getChildAt(0);
        v2cVar.f179370b = (SettingsItem) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        v2cVar.f179371c = (SettingsItem) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        v2cVar.f179372d = (SettingsItem) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m201091b(v2c v2cVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95753e2, viewGroup, false);
        m201090a(v2cVar, viewInflate);
        return viewInflate;
    }
}
