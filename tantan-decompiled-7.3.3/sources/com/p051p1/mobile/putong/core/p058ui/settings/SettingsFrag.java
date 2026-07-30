package com.p051p1.mobile.putong.core.p058ui.settings;

import com.p051p1.mobile.putong.app.PutongMvpFrag;
import p153l.ar2;
import p153l.iam;

/* JADX INFO: loaded from: classes12.dex */
public class SettingsFrag extends PutongMvpFrag {
    @Override // com.p051p1.mobile.putong.app.PutongMvpFrag
    /* JADX INFO: renamed from: M4 */
    public ar2 mo30639M4() {
        return new C9011a(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpFrag
    /* JADX INFO: renamed from: N4 */
    public iam mo30640N4() {
        return new C9012b(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, p153l.e6m
    public boolean disableAutoPV() {
        return false;
    }

    /* JADX INFO: renamed from: o */
    public boolean m56220o() {
        return ((C9011a) this.f17894z).m56370b3();
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, p153l.e6m
    public String pageId() {
        return "p_settings_view";
    }
}
