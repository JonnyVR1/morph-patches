package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.settings.filter.SettingsFilterItemWithInfo;
import p147v.VSwitch;

/* JADX INFO: loaded from: classes10.dex */
public class pne0 {
    /* JADX INFO: renamed from: a */
    public static void m170405a(SettingsFilterItemWithInfo settingsFilterItemWithInfo, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        settingsFilterItemWithInfo.f36051d = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        settingsFilterItemWithInfo.f36052e = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        settingsFilterItemWithInfo.f36053f = viewGroup.getChildAt(1);
        settingsFilterItemWithInfo.f36054g = (VSwitch) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m170406b(SettingsFilterItemWithInfo settingsFilterItemWithInfo, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.f137318Q0, viewGroup, true);
        m170405a(settingsFilterItemWithInfo, viewInflate);
        return viewInflate;
    }
}
