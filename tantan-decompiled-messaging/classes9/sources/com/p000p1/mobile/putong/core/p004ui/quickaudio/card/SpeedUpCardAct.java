package com.p000p1.mobile.putong.core.p004ui.quickaudio.card;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.PutongCoreMvpAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.ui.onlinematch.a;
import com.tantanapp.common.utils.NullChecker;
import l.j760;
import l.vwb;
import p006l.jof0;
import p006l.pnf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class SpeedUpCardAct extends PutongCoreMvpAct<pnf0, jof0> {
    /* JADX INFO: renamed from: Z1 */
    public static Intent m7832Z1(Act act) {
        return new Intent((Context) act, (Class<?>) SpeedUpCardAct.class);
    }

    @Override // com.p000p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public pnf0 mo1879X1() {
        return new pnf0(this);
    }

    @Override // com.p000p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public jof0 mo1880Y1() {
        return new jof0(this);
    }

    public void onStartLifecycle() {
        this.pageHelper.p(new j760[]{vwb.Y("is_used", Boolean.valueOf((NullChecker.a(CoreModule.f1534c.f3547D0.m6789o4()) ? CoreModule.f1534c.f3547D0.m6789o4().status : "").equals("on") && a.S() > 0))});
        super.onStartLifecycle();
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public String pageId() {
        return "p_propscard";
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        setSwipeBackEnable(false);
    }
}
