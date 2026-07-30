package com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.multiple;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.base.MarryEditProfileBaseMvpFrag;
import p149l.eyw;
import p149l.fyw;

/* JADX INFO: loaded from: classes3.dex */
public class MarryEditProfileMultipleFrag extends MarryEditProfileBaseMvpFrag<eyw, fyw> {
    @Override // com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.base.MarryEditProfileBaseMvpFrag
    /* JADX INFO: renamed from: S4, reason: merged with bridge method [inline-methods] */
    public eyw mo47491N4() {
        return new eyw(this);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.base.MarryEditProfileBaseMvpFrag
    /* JADX INFO: renamed from: T4, reason: merged with bridge method [inline-methods] */
    public fyw mo47492O4() {
        return new fyw(act(), this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putSerializable("param_type", ((eyw) this.f30421z).f93796a);
    }
}
