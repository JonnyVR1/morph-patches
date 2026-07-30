package com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.multiple;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.base.MarryEditProfileBaseMvpFrag;
import p153l.d1x;
import p153l.e1x;

/* JADX INFO: loaded from: classes3.dex */
public class MarryEditProfileMultipleFrag extends MarryEditProfileBaseMvpFrag<d1x, e1x> {
    @Override // com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.base.MarryEditProfileBaseMvpFrag
    /* JADX INFO: renamed from: S4, reason: merged with bridge method [inline-methods] */
    public d1x mo48674N4() {
        return new d1x(this);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.base.MarryEditProfileBaseMvpFrag
    /* JADX INFO: renamed from: T4, reason: merged with bridge method [inline-methods] */
    public e1x mo48675O4() {
        return new e1x(act(), this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putSerializable("param_type", ((d1x) this.f31269z).f84735a);
    }
}
