package com.p046p1.mobile.putong.core.p053ui.settings;

import com.p046p1.mobile.putong.app.PutongMvpFrag;
import p149l.jq2;
import p149l.s7m;

/* JADX INFO: loaded from: classes9.dex */
public class SettingsFrag extends PutongMvpFrag {
    @Override // com.p046p1.mobile.putong.app.PutongMvpFrag
    /* JADX INFO: renamed from: M4 */
    public jq2 mo29641M4() {
        return new C8848a(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpFrag
    /* JADX INFO: renamed from: N4 */
    public s7m mo29642N4() {
        return new C8849b(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, p149l.n3m
    public boolean disableAutoPV() {
        return false;
    }

    /* JADX INFO: renamed from: o */
    public boolean m55037o() {
        return ((C8848a) this.f17175z).m55187b3();
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, p149l.n3m
    public String pageId() {
        return "p_settings_view";
    }
}
