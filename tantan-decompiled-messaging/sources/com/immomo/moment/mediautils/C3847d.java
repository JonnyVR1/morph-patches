package com.immomo.moment.mediautils;

import android.media.AudioTrack;
import com.clevertap.android.sdk.Constants;
import com.cosmos.mdlog.MDLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import p149l.tmw;
import p149l.u460;
import p149l.ub1;

/* JADX INFO: renamed from: com.immomo.moment.mediautils.d */
/* JADX INFO: loaded from: classes7.dex */
public class C3847d {

    /* JADX INFO: renamed from: v */
    private static int f13278v = 1;

    /* JADX INFO: renamed from: w */
    private static int f13279w = 2;

    /* JADX INFO: renamed from: a */
    private AudioTrack f13280a;

    /* JADX INFO: renamed from: b */
    private int f13281b;

    /* JADX INFO: renamed from: c */
    private int f13282c;

    /* JADX INFO: renamed from: d */
    private int f13283d;

    /* JADX INFO: renamed from: e */
    private int f13284e;

    /* JADX INFO: renamed from: f */
    private byte[] f13285f;

    /* JADX INFO: renamed from: g */
    private int f13286g;

    /* JADX INFO: renamed from: h */
    private boolean f13287h;

    /* JADX INFO: renamed from: i */
    private Object f13288i;

    /* JADX INFO: renamed from: j */
    private LinkedList<u460> f13289j;

    /* JADX INFO: renamed from: k */
    private volatile boolean f13290k;

    /* JADX INFO: renamed from: l */
    private List<ub1> f13291l;

    /* JADX INFO: renamed from: m */
    private int f13292m;

    /* JADX INFO: renamed from: n */
    private int f13293n;

    /* JADX INFO: renamed from: o */
    private long f13294o;

    /* JADX INFO: renamed from: p */
    private boolean f13295p;

    /* JADX INFO: renamed from: q */
    c f13296q;

    /* JADX INFO: renamed from: r */
    d f13297r;

    /* JADX INFO: renamed from: s */
    b f13298s;

    /* JADX INFO: renamed from: t */
    a f13299t;

    /* JADX INFO: renamed from: u */
    private tmw f13300u;

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
                while (!C3847d.this.f13290k) {
                    int size = C3847d.this.f13289j.size();
                    C3847d c3847d = C3847d.this;
                    if (size > 0) {
                        try {
                            if (c3847d.f13292m == C3847d.f13278v) {
                                synchronized (C3847d.this.f13288i) {
                                    try {
                                        if (C3847d.this.f13289j.size() > 0) {
                                            u460 u460Var = (u460) C3847d.this.f13289j.pollFirst();
                                            if (C3847d.this.f13298s != null && u460Var.m191673b() != null) {
                                                C3847d.this.f13298s.onAudioOriginPosition(u460Var.m191673b().presentationTimeUs);
                                            }
                                            C3847d c3847d2 = C3847d.this;
                                            a aVar = c3847d2.f13299t;
                                            if (aVar != null) {
                                                aVar.onAudioAvailableBufferCount(c3847d2.f13289j.size());
                                            }
                                            u460 u460VarM18725k = C3847d.this.m18725k(u460Var);
                                            if (u460VarM18725k != null) {
                                                long j = u460VarM18725k.m191673b().presentationTimeUs;
                                                d dVar = C3847d.this.f13297r;
                                                if (dVar != null) {
                                                    dVar.onAudioPlayingPosition(j);
                                                }
                                                if (!C3847d.this.f13295p && z) {
                                                    z = false;
                                                    C3847d.this.m18726w(j / 1000);
                                                }
                                                C3847d.this.m18740y(u460VarM18725k.m191672a().array(), u460VarM18725k.m191673b().size);
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
                                        if (C3847d.this.f13300u != null) {
                                            C3847d.this.f13300u.onFail(6004, "Audio Player running failed !!!" + e.toString());
                                        }
                                        MDLog.m7391e("AudioPlayer", "Audio Player running failed !!!" + e.toString());
                                    }
                                } catch (InterruptedException e2) {
                                    e2.printStackTrace();
                                }
                            }
                        } catch (Exception e3) {
                            e = e3;
                        }
                        if (C3847d.this.f13300u != null) {
                            C3847d.this.f13300u.onFail(6004, "Audio Player running failed !!!" + e.toString());
                        }
                        MDLog.m7391e("AudioPlayer", "Audio Player running failed !!!" + e.toString());
                    } else {
                        synchronized (c3847d.f13288i) {
                            try {
                                if (!C3847d.this.f13290k) {
                                    C3847d.this.f13288i.wait();
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

    public C3847d() {
        this.f13280a = null;
        this.f13281b = 0;
        this.f13282c = 0;
        this.f13283d = 0;
        this.f13284e = 0;
        this.f13285f = null;
        this.f13286g = 0;
        this.f13287h = false;
        this.f13288i = new Object();
        this.f13289j = new LinkedList<>();
        this.f13290k = false;
        this.f13292m = 0;
        this.f13293n = 3;
        this.f13294o = -1L;
        this.f13295p = true;
        this.f13300u = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public synchronized u460 m18725k(u460 u460Var) {
        if (u460Var == null) {
            return null;
        }
        List<ub1> list = this.f13291l;
        if (list != null) {
            Iterator<ub1> it = list.iterator();
            while (it.hasNext()) {
                u460Var = it.next().mo130258b(u460Var, u460Var.m191673b().size, u460Var.m191673b().presentationTimeUs);
                if (u460Var == null) {
                    return u460Var;
                }
            }
        }
        return u460Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public void m18726w(long j) {
        MDLog.m7389d("AudioPlayer", "start audioPts:" + j + " videoPts:" + this.f13294o + " avdiff:" + (j - this.f13294o));
        long jCurrentTimeMillis = System.currentTimeMillis();
        do {
            long j2 = this.f13294o;
            if (j2 == -1 || (j - j2 > 50 && !this.f13290k)) {
                try {
                    Thread.sleep(10L);
                } catch (Exception e) {
                    MDLog.printErrStackTrace("AudioPlayer", e);
                }
            }
            MDLog.m7389d("AudioPlayer", "end costTime:" + (System.currentTimeMillis() - jCurrentTimeMillis) + " audioPts:" + j + " videoPts:" + this.f13294o + " avdiff:" + (j - this.f13294o));
        } while (System.currentTimeMillis() - jCurrentTimeMillis <= Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
        MDLog.m7391e("AudioPlayer", "timeout:" + (System.currentTimeMillis() - jCurrentTimeMillis));
        MDLog.m7389d("AudioPlayer", "end costTime:" + (System.currentTimeMillis() - jCurrentTimeMillis) + " audioPts:" + j + " videoPts:" + this.f13294o + " avdiff:" + (j - this.f13294o));
    }

    /* JADX INFO: renamed from: j */
    public synchronized void m18727j(ub1 ub1Var) {
        try {
            MDLog.m7395i("AudioPlayer", "AudioPlayer addAudioProcessor !!!");
            if (ub1Var == null) {
                return;
            }
            if (this.f13291l == null) {
                this.f13291l = new ArrayList();
            }
            this.f13291l.add(ub1Var);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: l */
    public synchronized void m18728l() {
        MDLog.m7395i("AudioPlayer", "AudioPlayer clearAudioProcessor !!!");
        List<ub1> list = this.f13291l;
        if (list != null) {
            list.clear();
        }
    }

    /* JADX INFO: renamed from: m */
    public void m18729m() {
        MDLog.m7395i("AudioPlayer", "AudioPlayer pause !!!");
        this.f13292m = f13279w;
        AudioTrack audioTrack = this.f13280a;
        if (audioTrack != null) {
            audioTrack.pause();
            this.f13287h = true;
            this.f13294o = -1L;
        }
    }

    /* JADX INFO: renamed from: n */
    public boolean m18730n(int i, int i2, int i3) {
        MDLog.m7395i("AudioPlayer", "AudioPlayer prepare sampleRate = " + i + " bits = " + i2 + " channels = " + i3);
        if (i == 0 || i2 == 0 || i3 == 0) {
            tmw tmwVar = this.f13300u;
            if (tmwVar != null) {
                tmwVar.onFail(6001, "Audio Player sampleRate:" + i + " bits:" + i2 + " channels:" + i3);
            }
            return false;
        }
        this.f13281b = i;
        this.f13283d = i2;
        this.f13282c = i3;
        int i4 = i3 == 2 ? 12 : 4;
        int i5 = i2 != 16 ? 3 : 2;
        try {
            this.f13284e = AudioTrack.getMinBufferSize(i, i4, i5);
            AudioTrack audioTrack = new AudioTrack(this.f13293n, this.f13281b, i4, i5, this.f13284e, 1);
            this.f13280a = audioTrack;
            audioTrack.play();
            this.f13285f = new byte[this.f13284e];
            c cVar = new c();
            this.f13296q = cVar;
            cVar.start();
            this.f13292m = f13278v;
            return true;
        } catch (Exception e) {
            this.f13280a = null;
            MDLog.m7395i("AudioPlayer", "Audio Player Initialize error + audioSampleRate = " + this.f13281b);
            tmw tmwVar2 = this.f13300u;
            if (tmwVar2 != null) {
                tmwVar2.onFail(6001, "Audio Player Initialize error !!!" + e.toString());
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: o */
    public void m18731o() {
        MDLog.m7395i("AudioPlayer", "AudioPlayer release !!!");
        this.f13290k = true;
        if (this.f13296q != null) {
            try {
                synchronized (this.f13288i) {
                    this.f13288i.notifyAll();
                }
                this.f13296q.interrupt();
                this.f13296q.join(1000L);
            } catch (Exception e) {
                tmw tmwVar = this.f13300u;
                if (tmwVar != null) {
                    tmwVar.onFail(6003, "Audio Player release failed !!!" + e.toString());
                }
                MDLog.m7391e("AudioPlayer", "Audio Player release failed !!!" + e.toString());
            }
        }
        AudioTrack audioTrack = this.f13280a;
        if (audioTrack != null) {
            audioTrack.release();
        }
        this.f13289j.clear();
    }

    /* JADX INFO: renamed from: p */
    public void m18732p() {
        MDLog.m7395i("AudioPlayer", "AudioPlayer reset !!!");
        synchronized (this.f13288i) {
            try {
                this.f13289j.clear();
                AudioTrack audioTrack = this.f13280a;
                if (audioTrack != null) {
                    audioTrack.flush();
                }
                d dVar = this.f13297r;
                if (dVar != null) {
                    dVar.onAudioPlayingPosition(0L);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public void m18733q() {
        MDLog.m7395i("AudioPlayer", "AudioPlayer resume !!!");
        try {
            AudioTrack audioTrack = this.f13280a;
            if (audioTrack != null) {
                if (this.f13287h) {
                    audioTrack.play();
                    this.f13287h = false;
                }
                this.f13292m = f13278v;
            }
        } catch (Exception e) {
            tmw tmwVar = this.f13300u;
            if (tmwVar != null) {
                tmwVar.onFail(6002, "Audio Player resume failed !!!" + e.toString());
            }
            MDLog.m7391e("AudioPlayer", "AudioPlayer resume failed !!! " + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: r */
    public void m18734r(b bVar) {
        this.f13298s = bVar;
    }

    /* JADX INFO: renamed from: s */
    public void m18735s(d dVar) {
        this.f13297r = dVar;
    }

    /* JADX INFO: renamed from: t */
    public void m18736t(a aVar) {
        this.f13299t = aVar;
    }

    /* JADX INFO: renamed from: u */
    public void m18737u(tmw tmwVar) {
        this.f13300u = tmwVar;
    }

    /* JADX INFO: renamed from: v */
    public void m18738v(long j) {
        this.f13294o = j;
    }

    /* JADX INFO: renamed from: x */
    public void m18739x(u460 u460Var) {
        synchronized (this.f13288i) {
            if (u460Var != null) {
                try {
                    this.f13289j.addLast(u460Var);
                    this.f13288i.notifyAll();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public void m18740y(byte[] bArr, int i) {
        if (this.f13280a == null || bArr == null) {
            return;
        }
        int i2 = 0;
        do {
            int iWrite = this.f13280a.write(bArr, i2, i);
            if (iWrite >= 0) {
                i2 += iWrite;
                i -= iWrite;
            }
            if (iWrite < 0 || i <= 0) {
                return;
            }
        } while (!this.f13287h);
    }

    public C3847d(boolean z) {
        this.f13280a = null;
        this.f13281b = 0;
        this.f13282c = 0;
        this.f13283d = 0;
        this.f13284e = 0;
        this.f13285f = null;
        this.f13286g = 0;
        this.f13287h = false;
        this.f13288i = new Object();
        this.f13289j = new LinkedList<>();
        this.f13290k = false;
        this.f13292m = 0;
        this.f13293n = 3;
        this.f13294o = -1L;
        this.f13300u = null;
        this.f13295p = z;
    }
}
