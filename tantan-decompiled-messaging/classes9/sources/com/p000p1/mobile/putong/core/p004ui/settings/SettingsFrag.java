package com.p000p1.mobile.putong.core.p004ui.settings;

import com.p000p1.mobile.putong.app.PutongMvpFrag;
import l.jq2;
import l.s7m;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class SettingsFrag extends PutongMvpFrag {
    @Override // com.p000p1.mobile.putong.app.PutongMvpFrag
    /* JADX INFO: renamed from: M4 */
    public jq2 mo1551M4() {
        return new C0284a(this);
    }

    @Override // com.p000p1.mobile.putong.app.PutongMvpFrag
    /* JADX INFO: renamed from: N4 */
    public s7m mo1552N4() {
        return new C0285b(this);
    }

    @Override // com.p000p1.mobile.putong.app.PutongFrag
    public boolean disableAutoPV() {
        return false;
    }

    /* JADX INFO: renamed from: o */
    public boolean m8403o() {
        return ((C0284a) this.f1164z).m8556b3();
    }

    @Override // com.p000p1.mobile.putong.app.PutongFrag
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
    }

    @Override // com.p000p1.mobile.putong.app.PutongFrag
    public String pageId() {
        return "p_settings_view";
    }
}
