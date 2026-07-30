package com.p046p1.mobile.putong.camera.upload;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.camera.TTCameraConfig;
import com.p046p1.mobile.putong.camera.upload.TTCameraPreviewAndUploadAct;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
import java.util.ArrayList;
import p149l.d30;
import p149l.d6c0;
import p149l.e30;
import p149l.hnh0;
import p149l.zqx;

/* JADX INFO: loaded from: classes9.dex */
public class TTCameraPreviewAndUploadAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public final String f17231c = getClass().getSimpleName();

    /* JADX INFO: renamed from: d */
    @Nullable
    public TTCameraConfig f17232d;

    /* JADX INFO: renamed from: e */
    public TTCameraPreviewConfig f17233e;

    /* JADX INFO: renamed from: f */
    public hnh0 f17234f;

    /* JADX INFO: renamed from: g */
    public TTCameraPreviewPresenter f17235g;

    /* JADX INFO: renamed from: X1 */
    public static /* synthetic */ void m29769X1(PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
    }

    /* JADX INFO: renamed from: Y1 */
    public static Intent m29770Y1(Context context, TTCameraConfig tTCameraConfig, TTCameraPreviewConfig tTCameraPreviewConfig) {
        Intent intent = new Intent(context, (Class<?>) TTCameraPreviewAndUploadAct.class);
        intent.putExtra("extra_preview_config", tTCameraPreviewConfig);
        intent.putExtra("extra_camera_config", tTCameraConfig);
        return intent;
    }

    /* JADX INFO: renamed from: Z1 */
    public static void m29771Z1(final Act act, TTCameraConfig tTCameraConfig, TTCameraPreviewConfig tTCameraPreviewConfig) {
        final Intent intentM29770Y1 = m29770Y1(act, tTCameraConfig, tTCameraPreviewConfig);
        if (zqx.m219898k()) {
            act.startActivity(intentM29770Y1);
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
        PermissionHelper.m79882c().m79905w(false).m79903u(true).m79892j(false).m79895m(new d30() { // from class: l.dmh0
            @Override // p149l.d30
            public final void call() {
                act.startActivity(intentM29770Y1);
            }
        }, new e30() { // from class: l.emh0
            @Override // p149l.e30
            public final void call(Object obj) {
                TTCameraPreviewAndUploadAct.m29769X1((PermissionHelper.PermissionDeniedReason) obj);
            }
        }).m79899q(arrayList).m79891i(act);
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(d6c0.f84616e, viewGroup, false);
        this.f17234f = new hnh0(this, viewInflate, this.f17232d, this.f17233e);
        TTCameraPreviewPresenter tTCameraPreviewPresenter = new TTCameraPreviewPresenter(this, this.f17232d, this.f17233e);
        this.f17235g = tTCameraPreviewPresenter;
        tTCameraPreviewPresenter.mo51532C(this.f17234f);
        setTransparentStatusBar();
        return viewInflate;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        TTCameraPreviewConfig tTCameraPreviewConfig = (TTCameraPreviewConfig) getIntent().getParcelableExtra("extra_preview_config");
        this.f17233e = tTCameraPreviewConfig;
        tTCameraPreviewConfig.m29779h();
        this.f17232d = (TTCameraConfig) getIntent().getParcelableExtra("extra_camera_config");
    }
}
