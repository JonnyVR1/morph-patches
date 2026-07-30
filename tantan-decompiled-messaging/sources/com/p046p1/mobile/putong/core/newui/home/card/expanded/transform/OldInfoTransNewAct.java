package com.p046p1.mobile.putong.core.newui.home.card.expanded.transform;

import android.os.Bundle;
import com.p046p1.mobile.putong.core.PutongCoreMvpAct;
import io.agora.rtc2.internal.AudioRoutingController;
import p149l.a950;
import p149l.e30;

/* JADX INFO: loaded from: classes11.dex */
public class OldInfoTransNewAct extends PutongCoreMvpAct<a950, C7954a> {
    /* JADX INFO: renamed from: b2 */
    private void m38176b2() {
        setLightStatusBar(1024);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().clearFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        getWindow().setStatusBarColor(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d2 */
    public /* synthetic */ void m38177d2(Bundle bundle) {
        m38176b2();
        setStatusBarColor(0);
    }

    @Override // com.p046p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public a950 mo29951X1() {
        return new a950(this);
    }

    @Override // com.p046p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public C7954a mo29952Y1() {
        return new C7954a(this);
    }

    @Override // com.p046p1.mobile.putong.core.PutongCoreMvpAct, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        creates(new e30() { // from class: l.s850
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f162995a.m38177d2((Bundle) obj);
            }
        });
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        ((C7954a) this.f17565e).m38206B();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_confirm_new_profile";
    }
}
