package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.settings.SettingsItem;
import p151v.VSwitch;

/* JADX INFO: loaded from: classes10.dex */
public class b0f0 {
    /* JADX INFO: renamed from: a */
    public static void m101301a(SettingsItem settingsItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        settingsItem.f36702a = (ImageView) viewGroup.getChildAt(0);
        settingsItem.f36703b = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        settingsItem.f36704c = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        settingsItem.f36705d = (VSwitch) viewGroup.getChildAt(2);
        settingsItem.f36706e = viewGroup.getChildAt(3);
        settingsItem.f36707f = (ImageView) viewGroup.getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m101302b(SettingsItem settingsItem, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125655Ue, viewGroup, true);
        m101301a(settingsItem, viewInflate);
        return viewInflate;
    }
}
