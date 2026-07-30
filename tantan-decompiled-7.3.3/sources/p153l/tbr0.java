package p153l;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.firebase.messaging.Constants;

/* JADX INFO: loaded from: classes6.dex */
@RequiresApi(17)
public final class tbr0 implements DisplayManager.DisplayListener, rbr0 {

    /* JADX INFO: renamed from: a */
    public final DisplayManager f172986a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public obr0 f172987b;

    public tbr0(DisplayManager displayManager) {
        this.f172986a = displayManager;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static rbr0 m190069b(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
        if (displayManager != null) {
            return new tbr0(displayManager);
        }
        return null;
    }

    @Override // p153l.rbr0
    /* JADX INFO: renamed from: a */
    public final void mo180758a(obr0 obr0Var) {
        this.f172987b = obr0Var;
        this.f172986a.registerDisplayListener(this, mpw0.m159399L(null));
        vbr0.m200729b(obr0Var.f146612a, m190070c());
    }

    /* JADX INFO: renamed from: c */
    public final Display m190070c() {
        return this.f172986a.getDisplay(0);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        obr0 obr0Var = this.f172987b;
        if (obr0Var == null || i != 0) {
            return;
        }
        vbr0.m200729b(obr0Var.f146612a, m190070c());
    }

    @Override // p153l.rbr0
    public final void zza() {
        this.f172986a.unregisterDisplayListener(this);
        this.f172987b = null;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }
}
