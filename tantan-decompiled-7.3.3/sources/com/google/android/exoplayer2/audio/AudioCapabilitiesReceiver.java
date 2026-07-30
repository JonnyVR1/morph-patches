package com.google.android.exoplayer2.audio;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import p153l.bmk0;
import p153l.ha1;
import p153l.w11;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class AudioCapabilitiesReceiver {

    /* JADX INFO: renamed from: a */
    public final Context f7062a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1826e f7063b;

    /* JADX INFO: renamed from: c */
    public final Handler f7064c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final C1824c f7065d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final BroadcastReceiver f7066e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public final C1825d f7067f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public ha1 f7068g;

    /* JADX INFO: renamed from: h */
    public boolean f7069h;

    public final class HdmiAudioPlugBroadcastReceiver extends BroadcastReceiver {
        public HdmiAudioPlugBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            AudioCapabilitiesReceiver.this.m9463c(ha1.m134107d(context, intent));
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.AudioCapabilitiesReceiver$b */
    @RequiresApi(23)
    public static final class C1823b {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static void m9466a(Context context, AudioDeviceCallback audioDeviceCallback, Handler handler) {
            ((AudioManager) w11.m204369e((AudioManager) context.getSystemService("audio"))).registerAudioDeviceCallback(audioDeviceCallback, handler);
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static void m9467b(Context context, AudioDeviceCallback audioDeviceCallback) {
            ((AudioManager) w11.m204369e((AudioManager) context.getSystemService("audio"))).unregisterAudioDeviceCallback(audioDeviceCallback);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.AudioCapabilitiesReceiver$c */
    @RequiresApi(23)
    public final class C1824c extends AudioDeviceCallback {
        public C1824c() {
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
            AudioCapabilitiesReceiver audioCapabilitiesReceiver = AudioCapabilitiesReceiver.this;
            audioCapabilitiesReceiver.m9463c(ha1.m134106c(audioCapabilitiesReceiver.f7062a));
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
            AudioCapabilitiesReceiver audioCapabilitiesReceiver = AudioCapabilitiesReceiver.this;
            audioCapabilitiesReceiver.m9463c(ha1.m134106c(audioCapabilitiesReceiver.f7062a));
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.AudioCapabilitiesReceiver$d */
    public final class C1825d extends ContentObserver {

        /* JADX INFO: renamed from: a */
        public final ContentResolver f7072a;

        /* JADX INFO: renamed from: b */
        public final Uri f7073b;

        public C1825d(Handler handler, ContentResolver contentResolver, Uri uri) {
            super(handler);
            this.f7072a = contentResolver;
            this.f7073b = uri;
        }

        /* JADX INFO: renamed from: a */
        public void m9468a() {
            this.f7072a.registerContentObserver(this.f7073b, false, this);
        }

        /* JADX INFO: renamed from: b */
        public void m9469b() {
            this.f7072a.unregisterContentObserver(this);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            AudioCapabilitiesReceiver audioCapabilitiesReceiver = AudioCapabilitiesReceiver.this;
            audioCapabilitiesReceiver.m9463c(ha1.m134106c(audioCapabilitiesReceiver.f7062a));
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.AudioCapabilitiesReceiver$e */
    public interface InterfaceC1826e {
        /* JADX INFO: renamed from: a */
        void mo9470a(ha1 ha1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AudioCapabilitiesReceiver(Context context, InterfaceC1826e interfaceC1826e) {
        Context applicationContext = context.getApplicationContext();
        this.f7062a = applicationContext;
        this.f7063b = (InterfaceC1826e) w11.m204369e(interfaceC1826e);
        Handler handlerM105178y = bmk0.m105178y();
        this.f7064c = handlerM105178y;
        int i = bmk0.f77313a;
        Object[] objArr = 0;
        this.f7065d = i >= 23 ? new C1824c() : null;
        this.f7066e = i >= 21 ? new HdmiAudioPlugBroadcastReceiver() : null;
        Uri uriM134109g = ha1.m134109g();
        this.f7067f = uriM134109g != null ? new C1825d(handlerM105178y, applicationContext.getContentResolver(), uriM134109g) : null;
    }

    /* JADX INFO: renamed from: c */
    public final void m9463c(ha1 ha1Var) {
        if (!this.f7069h || ha1Var.equals(this.f7068g)) {
            return;
        }
        this.f7068g = ha1Var;
        this.f7063b.mo9470a(ha1Var);
    }

    /* JADX INFO: renamed from: d */
    public ha1 m9464d() {
        C1824c c1824c;
        if (this.f7069h) {
            return (ha1) w11.m204369e(this.f7068g);
        }
        this.f7069h = true;
        C1825d c1825d = this.f7067f;
        if (c1825d != null) {
            c1825d.m9468a();
        }
        if (bmk0.f77313a >= 23 && (c1824c = this.f7065d) != null) {
            C1823b.m9466a(this.f7062a, c1824c, this.f7064c);
        }
        ha1 ha1VarM134107d = ha1.m134107d(this.f7062a, this.f7066e != null ? this.f7062a.registerReceiver(this.f7066e, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, this.f7064c) : null);
        this.f7068g = ha1VarM134107d;
        return ha1VarM134107d;
    }

    /* JADX INFO: renamed from: e */
    public void m9465e() {
        C1824c c1824c;
        if (this.f7069h) {
            this.f7068g = null;
            if (bmk0.f77313a >= 23 && (c1824c = this.f7065d) != null) {
                C1823b.m9467b(this.f7062a, c1824c);
            }
            BroadcastReceiver broadcastReceiver = this.f7066e;
            if (broadcastReceiver != null) {
                this.f7062a.unregisterReceiver(broadcastReceiver);
            }
            C1825d c1825d = this.f7067f;
            if (c1825d != null) {
                c1825d.m9469b();
            }
            this.f7069h = false;
        }
    }
}
