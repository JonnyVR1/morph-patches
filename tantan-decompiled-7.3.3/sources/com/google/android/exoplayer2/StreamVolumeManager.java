package com.google.android.exoplayer2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import androidx.annotation.Nullable;
import p153l.bmk0;
import p153l.jj5;
import p153l.kyv;
import p153l.w11;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class StreamVolumeManager {

    /* JADX INFO: renamed from: a */
    public final Context f7049a;

    /* JADX INFO: renamed from: b */
    public final Handler f7050b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC1819b f7051c;

    /* JADX INFO: renamed from: d */
    public final AudioManager f7052d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public VolumeChangeReceiver f7053e;

    /* JADX INFO: renamed from: f */
    public int f7054f;

    /* JADX INFO: renamed from: g */
    public int f7055g;

    /* JADX INFO: renamed from: h */
    public boolean f7056h;

    public final class VolumeChangeReceiver extends BroadcastReceiver {
        public VolumeChangeReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Handler handler = StreamVolumeManager.this.f7050b;
            final StreamVolumeManager streamVolumeManager = StreamVolumeManager.this;
            handler.post(new Runnable() { // from class: com.google.android.exoplayer2.a0
                @Override // java.lang.Runnable
                public final void run() {
                    streamVolumeManager.m9436o();
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.StreamVolumeManager$b */
    public interface InterfaceC1819b {
        /* JADX INFO: renamed from: C */
        void mo9438C(int i, boolean z);

        /* JADX INFO: renamed from: z */
        void mo9439z(int i);
    }

    public StreamVolumeManager(Context context, Handler handler, InterfaceC1819b interfaceC1819b) {
        Context applicationContext = context.getApplicationContext();
        this.f7049a = applicationContext;
        this.f7050b = handler;
        this.f7051c = interfaceC1819b;
        AudioManager audioManager = (AudioManager) w11.m204373i((AudioManager) applicationContext.getSystemService("audio"));
        this.f7052d = audioManager;
        this.f7054f = 3;
        this.f7055g = m9425h(audioManager, 3);
        this.f7056h = m9424f(audioManager, this.f7054f);
        VolumeChangeReceiver volumeChangeReceiver = new VolumeChangeReceiver();
        try {
            jj5.m145018l(applicationContext, volumeChangeReceiver, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f7053e = volumeChangeReceiver;
        } catch (RuntimeException e) {
            kyv.m152152j("StreamVolumeManager", "Error registering stream volume receiver", e);
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m9424f(AudioManager audioManager, int i) {
        if (bmk0.f77313a >= 23) {
            return audioManager.isStreamMute(i);
        }
        return m9425h(audioManager, i) == 0;
    }

    /* JADX INFO: renamed from: h */
    public static int m9425h(AudioManager audioManager, int i) {
        try {
            return audioManager.getStreamVolume(i);
        } catch (RuntimeException e) {
            kyv.m152152j("StreamVolumeManager", "Could not retrieve stream volume for stream type " + i, e);
            return audioManager.getStreamMaxVolume(i);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m9426c(int i) {
        if (this.f7055g <= m9428e()) {
            return;
        }
        this.f7052d.adjustStreamVolume(this.f7054f, -1, i);
        m9436o();
    }

    /* JADX INFO: renamed from: d */
    public int m9427d() {
        return this.f7052d.getStreamMaxVolume(this.f7054f);
    }

    /* JADX INFO: renamed from: e */
    public int m9428e() {
        if (bmk0.f77313a >= 28) {
            return this.f7052d.getStreamMinVolume(this.f7054f);
        }
        return 0;
    }

    /* JADX INFO: renamed from: g */
    public int m9429g() {
        return this.f7055g;
    }

    /* JADX INFO: renamed from: i */
    public void m9430i(int i) {
        if (this.f7055g >= m9427d()) {
            return;
        }
        this.f7052d.adjustStreamVolume(this.f7054f, 1, i);
        m9436o();
    }

    /* JADX INFO: renamed from: j */
    public boolean m9431j() {
        return this.f7056h;
    }

    /* JADX INFO: renamed from: k */
    public void m9432k() {
        VolumeChangeReceiver volumeChangeReceiver = this.f7053e;
        if (volumeChangeReceiver != null) {
            try {
                this.f7049a.unregisterReceiver(volumeChangeReceiver);
            } catch (RuntimeException e) {
                kyv.m152152j("StreamVolumeManager", "Error unregistering stream volume receiver", e);
            }
            this.f7053e = null;
        }
    }

    /* JADX INFO: renamed from: l */
    public void m9433l(boolean z, int i) {
        int i2 = bmk0.f77313a;
        AudioManager audioManager = this.f7052d;
        if (i2 >= 23) {
            audioManager.adjustStreamVolume(this.f7054f, z ? -100 : 100, i);
        } else {
            audioManager.setStreamMute(this.f7054f, z);
        }
        m9436o();
    }

    /* JADX INFO: renamed from: m */
    public void m9434m(int i) {
        if (this.f7054f == i) {
            return;
        }
        this.f7054f = i;
        m9436o();
        this.f7051c.mo9439z(i);
    }

    /* JADX INFO: renamed from: n */
    public void m9435n(int i, int i2) {
        if (i < m9428e() || i > m9427d()) {
            return;
        }
        this.f7052d.setStreamVolume(this.f7054f, i, i2);
        m9436o();
    }

    /* JADX INFO: renamed from: o */
    public final void m9436o() {
        int iM9425h = m9425h(this.f7052d, this.f7054f);
        boolean zM9424f = m9424f(this.f7052d, this.f7054f);
        if (this.f7055g == iM9425h && this.f7056h == zM9424f) {
            return;
        }
        this.f7055g = iM9425h;
        this.f7056h = zM9424f;
        this.f7051c.mo9438C(iM9425h, zM9424f);
    }
}
