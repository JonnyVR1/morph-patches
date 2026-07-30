package com.p046p1.mobile.putong.core.p053ui.verification.remind.result;

import android.content.Intent;
import android.os.Bundle;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.PutongCoreMvpAct;
import io.agora.rtc2.internal.AudioRoutingController;
import p149l.e30;
import p149l.j760;
import p149l.rwk0;
import p149l.wn1;
import p149l.zn1;

/* JADX INFO: loaded from: classes9.dex */
public class AvatarResultAct extends PutongCoreMvpAct<wn1, zn1> {
    /* JADX INFO: renamed from: b2 */
    private void m56082b2() {
        PutongAct.setLightStatusBar(getWindow(), 1024);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().clearFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        getWindow().setStatusBarColor(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d2 */
    public /* synthetic */ void m56083d2(Bundle bundle) {
        setSwipeBackEnable(false);
        m56082b2();
        setStatusBarColor(0);
    }

    /* JADX INFO: renamed from: e2 */
    public static void m56084e2(Act act, int i) {
        Intent intent = new Intent(act, (Class<?>) AvatarResultAct.class);
        intent.putExtra("verification_type", i);
        act.startActivity(intent);
        rwk0.f161352b.m132487l(Integer.valueOf(i));
    }

    @Override // com.p046p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public wn1 mo29951X1() {
        return new wn1(this);
    }

    @Override // com.p046p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public zn1 mo29952Y1() {
        return new zn1(this);
    }

    @Override // com.p046p1.mobile.putong.core.PutongCoreMvpAct, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        creates(new e30() { // from class: l.cn1
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f81636a.m56083d2((Bundle) obj);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        ((wn1) this.f17564d).m204592V0(intent);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_verification_results";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
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
        this.pageHelper.m109040p(j760.m140076a("validation_type", str));
    }
}
