package com.google.android.exoplayer2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import androidx.annotation.Nullable;
import p149l.ii5;
import p149l.jwv;
import p149l.p11;
import p149l.vck0;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class StreamVolumeManager {

    /* JADX INFO: renamed from: a */
    public final Context f7012a;

    /* JADX INFO: renamed from: b */
    public final Handler f7013b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC1796b f7014c;

    /* JADX INFO: renamed from: d */
    public final AudioManager f7015d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public VolumeChangeReceiver f7016e;

    /* JADX INFO: renamed from: f */
    public int f7017f;

    /* JADX INFO: renamed from: g */
    public int f7018g;

    /* JADX INFO: renamed from: h */
    public boolean f7019h;

    public final class VolumeChangeReceiver extends BroadcastReceiver {
        public VolumeChangeReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Handler handler = StreamVolumeManager.this.f7013b;
            final StreamVolumeManager streamVolumeManager = StreamVolumeManager.this;
            handler.post(new Runnable() { // from class: com.google.android.exoplayer2.a0
                @Override // java.lang.Runnable
                public final void run() {
                    streamVolumeManager.m9382o();
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.StreamVolumeManager$b */
    public interface InterfaceC1796b {
        /* JADX INFO: renamed from: C */
        void mo9384C(int i, boolean z);

        /* JADX INFO: renamed from: z */
        void mo9385z(int i);
    }

    public StreamVolumeManager(Context context, Handler handler, InterfaceC1796b interfaceC1796b) {
        Context applicationContext = context.getApplicationContext();
        this.f7012a = applicationContext;
        this.f7013b = handler;
        this.f7014c = interfaceC1796b;
        AudioManager audioManager = (AudioManager) p11.m167015i((AudioManager) applicationContext.getSystemService("audio"));
        this.f7015d = audioManager;
        this.f7017f = 3;
        this.f7018g = m9371h(audioManager, 3);
        this.f7019h = m9370f(audioManager, this.f7017f);
        VolumeChangeReceiver volumeChangeReceiver = new VolumeChangeReceiver();
        try {
            ii5.m136342l(applicationContext, volumeChangeReceiver, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f7016e = volumeChangeReceiver;
        } catch (RuntimeException e) {
            jwv.m143690j("StreamVolumeManager", "Error registering stream volume receiver", e);
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m9370f(AudioManager audioManager, int i) {
        if (vck0.f180948a >= 23) {
            return audioManager.isStreamMute(i);
        }
        return m9371h(audioManager, i) == 0;
    }

    /* JADX INFO: renamed from: h */
    public static int m9371h(AudioManager audioManager, int i) {
        try {
            return audioManager.getStreamVolume(i);
        } catch (RuntimeException e) {
            jwv.m143690j("StreamVolumeManager", "Could not retrieve stream volume for stream type " + i, e);
            return audioManager.getStreamMaxVolume(i);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m9372c(int i) {
        if (this.f7018g <= m9374e()) {
            return;
        }
        this.f7015d.adjustStreamVolume(this.f7017f, -1, i);
        m9382o();
    }

    /* JADX INFO: renamed from: d */
    public int m9373d() {
        return this.f7015d.getStreamMaxVolume(this.f7017f);
    }

    /* JADX INFO: renamed from: e */
    public int m9374e() {
        if (vck0.f180948a >= 28) {
            return this.f7015d.getStreamMinVolume(this.f7017f);
        }
        return 0;
    }

    /* JADX INFO: renamed from: g */
    public int m9375g() {
        return this.f7018g;
    }

    /* JADX INFO: renamed from: i */
    public void m9376i(int i) {
        if (this.f7018g >= m9373d()) {
            return;
        }
        this.f7015d.adjustStreamVolume(this.f7017f, 1, i);
        m9382o();
    }

    /* JADX INFO: renamed from: j */
    public boolean m9377j() {
        return this.f7019h;
    }

    /* JADX INFO: renamed from: k */
    public void m9378k() {
        VolumeChangeReceiver volumeChangeReceiver = this.f7016e;
        if (volumeChangeReceiver != null) {
            try {
                this.f7012a.unregisterReceiver(volumeChangeReceiver);
            } catch (RuntimeException e) {
                jwv.m143690j("StreamVolumeManager", "Error unregistering stream volume receiver", e);
            }
            this.f7016e = null;
        }
    }

    /* JADX INFO: renamed from: l */
    public void m9379l(boolean z, int i) {
        int i2 = vck0.f180948a;
        AudioManager audioManager = this.f7015d;
        if (i2 >= 23) {
            audioManager.adjustStreamVolume(this.f7017f, z ? -100 : 100, i);
        } else {
            audioManager.setStreamMute(this.f7017f, z);
        }
        m9382o();
    }

    /* JADX INFO: renamed from: m */
    public void m9380m(int i) {
        if (this.f7017f == i) {
            return;
        }
        this.f7017f = i;
        m9382o();
        this.f7014c.mo9385z(i);
    }

    /* JADX INFO: renamed from: n */
    public void m9381n(int i, int i2) {
        if (i < m9374e() || i > m9373d()) {
            return;
        }
        this.f7015d.setStreamVolume(this.f7017f, i, i2);
        m9382o();
    }

    /* JADX INFO: renamed from: o */
    public final void m9382o() {
        int iM9371h = m9371h(this.f7015d, this.f7017f);
        boolean zM9370f = m9370f(this.f7015d, this.f7017f);
        if (this.f7018g == iM9371h && this.f7019h == zM9370f) {
            return;
        }
        this.f7018g = iM9371h;
        this.f7019h = zM9370f;
        this.f7014c.mo9384C(iM9371h, zM9370f);
    }
}
