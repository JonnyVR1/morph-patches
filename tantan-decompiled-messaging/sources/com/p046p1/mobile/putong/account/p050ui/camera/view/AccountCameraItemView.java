package com.p046p1.mobile.putong.account.p050ui.camera.view;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.account.p050ui.camera.act.AccountCompactMediaPickerAct;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.C17082gi;
import p149l.d30;
import p149l.xdl0;
import p149l.zqx;
import p149l.zvf0;

/* JADX INFO: loaded from: classes9.dex */
public class AccountCameraItemView extends VLinear {

    /* JADX INFO: renamed from: c */
    public AccountCameraItemView f16757c;

    /* JADX INFO: renamed from: d */
    public VImage f16758d;

    /* JADX INFO: renamed from: e */
    public VText f16759e;

    public AccountCameraItemView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public /* synthetic */ void m28918S(View view) {
        zvf0.m220396r("e_camera_top_start", "p_camera_local_album");
        m28919T((Act) getContext(), "", 10000);
    }

    /* JADX INFO: renamed from: T */
    public static void m28919T(final Act act, String str, final int i) {
        String[] strArr = zqx.m219898k() ? new String[]{"android.permission.CAMERA"} : new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"};
        final Intent intentM28791b2 = AccountCompactMediaPickerAct.m28791b2(act, 1, null, false, false, str);
        PermissionHelper.m79882c().m79900r(strArr).m79905w(false).m79903u(true).m79897o(new d30() { // from class: l.fi
            @Override // p149l.d30
            public final void call() {
                act.startActivityForResult(intentM28791b2, i);
            }
        }).m79891i(act);
    }

    /* JADX INFO: renamed from: R */
    public final void m28920R(View view) {
        C17082gi.m126246a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m28920R(this);
        xdl0.m208329E0(this.f16757c, new View.OnClickListener() { // from class: l.ei
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f91532a.m28918S(view);
            }
        });
    }

    public AccountCameraItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AccountCameraItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
