package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import p149l.e7c0;
import p149l.exr0;
import p149l.g4c0;
import p149l.kns0;
import p149l.n7u0;
import p149l.s050;

/* JADX INFO: loaded from: classes6.dex */
@KeepForSdk
public final class OutOfContextTestingActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        n7u0 n7u0VarM156444f = exr0.m118702a().m156444f(this, new kns0());
        if (n7u0VarM156444f == null) {
            finish();
            return;
        }
        setContentView(e7c0.f89694a);
        LinearLayout linearLayout = (LinearLayout) findViewById(g4c0.f100559a);
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
            n7u0VarM156444f.mo158163X1(stringExtra, s050.m181848Y2(this), s050.m181848Y2(linearLayout));
        } catch (RemoteException unused) {
            finish();
        }
    }
}
