package com.immomo.moment.mediautils;

import com.tencent.liteav.audio.TXEAudioDef;
import java.nio.ByteBuffer;
import java.util.concurrent.LinkedBlockingQueue;
import p153l.jpw;

/* JADX INFO: renamed from: com.immomo.moment.mediautils.b */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC3987b {

    /* JADX INFO: renamed from: a */
    protected b f13936a = null;

    /* JADX INFO: renamed from: b */
    protected a f13937b = null;

    /* JADX INFO: renamed from: c */
    protected jpw f13938c = null;

    /* JADX INFO: renamed from: d */
    protected int f13939d = 44100;

    /* JADX INFO: renamed from: e */
    protected int f13940e = 16;

    /* JADX INFO: renamed from: f */
    protected int f13941f = 1;

    /* JADX INFO: renamed from: g */
    protected int f13942g = 0;

    /* JADX INFO: renamed from: h */
    protected int f13943h = 16;

    /* JADX INFO: renamed from: i */
    protected int f13944i = 0;

    /* JADX INFO: renamed from: j */
    protected long f13945j = 0;

    /* JADX INFO: renamed from: k */
    protected boolean f13946k = true;

    /* JADX INFO: renamed from: l */
    protected Object f13947l = new Object();

    /* JADX INFO: renamed from: m */
    protected ByteBuffer f13948m = null;

    /* JADX INFO: renamed from: n */
    protected long f13949n = 0;

    /* JADX INFO: renamed from: o */
    protected long f13950o = 0;

    /* JADX INFO: renamed from: p */
    protected boolean f13951p = false;

    /* JADX INFO: renamed from: q */
    protected boolean f13952q = false;

    /* JADX INFO: renamed from: r */
    protected boolean f13953r = false;

    /* JADX INFO: renamed from: s */
    protected boolean f13954s = false;

    /* JADX INFO: renamed from: t */
    protected LinkedBlockingQueue<ByteBuffer> f13955t = new LinkedBlockingQueue<>();

    /* JADX INFO: renamed from: u */
    protected LinkedBlockingQueue<ByteBuffer> f13956u = new LinkedBlockingQueue<>();

    /* JADX INFO: renamed from: v */
    protected final int f13957v = -100;

    /* JADX INFO: renamed from: w */
    protected final int f13958w = -101;

    /* JADX INFO: renamed from: x */
    protected final int f13959x = -102;

    /* JADX INFO: renamed from: y */
    protected final int f13960y = -103;

    /* JADX INFO: renamed from: z */
    protected final int f13961z = TXEAudioDef.TXE_AUDIO_PLAY_ERR_REPEAT_OPTION;

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.b$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo19661a(int i, int i2, int i3);
    }

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.b$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo19662a(ByteBuffer byteBuffer, int i, long j);

        void onFinished();
    }

    /* JADX INFO: renamed from: a */
    public synchronized long m19680a() {
        return this.f13945j;
    }

    /* JADX INFO: renamed from: b */
    public abstract boolean mo19671b(ByteBuffer byteBuffer, int i);

    /* JADX INFO: renamed from: c */
    public abstract void mo19672c();

    /* JADX INFO: renamed from: d */
    public abstract void mo19673d(long j);

    /* JADX INFO: renamed from: e */
    public abstract boolean mo19674e(String str);

    /* JADX INFO: renamed from: f */
    public abstract void mo19675f(boolean z);

    /* JADX INFO: renamed from: g */
    public abstract void mo19676g(long j, long j2);

    /* JADX INFO: renamed from: h */
    public synchronized void m19681h(boolean z) {
        this.f13946k = z;
    }

    /* JADX INFO: renamed from: i */
    public synchronized void m19682i(a aVar) {
        this.f13937b = aVar;
    }

    /* JADX INFO: renamed from: j */
    public synchronized void m19683j(b bVar) {
        this.f13936a = bVar;
    }

    /* JADX INFO: renamed from: k */
    public abstract void mo19677k(int i, int i2, int i3);

    /* JADX INFO: renamed from: l */
    public synchronized void m19684l(jpw jpwVar) {
        this.f13938c = jpwVar;
    }

    /* JADX INFO: renamed from: m */
    public abstract void mo19678m();
}
