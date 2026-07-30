package com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.input;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.base.MarryEditProfileBaseMvpFrag;
import p153l.bzw;
import p153l.i0x;
import p153l.l0x;

/* JADX INFO: loaded from: classes3.dex */
public class MarryEditProfileInputFrag extends MarryEditProfileBaseMvpFrag<i0x, l0x> {
    @Override // com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.base.MarryEditProfileBaseMvpFrag
    /* JADX INFO: renamed from: S4, reason: merged with bridge method [inline-methods] */
    public i0x mo48674N4() {
        return new i0x(this);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.base.MarryEditProfileBaseMvpFrag
    /* JADX INFO: renamed from: T4, reason: merged with bridge method [inline-methods] */
    public l0x mo48675O4() {
        return new l0x(act(), this);
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        bzw.m107264f(((i0x) this.f31269z).f112457a, ((l0x) this.f31267A).m152398q());
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putSerializable("marry_series_type", ((i0x) this.f31269z).f112457a);
    }
}
