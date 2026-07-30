package com.p046p1.mobile.putong.live.base.mmsdk.player;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import java.util.concurrent.ConcurrentLinkedQueue;
import p149l.ma1;
import p149l.pa1;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.base.mmsdk.player.a */
/* JADX INFO: loaded from: classes13.dex */
public class C12459a {

    /* JADX INFO: renamed from: h */
    public static volatile C12459a f44537h;

    /* JADX INFO: renamed from: b */
    public AudioManager.OnAudioFocusChangeListener f44539b;

    /* JADX INFO: renamed from: c */
    public AudioManager f44540c;

    /* JADX INFO: renamed from: d */
    public c f44541d;

    /* JADX INFO: renamed from: e */
    public TelephonyManager f44542e;

    /* JADX INFO: renamed from: g */
    public AudioFocusRequest f44544g;

    /* JADX INFO: renamed from: a */
    public ConcurrentLinkedQueue<b> f44538a = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: f */
    public int f44543f = -1;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.mmsdk.player.a$a */
    public class a implements AudioManager.OnAudioFocusChangeListener {
        public a() {
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int i) {
            if (i == -3 || i == -2 || i == -1) {
                for (b bVar : C12459a.this.f44538a) {
                    if (bVar != null) {
                        bVar.mo68520a(i);
                    }
                }
                return;
            }
            if (i == 1 || i == 2 || i == 3) {
                for (b bVar2 : C12459a.this.f44538a) {
                    if (bVar2 != null) {
                        bVar2.mo68522c(i);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.mmsdk.player.a$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo68520a(int i);

        /* JADX INFO: renamed from: b */
        void mo68521b(int i, String str);

        /* JADX INFO: renamed from: c */
        void mo68522c(int i);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.mmsdk.player.a$c */
    public class c extends PhoneStateListener {
        public c() {
        }

        @Override // android.telephony.PhoneStateListener
        public void onCallStateChanged(int i, String str) {
            if (i == 0) {
                for (b bVar : C12459a.this.f44538a) {
                    if (bVar != null) {
                        bVar.mo68521b(i, str);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static C12459a m68524b() {
        if (f44537h == null) {
            synchronized (C12459a.class) {
                try {
                    if (f44537h == null) {
                        f44537h = new C12459a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f44537h;
    }

    /* JADX INFO: renamed from: c */
    public void m68525c(b bVar) {
        if (bVar == null || this.f44538a.contains(bVar)) {
            return;
        }
        this.f44538a.offer(bVar);
    }

    /* JADX INFO: renamed from: d */
    public void m68526d(b bVar) {
        this.f44538a.remove(bVar);
    }

    /* JADX INFO: renamed from: e */
    public synchronized int m68527e(Context context) {
        try {
            if (this.f44540c == null) {
                this.f44540c = (AudioManager) context.getSystemService("audio");
            }
            if (Build.VERSION.SDK_INT >= 26) {
                AudioAttributes audioAttributesBuild = new AudioAttributes.Builder().setUsage(1).setContentType(2).build();
                if (this.f44539b == null) {
                    this.f44539b = new a();
                }
                if (this.f44544g == null) {
                    pa1.m167970a();
                    this.f44544g = ma1.m153628a(2).setAudioAttributes(audioAttributesBuild).setOnAudioFocusChangeListener(this.f44539b).build();
                }
                this.f44543f = this.f44540c.requestAudioFocus(this.f44544g);
            } else {
                if (this.f44539b == null) {
                    this.f44539b = new a();
                }
                this.f44543f = this.f44540c.requestAudioFocus(this.f44539b, 3, 2);
            }
            int i = this.f44543f;
            if (i == 1) {
                this.f44539b.onAudioFocusChange(i);
            }
            try {
                if (this.f44542e == null) {
                    this.f44542e = (TelephonyManager) context.getSystemService("phone");
                }
                if (this.f44541d == null) {
                    this.f44541d = new c();
                }
                this.f44542e.listen(this.f44541d, 32);
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f44543f;
    }
}
