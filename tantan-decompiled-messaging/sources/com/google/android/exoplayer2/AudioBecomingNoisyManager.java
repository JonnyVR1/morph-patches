package com.google.android.exoplayer2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import p149l.ii5;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class AudioBecomingNoisyManager {

    /* JADX INFO: renamed from: a */
    public final Context f6976a;

    /* JADX INFO: renamed from: b */
    public final AudioBecomingNoisyReceiver f6977b;

    /* JADX INFO: renamed from: c */
    public boolean f6978c;

    public final class AudioBecomingNoisyReceiver extends BroadcastReceiver implements Runnable {

        /* JADX INFO: renamed from: a */
        public final InterfaceC1788a f6979a;

        /* JADX INFO: renamed from: b */
        public final Handler f6980b;

        public AudioBecomingNoisyReceiver(Handler handler, InterfaceC1788a interfaceC1788a) {
            this.f6980b = handler;
            this.f6979a = interfaceC1788a;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f6980b.post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (AudioBecomingNoisyManager.this.f6978c) {
                this.f6979a.mo9354s();
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.AudioBecomingNoisyManager$a */
    public interface InterfaceC1788a {
        /* JADX INFO: renamed from: s */
        void mo9354s();
    }

    public AudioBecomingNoisyManager(Context context, Handler handler, InterfaceC1788a interfaceC1788a) {
        this.f6976a = context.getApplicationContext();
        this.f6977b = new AudioBecomingNoisyReceiver(handler, interfaceC1788a);
    }

    /* JADX INFO: renamed from: b */
    public void m9353b(boolean z) {
        if (z && !this.f6978c) {
            ii5.m136342l(this.f6976a, this.f6977b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            this.f6978c = true;
        } else {
            if (z || !this.f6978c) {
                return;
            }
            this.f6976a.unregisterReceiver(this.f6977b);
            this.f6978c = false;
        }
    }
}
