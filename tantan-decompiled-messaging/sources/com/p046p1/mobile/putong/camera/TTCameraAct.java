package com.p046p1.mobile.putong.camera;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.camera.TTCameraAct;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
import java.util.ArrayList;
import p149l.d30;
import p149l.d6c0;
import p149l.e30;
import p149l.r4c0;
import p149l.zqx;

/* JADX INFO: loaded from: classes9.dex */
public class TTCameraAct extends PutongAct {
    /* JADX INFO: renamed from: X1 */
    public static /* synthetic */ void m29704X1(Act act, TTCameraConfig tTCameraConfig, d30 d30Var) {
        act.startActivity(m29706Z1(act, tTCameraConfig));
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: Y1 */
    public static /* synthetic */ void m29705Y1(PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
    }

    /* JADX INFO: renamed from: Z1 */
    public static Intent m29706Z1(Context context, TTCameraConfig tTCameraConfig) {
        Intent intent = new Intent(context, (Class<?>) TTCameraAct.class);
        intent.putExtra("camera_config", tTCameraConfig);
        return intent;
    }

    /* JADX INFO: renamed from: a2 */
    public static void m29707a2(Act act, TTCameraConfig tTCameraConfig) {
        m29708b2(act, tTCameraConfig, null);
    }

    /* JADX INFO: renamed from: b2 */
    public static void m29708b2(final Act act, final TTCameraConfig tTCameraConfig, final d30 d30Var) {
        ArrayList arrayList = new ArrayList();
        if (!zqx.m219898k()) {
            arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
        }
        arrayList.add("android.permission.CAMERA");
        arrayList.add("android.permission.RECORD_AUDIO");
        PermissionHelper.m79882c().m79905w(false).m79903u(true).m79892j(false).m79895m(new d30() { // from class: l.dlh0
            @Override // p149l.d30
            public final void call() {
                TTCameraAct.m29704X1(act, tTCameraConfig, d30Var);
            }
        }, new e30() { // from class: l.elh0
            @Override // p149l.e30
            public final void call(Object obj) {
                TTCameraAct.m29705Y1((PermissionHelper.PermissionDeniedReason) obj);
            }
        }).m79899q(arrayList).m79891i(act);
    }

    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public final void lambda$initSubscription$2(Bundle bundle) {
        getWindow().getDecorView().setSystemUiVisibility(4);
        setTransparentStatusBar();
        getSupportFragmentManager().m2567m().m2811s(r4c0.f157656k, TTCameraBaseFrag.m29710M4((TTCameraConfig) getIntent().getParcelableExtra("camera_config"))).mo2707i();
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(d6c0.f84612a, viewGroup, false);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        creates(new e30() { // from class: l.clh0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f81413a.lambda$initSubscription$2((Bundle) obj);
            }
        });
    }
}
