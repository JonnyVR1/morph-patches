package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.settings.filter.SettingsFilterItemWithInfo;
import p151v.VSwitch;

/* JADX INFO: loaded from: classes10.dex */
public class wve0 {
    /* JADX INFO: renamed from: a */
    public static void m208066a(SettingsFilterItemWithInfo settingsFilterItemWithInfo, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        settingsFilterItemWithInfo.f36899d = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        settingsFilterItemWithInfo.f36900e = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        settingsFilterItemWithInfo.f36901f = viewGroup.getChildAt(1);
        settingsFilterItemWithInfo.f36902g = (VSwitch) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m208067b(SettingsFilterItemWithInfo settingsFilterItemWithInfo, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(sec0.f167532Q0, viewGroup, true);
        m208066a(settingsFilterItemWithInfo, viewInflate);
        return viewInflate;
    }
}
