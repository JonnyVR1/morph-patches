package com.p000p1.mobile.putong.camera;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.app.PutongAct;
import com.p000p1.mobile.putong.camera.TTCameraAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.ui.permission.PermissionHelper;
import java.util.ArrayList;
import l.d30;
import l.e30;
import l.zqx;
import p006l.d6c0;
import p006l.r4c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class TTCameraAct extends PutongAct {
    /* JADX INFO: renamed from: X1 */
    public static /* synthetic */ void m1614X1(Act act, TTCameraConfig tTCameraConfig, d30 d30Var) {
        act.startActivity(m1616Z1(act, tTCameraConfig));
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: Y1 */
    public static /* synthetic */ void m1615Y1(PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
    }

    /* JADX INFO: renamed from: Z1 */
    public static Intent m1616Z1(Context context, TTCameraConfig tTCameraConfig) {
        Intent intent = new Intent(context, (Class<?>) TTCameraAct.class);
        intent.putExtra("camera_config", tTCameraConfig);
        return intent;
    }

    /* JADX INFO: renamed from: a2 */
    public static void m1617a2(Act act, TTCameraConfig tTCameraConfig) {
        m1618b2(act, tTCameraConfig, null);
    }

    /* JADX INFO: renamed from: b2 */
    public static void m1618b2(final Act act, final TTCameraConfig tTCameraConfig, final d30 d30Var) {
        ArrayList arrayList = new ArrayList();
        if (!zqx.k()) {
            arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
        }
        arrayList.add("android.permission.CAMERA");
        arrayList.add("android.permission.RECORD_AUDIO");
        PermissionHelper.c().w(false).u(true).j(false).m(new d30() { // from class: l.dlh0
            public final void call() {
                TTCameraAct.m1614X1(act, tTCameraConfig, d30Var);
            }
        }, new e30() { // from class: l.elh0
            public final void call(Object obj) {
                TTCameraAct.m1615Y1((PermissionHelper.PermissionDeniedReason) obj);
            }
        }).q(arrayList).i(act);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public final void lambda$initSubscription$2(Bundle bundle) {
        getWindow().getDecorView().setSystemUiVisibility(4);
        setTransparentStatusBar();
        getSupportFragmentManager().m().s(r4c0.f20301k, TTCameraBaseFrag.m1620M4((TTCameraConfig) getIntent().getParcelableExtra("camera_config"))).i();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(d6c0.f10027a, viewGroup, false);
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void initSubscription() {
        super.initSubscription();
        creates(new e30() { // from class: l.clh0
            public final void call(Object obj) {
                this.f9716a.lambda$initSubscription$2((Bundle) obj);
            }
        });
    }
}
