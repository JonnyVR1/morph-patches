package com.p051p1.mobile.putong.camera.upload;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.camera.TTCameraConfig;
import com.p051p1.mobile.putong.camera.upload.TTCameraPreviewAndUploadAct;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import java.util.ArrayList;
import p153l.iec0;
import p153l.ovh0;
import p153l.wzx;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes9.dex */
public class TTCameraPreviewAndUploadAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public final String f17950c = getClass().getSimpleName();

    /* JADX INFO: renamed from: d */
    @Nullable
    public TTCameraConfig f17951d;

    /* JADX INFO: renamed from: e */
    public TTCameraPreviewConfig f17952e;

    /* JADX INFO: renamed from: f */
    public ovh0 f17953f;

    /* JADX INFO: renamed from: g */
    public TTCameraPreviewPresenter f17954g;

    /* JADX INFO: renamed from: Y1 */
    public static /* synthetic */ void m30767Y1(PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
    }

    /* JADX INFO: renamed from: Z1 */
    public static Intent m30768Z1(Context context, TTCameraConfig tTCameraConfig, TTCameraPreviewConfig tTCameraPreviewConfig) {
        Intent intent = new Intent(context, (Class<?>) TTCameraPreviewAndUploadAct.class);
        intent.putExtra("extra_preview_config", tTCameraPreviewConfig);
        intent.putExtra("extra_camera_config", tTCameraConfig);
        return intent;
    }

    /* JADX INFO: renamed from: a2 */
    public static void m30769a2(final Act act, TTCameraConfig tTCameraConfig, TTCameraPreviewConfig tTCameraPreviewConfig) {
        final Intent intentM30768Z1 = m30768Z1(act, tTCameraConfig, tTCameraPreviewConfig);
        if (wzx.m208784k()) {
            act.startActivity(intentM30768Z1);
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
        PermissionHelper.m81065c().m81088w(false).m81086u(true).m81075j(false).m81078m(new x20() { // from class: l.kuh0
            @Override // p153l.x20
            public final void call() {
                act.startActivity(intentM30768Z1);
            }
        }, new y20() { // from class: l.luh0
            @Override // p153l.y20
            public final void call(Object obj) {
                TTCameraPreviewAndUploadAct.m30767Y1((PermissionHelper.PermissionDeniedReason) obj);
            }
        }).m81082q(arrayList).m81074i(act);
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(iec0.f114572e, viewGroup, false);
        this.f17953f = new ovh0(this, viewInflate, this.f17951d, this.f17952e);
        TTCameraPreviewPresenter tTCameraPreviewPresenter = new TTCameraPreviewPresenter(this, this.f17951d, this.f17952e);
        this.f17954g = tTCameraPreviewPresenter;
        tTCameraPreviewPresenter.mo52715C(this.f17953f);
        setTransparentStatusBar();
        return viewInflate;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        TTCameraPreviewConfig tTCameraPreviewConfig = (TTCameraPreviewConfig) getIntent().getParcelableExtra("extra_preview_config");
        this.f17952e = tTCameraPreviewConfig;
        tTCameraPreviewConfig.m30777h();
        this.f17951d = (TTCameraConfig) getIntent().getParcelableExtra("extra_camera_config");
    }
}
