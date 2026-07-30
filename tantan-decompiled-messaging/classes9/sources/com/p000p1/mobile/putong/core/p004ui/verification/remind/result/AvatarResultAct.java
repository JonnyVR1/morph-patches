package com.p000p1.mobile.putong.core.p004ui.verification.remind.result;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.p000p1.mobile.putong.app.PutongAct;
import com.p000p1.mobile.putong.camera.TTCameraConfig;
import com.p000p1.mobile.putong.core.PutongCoreMvpAct;
import com.p1.mobile.android.app.Act;
import l.e30;
import l.j760;
import p006l.rwk0;
import p006l.wn1;
import p006l.zn1;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class AvatarResultAct extends PutongCoreMvpAct<wn1, zn1> {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b2 */
    private void m9507b2() {
        PutongAct.setLightStatusBar(getWindow(), 1024);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().clearFlags(67108864);
        getWindow().setStatusBarColor(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d2 */
    public /* synthetic */ void m9508d2(Bundle bundle) {
        setSwipeBackEnable(false);
        m9507b2();
        setStatusBarColor(0);
    }

    /* JADX INFO: renamed from: e2 */
    public static void m9509e2(Act act, int i) {
        Intent intent = new Intent((Context) act, (Class<?>) AvatarResultAct.class);
        intent.putExtra("verification_type", i);
        act.startActivity(intent);
        rwk0.f20827b.onNext(Integer.valueOf(i));
    }

    @Override // com.p000p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public wn1 mo1879X1() {
        return new wn1(this);
    }

    @Override // com.p000p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public zn1 mo1880Y1() {
        return new zn1(this);
    }

    @Override // com.p000p1.mobile.putong.core.PutongCoreMvpAct, com.p000p1.mobile.putong.app.PutongAct
    public void initDataOnCreate() {
        super.initDataOnCreate();
        creates(new e30() { // from class: l.cn1
            public final void call(Object obj) {
                this.f9738a.m9508d2((Bundle) obj);
            }
        });
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        ((wn1) this.f1553d).m26547V0(intent);
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public String pageId() {
        return "p_verification_results";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        int intExtra = getIntent().getIntExtra("verification_type", 0);
        String str = "" + intExtra;
        if (intExtra == 1) {
            str = TTCameraConfig.TYPE_ID_CARD_AVATAR;
        } else if (intExtra == 2) {
            str = "Identity";
        } else if (intExtra == 3) {
            str = "CTID";
        }
        this.pageHelper.p(new j760[]{j760.a("validation_type", str)});
    }
}
