package com.p051p1.mobile.putong.camera;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.camera.TTCameraAct;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import java.util.ArrayList;
import p153l.iec0;
import p153l.wzx;
import p153l.x20;
import p153l.xcc0;
import p153l.y20;

/* JADX INFO: loaded from: classes9.dex */
public class TTCameraAct extends PutongAct {
    /* JADX INFO: renamed from: Y1 */
    public static /* synthetic */ void m30702Y1(Act act, TTCameraConfig tTCameraConfig, x20 x20Var) {
        act.startActivity(m30704a2(act, tTCameraConfig));
        if (x20Var != null) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: Z1 */
    public static /* synthetic */ void m30703Z1(PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
    }

    /* JADX INFO: renamed from: a2 */
    public static Intent m30704a2(Context context, TTCameraConfig tTCameraConfig) {
        Intent intent = new Intent(context, (Class<?>) TTCameraAct.class);
        intent.putExtra("camera_config", tTCameraConfig);
        return intent;
    }

    /* JADX INFO: renamed from: b2 */
    public static void m30705b2(Act act, TTCameraConfig tTCameraConfig) {
        m30706c2(act, tTCameraConfig, null);
    }

    /* JADX INFO: renamed from: c2 */
    public static void m30706c2(final Act act, final TTCameraConfig tTCameraConfig, final x20 x20Var) {
        ArrayList arrayList = new ArrayList();
        if (!wzx.m208784k()) {
            arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
        }
        arrayList.add("android.permission.CAMERA");
        arrayList.add("android.permission.RECORD_AUDIO");
        PermissionHelper.m81065c().m81088w(false).m81086u(true).m81075j(false).m81078m(new x20() { // from class: l.kth0
            @Override // p153l.x20
            public final void call() {
                TTCameraAct.m30702Y1(act, tTCameraConfig, x20Var);
            }
        }, new y20() { // from class: l.lth0
            @Override // p153l.y20
            public final void call(Object obj) {
                TTCameraAct.m30703Z1((PermissionHelper.PermissionDeniedReason) obj);
            }
        }).m81082q(arrayList).m81074i(act);
    }

    /* JADX INFO: renamed from: d2, reason: merged with bridge method [inline-methods] */
    public final void lambda$initSubscription$2(Bundle bundle) {
        getWindow().getDecorView().setSystemUiVisibility(4);
        setTransparentStatusBar();
        getSupportFragmentManager().m2568m().m2812s(xcc0.f193298k, TTCameraBaseFrag.m30708M4((TTCameraConfig) getIntent().getParcelableExtra("camera_config"))).mo2708i();
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(iec0.f114568a, viewGroup, false);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        creates(new y20() { // from class: l.jth0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f122592a.lambda$initSubscription$2((Bundle) obj);
            }
        });
    }
}
