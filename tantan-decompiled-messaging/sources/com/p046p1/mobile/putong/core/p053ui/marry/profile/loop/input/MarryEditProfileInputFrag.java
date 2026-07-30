package com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.input;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.base.MarryEditProfileBaseMvpFrag;
import p149l.cww;
import p149l.jxw;
import p149l.mxw;

/* JADX INFO: loaded from: classes3.dex */
public class MarryEditProfileInputFrag extends MarryEditProfileBaseMvpFrag<jxw, mxw> {
    @Override // com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.base.MarryEditProfileBaseMvpFrag
    /* JADX INFO: renamed from: S4, reason: merged with bridge method [inline-methods] */
    public jxw mo47491N4() {
        return new jxw(this);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.base.MarryEditProfileBaseMvpFrag
    /* JADX INFO: renamed from: T4, reason: merged with bridge method [inline-methods] */
    public mxw mo47492O4() {
        return new mxw(act(), this);
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        cww.m109073f(((jxw) this.f30421z).f120268a, ((mxw) this.f30419A).m156940q());
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putSerializable("marry_series_type", ((jxw) this.f30421z).f120268a);
    }
}
