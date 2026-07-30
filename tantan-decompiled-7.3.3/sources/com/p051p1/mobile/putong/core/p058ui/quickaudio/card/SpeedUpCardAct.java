package com.p051p1.mobile.putong.core.p058ui.quickaudio.card;

import android.content.Intent;
import android.os.Bundle;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.PutongCoreMvpAct;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.C8772a;
import com.tantanapp.common.utils.NullChecker;
import p153l.jyb;
import p153l.swf0;
import p153l.yvf0;

/* JADX INFO: loaded from: classes12.dex */
public class SpeedUpCardAct extends PutongCoreMvpAct<yvf0, swf0> {
    /* JADX INFO: renamed from: a2 */
    public static Intent m55676a2(Act act) {
        return new Intent(act, (Class<?>) SpeedUpCardAct.class);
    }

    @Override // com.p051p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public yvf0 mo30949Y1() {
        return new yvf0(this);
    }

    @Override // com.p051p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public swf0 mo30950Z1() {
        return new swf0(this);
    }

    @Override // com.p051p1.mobile.android.app.Act
    public void onStartLifecycle() {
        this.pageHelper.m152781p(jyb.m147494Y("is_used", Boolean.valueOf((NullChecker.m82486a(CoreModule.f18264c.f20300D0.m35855o4()) ? CoreModule.f18264c.f20300D0.m35855o4().status : "").equals("on") && C8772a.m51418S() > 0)));
        super.onStartLifecycle();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_propscard";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        setSwipeBackEnable(false);
    }
}
