package p153l;

import android.content.Context;
import android.media.AudioManager;

/* JADX INFO: loaded from: classes6.dex */
public final class mdr0 {

    /* JADX INFO: renamed from: a */
    public boolean f136404a = false;

    /* JADX INFO: renamed from: b */
    public float f136405b = 1.0f;

    /* JADX INFO: renamed from: b */
    public static float m157989b(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return 0.0f;
        }
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int streamVolume = audioManager.getStreamVolume(3);
        if (streamMaxVolume != 0) {
            return streamVolume / streamMaxVolume;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized float m157990a() {
        if (!m157994f()) {
            return 1.0f;
        }
        return this.f136405b;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m157991c(boolean z) {
        this.f136404a = z;
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m157992d(float f) {
        this.f136405b = f;
    }

    /* JADX INFO: renamed from: e */
    public final synchronized boolean m157993e() {
        return this.f136404a;
    }

    /* JADX INFO: renamed from: f */
    public final synchronized boolean m157994f() {
        return this.f136405b >= 0.0f;
    }
}
