package com.p046p1.mobile.putong.core.p053ui.quickaudio.card;

import android.content.Intent;
import android.os.Bundle;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.PutongCoreMvpAct;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.C8609a;
import com.tantanapp.common.utils.NullChecker;
import p149l.jof0;
import p149l.pnf0;
import p149l.vwb;

/* JADX INFO: loaded from: classes9.dex */
public class SpeedUpCardAct extends PutongCoreMvpAct<pnf0, jof0> {
    /* JADX INFO: renamed from: Z1 */
    public static Intent m54493Z1(Act act) {
        return new Intent(act, (Class<?>) SpeedUpCardAct.class);
    }

    @Override // com.p046p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public pnf0 mo29951X1() {
        return new pnf0(this);
    }

    @Override // com.p046p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public jof0 mo29952Y1() {
        return new jof0(this);
    }

    @Override // com.p046p1.mobile.android.app.Act
    public void onStartLifecycle() {
        this.pageHelper.m109040p(vwb.m200311Y("is_used", Boolean.valueOf((NullChecker.m81303a(CoreModule.f17545c.f19558D0.m34852o4()) ? CoreModule.f17545c.f19558D0.m34852o4().status : "").equals("on") && C8609a.m50235S() > 0)));
        super.onStartLifecycle();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_propscard";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        setSwipeBackEnable(false);
    }
}
