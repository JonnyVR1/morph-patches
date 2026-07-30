package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import p153l.h950;
import p153l.ifc0;
import p153l.k6s0;
import p153l.mcc0;
import p153l.qws0;
import p153l.tgu0;

/* JADX INFO: loaded from: classes6.dex */
@KeepForSdk
public final class OutOfContextTestingActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        tgu0 tgu0VarM184300f = k6s0.m148568a().m184300f(this, new qws0());
        if (tgu0VarM184300f == null) {
            finish();
            return;
        }
        setContentView(ifc0.f114655a);
        LinearLayout linearLayout = (LinearLayout) findViewById(mcc0.f135803a);
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            return;
        }
        String stringExtra = intent.getStringExtra("adUnit");
        if (stringExtra == null) {
            finish();
            return;
        }
        try {
            tgu0VarM184300f.mo113639X1(stringExtra, h950.m134038Y2(this), h950.m134038Y2(linearLayout));
        } catch (RemoteException unused) {
            finish();
        }
    }
}
