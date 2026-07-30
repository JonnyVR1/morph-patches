package com.p051p1.mobile.putong.core.p058ui.verification.remind.result;

import android.content.Intent;
import android.os.Bundle;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.PutongCoreMvpAct;
import io.agora.rtc2.internal.AudioRoutingController;
import p153l.do1;
import p153l.go1;
import p153l.pf60;
import p153l.x5l0;
import p153l.y20;

/* JADX INFO: loaded from: classes12.dex */
public class AvatarResultAct extends PutongCoreMvpAct<do1, go1> {
    /* JADX INFO: renamed from: c2 */
    private void m57265c2() {
        PutongAct.setLightStatusBar(getWindow(), 1024);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().clearFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        getWindow().setStatusBarColor(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e2 */
    public /* synthetic */ void m57266e2(Bundle bundle) {
        setSwipeBackEnable(false);
        m57265c2();
        setStatusBarColor(0);
    }

    /* JADX INFO: renamed from: g2 */
    public static void m57267g2(Act act, int i) {
        Intent intent = new Intent(act, (Class<?>) AvatarResultAct.class);
        intent.putExtra("verification_type", i);
        act.startActivity(intent);
        x5l0.f192503b.m137019l(Integer.valueOf(i));
    }

    @Override // com.p051p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public do1 mo30949Y1() {
        return new do1(this);
    }

    @Override // com.p051p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: d2, reason: merged with bridge method [inline-methods] */
    public go1 mo30950Z1() {
        return new go1(this);
    }

    @Override // com.p051p1.mobile.putong.core.PutongCoreMvpAct, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        creates(new y20() { // from class: l.jn1
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f121735a.m57266e2((Bundle) obj);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        ((do1) this.f18283d).m117126V0(intent);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_verification_results";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        int intExtra = getIntent().getIntExtra("verification_type", 0);
        String str = "" + intExtra;
        if (intExtra == 1) {
            str = "avatar";
        } else if (intExtra == 2) {
            str = "Identity";
        } else if (intExtra == 3) {
            str = "CTID";
        }
        this.pageHelper.m152781p(pf60.m172085a("validation_type", str));
    }
}
