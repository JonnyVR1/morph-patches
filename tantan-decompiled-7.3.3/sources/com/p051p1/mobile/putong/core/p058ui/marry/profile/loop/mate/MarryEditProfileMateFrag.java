package com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.mate;

import android.content.Intent;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.base.MarryEditProfileBaseMvpFrag;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.bean.MarrySeriesType;
import com.p051p1.mobile.putong.data.User;
import p153l.a1x;
import p153l.bzw;
import p153l.y0x;

/* JADX INFO: loaded from: classes3.dex */
public class MarryEditProfileMateFrag extends MarryEditProfileBaseMvpFrag<y0x, a1x> {
    @Override // com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.base.MarryEditProfileBaseMvpFrag
    /* JADX INFO: renamed from: S4, reason: merged with bridge method [inline-methods] */
    public y0x mo48674N4() {
        return new y0x(this);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.base.MarryEditProfileBaseMvpFrag
    /* JADX INFO: renamed from: T4, reason: merged with bridge method [inline-methods] */
    public a1x mo48675O4() {
        return new a1x(act(), this);
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 5002) {
            ((y0x) this.f31269z).f197059a = (User) intent.getSerializableExtra("loop_edit_user");
            ((a1x) this.f31267A).m95582q(false, ((y0x) this.f31269z).f197059a);
        }
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        bzw.m107264f(MarrySeriesType.MATE, ((a1x) this.f31267A).m95581n());
    }
}
