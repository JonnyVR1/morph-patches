package com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.input;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.base.MarryEditProfileBaseMvpFrag;
import p003l.cww;
import p003l.jxw;
import p003l.mxw;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class MarryEditProfileInputFrag extends MarryEditProfileBaseMvpFrag<jxw, mxw> {
    @Override // com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.base.MarryEditProfileBaseMvpFrag
    /* JADX INFO: renamed from: S4, reason: merged with bridge method [inline-methods] */
    public jxw mo539N4() {
        return new jxw(this);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.base.MarryEditProfileBaseMvpFrag
    /* JADX INFO: renamed from: T4, reason: merged with bridge method [inline-methods] */
    public mxw mo540O4() {
        return new mxw(act(), this);
    }

    public void onPause() {
        super/*com.p1.mobile.android.app.Frag*/.onPause();
        cww.m3487f(((jxw) this.f312z).f4761a, ((mxw) this.f310A).m6513q());
    }

    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super/*androidx.fragment.app.Fragment*/.onSaveInstanceState(bundle);
        bundle.putSerializable("marry_series_type", ((jxw) this.f312z).f4761a);
    }
}
