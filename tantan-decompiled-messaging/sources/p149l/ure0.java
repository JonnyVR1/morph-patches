package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.settings.SettingsItem;
import p147v.VSwitch;

/* JADX INFO: loaded from: classes10.dex */
public class ure0 {
    /* JADX INFO: renamed from: a */
    public static void m195073a(SettingsItem settingsItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        settingsItem.f35854a = (ImageView) viewGroup.getChildAt(0);
        settingsItem.f35855b = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        settingsItem.f35856c = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        settingsItem.f35857d = (VSwitch) viewGroup.getChildAt(2);
        settingsItem.f35858e = viewGroup.getChildAt(3);
        settingsItem.f35859f = (ImageView) viewGroup.getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m195074b(SettingsItem settingsItem, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95489Ne, viewGroup, true);
        m195073a(settingsItem, viewInflate);
        return viewInflate;
    }
}
