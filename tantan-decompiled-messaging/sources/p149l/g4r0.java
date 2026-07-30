package p149l;

import android.content.Context;
import android.media.AudioManager;

/* JADX INFO: loaded from: classes6.dex */
public final class g4r0 {

    /* JADX INFO: renamed from: a */
    public boolean f100583a = false;

    /* JADX INFO: renamed from: b */
    public float f100584b = 1.0f;

    /* JADX INFO: renamed from: b */
    public static float m124394b(Context context) {
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
    public final synchronized float m124395a() {
        if (!m124399f()) {
            return 1.0f;
        }
        return this.f100584b;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m124396c(boolean z) {
        this.f100583a = z;
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m124397d(float f) {
        this.f100584b = f;
    }

    /* JADX INFO: renamed from: e */
    public final synchronized boolean m124398e() {
        return this.f100583a;
    }

    /* JADX INFO: renamed from: f */
    public final synchronized boolean m124399f() {
        return this.f100584b >= 0.0f;
    }
}
