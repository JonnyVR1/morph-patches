package com.p051p1.mobile.putong.core.p058ui.settings;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;

/* JADX INFO: loaded from: classes12.dex */
public class SettingsFragOld extends SettingsFrag {
    /* JADX INFO: renamed from: O4 */
    public static SettingsFragOld m56221O4(boolean z) {
        SettingsFragOld settingsFragOld = new SettingsFragOld();
        Bundle bundle = new Bundle();
        bundle.putBoolean("scroll_to_bottom", z);
        settingsFragOld.setArguments(bundle);
        return settingsFragOld;
    }

    /* JADX INFO: renamed from: P4 */
    public static SettingsFragOld m56222P4(boolean z, int i, boolean z2, String str, int i2, int i3) {
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

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        ((C9012b) this.f17893A).m56518o0();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        ((C9012b) this.f17893A).m56490Y0();
    }
}
