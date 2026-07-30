package com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.mate;

import android.content.Intent;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.base.MarryEditProfileBaseMvpFrag;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.bean.MarrySeriesType;
import com.p046p1.mobile.putong.data.User;
import p149l.byw;
import p149l.cww;
import p149l.zxw;

/* JADX INFO: loaded from: classes3.dex */
public class MarryEditProfileMateFrag extends MarryEditProfileBaseMvpFrag<zxw, byw> {
    @Override // com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.base.MarryEditProfileBaseMvpFrag
    /* JADX INFO: renamed from: S4, reason: merged with bridge method [inline-methods] */
    public zxw mo47491N4() {
        return new zxw(this);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.base.MarryEditProfileBaseMvpFrag
    /* JADX INFO: renamed from: T4, reason: merged with bridge method [inline-methods] */
    public byw mo47492O4() {
        return new byw(act(), this);
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 5002) {
            ((zxw) this.f30421z).f205564a = (User) intent.getSerializableExtra("loop_edit_user");
            ((byw) this.f30419A).m104522q(false, ((zxw) this.f30421z).f205564a);
        }
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        cww.m109073f(MarrySeriesType.MATE, ((byw) this.f30419A).m104521n());
    }
}
