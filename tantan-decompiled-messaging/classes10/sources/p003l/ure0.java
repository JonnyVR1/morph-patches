package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.settings.SettingsItem;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ure0 {
    /* JADX INFO: renamed from: a */
    public static void m9767a(SettingsItem settingsItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        settingsItem.a = (ImageView) viewGroup.getChildAt(0);
        settingsItem.b = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        settingsItem.c = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        settingsItem.d = viewGroup.getChildAt(2);
        settingsItem.e = viewGroup.getChildAt(3);
        settingsItem.f = (ImageView) viewGroup.getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m9768b(SettingsItem settingsItem, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.Ne, viewGroup, true);
        m9767a(settingsItem, viewInflate);
        return viewInflate;
    }
}
