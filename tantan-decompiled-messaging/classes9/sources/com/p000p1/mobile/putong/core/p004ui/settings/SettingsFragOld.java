package com.p000p1.mobile.putong.core.p004ui.settings;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class SettingsFragOld extends SettingsFrag {
    /* JADX INFO: renamed from: O4 */
    public static SettingsFragOld m8404O4(boolean z) {
        SettingsFragOld settingsFragOld = new SettingsFragOld();
        Bundle bundle = new Bundle();
        bundle.putBoolean("scroll_to_bottom", z);
        settingsFragOld.setArguments(bundle);
        return settingsFragOld;
    }

    /* JADX INFO: renamed from: P4 */
    public static SettingsFragOld m8405P4(boolean z, int i, boolean z2, String str, int i2, int i3) {
        SettingsFragOld settingsFragOld = new SettingsFragOld();
        Bundle bundle = new Bundle();
        bundle.putBoolean("scroll_to_bottom", z);
        bundle.putInt("searchRadius", i);
        bundle.putBoolean("autoSearch", z2);
        bundle.putString("gender", str);
        bundle.putInt("minAge", i2);
        bundle.putInt("maxAge", i3);
        settingsFragOld.setArguments(bundle);
        return settingsFragOld;
    }

    /* JADX INFO: renamed from: g4 */
    public void m8406g4(Bundle bundle) {
        super.g4(bundle);
        ((C0285b) this.f1163A).m8707o0();
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public void onDestroyView() {
        super.onDestroyView();
        ((C0285b) this.f1163A).m8677Y0();
    }
}
