package com.immomo.moment.mediautils;

import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.cosmos.mdlog.MDLog;
import com.momo.mcamera.util.MDLogTag;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import p153l.lyi0;

/* JADX INFO: renamed from: com.immomo.moment.mediautils.o */
/* JADX INFO: loaded from: classes7.dex */
public class C4001o {

    /* JADX INFO: renamed from: A */
    private long f14256A;

    /* JADX INFO: renamed from: B */
    private long f14257B;

    /* JADX INFO: renamed from: a */
    private AbstractC3999m f14260a;

    /* JADX INFO: renamed from: b */
    private C4000n f14261b;

    /* JADX INFO: renamed from: s */
    private f f14278s;

    /* JADX INFO: renamed from: y */
    private e f14284y;

    /* JADX INFO: renamed from: z */
    private HandlerThread f14285z;

    /* JADX INFO: renamed from: c */
    private int f14262c = 0;

    /* JADX INFO: renamed from: d */
    private int f14263d = 0;

    /* JADX INFO: renamed from: e */
    private Object f14264e = new Object();

    /* JADX INFO: renamed from: f */
    private Object f14265f = new Object();

    /* JADX INFO: renamed from: g */
    private Object f14266g = new Object();

    /* JADX INFO: renamed from: h */
    private volatile boolean f14267h = false;

    /* JADX INFO: renamed from: i */
    private Object f14268i = new Object();

    /* JADX INFO: renamed from: j */
    private boolean f14269j = false;

    /* JADX INFO: renamed from: k */
    private long f14270k = 0;

    /* JADX INFO: renamed from: l */
    private long f14271l = 0;

    /* JADX INFO: renamed from: m */
    private long f14272m = -1;

    /* JADX INFO: renamed from: n */
    private final long f14273n = 23220;

    /* JADX INFO: renamed from: o */
    private long f14274o = 0;

    /* JADX INFO: renamed from: p */
    private long f14275p = 0;

    /* JADX INFO: renamed from: q */
    private long f14276q = -1;

    /* JADX INFO: renamed from: r */
    private d f14277r = null;

    /* JADX INFO: renamed from: t */
    private int f14279t = 0;

    /* JADX INFO: renamed from: u */
    private boolean f14280u = false;

    /* JADX INFO: renamed from: v */
    private boolean f14281v = false;

    /* JADX INFO: renamed from: w */
    private int f14282w = 0;

    /* JADX INFO: renamed from: x */
    private MediaCodec.BufferInfo f14283x = new MediaCodec.BufferInfo();

    /* JADX INFO: renamed from: C */
    private AbstractC3999m.c f14258C = new a();

    /* JADX INFO: renamed from: D */
    private AbstractC3999m.e f14259D = new b();

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.o$a */
    public class a implements AbstractC3999m.c {
        public a() {
        }

        @Override // com.immomo.moment.mediautils.AbstractC3999m.c
        /* JADX INFO: renamed from: a */
        public void mo19920a() {
        }

        @Override // com.immomo.moment.mediautils.AbstractC3999m.c
        /* JADX INFO: renamed from: c */
        public void mo19921c() {
            C4001o.this.m19979x(1);
        }

        @Override // com.immomo.moment.mediautils.AbstractC3999m.c
        /* JADX INFO: renamed from: d */
        public void mo19922d(MediaFormat mediaFormat) {
            if (C4001o.this.f14277r != null) {
                C4001o.this.f14277r.mo19983d(mediaFormat);
            }
        }

        @Override // com.immomo.moment.mediautils.AbstractC3999m.c
        /* JADX INFO: renamed from: e */
        public void mo19923e(ByteBuffer byteBuffer, int i, long j) {
            boolean z;
            if (C4001o.this.f14277r != null) {
                if (C4001o.this.f14272m < 0) {
                    C4001o.this.f14272m = j;
                    z = true;
                } else {
                    z = false;
                }
                long j2 = C4001o.this.f14270k + (j - C4001o.this.f14272m);
                if (C4001o.this.f14271l == j2 && (j2 != 0 || (j2 == 0 && !z))) {
                    C4001o.m19955m(C4001o.this, 23220L);
                    j2 += 23220;
                    MDLog.m7443d("MediaSourceManager", "adjust AudioPtsOffset for same pts:" + C4001o.this.f14271l + " AudioPtsOffset:" + C4001o.this.f14270k);
                }
                C4001o.this.f14277r.mo19986g(byteBuffer, i, j2);
                C4001o.this.f14271l = j2;
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.o$b */
    public class b implements AbstractC3999m.e {
        public b() {
        }

        @Override // com.immomo.moment.mediautils.AbstractC3999m.e
        /* JADX INFO: renamed from: a */
        public void mo19924a() {
        }

        @Override // com.immomo.moment.mediautils.AbstractC3999m.e
        /* JADX INFO: renamed from: b */
        public void mo19925b(ByteBuffer byteBuffer) {
            if (C4001o.this.f14277r != null) {
                C4001o.this.f14277r.mo19981b(byteBuffer);
            }
        }

        @Override // com.immomo.moment.mediautils.AbstractC3999m.e
        /* JADX INFO: renamed from: c */
        public void mo19926c() {
        }

        @Override // com.immomo.moment.mediautils.AbstractC3999m.e
        /* JADX INFO: renamed from: d */
        public void mo19927d(MediaFormat mediaFormat) {
            if (C4001o.this.f14277r != null) {
                C4001o.this.f14277r.mo19987h(mediaFormat);
            }
        }

        @Override // com.immomo.moment.mediautils.AbstractC3999m.e
        /* JADX INFO: renamed from: e */
        public void mo19928e(MediaCodec.BufferInfo bufferInfo) {
            if (C4001o.this.f14277r != null) {
                C4001o c4001o = C4001o.this;
                if (bufferInfo == null) {
                    c4001o.f14277r.mo19982c(-1L);
                    return;
                }
                if (c4001o.f14276q < 0) {
                    C4001o.this.f14276q = bufferInfo.presentationTimeUs;
                }
                long j = C4001o.this.f14274o + (bufferInfo.presentationTimeUs - C4001o.this.f14276q);
                C4001o.this.f14277r.mo19982c(j);
                C4001o.this.f14275p = j;
            }
        }

        @Override // com.immomo.moment.mediautils.AbstractC3999m.e
        /* JADX INFO: renamed from: f */
        public void mo19929f(SurfaceTexture surfaceTexture) {
            if (C4001o.this.f14277r != null) {
                C4001o.this.f14277r.mo19988i(surfaceTexture);
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.o$c */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C4001o.this.f14277r != null) {
                C4001o.this.f14277r.onFinished();
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.o$d */
    public interface d {
        /* JADX INFO: renamed from: a */
        void mo19980a();

        /* JADX INFO: renamed from: b */
        void mo19981b(ByteBuffer byteBuffer);

        /* JADX INFO: renamed from: c */
        void mo19982c(long j);

        /* JADX INFO: renamed from: d */
        void mo19983d(MediaFormat mediaFormat);

        /* JADX INFO: renamed from: e */
        void mo19984e(int i);

        /* JADX INFO: renamed from: f */
        void mo19985f();

        /* JADX INFO: renamed from: g */
        void mo19986g(ByteBuffer byteBuffer, int i, long j);

        /* JADX INFO: renamed from: h */
        void mo19987h(MediaFormat mediaFormat);

        /* JADX INFO: renamed from: i */
        void mo19988i(SurfaceTexture surfaceTexture);

        void onFinished();
    }

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.o$e */
    public class e extends Handler {
        public e(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    MDLog.m7449i(MDLogTag.MOMENT_EDIT_TAG, "MediaSourceManager changeSource");
                    C4001o.this.m19965y();
                    return;
                case 2:
                    C4001o.this.m19938D(((Boolean) message.obj).booleanValue());
                    MDLog.m7449i(MDLogTag.MOMENT_EDIT_TAG, "MediaSourceManager pauseWorking");
                    C4001o.this.f14267h = true;
                    return;
                case 3:
                    MDLog.m7449i(MDLogTag.MOMENT_EDIT_TAG, "MediaSourceManager resumeWorking");
                    C4001o.this.m19941I();
                    return;
                case 4:
                    MDLog.m7449i(MDLogTag.MOMENT_EDIT_TAG, "MediaSourceManager seekWorking");
                    C4001o c4001o = C4001o.this;
                    c4001o.m19942K(c4001o.f14256A);
                    C4001o.this.f14256A = 0L;
                    return;
                case 5:
                    C4001o.this.m19940H();
                    MDLog.m7449i(MDLogTag.MOMENT_EDIT_TAG, "MediaSourceManager resetWorking");
                    synchronized (C4001o.this.f14268i) {
                        C4001o.this.f14269j = true;
                        C4001o.this.f14268i.notifyAll();
                        break;
                    }
                    return;
                case 6:
                    C4001o.this.m19939G(((Boolean) message.obj).booleanValue());
                    return;
                default:
                    return;
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.o$f */
    public interface f {
        /* JADX INFO: renamed from: a */
        void mo19989a();

        /* JADX INFO: renamed from: b */
        void mo19990b();
    }

    /* JADX INFO: renamed from: A */
    private boolean m19937A(long j) {
        synchronized (this.f14264e) {
            long j2 = 0;
            try {
                if (j == 0) {
                    return m19966z();
                }
                C4000n c4000n = this.f14261b;
                if (c4000n == null) {
                    return false;
                }
                this.f14279t = 0;
                this.f14271l = 0L;
                this.f14275p = 0L;
                this.f14270k = 0L;
                this.f14274o = 0L;
                this.f14263d = 0;
                this.f14272m = -1L;
                this.f14276q = -1L;
                List<C4000n.a> listM19934e = c4000n.m19934e();
                if (listM19934e != null) {
                    int size = listM19934e.size();
                    long j3 = j;
                    for (C4000n.a aVar : listM19934e) {
                        long j4 = aVar.f14252b;
                        long j5 = j2;
                        j3 -= j4 - aVar.f14251a;
                        if (j3 <= j5) {
                            AbstractC3999m abstractC3999m = this.f14261b.m19935f().get(aVar.f14253c);
                            this.f14260a = abstractC3999m;
                            abstractC3999m.mo19774t(aVar.f14251a, aVar.f14252b, aVar.f14254d.booleanValue());
                            break;
                        }
                        if (size == 1 && j4 == -1) {
                            AbstractC3999m abstractC3999m2 = this.f14261b.m19935f().get(aVar.f14253c);
                            this.f14260a = abstractC3999m2;
                            abstractC3999m2.mo19774t(aVar.f14251a, aVar.f14252b, aVar.f14254d.booleanValue());
                            break;
                        }
                        this.f14279t++;
                        j2 = j5;
                    }
                }
                int iM19911l = this.f14260a.m19911l();
                this.f14262c = iM19911l;
                if ((iM19911l & 1) != 0) {
                    this.f14260a.m19914u(this.f14258C);
                    if (this.f14260a.m19904e() != null) {
                        this.f14258C.mo19922d(this.f14260a.m19904e());
                    }
                }
                if ((this.f14262c & 16) != 0) {
                    this.f14260a.m19919z(this.f14259D);
                    if (this.f14260a.m19912m() != null) {
                        this.f14259D.mo19927d(this.f14260a.m19912m());
                    }
                }
                d dVar = this.f14277r;
                if (dVar != null) {
                    dVar.mo19984e(this.f14260a.m19909j());
                }
                this.f14260a.mo19767C(j);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public void m19938D(boolean z) {
        synchronized (this.f14264e) {
            try {
                AbstractC3999m abstractC3999m = this.f14260a;
                if (abstractC3999m != null) {
                    abstractC3999m.mo19769o();
                    f fVar = this.f14278s;
                    if (fVar != null && z) {
                        fVar.mo19989a();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public void m19939G(boolean z) {
        AbstractC3999m abstractC3999m = this.f14260a;
        if (abstractC3999m != null) {
            abstractC3999m.mo19772r(Boolean.valueOf(z));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public void m19940H() {
        synchronized (this.f14264e) {
            this.f14279t = 0;
            this.f14271l = 0L;
            this.f14275p = 0L;
            this.f14270k = 0L;
            this.f14274o = 0L;
            this.f14263d = 0;
            this.f14272m = -1L;
            this.f14276q = -1L;
            m19937A(this.f14257B);
            this.f14257B = 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public void m19941I() {
        AbstractC3999m abstractC3999m = this.f14260a;
        if (abstractC3999m != null) {
            abstractC3999m.mo19773s();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public void m19942K(long j) {
        long j2;
        synchronized (this.f14264e) {
            try {
                if (this.f14261b == null) {
                    return;
                }
                if (j >= 0) {
                    AbstractC3999m abstractC3999m = this.f14260a;
                    if (abstractC3999m != null) {
                        abstractC3999m.mo19769o();
                        this.f14260a.m19914u(null);
                        this.f14260a.m19919z(null);
                    }
                    this.f14279t = 0;
                    this.f14271l = 0L;
                    this.f14275p = 0L;
                    this.f14270k = 0L;
                    this.f14274o = 0L;
                    this.f14263d = 0;
                    this.f14272m = -1L;
                    this.f14276q = -1L;
                    List<C4000n.a> listM19934e = this.f14261b.m19934e();
                    if (listM19934e != null) {
                        int size = listM19934e.size();
                        Iterator<C4000n.a> it = listM19934e.iterator();
                        long j3 = j;
                        while (true) {
                            if (!it.hasNext()) {
                                j2 = j3;
                                break;
                            }
                            C4000n.a next = it.next();
                            long j4 = next.f14252b;
                            long j5 = next.f14251a;
                            long j6 = j4 - j5;
                            j3 -= j6;
                            if (j3 > 0) {
                                if (size == 1 && j4 == -1) {
                                    j2 = j3 + j5;
                                    AbstractC3999m abstractC3999m2 = this.f14261b.m19935f().get(next.f14253c);
                                    this.f14260a = abstractC3999m2;
                                    abstractC3999m2.mo19774t(next.f14251a, next.f14252b, next.f14254d.booleanValue());
                                    break;
                                }
                                this.f14279t++;
                            } else {
                                j2 = j3 + j6 + j5;
                                AbstractC3999m abstractC3999m3 = this.f14261b.m19935f().get(next.f14253c);
                                this.f14260a = abstractC3999m3;
                                abstractC3999m3.mo19774t(next.f14251a, next.f14252b, next.f14254d.booleanValue());
                                break;
                            }
                        }
                    } else {
                        j2 = j;
                    }
                    int iM19911l = this.f14260a.m19911l();
                    this.f14262c = iM19911l;
                    if ((iM19911l & 1) != 0) {
                        this.f14260a.m19914u(this.f14258C);
                        if (this.f14260a.m19904e() != null) {
                            this.f14258C.mo19922d(this.f14260a.m19904e());
                        }
                    }
                    if ((this.f14262c & 16) != 0) {
                        this.f14260a.m19919z(this.f14259D);
                        if (this.f14260a.m19912m() != null) {
                            this.f14259D.mo19927d(this.f14260a.m19912m());
                        }
                    }
                    d dVar = this.f14277r;
                    if (dVar != null) {
                        dVar.mo19984e(this.f14260a.m19909j());
                    }
                    this.f14260a.mo19767C(j2);
                }
                f fVar = this.f14278s;
                if (fVar != null) {
                    fVar.mo19990b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ long m19955m(C4001o c4001o, long j) {
        long j2 = c4001o.f14270k + j;
        c4001o.f14270k = j2;
        return j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public void m19965y() {
        this.f14279t++;
        this.f14263d = 0;
        this.f14272m = -1L;
        this.f14276q = -1L;
        if (m19966z()) {
            return;
        }
        lyi0.m156289d(2, new c());
    }

    /* JADX INFO: renamed from: z */
    private boolean m19966z() {
        synchronized (this.f14264e) {
            try {
                MDLog.m7449i(MDLogTag.MOMENT_EDIT_TAG, " MediaSourceManager initSource Start");
                C4000n c4000n = this.f14261b;
                if (c4000n == null) {
                    return false;
                }
                this.f14263d = 0;
                c4000n.m19934e().size();
                if (this.f14279t >= this.f14261b.m19934e().size()) {
                    if (this.f14280u) {
                        d dVar = this.f14277r;
                        if (dVar != null) {
                            dVar.mo19980a();
                        }
                        e eVar = this.f14284y;
                        if (eVar != null) {
                            eVar.sendMessage(eVar.obtainMessage(5));
                        }
                        return true;
                    }
                    if (this.f14281v) {
                        this.f14279t = 0;
                        d dVar2 = this.f14277r;
                        if (dVar2 != null) {
                            dVar2.mo19985f();
                        }
                        return true;
                    }
                    int i = this.f14282w;
                    AbstractC3999m abstractC3999m = this.f14260a;
                    if (i == 1) {
                        if (abstractC3999m != null) {
                            abstractC3999m.m19917x(true);
                        }
                        return false;
                    }
                    if (abstractC3999m != null) {
                        abstractC3999m.mo19769o();
                    }
                    d dVar3 = this.f14277r;
                    if (dVar3 != null) {
                        dVar3.onFinished();
                    }
                    return true;
                }
                AbstractC3999m abstractC3999m2 = this.f14260a;
                if (abstractC3999m2 != null) {
                    abstractC3999m2.mo19769o();
                    this.f14260a.m19914u(null);
                    this.f14260a.m19919z(null);
                }
                C4000n.a aVar = this.f14261b.m19934e().get(this.f14279t);
                AbstractC3999m abstractC3999m3 = this.f14261b.m19935f().get(aVar.f14253c);
                this.f14260a = abstractC3999m3;
                abstractC3999m3.mo19774t(aVar.f14251a, aVar.f14252b, aVar.f14254d.booleanValue());
                int iM19911l = this.f14260a.m19911l();
                this.f14262c = iM19911l;
                if ((iM19911l & 1) != 0) {
                    this.f14260a.m19914u(this.f14258C);
                    if (this.f14260a.m19904e() != null) {
                        this.f14258C.mo19922d(this.f14260a.m19904e());
                    }
                }
                if ((this.f14262c & 16) != 0) {
                    this.f14260a.m19919z(this.f14259D);
                    if (this.f14260a.m19912m() != null) {
                        this.f14259D.mo19927d(this.f14260a.m19912m());
                    }
                }
                d dVar4 = this.f14277r;
                if (dVar4 != null) {
                    dVar4.mo19984e(this.f14260a.m19909j());
                }
                if (this.f14279t != 0) {
                    this.f14270k = this.f14271l;
                    this.f14274o = this.f14275p;
                } else {
                    this.f14270k = 0L;
                    this.f14274o = 0L;
                    this.f14271l = 0L;
                    this.f14275p = 0L;
                }
                this.f14260a.mo19766B();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public void m19967B() {
        m19968C(false);
    }

    /* JADX INFO: renamed from: C */
    public void m19968C(boolean z) {
        if (this.f14284y != null) {
            this.f14267h = false;
            e eVar = this.f14284y;
            eVar.sendMessage(eVar.obtainMessage(2, Boolean.valueOf(z)));
        }
        synchronized (this.f14266g) {
            while (!this.f14267h) {
                try {
                    this.f14266g.wait(5L);
                } catch (InterruptedException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public void m19969E(boolean z) {
        e eVar = this.f14284y;
        if (eVar != null) {
            eVar.sendMessage(eVar.obtainMessage(6, Boolean.valueOf(z)));
        }
    }

    /* JADX INFO: renamed from: F */
    public void m19970F() {
        MDLog.m7449i(MDLogTag.MOMENT_EDIT_TAG, "SourceManager released !!!");
        this.f14267h = true;
        this.f14269j = true;
        HandlerThread handlerThread = this.f14285z;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f14284y = null;
            this.f14285z = null;
        }
        synchronized (this.f14264e) {
            try {
                C4000n c4000n = this.f14261b;
                if (c4000n != null) {
                    c4000n.m19936g();
                    this.f14261b = null;
                }
                this.f14260a = null;
                this.f14277r = null;
                this.f14263d = 0;
                this.f14262c = 0;
                this.f14270k = 0L;
                this.f14271l = 0L;
                this.f14272m = -1L;
                this.f14274o = 0L;
                this.f14275p = 0L;
                this.f14276q = -1L;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public boolean m19971J(long j) {
        this.f14256A = j;
        e eVar = this.f14284y;
        if (eVar == null) {
            return true;
        }
        eVar.sendMessage(eVar.obtainMessage(4));
        return true;
    }

    /* JADX INFO: renamed from: L */
    public void m19972L(d dVar) {
        this.f14277r = dVar;
    }

    /* JADX INFO: renamed from: M */
    public void m19973M(int i) {
        if (i < 0 || i > 1) {
            return;
        }
        this.f14282w = i;
    }

    /* JADX INFO: renamed from: N */
    public void m19974N(boolean z) {
        this.f14281v = z;
    }

    /* JADX INFO: renamed from: O */
    public void m19975O(boolean z) {
        this.f14280u = z;
    }

    /* JADX INFO: renamed from: P */
    public void m19976P(f fVar) {
        this.f14278s = fVar;
    }

    /* JADX INFO: renamed from: Q */
    public boolean m19977Q() {
        if (this.f14284y == null || this.f14285z == null) {
            HandlerThread handlerThread = new HandlerThread("MediasourceManager");
            this.f14285z = handlerThread;
            handlerThread.start();
            this.f14284y = new e(this.f14285z.getLooper());
        }
        return m19966z();
    }

    /* JADX INFO: renamed from: w */
    public void m19978w(C4000n c4000n) {
        synchronized (this.f14264e) {
            this.f14261b = c4000n;
        }
    }

    /* JADX INFO: renamed from: x */
    public void m19979x(int i) {
        e eVar;
        synchronized (this.f14265f) {
            try {
                int i2 = i | this.f14263d;
                this.f14263d = i2;
                if (i2 == this.f14262c && (eVar = this.f14284y) != null) {
                    eVar.sendMessage(eVar.obtainMessage(1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
