package com.p046p1.mobile.putong.core.p053ui.settings;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;

/* JADX INFO: loaded from: classes9.dex */
public class SettingsFragOld extends SettingsFrag {
    /* JADX INFO: renamed from: O4 */
    public static SettingsFragOld m55038O4(boolean z) {
        SettingsFragOld settingsFragOld = new SettingsFragOld();
        Bundle bundle = new Bundle();
        bundle.putBoolean("scroll_to_bottom", z);
        settingsFragOld.setArguments(bundle);
        return settingsFragOld;
    }

    /* JADX INFO: renamed from: P4 */
    public static SettingsFragOld m55039P4(boolean z, int i, boolean z2, String str, int i2, int i3) {
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

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        ((C8849b) this.f17174A).m55335o0();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        ((C8849b) this.f17174A).m55307Y0();
    }
}
