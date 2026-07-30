package com.immomo.moment.mediautils;

import com.tencent.liteav.audio.TXEAudioDef;
import java.nio.ByteBuffer;
import java.util.concurrent.LinkedBlockingQueue;
import p149l.kmw;

/* JADX INFO: renamed from: com.immomo.moment.mediautils.b */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC3844b {

    /* JADX INFO: renamed from: a */
    protected b f13242a = null;

    /* JADX INFO: renamed from: b */
    protected a f13243b = null;

    /* JADX INFO: renamed from: c */
    protected kmw f13244c = null;

    /* JADX INFO: renamed from: d */
    protected int f13245d = 44100;

    /* JADX INFO: renamed from: e */
    protected int f13246e = 16;

    /* JADX INFO: renamed from: f */
    protected int f13247f = 1;

    /* JADX INFO: renamed from: g */
    protected int f13248g = 0;

    /* JADX INFO: renamed from: h */
    protected int f13249h = 16;

    /* JADX INFO: renamed from: i */
    protected int f13250i = 0;

    /* JADX INFO: renamed from: j */
    protected long f13251j = 0;

    /* JADX INFO: renamed from: k */
    protected boolean f13252k = true;

    /* JADX INFO: renamed from: l */
    protected Object f13253l = new Object();

    /* JADX INFO: renamed from: m */
    protected ByteBuffer f13254m = null;

    /* JADX INFO: renamed from: n */
    protected long f13255n = 0;

    /* JADX INFO: renamed from: o */
    protected long f13256o = 0;

    /* JADX INFO: renamed from: p */
    protected boolean f13257p = false;

    /* JADX INFO: renamed from: q */
    protected boolean f13258q = false;

    /* JADX INFO: renamed from: r */
    protected boolean f13259r = false;

    /* JADX INFO: renamed from: s */
    protected boolean f13260s = false;

    /* JADX INFO: renamed from: t */
    protected LinkedBlockingQueue<ByteBuffer> f13261t = new LinkedBlockingQueue<>();

    /* JADX INFO: renamed from: u */
    protected LinkedBlockingQueue<ByteBuffer> f13262u = new LinkedBlockingQueue<>();

    /* JADX INFO: renamed from: v */
    protected final int f13263v = -100;

    /* JADX INFO: renamed from: w */
    protected final int f13264w = -101;

    /* JADX INFO: renamed from: x */
    protected final int f13265x = -102;

    /* JADX INFO: renamed from: y */
    protected final int f13266y = -103;

    /* JADX INFO: renamed from: z */
    protected final int f13267z = TXEAudioDef.TXE_AUDIO_PLAY_ERR_REPEAT_OPTION;

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.b$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo18681a(int i, int i2, int i3);
    }

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.b$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo18682a(ByteBuffer byteBuffer, int i, long j);

        void onFinished();
    }

    /* JADX INFO: renamed from: a */
    public synchronized long m18700a() {
        return this.f13251j;
    }

    /* JADX INFO: renamed from: b */
    public abstract boolean mo18691b(ByteBuffer byteBuffer, int i);

    /* JADX INFO: renamed from: c */
    public abstract void mo18692c();

    /* JADX INFO: renamed from: d */
    public abstract void mo18693d(long j);

    /* JADX INFO: renamed from: e */
    public abstract boolean mo18694e(String str);

    /* JADX INFO: renamed from: f */
    public abstract void mo18695f(boolean z);

    /* JADX INFO: renamed from: g */
    public abstract void mo18696g(long j, long j2);

    /* JADX INFO: renamed from: h */
    public synchronized void m18701h(boolean z) {
        this.f13252k = z;
    }

    /* JADX INFO: renamed from: i */
    public synchronized void m18702i(a aVar) {
        this.f13243b = aVar;
    }

    /* JADX INFO: renamed from: j */
    public synchronized void m18703j(b bVar) {
        this.f13242a = bVar;
    }

    /* JADX INFO: renamed from: k */
    public abstract void mo18697k(int i, int i2, int i3);

    /* JADX INFO: renamed from: l */
    public synchronized void m18704l(kmw kmwVar) {
        this.f13244c = kmwVar;
    }

    /* JADX INFO: renamed from: m */
    public abstract void mo18698m();
}
