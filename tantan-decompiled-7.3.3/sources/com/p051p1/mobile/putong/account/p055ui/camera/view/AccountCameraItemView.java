package com.p051p1.mobile.putong.account.p055ui.camera.view;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.account.p055ui.camera.act.AccountCompactMediaPickerAct;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.C16016bi;
import p153l.bnl0;
import p153l.i4g0;
import p153l.wzx;
import p153l.x20;

/* JADX INFO: loaded from: classes9.dex */
public class AccountCameraItemView extends VLinear {

    /* JADX INFO: renamed from: c */
    public AccountCameraItemView f17476c;

    /* JADX INFO: renamed from: d */
    public VImage f17477d;

    /* JADX INFO: renamed from: e */
    public VText f17478e;

    public AccountCameraItemView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public /* synthetic */ void m29917S(View view) {
        i4g0.m138520r("e_camera_top_start", "p_camera_local_album");
        m29918T((Act) getContext(), "", 10000);
    }

    /* JADX INFO: renamed from: T */
    public static void m29918T(final Act act, String str, final int i) {
        String[] strArr = wzx.m208784k() ? new String[]{"android.permission.CAMERA"} : new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"};
        final Intent intentM29790c2 = AccountCompactMediaPickerAct.m29790c2(act, 1, null, false, false, str);
        PermissionHelper.m81065c().m81083r(strArr).m81088w(false).m81086u(true).m81080o(new x20() { // from class: l.ai
            @Override // p153l.x20
            public final void call() {
                act.startActivityForResult(intentM29790c2, i);
            }
        }).m81074i(act);
    }

    /* JADX INFO: renamed from: R */
    public final void m29919R(View view) {
        C16016bi.m104383a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m29919R(this);
        bnl0.m105509E0(this.f17476c, new View.OnClickListener() { // from class: l.zh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f204368a.m29917S(view);
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
