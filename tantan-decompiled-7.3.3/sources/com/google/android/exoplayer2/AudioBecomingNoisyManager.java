package com.google.android.exoplayer2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import p153l.jj5;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class AudioBecomingNoisyManager {

    /* JADX INFO: renamed from: a */
    public final Context f7013a;

    /* JADX INFO: renamed from: b */
    public final AudioBecomingNoisyReceiver f7014b;

    /* JADX INFO: renamed from: c */
    public boolean f7015c;

    public final class AudioBecomingNoisyReceiver extends BroadcastReceiver implements Runnable {

        /* JADX INFO: renamed from: a */
        public final InterfaceC1811a f7016a;

        /* JADX INFO: renamed from: b */
        public final Handler f7017b;

        public AudioBecomingNoisyReceiver(Handler handler, InterfaceC1811a interfaceC1811a) {
            this.f7017b = handler;
            this.f7016a = interfaceC1811a;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f7017b.post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (AudioBecomingNoisyManager.this.f7015c) {
                this.f7016a.mo9408s();
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.AudioBecomingNoisyManager$a */
    public interface InterfaceC1811a {
        /* JADX INFO: renamed from: s */
        void mo9408s();
    }

    public AudioBecomingNoisyManager(Context context, Handler handler, InterfaceC1811a interfaceC1811a) {
        this.f7013a = context.getApplicationContext();
        this.f7014b = new AudioBecomingNoisyReceiver(handler, interfaceC1811a);
    }

    /* JADX INFO: renamed from: b */
    public void m9407b(boolean z) {
        if (z && !this.f7015c) {
            jj5.m145018l(this.f7013a, this.f7014b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            this.f7015c = true;
        } else {
            if (z || !this.f7015c) {
                return;
            }
            this.f7013a.unregisterReceiver(this.f7014b);
            this.f7015c = false;
        }
    }
}
