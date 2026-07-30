package p149l;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.firebase.messaging.Constants;

/* JADX INFO: loaded from: classes6.dex */
@RequiresApi(17)
public final class n2r0 implements DisplayManager.DisplayListener, l2r0 {

    /* JADX INFO: renamed from: a */
    public final DisplayManager f136869a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public i2r0 f136870b;

    public n2r0(DisplayManager displayManager) {
        this.f136869a = displayManager;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static l2r0 m157677b(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
        if (displayManager != null) {
            return new n2r0(displayManager);
        }
        return null;
    }

    @Override // p149l.l2r0
    /* JADX INFO: renamed from: a */
    public final void mo148295a(i2r0 i2r0Var) {
        this.f136870b = i2r0Var;
        this.f136869a.registerDisplayListener(this, ggw0.m126055L(null));
        p2r0.m167208b(i2r0Var.f110579a, m157678c());
    }

    /* JADX INFO: renamed from: c */
    public final Display m157678c() {
        return this.f136869a.getDisplay(0);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        i2r0 i2r0Var = this.f136870b;
        if (i2r0Var == null || i != 0) {
            return;
        }
        p2r0.m167208b(i2r0Var.f110579a, m157678c());
    }

    @Override // p149l.l2r0
    public final void zza() {
        this.f136869a.unregisterDisplayListener(this);
        this.f136870b = null;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }
}
