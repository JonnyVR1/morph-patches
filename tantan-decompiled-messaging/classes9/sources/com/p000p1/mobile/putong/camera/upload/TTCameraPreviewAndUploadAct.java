package com.p000p1.mobile.putong.camera.upload;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.app.PutongAct;
import com.p000p1.mobile.putong.camera.TTCameraConfig;
import com.p000p1.mobile.putong.camera.upload.TTCameraPreviewAndUploadAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.ui.permission.PermissionHelper;
import java.util.ArrayList;
import l.d30;
import l.e30;
import l.zqx;
import p006l.d6c0;
import p006l.hnh0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class TTCameraPreviewAndUploadAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public final String f1220c = getClass().getSimpleName();

    /* JADX INFO: renamed from: d */
    @Nullable
    public TTCameraConfig f1221d;

    /* JADX INFO: renamed from: e */
    public TTCameraPreviewConfig f1222e;

    /* JADX INFO: renamed from: f */
    public hnh0 f1223f;

    /* JADX INFO: renamed from: g */
    public TTCameraPreviewPresenter f1224g;

    /* JADX INFO: renamed from: X1 */
    public static /* synthetic */ void m1680X1(PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
    }

    /* JADX INFO: renamed from: Y1 */
    public static Intent m1681Y1(Context context, TTCameraConfig tTCameraConfig, TTCameraPreviewConfig tTCameraPreviewConfig) {
        Intent intent = new Intent(context, (Class<?>) TTCameraPreviewAndUploadAct.class);
        intent.putExtra("extra_preview_config", tTCameraPreviewConfig);
        intent.putExtra("extra_camera_config", tTCameraConfig);
        return intent;
    }

    /* JADX INFO: renamed from: Z1 */
    public static void m1682Z1(final Act act, TTCameraConfig tTCameraConfig, TTCameraPreviewConfig tTCameraPreviewConfig) {
        final Intent intentM1681Y1 = m1681Y1(act, tTCameraConfig, tTCameraPreviewConfig);
        if (zqx.k()) {
            act.startActivity(intentM1681Y1);
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
        PermissionHelper.c().w(false).u(true).j(false).m(new d30() { // from class: l.dmh0
            public final void call() {
                act.startActivity(intentM1681Y1);
            }
        }, new e30() { // from class: l.emh0
            public final void call(Object obj) {
                TTCameraPreviewAndUploadAct.m1680X1((PermissionHelper.PermissionDeniedReason) obj);
            }
        }).q(arrayList).i(act);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(d6c0.f10031e, viewGroup, false);
        this.f1223f = new hnh0(this, viewInflate, this.f1221d, this.f1222e);
        TTCameraPreviewPresenter tTCameraPreviewPresenter = new TTCameraPreviewPresenter(this, this.f1221d, this.f1222e);
        this.f1224g = tTCameraPreviewPresenter;
        tTCameraPreviewPresenter.C(this.f1223f);
        setTransparentStatusBar();
        return viewInflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void initDataOnCreate() {
        super.initDataOnCreate();
        TTCameraPreviewConfig tTCameraPreviewConfig = (TTCameraPreviewConfig) getIntent().getParcelableExtra("extra_preview_config");
        this.f1222e = tTCameraPreviewConfig;
        tTCameraPreviewConfig.m1690h();
        this.f1221d = (TTCameraConfig) getIntent().getParcelableExtra("extra_camera_config");
    }
}
