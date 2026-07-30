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
import p149l.exr0;
import p149l.lss0;
import p149l.s050;
import p149l.x2t0;

/* JADX INFO: loaded from: classes6.dex */
@KeepForSdk
public final class AdActivity extends Activity {

    /* JADX INFO: renamed from: a */
    @Nullable
    public lss0 f9638a;

    /* JADX INFO: renamed from: a */
    public final void m12216a() {
        lss0 lss0Var = this.f9638a;
        if (lss0Var != null) {
            try {
                lss0Var.mo12268g();
            } catch (RemoteException e) {
                x2t0.m206871i("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, @NonNull Intent intent) {
        try {
            lss0 lss0Var = this.f9638a;
            if (lss0Var != null) {
                lss0Var.mo12264T6(i, i2, intent);
            }
        } catch (Exception e) {
            x2t0.m206871i("#007 Could not call remote method.", e);
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        try {
            lss0 lss0Var = this.f9638a;
            if (lss0Var != null && !lss0Var.mo12270o()) {
                return;
            }
        } catch (RemoteException e) {
            x2t0.m206871i("#007 Could not call remote method.", e);
        }
        super.onBackPressed();
        try {
            lss0 lss0Var2 = this.f9638a;
            if (lss0Var2 != null) {
                lss0Var2.zzi();
            }
        } catch (RemoteException e2) {
            x2t0.m206871i("#007 Could not call remote method.", e2);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            lss0 lss0Var = this.f9638a;
            if (lss0Var != null) {
                lss0Var.mo12261C(s050.m181848Y2(configuration));
            }
        } catch (RemoteException e) {
            x2t0.m206871i("#007 Could not call remote method.", e);
        }
    }

    @Override // android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        lss0 lss0VarM156447l = exr0.m118702a().m156447l(this);
        this.f9638a = lss0VarM156447l;
        if (lss0VarM156447l == null) {
            x2t0.m206871i("#007 Could not call remote method.", null);
            finish();
            return;
        }
        try {
            lss0VarM156447l.mo12280z5(bundle);
        } catch (RemoteException e) {
            x2t0.m206871i("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        try {
            lss0 lss0Var = this.f9638a;
            if (lss0Var != null) {
                lss0Var.zzm();
            }
        } catch (RemoteException e) {
            x2t0.m206871i("#007 Could not call remote method.", e);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onPause() {
        try {
            lss0 lss0Var = this.f9638a;
            if (lss0Var != null) {
                lss0Var.zzo();
            }
        } catch (RemoteException e) {
            x2t0.m206871i("#007 Could not call remote method.", e);
            finish();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        try {
            lss0 lss0Var = this.f9638a;
            if (lss0Var != null) {
                lss0Var.mo12269g1(i, strArr, iArr);
            }
        } catch (RemoteException e) {
            x2t0.m206871i("#007 Could not call remote method.", e);
        }
    }

    @Override // android.app.Activity
    public final void onRestart() {
        super.onRestart();
        try {
            lss0 lss0Var = this.f9638a;
            if (lss0Var != null) {
                lss0Var.mo12265a();
            }
        } catch (RemoteException e) {
            x2t0.m206871i("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        try {
            lss0 lss0Var = this.f9638a;
            if (lss0Var != null) {
                lss0Var.zzr();
            }
        } catch (RemoteException e) {
            x2t0.m206871i("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(@NonNull Bundle bundle) {
        try {
            lss0 lss0Var = this.f9638a;
            if (lss0Var != null) {
                lss0Var.mo12277v0(bundle);
            }
        } catch (RemoteException e) {
            x2t0.m206871i("#007 Could not call remote method.", e);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public final void onStart() {
        super.onStart();
        try {
            lss0 lss0Var = this.f9638a;
            if (lss0Var != null) {
                lss0Var.zzt();
            }
        } catch (RemoteException e) {
            x2t0.m206871i("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        try {
            lss0 lss0Var = this.f9638a;
            if (lss0Var != null) {
                lss0Var.zzu();
            }
        } catch (RemoteException e) {
            x2t0.m206871i("#007 Could not call remote method.", e);
            finish();
        }
        super.onStop();
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        try {
            lss0 lss0Var = this.f9638a;
            if (lss0Var != null) {
                lss0Var.mo12266b();
            }
        } catch (RemoteException e) {
            x2t0.m206871i("#007 Could not call remote method.", e);
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        super.setContentView(i);
        m12216a();
    }

    @Override // android.app.Activity
    public final void setContentView(@NonNull View view) {
        super.setContentView(view);
        m12216a();
    }

    @Override // android.app.Activity
    public final void setContentView(@NonNull View view, @NonNull ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        m12216a();
    }
}
