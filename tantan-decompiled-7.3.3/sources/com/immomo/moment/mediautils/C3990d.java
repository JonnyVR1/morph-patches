package com.immomo.moment.mediautils;

import android.media.AudioTrack;
import com.clevertap.android.sdk.Constants;
import com.cosmos.mdlog.MDLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import p153l.ad60;
import p153l.bc1;
import p153l.spw;

/* JADX INFO: renamed from: com.immomo.moment.mediautils.d */
/* JADX INFO: loaded from: classes7.dex */
public class C3990d {

    /* JADX INFO: renamed from: v */
    private static int f13972v = 1;

    /* JADX INFO: renamed from: w */
    private static int f13973w = 2;

    /* JADX INFO: renamed from: a */
    private AudioTrack f13974a;

    /* JADX INFO: renamed from: b */
    private int f13975b;

    /* JADX INFO: renamed from: c */
    private int f13976c;

    /* JADX INFO: renamed from: d */
    private int f13977d;

    /* JADX INFO: renamed from: e */
    private int f13978e;

    /* JADX INFO: renamed from: f */
    private byte[] f13979f;

    /* JADX INFO: renamed from: g */
    private int f13980g;

    /* JADX INFO: renamed from: h */
    private boolean f13981h;

    /* JADX INFO: renamed from: i */
    private Object f13982i;

    /* JADX INFO: renamed from: j */
    private LinkedList<ad60> f13983j;

    /* JADX INFO: renamed from: k */
    private volatile boolean f13984k;

    /* JADX INFO: renamed from: l */
    private List<bc1> f13985l;

    /* JADX INFO: renamed from: m */
    private int f13986m;

    /* JADX INFO: renamed from: n */
    private int f13987n;

    /* JADX INFO: renamed from: o */
    private long f13988o;

    /* JADX INFO: renamed from: p */
    private boolean f13989p;

    /* JADX INFO: renamed from: q */
    c f13990q;

    /* JADX INFO: renamed from: r */
    d f13991r;

    /* JADX INFO: renamed from: s */
    b f13992s;

    /* JADX INFO: renamed from: t */
    a f13993t;

    /* JADX INFO: renamed from: u */
    private spw f13994u;

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.d$a */
    public interface a {
        void onAudioAvailableBufferCount(int i);
    }

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.d$b */
    public interface b {
        void onAudioOriginPosition(long j);
    }

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.d$c */
    public class c extends Thread {
        public c() {
        }

        /* JADX WARN: Code duplicated, block: B:54:0x00ce  */
        /* JADX WARN: Instruction removed from duplicated block: B:54:0x00ce, please report this as an issue */
        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (true) {
                boolean z = true;
                while (!C3990d.this.f13984k) {
                    int size = C3990d.this.f13983j.size();
                    C3990d c3990d = C3990d.this;
                    if (size > 0) {
                        try {
                            if (c3990d.f13986m == C3990d.f13972v) {
                                synchronized (C3990d.this.f13982i) {
                                    try {
                                        if (C3990d.this.f13983j.size() > 0) {
                                            ad60 ad60Var = (ad60) C3990d.this.f13983j.pollFirst();
                                            if (C3990d.this.f13992s != null && ad60Var.m97016b() != null) {
                                                C3990d.this.f13992s.onAudioOriginPosition(ad60Var.m97016b().presentationTimeUs);
                                            }
                                            C3990d c3990d2 = C3990d.this;
                                            a aVar = c3990d2.f13993t;
                                            if (aVar != null) {
                                                aVar.onAudioAvailableBufferCount(c3990d2.f13983j.size());
                                            }
                                            ad60 ad60VarM19705k = C3990d.this.m19705k(ad60Var);
                                            if (ad60VarM19705k != null) {
                                                long j = ad60VarM19705k.m97016b().presentationTimeUs;
                                                d dVar = C3990d.this.f13991r;
                                                if (dVar != null) {
                                                    dVar.onAudioPlayingPosition(j);
                                                }
                                                if (!C3990d.this.f13989p && z) {
                                                    z = false;
                                                    C3990d.this.m19706w(j / 1000);
                                                }
                                                C3990d.this.m19720y(ad60VarM19705k.m97015a().array(), ad60VarM19705k.m97016b().size);
                                            }
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                            } else {
                                try {
                                    try {
                                        Thread.sleep(5L);
                                    } catch (Exception e) {
                                        e = e;
                                        z = true;
                                        if (C3990d.this.f13994u != null) {
                                            C3990d.this.f13994u.onFail(6004, "Audio Player running failed !!!" + e.toString());
                                        }
                                        MDLog.m7445e("AudioPlayer", "Audio Player running failed !!!" + e.toString());
                                    }
                                } catch (InterruptedException e2) {
                                    e2.printStackTrace();
                                }
                            }
                        } catch (Exception e3) {
                            e = e3;
                        }
                        if (C3990d.this.f13994u != null) {
                            C3990d.this.f13994u.onFail(6004, "Audio Player running failed !!!" + e.toString());
                        }
                        MDLog.m7445e("AudioPlayer", "Audio Player running failed !!!" + e.toString());
                    } else {
                        synchronized (c3990d.f13982i) {
                            try {
                                if (!C3990d.this.f13984k) {
                                    C3990d.this.f13982i.wait();
                                }
                            } catch (InterruptedException e4) {
                                e4.printStackTrace();
                            }
                        }
                    }
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.d$d */
    public interface d {
        void onAudioPlayingPosition(long j);
    }

    public C3990d() {
        this.f13974a = null;
        this.f13975b = 0;
        this.f13976c = 0;
        this.f13977d = 0;
        this.f13978e = 0;
        this.f13979f = null;
        this.f13980g = 0;
        this.f13981h = false;
        this.f13982i = new Object();
        this.f13983j = new LinkedList<>();
        this.f13984k = false;
        this.f13986m = 0;
        this.f13987n = 3;
        this.f13988o = -1L;
        this.f13989p = true;
        this.f13994u = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public synchronized ad60 m19705k(ad60 ad60Var) {
        if (ad60Var == null) {
            return null;
        }
        List<bc1> list = this.f13985l;
        if (list != null) {
            Iterator<bc1> it = list.iterator();
            while (it.hasNext()) {
                ad60Var = it.next().mo103472b(ad60Var, ad60Var.m97016b().size, ad60Var.m97016b().presentationTimeUs);
                if (ad60Var == null) {
                    return ad60Var;
                }
            }
        }
        return ad60Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public void m19706w(long j) {
        MDLog.m7443d("AudioPlayer", "start audioPts:" + j + " videoPts:" + this.f13988o + " avdiff:" + (j - this.f13988o));
        long jCurrentTimeMillis = System.currentTimeMillis();
        do {
            long j2 = this.f13988o;
            if (j2 == -1 || (j - j2 > 50 && !this.f13984k)) {
                try {
                    Thread.sleep(10L);
                } catch (Exception e) {
                    MDLog.printErrStackTrace("AudioPlayer", e);
                }
            }
            MDLog.m7443d("AudioPlayer", "end costTime:" + (System.currentTimeMillis() - jCurrentTimeMillis) + " audioPts:" + j + " videoPts:" + this.f13988o + " avdiff:" + (j - this.f13988o));
        } while (System.currentTimeMillis() - jCurrentTimeMillis <= Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
        MDLog.m7445e("AudioPlayer", "timeout:" + (System.currentTimeMillis() - jCurrentTimeMillis));
        MDLog.m7443d("AudioPlayer", "end costTime:" + (System.currentTimeMillis() - jCurrentTimeMillis) + " audioPts:" + j + " videoPts:" + this.f13988o + " avdiff:" + (j - this.f13988o));
    }

    /* JADX INFO: renamed from: j */
    public synchronized void m19707j(bc1 bc1Var) {
        try {
            MDLog.m7449i("AudioPlayer", "AudioPlayer addAudioProcessor !!!");
            if (bc1Var == null) {
                return;
            }
            if (this.f13985l == null) {
                this.f13985l = new ArrayList();
            }
            this.f13985l.add(bc1Var);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: l */
    public synchronized void m19708l() {
        MDLog.m7449i("AudioPlayer", "AudioPlayer clearAudioProcessor !!!");
        List<bc1> list = this.f13985l;
        if (list != null) {
            list.clear();
        }
    }

    /* JADX INFO: renamed from: m */
    public void m19709m() {
        MDLog.m7449i("AudioPlayer", "AudioPlayer pause !!!");
        this.f13986m = f13973w;
        AudioTrack audioTrack = this.f13974a;
        if (audioTrack != null) {
            audioTrack.pause();
            this.f13981h = true;
            this.f13988o = -1L;
        }
    }

    /* JADX INFO: renamed from: n */
    public boolean m19710n(int i, int i2, int i3) {
        MDLog.m7449i("AudioPlayer", "AudioPlayer prepare sampleRate = " + i + " bits = " + i2 + " channels = " + i3);
        if (i == 0 || i2 == 0 || i3 == 0) {
            spw spwVar = this.f13994u;
            if (spwVar != null) {
                spwVar.onFail(6001, "Audio Player sampleRate:" + i + " bits:" + i2 + " channels:" + i3);
            }
            return false;
        }
        this.f13975b = i;
        this.f13977d = i2;
        this.f13976c = i3;
        int i4 = i3 == 2 ? 12 : 4;
        int i5 = i2 != 16 ? 3 : 2;
        try {
            this.f13978e = AudioTrack.getMinBufferSize(i, i4, i5);
            AudioTrack audioTrack = new AudioTrack(this.f13987n, this.f13975b, i4, i5, this.f13978e, 1);
            this.f13974a = audioTrack;
            audioTrack.play();
            this.f13979f = new byte[this.f13978e];
            c cVar = new c();
            this.f13990q = cVar;
            cVar.start();
            this.f13986m = f13972v;
            return true;
        } catch (Exception e) {
            this.f13974a = null;
            MDLog.m7449i("AudioPlayer", "Audio Player Initialize error + audioSampleRate = " + this.f13975b);
            spw spwVar2 = this.f13994u;
            if (spwVar2 != null) {
                spwVar2.onFail(6001, "Audio Player Initialize error !!!" + e.toString());
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: o */
    public void m19711o() {
        MDLog.m7449i("AudioPlayer", "AudioPlayer release !!!");
        this.f13984k = true;
        if (this.f13990q != null) {
            try {
                synchronized (this.f13982i) {
                    this.f13982i.notifyAll();
                }
                this.f13990q.interrupt();
                this.f13990q.join(1000L);
            } catch (Exception e) {
                spw spwVar = this.f13994u;
                if (spwVar != null) {
                    spwVar.onFail(6003, "Audio Player release failed !!!" + e.toString());
                }
                MDLog.m7445e("AudioPlayer", "Audio Player release failed !!!" + e.toString());
            }
        }
        AudioTrack audioTrack = this.f13974a;
        if (audioTrack != null) {
            audioTrack.release();
        }
        this.f13983j.clear();
    }

    /* JADX INFO: renamed from: p */
    public void m19712p() {
        MDLog.m7449i("AudioPlayer", "AudioPlayer reset !!!");
        synchronized (this.f13982i) {
            try {
                this.f13983j.clear();
                AudioTrack audioTrack = this.f13974a;
                if (audioTrack != null) {
                    audioTrack.flush();
                }
                d dVar = this.f13991r;
                if (dVar != null) {
                    dVar.onAudioPlayingPosition(0L);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public void m19713q() {
        MDLog.m7449i("AudioPlayer", "AudioPlayer resume !!!");
        try {
            AudioTrack audioTrack = this.f13974a;
            if (audioTrack != null) {
                if (this.f13981h) {
                    audioTrack.play();
                    this.f13981h = false;
                }
                this.f13986m = f13972v;
            }
        } catch (Exception e) {
            spw spwVar = this.f13994u;
            if (spwVar != null) {
                spwVar.onFail(6002, "Audio Player resume failed !!!" + e.toString());
            }
            MDLog.m7445e("AudioPlayer", "AudioPlayer resume failed !!! " + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: r */
    public void m19714r(b bVar) {
        this.f13992s = bVar;
    }

    /* JADX INFO: renamed from: s */
    public void m19715s(d dVar) {
        this.f13991r = dVar;
    }

    /* JADX INFO: renamed from: t */
    public void m19716t(a aVar) {
        this.f13993t = aVar;
    }

    /* JADX INFO: renamed from: u */
    public void m19717u(spw spwVar) {
        this.f13994u = spwVar;
    }

    /* JADX INFO: renamed from: v */
    public void m19718v(long j) {
        this.f13988o = j;
    }

    /* JADX INFO: renamed from: x */
    public void m19719x(ad60 ad60Var) {
        synchronized (this.f13982i) {
            if (ad60Var != null) {
                try {
                    this.f13983j.addLast(ad60Var);
                    this.f13982i.notifyAll();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public void m19720y(byte[] bArr, int i) {
        if (this.f13974a == null || bArr == null) {
            return;
        }
        int i2 = 0;
        do {
            int iWrite = this.f13974a.write(bArr, i2, i);
            if (iWrite >= 0) {
                i2 += iWrite;
                i -= iWrite;
            }
            if (iWrite < 0 || i <= 0) {
                return;
            }
        } while (!this.f13981h);
    }

    public C3990d(boolean z) {
        this.f13974a = null;
        this.f13975b = 0;
        this.f13976c = 0;
        this.f13977d = 0;
        this.f13978e = 0;
        this.f13979f = null;
        this.f13980g = 0;
        this.f13981h = false;
        this.f13982i = new Object();
        this.f13983j = new LinkedList<>();
        this.f13984k = false;
        this.f13986m = 0;
        this.f13987n = 3;
        this.f13988o = -1L;
        this.f13994u = null;
        this.f13989p = z;
    }
}
