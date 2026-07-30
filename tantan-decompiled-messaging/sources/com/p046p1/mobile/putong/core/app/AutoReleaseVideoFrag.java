package com.p046p1.mobile.putong.core.app;

import android.os.Bundle;
import com.p046p1.mobile.putong.app.PutongFrag;
import p149l.dbl0;
import p149l.ura;

/* JADX INFO: loaded from: classes9.dex */
public class AutoReleaseVideoFrag extends PutongFrag {
    /* JADX INFO: renamed from: M4 */
    public boolean m34963M4() {
        return ura.m195053e().m195057d().mo33936vd(this);
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onDestroy() {
        if (m34963M4()) {
            dbl0.m110646a(getView(), true);
        }
        super.onDestroy();
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onPause() {
        if (m34963M4()) {
            dbl0.m110646a(getView(), false);
        }
        super.onPause();
    }
}
