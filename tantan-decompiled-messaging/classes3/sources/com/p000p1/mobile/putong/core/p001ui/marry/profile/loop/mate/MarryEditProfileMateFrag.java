package com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.mate;

import android.content.Intent;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.base.MarryEditProfileBaseMvpFrag;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.bean.MarrySeriesType;
import p003l.byw;
import p003l.cww;
import p003l.zxw;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class MarryEditProfileMateFrag extends MarryEditProfileBaseMvpFrag<zxw, byw> {
    @Override // com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.base.MarryEditProfileBaseMvpFrag
    /* JADX INFO: renamed from: S4, reason: merged with bridge method [inline-methods] */
    public zxw mo539N4() {
        return new zxw(this);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.base.MarryEditProfileBaseMvpFrag
    /* JADX INFO: renamed from: T4, reason: merged with bridge method [inline-methods] */
    public byw mo540O4() {
        return new byw(act(), this);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super/*com.p1.mobile.android.app.Frag*/.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 5002) {
            ((zxw) this.f312z).f9501a = intent.getSerializableExtra("loop_edit_user");
            ((byw) this.f310A).m3215q(false, ((zxw) this.f312z).f9501a);
        }
    }

    public void onPause() {
        super/*com.p1.mobile.android.app.Frag*/.onPause();
        cww.m3487f(MarrySeriesType.MATE, ((byw) this.f310A).m3214n());
    }
}
