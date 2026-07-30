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
import p149l.jpi0;

/* JADX INFO: renamed from: com.immomo.moment.mediautils.o */
/* JADX INFO: loaded from: classes7.dex */
public class C3858o {

    /* JADX INFO: renamed from: A */
    private long f13562A;

    /* JADX INFO: renamed from: B */
    private long f13563B;

    /* JADX INFO: renamed from: a */
    private AbstractC3856m f13566a;

    /* JADX INFO: renamed from: b */
    private C3857n f13567b;

    /* JADX INFO: renamed from: s */
    private f f13584s;

    /* JADX INFO: renamed from: y */
    private e f13590y;

    /* JADX INFO: renamed from: z */
    private HandlerThread f13591z;

    /* JADX INFO: renamed from: c */
    private int f13568c = 0;

    /* JADX INFO: renamed from: d */
    private int f13569d = 0;

    /* JADX INFO: renamed from: e */
    private Object f13570e = new Object();

    /* JADX INFO: renamed from: f */
    private Object f13571f = new Object();

    /* JADX INFO: renamed from: g */
    private Object f13572g = new Object();

    /* JADX INFO: renamed from: h */
    private volatile boolean f13573h = false;

    /* JADX INFO: renamed from: i */
    private Object f13574i = new Object();

    /* JADX INFO: renamed from: j */
    private boolean f13575j = false;

    /* JADX INFO: renamed from: k */
    private long f13576k = 0;

    /* JADX INFO: renamed from: l */
    private long f13577l = 0;

    /* JADX INFO: renamed from: m */
    private long f13578m = -1;

    /* JADX INFO: renamed from: n */
    private final long f13579n = 23220;

    /* JADX INFO: renamed from: o */
    private long f13580o = 0;

    /* JADX INFO: renamed from: p */
    private long f13581p = 0;

    /* JADX INFO: renamed from: q */
    private long f13582q = -1;

    /* JADX INFO: renamed from: r */
    private d f13583r = null;

    /* JADX INFO: renamed from: t */
    private int f13585t = 0;

    /* JADX INFO: renamed from: u */
    private boolean f13586u = false;

    /* JADX INFO: renamed from: v */
    private boolean f13587v = false;

    /* JADX INFO: renamed from: w */
    private int f13588w = 0;

    /* JADX INFO: renamed from: x */
    private MediaCodec.BufferInfo f13589x = new MediaCodec.BufferInfo();

    /* JADX INFO: renamed from: C */
    private AbstractC3856m.c f13564C = new a();

    /* JADX INFO: renamed from: D */
    private AbstractC3856m.e f13565D = new b();

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.o$a */
    public class a implements AbstractC3856m.c {
        public a() {
        }

        @Override // com.immomo.moment.mediautils.AbstractC3856m.c
        /* JADX INFO: renamed from: a */
        public void mo18940a() {
        }

        @Override // com.immomo.moment.mediautils.AbstractC3856m.c
        /* JADX INFO: renamed from: c */
        public void mo18941c() {
            C3858o.this.m18999x(1);
        }

        @Override // com.immomo.moment.mediautils.AbstractC3856m.c
        /* JADX INFO: renamed from: d */
        public void mo18942d(MediaFormat mediaFormat) {
            if (C3858o.this.f13583r != null) {
                C3858o.this.f13583r.mo19003d(mediaFormat);
            }
        }

        @Override // com.immomo.moment.mediautils.AbstractC3856m.c
        /* JADX INFO: renamed from: e */
        public void mo18943e(ByteBuffer byteBuffer, int i, long j) {
            boolean z;
            if (C3858o.this.f13583r != null) {
                if (C3858o.this.f13578m < 0) {
                    C3858o.this.f13578m = j;
                    z = true;
                } else {
                    z = false;
                }
                long j2 = C3858o.this.f13576k + (j - C3858o.this.f13578m);
                if (C3858o.this.f13577l == j2 && (j2 != 0 || (j2 == 0 && !z))) {
                    C3858o.m18975m(C3858o.this, 23220L);
                    j2 += 23220;
                    MDLog.m7389d("MediaSourceManager", "adjust AudioPtsOffset for same pts:" + C3858o.this.f13577l + " AudioPtsOffset:" + C3858o.this.f13576k);
                }
                C3858o.this.f13583r.mo19006g(byteBuffer, i, j2);
                C3858o.this.f13577l = j2;
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.o$b */
    public class b implements AbstractC3856m.e {
        public b() {
        }

        @Override // com.immomo.moment.mediautils.AbstractC3856m.e
        /* JADX INFO: renamed from: a */
        public void mo18944a() {
        }

        @Override // com.immomo.moment.mediautils.AbstractC3856m.e
        /* JADX INFO: renamed from: b */
        public void mo18945b(ByteBuffer byteBuffer) {
            if (C3858o.this.f13583r != null) {
                C3858o.this.f13583r.mo19001b(byteBuffer);
            }
        }

        @Override // com.immomo.moment.mediautils.AbstractC3856m.e
        /* JADX INFO: renamed from: c */
        public void mo18946c() {
        }

        @Override // com.immomo.moment.mediautils.AbstractC3856m.e
        /* JADX INFO: renamed from: d */
        public void mo18947d(MediaFormat mediaFormat) {
            if (C3858o.this.f13583r != null) {
                C3858o.this.f13583r.mo19007h(mediaFormat);
            }
        }

        @Override // com.immomo.moment.mediautils.AbstractC3856m.e
        /* JADX INFO: renamed from: e */
        public void mo18948e(MediaCodec.BufferInfo bufferInfo) {
            if (C3858o.this.f13583r != null) {
                C3858o c3858o = C3858o.this;
                if (bufferInfo == null) {
                    c3858o.f13583r.mo19002c(-1L);
                    return;
                }
                if (c3858o.f13582q < 0) {
                    C3858o.this.f13582q = bufferInfo.presentationTimeUs;
                }
                long j = C3858o.this.f13580o + (bufferInfo.presentationTimeUs - C3858o.this.f13582q);
                C3858o.this.f13583r.mo19002c(j);
                C3858o.this.f13581p = j;
            }
        }

        @Override // com.immomo.moment.mediautils.AbstractC3856m.e
        /* JADX INFO: renamed from: f */
        public void mo18949f(SurfaceTexture surfaceTexture) {
            if (C3858o.this.f13583r != null) {
                C3858o.this.f13583r.mo19008i(surfaceTexture);
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.o$c */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C3858o.this.f13583r != null) {
                C3858o.this.f13583r.onFinished();
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.o$d */
    public interface d {
        /* JADX INFO: renamed from: a */
        void mo19000a();

        /* JADX INFO: renamed from: b */
        void mo19001b(ByteBuffer byteBuffer);

        /* JADX INFO: renamed from: c */
        void mo19002c(long j);

        /* JADX INFO: renamed from: d */
        void mo19003d(MediaFormat mediaFormat);

        /* JADX INFO: renamed from: e */
        void mo19004e(int i);

        /* JADX INFO: renamed from: f */
        void mo19005f();

        /* JADX INFO: renamed from: g */
        void mo19006g(ByteBuffer byteBuffer, int i, long j);

        /* JADX INFO: renamed from: h */
        void mo19007h(MediaFormat mediaFormat);

        /* JADX INFO: renamed from: i */
        void mo19008i(SurfaceTexture surfaceTexture);

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
                    MDLog.m7395i(MDLogTag.MOMENT_EDIT_TAG, "MediaSourceManager changeSource");
                    C3858o.this.m18985y();
                    return;
                case 2:
                    C3858o.this.m18958D(((Boolean) message.obj).booleanValue());
                    MDLog.m7395i(MDLogTag.MOMENT_EDIT_TAG, "MediaSourceManager pauseWorking");
                    C3858o.this.f13573h = true;
                    return;
                case 3:
                    MDLog.m7395i(MDLogTag.MOMENT_EDIT_TAG, "MediaSourceManager resumeWorking");
                    C3858o.this.m18961I();
                    return;
                case 4:
                    MDLog.m7395i(MDLogTag.MOMENT_EDIT_TAG, "MediaSourceManager seekWorking");
                    C3858o c3858o = C3858o.this;
                    c3858o.m18962K(c3858o.f13562A);
                    C3858o.this.f13562A = 0L;
                    return;
                case 5:
                    C3858o.this.m18960H();
                    MDLog.m7395i(MDLogTag.MOMENT_EDIT_TAG, "MediaSourceManager resetWorking");
                    synchronized (C3858o.this.f13574i) {
                        C3858o.this.f13575j = true;
                        C3858o.this.f13574i.notifyAll();
                        break;
                    }
                    return;
                case 6:
                    C3858o.this.m18959G(((Boolean) message.obj).booleanValue());
                    return;
                default:
                    return;
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.o$f */
    public interface f {
        /* JADX INFO: renamed from: a */
        void mo19009a();

        /* JADX INFO: renamed from: b */
        void mo19010b();
    }

    /* JADX INFO: renamed from: A */
    private boolean m18957A(long j) {
        synchronized (this.f13570e) {
            long j2 = 0;
            try {
                if (j == 0) {
                    return m18986z();
                }
                C3857n c3857n = this.f13567b;
                if (c3857n == null) {
                    return false;
                }
                this.f13585t = 0;
                this.f13577l = 0L;
                this.f13581p = 0L;
                this.f13576k = 0L;
                this.f13580o = 0L;
                this.f13569d = 0;
                this.f13578m = -1L;
                this.f13582q = -1L;
                List<C3857n.a> listM18954e = c3857n.m18954e();
                if (listM18954e != null) {
                    int size = listM18954e.size();
                    long j3 = j;
                    for (C3857n.a aVar : listM18954e) {
                        long j4 = aVar.f13558b;
                        long j5 = j2;
                        j3 -= j4 - aVar.f13557a;
                        if (j3 <= j5) {
                            AbstractC3856m abstractC3856m = this.f13567b.m18955f().get(aVar.f13559c);
                            this.f13566a = abstractC3856m;
                            abstractC3856m.mo18794t(aVar.f13557a, aVar.f13558b, aVar.f13560d.booleanValue());
                            break;
                        }
                        if (size == 1 && j4 == -1) {
                            AbstractC3856m abstractC3856m2 = this.f13567b.m18955f().get(aVar.f13559c);
                            this.f13566a = abstractC3856m2;
                            abstractC3856m2.mo18794t(aVar.f13557a, aVar.f13558b, aVar.f13560d.booleanValue());
                            break;
                        }
                        this.f13585t++;
                        j2 = j5;
                    }
                }
                int iM18931l = this.f13566a.m18931l();
                this.f13568c = iM18931l;
                if ((iM18931l & 1) != 0) {
                    this.f13566a.m18934u(this.f13564C);
                    if (this.f13566a.m18924e() != null) {
                        this.f13564C.mo18942d(this.f13566a.m18924e());
                    }
                }
                if ((this.f13568c & 16) != 0) {
                    this.f13566a.m18939z(this.f13565D);
                    if (this.f13566a.m18932m() != null) {
                        this.f13565D.mo18947d(this.f13566a.m18932m());
                    }
                }
                d dVar = this.f13583r;
                if (dVar != null) {
                    dVar.mo19004e(this.f13566a.m18929j());
                }
                this.f13566a.mo18787C(j);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public void m18958D(boolean z) {
        synchronized (this.f13570e) {
            try {
                AbstractC3856m abstractC3856m = this.f13566a;
                if (abstractC3856m != null) {
                    abstractC3856m.mo18789o();
                    f fVar = this.f13584s;
                    if (fVar != null && z) {
                        fVar.mo19009a();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public void m18959G(boolean z) {
        AbstractC3856m abstractC3856m = this.f13566a;
        if (abstractC3856m != null) {
            abstractC3856m.mo18792r(Boolean.valueOf(z));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public void m18960H() {
        synchronized (this.f13570e) {
            this.f13585t = 0;
            this.f13577l = 0L;
            this.f13581p = 0L;
            this.f13576k = 0L;
            this.f13580o = 0L;
            this.f13569d = 0;
            this.f13578m = -1L;
            this.f13582q = -1L;
            m18957A(this.f13563B);
            this.f13563B = 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public void m18961I() {
        AbstractC3856m abstractC3856m = this.f13566a;
        if (abstractC3856m != null) {
            abstractC3856m.mo18793s();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public void m18962K(long j) {
        long j2;
        synchronized (this.f13570e) {
            try {
                if (this.f13567b == null) {
                    return;
                }
                if (j >= 0) {
                    AbstractC3856m abstractC3856m = this.f13566a;
                    if (abstractC3856m != null) {
                        abstractC3856m.mo18789o();
                        this.f13566a.m18934u(null);
                        this.f13566a.m18939z(null);
                    }
                    this.f13585t = 0;
                    this.f13577l = 0L;
                    this.f13581p = 0L;
                    this.f13576k = 0L;
                    this.f13580o = 0L;
                    this.f13569d = 0;
                    this.f13578m = -1L;
                    this.f13582q = -1L;
                    List<C3857n.a> listM18954e = this.f13567b.m18954e();
                    if (listM18954e != null) {
                        int size = listM18954e.size();
                        Iterator<C3857n.a> it = listM18954e.iterator();
                        long j3 = j;
                        while (true) {
                            if (!it.hasNext()) {
                                j2 = j3;
                                break;
                            }
                            C3857n.a next = it.next();
                            long j4 = next.f13558b;
                            long j5 = next.f13557a;
                            long j6 = j4 - j5;
                            j3 -= j6;
                            if (j3 > 0) {
                                if (size == 1 && j4 == -1) {
                                    j2 = j3 + j5;
                                    AbstractC3856m abstractC3856m2 = this.f13567b.m18955f().get(next.f13559c);
                                    this.f13566a = abstractC3856m2;
                                    abstractC3856m2.mo18794t(next.f13557a, next.f13558b, next.f13560d.booleanValue());
                                    break;
                                }
                                this.f13585t++;
                            } else {
                                j2 = j3 + j6 + j5;
                                AbstractC3856m abstractC3856m3 = this.f13567b.m18955f().get(next.f13559c);
                                this.f13566a = abstractC3856m3;
                                abstractC3856m3.mo18794t(next.f13557a, next.f13558b, next.f13560d.booleanValue());
                                break;
                            }
                        }
                    } else {
                        j2 = j;
                    }
                    int iM18931l = this.f13566a.m18931l();
                    this.f13568c = iM18931l;
                    if ((iM18931l & 1) != 0) {
                        this.f13566a.m18934u(this.f13564C);
                        if (this.f13566a.m18924e() != null) {
                            this.f13564C.mo18942d(this.f13566a.m18924e());
                        }
                    }
                    if ((this.f13568c & 16) != 0) {
                        this.f13566a.m18939z(this.f13565D);
                        if (this.f13566a.m18932m() != null) {
                            this.f13565D.mo18947d(this.f13566a.m18932m());
                        }
                    }
                    d dVar = this.f13583r;
                    if (dVar != null) {
                        dVar.mo19004e(this.f13566a.m18929j());
                    }
                    this.f13566a.mo18787C(j2);
                }
                f fVar = this.f13584s;
                if (fVar != null) {
                    fVar.mo19010b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ long m18975m(C3858o c3858o, long j) {
        long j2 = c3858o.f13576k + j;
        c3858o.f13576k = j2;
        return j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public void m18985y() {
        this.f13585t++;
        this.f13569d = 0;
        this.f13578m = -1L;
        this.f13582q = -1L;
        if (m18986z()) {
            return;
        }
        jpi0.m142740d(2, new c());
    }

    /* JADX INFO: renamed from: z */
    private boolean m18986z() {
        synchronized (this.f13570e) {
            try {
                MDLog.m7395i(MDLogTag.MOMENT_EDIT_TAG, " MediaSourceManager initSource Start");
                C3857n c3857n = this.f13567b;
                if (c3857n == null) {
                    return false;
                }
                this.f13569d = 0;
                c3857n.m18954e().size();
                if (this.f13585t >= this.f13567b.m18954e().size()) {
                    if (this.f13586u) {
                        d dVar = this.f13583r;
                        if (dVar != null) {
                            dVar.mo19000a();
                        }
                        e eVar = this.f13590y;
                        if (eVar != null) {
                            eVar.sendMessage(eVar.obtainMessage(5));
                        }
                        return true;
                    }
                    if (this.f13587v) {
                        this.f13585t = 0;
                        d dVar2 = this.f13583r;
                        if (dVar2 != null) {
                            dVar2.mo19005f();
                        }
                        return true;
                    }
                    int i = this.f13588w;
                    AbstractC3856m abstractC3856m = this.f13566a;
                    if (i == 1) {
                        if (abstractC3856m != null) {
                            abstractC3856m.m18937x(true);
                        }
                        return false;
                    }
                    if (abstractC3856m != null) {
                        abstractC3856m.mo18789o();
                    }
                    d dVar3 = this.f13583r;
                    if (dVar3 != null) {
                        dVar3.onFinished();
                    }
                    return true;
                }
                AbstractC3856m abstractC3856m2 = this.f13566a;
                if (abstractC3856m2 != null) {
                    abstractC3856m2.mo18789o();
                    this.f13566a.m18934u(null);
                    this.f13566a.m18939z(null);
                }
                C3857n.a aVar = this.f13567b.m18954e().get(this.f13585t);
                AbstractC3856m abstractC3856m3 = this.f13567b.m18955f().get(aVar.f13559c);
                this.f13566a = abstractC3856m3;
                abstractC3856m3.mo18794t(aVar.f13557a, aVar.f13558b, aVar.f13560d.booleanValue());
                int iM18931l = this.f13566a.m18931l();
                this.f13568c = iM18931l;
                if ((iM18931l & 1) != 0) {
                    this.f13566a.m18934u(this.f13564C);
                    if (this.f13566a.m18924e() != null) {
                        this.f13564C.mo18942d(this.f13566a.m18924e());
                    }
                }
                if ((this.f13568c & 16) != 0) {
                    this.f13566a.m18939z(this.f13565D);
                    if (this.f13566a.m18932m() != null) {
                        this.f13565D.mo18947d(this.f13566a.m18932m());
                    }
                }
                d dVar4 = this.f13583r;
                if (dVar4 != null) {
                    dVar4.mo19004e(this.f13566a.m18929j());
                }
                if (this.f13585t != 0) {
                    this.f13576k = this.f13577l;
                    this.f13580o = this.f13581p;
                } else {
                    this.f13576k = 0L;
                    this.f13580o = 0L;
                    this.f13577l = 0L;
                    this.f13581p = 0L;
                }
                this.f13566a.mo18786B();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public void m18987B() {
        m18988C(false);
    }

    /* JADX INFO: renamed from: C */
    public void m18988C(boolean z) {
        if (this.f13590y != null) {
            this.f13573h = false;
            e eVar = this.f13590y;
            eVar.sendMessage(eVar.obtainMessage(2, Boolean.valueOf(z)));
        }
        synchronized (this.f13572g) {
            while (!this.f13573h) {
                try {
                    this.f13572g.wait(5L);
                } catch (InterruptedException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public void m18989E(boolean z) {
        e eVar = this.f13590y;
        if (eVar != null) {
            eVar.sendMessage(eVar.obtainMessage(6, Boolean.valueOf(z)));
        }
    }

    /* JADX INFO: renamed from: F */
    public void m18990F() {
        MDLog.m7395i(MDLogTag.MOMENT_EDIT_TAG, "SourceManager released !!!");
        this.f13573h = true;
        this.f13575j = true;
        HandlerThread handlerThread = this.f13591z;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f13590y = null;
            this.f13591z = null;
        }
        synchronized (this.f13570e) {
            try {
                C3857n c3857n = this.f13567b;
                if (c3857n != null) {
                    c3857n.m18956g();
                    this.f13567b = null;
                }
                this.f13566a = null;
                this.f13583r = null;
                this.f13569d = 0;
                this.f13568c = 0;
                this.f13576k = 0L;
                this.f13577l = 0L;
                this.f13578m = -1L;
                this.f13580o = 0L;
                this.f13581p = 0L;
                this.f13582q = -1L;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public boolean m18991J(long j) {
        this.f13562A = j;
        e eVar = this.f13590y;
        if (eVar == null) {
            return true;
        }
        eVar.sendMessage(eVar.obtainMessage(4));
        return true;
    }

    /* JADX INFO: renamed from: L */
    public void m18992L(d dVar) {
        this.f13583r = dVar;
    }

    /* JADX INFO: renamed from: M */
    public void m18993M(int i) {
        if (i < 0 || i > 1) {
            return;
        }
        this.f13588w = i;
    }

    /* JADX INFO: renamed from: N */
    public void m18994N(boolean z) {
        this.f13587v = z;
    }

    /* JADX INFO: renamed from: O */
    public void m18995O(boolean z) {
        this.f13586u = z;
    }

    /* JADX INFO: renamed from: P */
    public void m18996P(f fVar) {
        this.f13584s = fVar;
    }

    /* JADX INFO: renamed from: Q */
    public boolean m18997Q() {
        if (this.f13590y == null || this.f13591z == null) {
            HandlerThread handlerThread = new HandlerThread("MediasourceManager");
            this.f13591z = handlerThread;
            handlerThread.start();
            this.f13590y = new e(this.f13591z.getLooper());
        }
        return m18986z();
    }

    /* JADX INFO: renamed from: w */
    public void m18998w(C3857n c3857n) {
        synchronized (this.f13570e) {
            this.f13567b = c3857n;
        }
    }

    /* JADX INFO: renamed from: x */
    public void m18999x(int i) {
        e eVar;
        synchronized (this.f13571f) {
            try {
                int i2 = i | this.f13569d;
                this.f13569d = i2;
                if (i2 == this.f13568c && (eVar = this.f13590y) != null) {
                    eVar.sendMessage(eVar.obtainMessage(1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
