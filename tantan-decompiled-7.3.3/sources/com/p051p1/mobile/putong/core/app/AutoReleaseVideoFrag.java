package com.p051p1.mobile.putong.core.app;

import android.os.Bundle;
import com.p051p1.mobile.putong.app.PutongFrag;
import p153l.gta;
import p153l.hkl0;

/* JADX INFO: loaded from: classes9.dex */
public class AutoReleaseVideoFrag extends PutongFrag {
    /* JADX INFO: renamed from: M4 */
    public boolean m35966M4() {
        return gta.m132210e().m132214d().mo34939vd(this);
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onDestroy() {
        if (m35966M4()) {
            hkl0.m135638a(getView(), true);
        }
        super.onDestroy();
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onPause() {
        if (m35966M4()) {
            hkl0.m135638a(getView(), false);
        }
        super.onPause();
    }
}
