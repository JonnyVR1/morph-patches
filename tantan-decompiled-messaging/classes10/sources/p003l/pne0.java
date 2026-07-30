package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.settings.filter.SettingsFilterItemWithInfo;
import l.n6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class pne0 {
    /* JADX INFO: renamed from: a */
    public static void m8785a(SettingsFilterItemWithInfo settingsFilterItemWithInfo, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        settingsFilterItemWithInfo.d = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        settingsFilterItemWithInfo.e = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        settingsFilterItemWithInfo.f = viewGroup.getChildAt(1);
        settingsFilterItemWithInfo.g = viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m8786b(SettingsFilterItemWithInfo settingsFilterItemWithInfo, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.Q0, viewGroup, true);
        m8785a(settingsFilterItemWithInfo, viewInflate);
        return viewInflate;
    }
}
