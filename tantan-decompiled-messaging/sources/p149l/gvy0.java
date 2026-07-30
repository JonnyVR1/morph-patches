package p149l;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
@RequiresApi(32)
public final class gvy0 {

    /* JADX INFO: renamed from: a */
    public final Spatializer f104612a;

    /* JADX INFO: renamed from: b */
    public final boolean f104613b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public Handler f104614c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public Spatializer$OnSpatializerStateChangedListener f104615d;

    public gvy0(Spatializer spatializer) {
        this.f104612a = spatializer;
        this.f104613b = spatializer.getImmersiveAudioLevel() != 0;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public static gvy0 m128295a(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return null;
        }
        return new gvy0(audioManager.getSpatializer());
    }

    /* JADX INFO: renamed from: b */
    public final void m128296b(fwy0 fwy0Var, Looper looper) {
        if (this.f104615d == null && this.f104614c == null) {
            this.f104615d = new fvy0(this, fwy0Var);
            final Handler handler = new Handler(looper);
            this.f104614c = handler;
            Spatializer spatializer = this.f104612a;
            Objects.requireNonNull(handler);
            spatializer.addOnSpatializerStateChangedListener(new Executor() { // from class: l.evy0
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    handler.post(runnable);
                }
            }, this.f104615d);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m128297c() {
        Spatializer$OnSpatializerStateChangedListener spatializer$OnSpatializerStateChangedListener = this.f104615d;
        if (spatializer$OnSpatializerStateChangedListener == null || this.f104614c == null) {
            return;
        }
        this.f104612a.removeOnSpatializerStateChangedListener(spatializer$OnSpatializerStateChangedListener);
        Handler handler = this.f104614c;
        int i = ggw0.f102568a;
        handler.removeCallbacksAndMessages(null);
        this.f104614c = null;
        this.f104615d = null;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m128298d(qux0 qux0Var, mhr0 mhr0Var) {
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(ggw0.m126080v(("audio/eac3-joc".equals(mhr0Var.f133892l) && mhr0Var.f133905y == 16) ? 12 : mhr0Var.f133905y));
        int i = mhr0Var.f133906z;
        if (i != -1) {
            channelMask.setSampleRate(i);
        }
        return this.f104612a.canBeSpatialized(qux0Var.m176664a().f139488a, channelMask.build());
    }

    /* JADX INFO: renamed from: e */
    public final boolean m128299e() {
        return this.f104612a.isAvailable();
    }

    /* JADX INFO: renamed from: f */
    public final boolean m128300f() {
        return this.f104612a.isEnabled();
    }

    /* JADX INFO: renamed from: g */
    public final boolean m128301g() {
        return this.f104613b;
    }
}
