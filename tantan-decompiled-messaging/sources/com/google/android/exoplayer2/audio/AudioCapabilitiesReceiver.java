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
import p149l.aa1;
import p149l.p11;
import p149l.vck0;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class AudioCapabilitiesReceiver {

    /* JADX INFO: renamed from: a */
    public final Context f7025a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1803e f7026b;

    /* JADX INFO: renamed from: c */
    public final Handler f7027c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final C1801c f7028d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final BroadcastReceiver f7029e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public final C1802d f7030f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public aa1 f7031g;

    /* JADX INFO: renamed from: h */
    public boolean f7032h;

    public final class HdmiAudioPlugBroadcastReceiver extends BroadcastReceiver {
        public HdmiAudioPlugBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            AudioCapabilitiesReceiver.this.m9409c(aa1.m95504d(context, intent));
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.AudioCapabilitiesReceiver$b */
    @RequiresApi(23)
    public static final class C1800b {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static void m9412a(Context context, AudioDeviceCallback audioDeviceCallback, Handler handler) {
            ((AudioManager) p11.m167011e((AudioManager) context.getSystemService("audio"))).registerAudioDeviceCallback(audioDeviceCallback, handler);
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static void m9413b(Context context, AudioDeviceCallback audioDeviceCallback) {
            ((AudioManager) p11.m167011e((AudioManager) context.getSystemService("audio"))).unregisterAudioDeviceCallback(audioDeviceCallback);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.AudioCapabilitiesReceiver$c */
    @RequiresApi(23)
    public final class C1801c extends AudioDeviceCallback {
        public C1801c() {
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
            AudioCapabilitiesReceiver audioCapabilitiesReceiver = AudioCapabilitiesReceiver.this;
            audioCapabilitiesReceiver.m9409c(aa1.m95503c(audioCapabilitiesReceiver.f7025a));
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
            AudioCapabilitiesReceiver audioCapabilitiesReceiver = AudioCapabilitiesReceiver.this;
            audioCapabilitiesReceiver.m9409c(aa1.m95503c(audioCapabilitiesReceiver.f7025a));
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.AudioCapabilitiesReceiver$d */
    public final class C1802d extends ContentObserver {

        /* JADX INFO: renamed from: a */
        public final ContentResolver f7035a;

        /* JADX INFO: renamed from: b */
        public final Uri f7036b;

        public C1802d(Handler handler, ContentResolver contentResolver, Uri uri) {
            super(handler);
            this.f7035a = contentResolver;
            this.f7036b = uri;
        }

        /* JADX INFO: renamed from: a */
        public void m9414a() {
            this.f7035a.registerContentObserver(this.f7036b, false, this);
        }

        /* JADX INFO: renamed from: b */
        public void m9415b() {
            this.f7035a.unregisterContentObserver(this);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            AudioCapabilitiesReceiver audioCapabilitiesReceiver = AudioCapabilitiesReceiver.this;
            audioCapabilitiesReceiver.m9409c(aa1.m95503c(audioCapabilitiesReceiver.f7025a));
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.AudioCapabilitiesReceiver$e */
    public interface InterfaceC1803e {
        /* JADX INFO: renamed from: a */
        void mo9416a(aa1 aa1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AudioCapabilitiesReceiver(Context context, InterfaceC1803e interfaceC1803e) {
        Context applicationContext = context.getApplicationContext();
        this.f7025a = applicationContext;
        this.f7026b = (InterfaceC1803e) p11.m167011e(interfaceC1803e);
        Handler handlerM197900y = vck0.m197900y();
        this.f7027c = handlerM197900y;
        int i = vck0.f180948a;
        Object[] objArr = 0;
        this.f7028d = i >= 23 ? new C1801c() : null;
        this.f7029e = i >= 21 ? new HdmiAudioPlugBroadcastReceiver() : null;
        Uri uriM95506g = aa1.m95506g();
        this.f7030f = uriM95506g != null ? new C1802d(handlerM197900y, applicationContext.getContentResolver(), uriM95506g) : null;
    }

    /* JADX INFO: renamed from: c */
    public final void m9409c(aa1 aa1Var) {
        if (!this.f7032h || aa1Var.equals(this.f7031g)) {
            return;
        }
        this.f7031g = aa1Var;
        this.f7026b.mo9416a(aa1Var);
    }

    /* JADX INFO: renamed from: d */
    public aa1 m9410d() {
        C1801c c1801c;
        if (this.f7032h) {
            return (aa1) p11.m167011e(this.f7031g);
        }
        this.f7032h = true;
        C1802d c1802d = this.f7030f;
        if (c1802d != null) {
            c1802d.m9414a();
        }
        if (vck0.f180948a >= 23 && (c1801c = this.f7028d) != null) {
            C1800b.m9412a(this.f7025a, c1801c, this.f7027c);
        }
        aa1 aa1VarM95504d = aa1.m95504d(this.f7025a, this.f7029e != null ? this.f7025a.registerReceiver(this.f7029e, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, this.f7027c) : null);
        this.f7031g = aa1VarM95504d;
        return aa1VarM95504d;
    }

    /* JADX INFO: renamed from: e */
    public void m9411e() {
        C1801c c1801c;
        if (this.f7032h) {
            this.f7031g = null;
            if (vck0.f180948a >= 23 && (c1801c = this.f7028d) != null) {
                C1800b.m9413b(this.f7025a, c1801c);
            }
            BroadcastReceiver broadcastReceiver = this.f7029e;
            if (broadcastReceiver != null) {
                this.f7025a.unregisterReceiver(broadcastReceiver);
            }
            C1802d c1802d = this.f7030f;
            if (c1802d != null) {
                c1802d.m9415b();
            }
            this.f7032h = false;
        }
    }
}
