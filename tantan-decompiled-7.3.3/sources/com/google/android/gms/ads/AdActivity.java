package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import p153l.dct0;
import p153l.h950;
import p153l.k6s0;
import p153l.r1t0;

/* JADX INFO: loaded from: classes6.dex */
@KeepForSdk
public final class AdActivity extends Activity {

    /* JADX INFO: renamed from: a */
    @Nullable
    public r1t0 f9675a;

    /* JADX INFO: renamed from: a */
    public final void m12270a() {
        r1t0 r1t0Var = this.f9675a;
        if (r1t0Var != null) {
            try {
                r1t0Var.mo12322g();
            } catch (RemoteException e) {
                dct0.m115300i("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, @NonNull Intent intent) {
        try {
            r1t0 r1t0Var = this.f9675a;
            if (r1t0Var != null) {
                r1t0Var.mo12318T6(i, i2, intent);
            }
        } catch (Exception e) {
            dct0.m115300i("#007 Could not call remote method.", e);
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        try {
            r1t0 r1t0Var = this.f9675a;
            if (r1t0Var != null && !r1t0Var.mo12324o()) {
                return;
            }
        } catch (RemoteException e) {
            dct0.m115300i("#007 Could not call remote method.", e);
        }
        super.onBackPressed();
        try {
            r1t0 r1t0Var2 = this.f9675a;
            if (r1t0Var2 != null) {
                r1t0Var2.zzi();
            }
        } catch (RemoteException e2) {
            dct0.m115300i("#007 Could not call remote method.", e2);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            r1t0 r1t0Var = this.f9675a;
            if (r1t0Var != null) {
                r1t0Var.mo12315C(h950.m134038Y2(configuration));
            }
        } catch (RemoteException e) {
            dct0.m115300i("#007 Could not call remote method.", e);
        }
    }

    @Override // android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        r1t0 r1t0VarM184303l = k6s0.m148568a().m184303l(this);
        this.f9675a = r1t0VarM184303l;
        if (r1t0VarM184303l == null) {
            dct0.m115300i("#007 Could not call remote method.", null);
            finish();
            return;
        }
        try {
            r1t0VarM184303l.mo12334z5(bundle);
        } catch (RemoteException e) {
            dct0.m115300i("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        try {
            r1t0 r1t0Var = this.f9675a;
            if (r1t0Var != null) {
                r1t0Var.zzm();
            }
        } catch (RemoteException e) {
            dct0.m115300i("#007 Could not call remote method.", e);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onPause() {
        try {
            r1t0 r1t0Var = this.f9675a;
            if (r1t0Var != null) {
                r1t0Var.zzo();
            }
        } catch (RemoteException e) {
            dct0.m115300i("#007 Could not call remote method.", e);
            finish();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        try {
            r1t0 r1t0Var = this.f9675a;
            if (r1t0Var != null) {
                r1t0Var.mo12323g1(i, strArr, iArr);
            }
        } catch (RemoteException e) {
            dct0.m115300i("#007 Could not call remote method.", e);
        }
    }

    @Override // android.app.Activity
    public final void onRestart() {
        super.onRestart();
        try {
            r1t0 r1t0Var = this.f9675a;
            if (r1t0Var != null) {
                r1t0Var.mo12319a();
            }
        } catch (RemoteException e) {
            dct0.m115300i("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        try {
            r1t0 r1t0Var = this.f9675a;
            if (r1t0Var != null) {
                r1t0Var.zzr();
            }
        } catch (RemoteException e) {
            dct0.m115300i("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(@NonNull Bundle bundle) {
        try {
            r1t0 r1t0Var = this.f9675a;
            if (r1t0Var != null) {
                r1t0Var.mo12331v0(bundle);
            }
        } catch (RemoteException e) {
            dct0.m115300i("#007 Could not call remote method.", e);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public final void onStart() {
        super.onStart();
        try {
            r1t0 r1t0Var = this.f9675a;
            if (r1t0Var != null) {
                r1t0Var.zzt();
            }
        } catch (RemoteException e) {
            dct0.m115300i("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        try {
            r1t0 r1t0Var = this.f9675a;
            if (r1t0Var != null) {
                r1t0Var.zzu();
            }
        } catch (RemoteException e) {
            dct0.m115300i("#007 Could not call remote method.", e);
            finish();
        }
        super.onStop();
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        try {
            r1t0 r1t0Var = this.f9675a;
            if (r1t0Var != null) {
                r1t0Var.mo12320b();
            }
        } catch (RemoteException e) {
            dct0.m115300i("#007 Could not call remote method.", e);
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        super.setContentView(i);
        m12270a();
    }

    @Override // android.app.Activity
    public final void setContentView(@NonNull View view) {
        super.setContentView(view);
        m12270a();
    }

    @Override // android.app.Activity
    public final void setContentView(@NonNull View view, @NonNull ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        m12270a();
    }
}
