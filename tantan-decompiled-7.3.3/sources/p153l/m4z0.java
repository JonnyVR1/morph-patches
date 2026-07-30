package p153l;

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
public final class m4z0 {

    /* JADX INFO: renamed from: a */
    public final Spatializer f134841a;

    /* JADX INFO: renamed from: b */
    public final boolean f134842b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public Handler f134843c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public Spatializer$OnSpatializerStateChangedListener f134844d;

    public m4z0(Spatializer spatializer) {
        this.f134841a = spatializer;
        this.f134842b = spatializer.getImmersiveAudioLevel() != 0;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public static m4z0 m157065a(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return null;
        }
        return new m4z0(audioManager.getSpatializer());
    }

    /* JADX INFO: renamed from: b */
    public final void m157066b(l5z0 l5z0Var, Looper looper) {
        if (this.f134844d == null && this.f134843c == null) {
            this.f134844d = new l4z0(this, l5z0Var);
            final Handler handler = new Handler(looper);
            this.f134843c = handler;
            Spatializer spatializer = this.f134841a;
            Objects.requireNonNull(handler);
            spatializer.addOnSpatializerStateChangedListener(new Executor() { // from class: l.k4z0
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    handler.post(runnable);
                }
            }, this.f134844d);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m157067c() {
        Spatializer$OnSpatializerStateChangedListener spatializer$OnSpatializerStateChangedListener = this.f134844d;
        if (spatializer$OnSpatializerStateChangedListener == null || this.f134843c == null) {
            return;
        }
        this.f134841a.removeOnSpatializerStateChangedListener(spatializer$OnSpatializerStateChangedListener);
        Handler handler = this.f134843c;
        int i = mpw0.f137957a;
        handler.removeCallbacksAndMessages(null);
        this.f134843c = null;
        this.f134844d = null;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m157068d(w3y0 w3y0Var, sqr0 sqr0Var) {
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(mpw0.m159424v(("audio/eac3-joc".equals(sqr0Var.f170251l) && sqr0Var.f170264y == 16) ? 12 : sqr0Var.f170264y));
        int i = sqr0Var.f170265z;
        if (i != -1) {
            channelMask.setSampleRate(i);
        }
        return this.f134841a.canBeSpatialized(w3y0Var.m204797a().f176116a, channelMask.build());
    }

    /* JADX INFO: renamed from: e */
    public final boolean m157069e() {
        return this.f134841a.isAvailable();
    }

    /* JADX INFO: renamed from: f */
    public final boolean m157070f() {
        return this.f134841a.isEnabled();
    }

    /* JADX INFO: renamed from: g */
    public final boolean m157071g() {
        return this.f134842b;
    }
}
