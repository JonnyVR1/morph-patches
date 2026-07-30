package com.p051p1.mobile.putong.live.base.mmsdk.player;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import java.util.concurrent.ConcurrentLinkedQueue;
import p153l.ta1;
import p153l.wa1;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.base.mmsdk.player.a */
/* JADX INFO: loaded from: classes13.dex */
public class C12622a {

    /* JADX INFO: renamed from: h */
    public static volatile C12622a f45385h;

    /* JADX INFO: renamed from: b */
    public AudioManager.OnAudioFocusChangeListener f45387b;

    /* JADX INFO: renamed from: c */
    public AudioManager f45388c;

    /* JADX INFO: renamed from: d */
    public c f45389d;

    /* JADX INFO: renamed from: e */
    public TelephonyManager f45390e;

    /* JADX INFO: renamed from: g */
    public AudioFocusRequest f45392g;

    /* JADX INFO: renamed from: a */
    public ConcurrentLinkedQueue<b> f45386a = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: f */
    public int f45391f = -1;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.mmsdk.player.a$a */
    public class a implements AudioManager.OnAudioFocusChangeListener {
        public a() {
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int i) {
            if (i == -3 || i == -2 || i == -1) {
                for (b bVar : C12622a.this.f45386a) {
                    if (bVar != null) {
                        bVar.mo69703a(i);
                    }
                }
                return;
            }
            if (i == 1 || i == 2 || i == 3) {
                for (b bVar2 : C12622a.this.f45386a) {
                    if (bVar2 != null) {
                        bVar2.mo69705c(i);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.mmsdk.player.a$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo69703a(int i);

        /* JADX INFO: renamed from: b */
        void mo69704b(int i, String str);

        /* JADX INFO: renamed from: c */
        void mo69705c(int i);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.mmsdk.player.a$c */
    public class c extends PhoneStateListener {
        public c() {
        }

        @Override // android.telephony.PhoneStateListener
        public void onCallStateChanged(int i, String str) {
            if (i == 0) {
                for (b bVar : C12622a.this.f45386a) {
                    if (bVar != null) {
                        bVar.mo69704b(i, str);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static C12622a m69707b() {
        if (f45385h == null) {
            synchronized (C12622a.class) {
                try {
                    if (f45385h == null) {
                        f45385h = new C12622a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f45385h;
    }

    /* JADX INFO: renamed from: c */
    public void m69708c(b bVar) {
        if (bVar == null || this.f45386a.contains(bVar)) {
            return;
        }
        this.f45386a.offer(bVar);
    }

    /* JADX INFO: renamed from: d */
    public void m69709d(b bVar) {
        this.f45386a.remove(bVar);
    }

    /* JADX INFO: renamed from: e */
    public synchronized int m69710e(Context context) {
        try {
            if (this.f45388c == null) {
                this.f45388c = (AudioManager) context.getSystemService("audio");
            }
            if (Build.VERSION.SDK_INT >= 26) {
                AudioAttributes audioAttributesBuild = new AudioAttributes.Builder().setUsage(1).setContentType(2).build();
                if (this.f45387b == null) {
                    this.f45387b = new a();
                }
                if (this.f45392g == null) {
                    wa1.m205632a();
                    this.f45392g = ta1.m189769a(2).setAudioAttributes(audioAttributesBuild).setOnAudioFocusChangeListener(this.f45387b).build();
                }
                this.f45391f = this.f45388c.requestAudioFocus(this.f45392g);
            } else {
                if (this.f45387b == null) {
                    this.f45387b = new a();
                }
                this.f45391f = this.f45388c.requestAudioFocus(this.f45387b, 3, 2);
            }
            int i = this.f45391f;
            if (i == 1) {
                this.f45387b.onAudioFocusChange(i);
            }
            try {
                if (this.f45390e == null) {
                    this.f45390e = (TelephonyManager) context.getSystemService("phone");
                }
                if (this.f45389d == null) {
                    this.f45389d = new c();
                }
                this.f45390e.listen(this.f45389d, 32);
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f45391f;
    }
}
