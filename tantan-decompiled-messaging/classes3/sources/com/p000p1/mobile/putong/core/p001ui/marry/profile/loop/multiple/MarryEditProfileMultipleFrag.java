package com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.multiple;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.base.MarryEditProfileBaseMvpFrag;
import p003l.eyw;
import p003l.fyw;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class MarryEditProfileMultipleFrag extends MarryEditProfileBaseMvpFrag<eyw, fyw> {
    @Override // com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.base.MarryEditProfileBaseMvpFrag
    /* JADX INFO: renamed from: S4, reason: merged with bridge method [inline-methods] */
    public eyw mo539N4() {
        return new eyw(this);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.base.MarryEditProfileBaseMvpFrag
    /* JADX INFO: renamed from: T4, reason: merged with bridge method [inline-methods] */
    public fyw mo540O4() {
        return new fyw(act(), this);
    }

    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super/*androidx.fragment.app.Fragment*/.onSaveInstanceState(bundle);
        bundle.putSerializable("param_type", ((eyw) this.f312z).f3424a);
    }
}
