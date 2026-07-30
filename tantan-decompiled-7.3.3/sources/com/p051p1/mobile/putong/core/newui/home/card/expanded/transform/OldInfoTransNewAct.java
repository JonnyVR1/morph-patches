package com.p051p1.mobile.putong.core.newui.home.card.expanded.transform;

import android.os.Bundle;
import com.p051p1.mobile.putong.core.PutongCoreMvpAct;
import io.agora.rtc2.internal.AudioRoutingController;
import p153l.hh50;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class OldInfoTransNewAct extends PutongCoreMvpAct<hh50, C8105a> {
    /* JADX INFO: renamed from: c2 */
    private void m39179c2() {
        setLightStatusBar(1024);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().clearFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        getWindow().setStatusBarColor(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e2 */
    public /* synthetic */ void m39180e2(Bundle bundle) {
        m39179c2();
        setStatusBarColor(0);
    }

    @Override // com.p051p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public hh50 mo30949Y1() {
        return new hh50(this);
    }

    @Override // com.p051p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: d2, reason: merged with bridge method [inline-methods] */
    public C8105a mo30950Z1() {
        return new C8105a(this);
    }

    @Override // com.p051p1.mobile.putong.core.PutongCoreMvpAct, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        creates(new y20() { // from class: l.zg50
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f204261a.m39180e2((Bundle) obj);
            }
        });
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        ((C8105a) this.f18284e).m39209B();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_confirm_new_profile";
    }
}
