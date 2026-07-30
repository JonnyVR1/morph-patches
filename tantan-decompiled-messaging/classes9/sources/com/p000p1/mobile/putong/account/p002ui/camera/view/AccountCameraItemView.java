package com.p000p1.mobile.putong.account.p002ui.camera.view;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import com.p000p1.mobile.putong.account.p002ui.camera.act.AccountCompactMediaPickerAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.ui.permission.PermissionHelper;
import l.d30;
import l.xdl0;
import l.zqx;
import l.zvf0;
import p006l.C0763gi;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class AccountCameraItemView extends VLinear {

    /* JADX INFO: renamed from: c */
    public AccountCameraItemView f746c;

    /* JADX INFO: renamed from: d */
    public VImage f747d;

    /* JADX INFO: renamed from: e */
    public VText f748e;

    public AccountCameraItemView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S */
    public /* synthetic */ void m824S(View view) {
        zvf0.r("e_camera_top_start", "p_camera_local_album");
        m825T(getContext(), "", 10000);
    }

    /* JADX INFO: renamed from: T */
    public static void m825T(final Act act, String str, final int i) {
        String[] strArr = zqx.k() ? new String[]{"android.permission.CAMERA"} : new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"};
        final Intent intentM691b2 = AccountCompactMediaPickerAct.m691b2(act, 1, null, false, false, str);
        PermissionHelper.c().r(strArr).w(false).u(true).o(new d30() { // from class: l.fi
            public final void call() {
                act.startActivityForResult(intentM691b2, i);
            }
        }).i(act);
    }

    /* JADX INFO: renamed from: R */
    public final void m826R(View view) {
        C0763gi.m15796a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m826R(this);
        xdl0.E0(this.f746c, new View.OnClickListener() { // from class: l.ei
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11160a.m824S(view);
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
