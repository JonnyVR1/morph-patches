package com.immomo.audioeffect;

import android.util.Log;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class AudioEffect {
    public static final int BASEMENT = 2;
    public static final int BATHROOM = 3;
    public static final int ELECTRONIC = 8;
    public static final int KTV = 5;
    public static final int NewKTV = 7;
    public static final int Origin = 0;
    public static final int STUDIO = 6;
    public static final int THEATER = 1;
    public static final int WORKPLACE = 4;
    private static volatile boolean mIsLibLoaded = false;
    private long handle;

    /* JADX INFO: renamed from: EQ */
    public String f12891EQ = "equalizer";
    public String REVERB = "reverb";
    public String GAIN = "gain";
    public String ELC = "tremolo";
    private InterfaceC3744b procfun = null;
    private Object mSyncObj = new Object();
    private float[][] workplaceEQ = {new float[]{31.25f, 1.0f, 12.0f}, new float[]{62.5f, 1.0f, 12.0f}, new float[]{125.0f, 1.0f, 12.0f}, new float[]{250.0f, 1.0f, 5.0f}, new float[]{2000.0f, 1.0f, 5.0f}, new float[]{6000.0f, 1.5f, -5.0f}};
    private float[][] studioEQ = {new float[]{250.0f, 1.5f, 10.0f}, new float[]{2000.0f, 1.0f, 7.0f}, new float[]{4000.0f, 1.5f, 0.0f}, new float[]{8000.0f, 1.5f, 0.0f}};
    private float[][] theaterEQ = {new float[]{63.0f, 1.4f, 8.0f}, new float[]{160.0f, 2.1f, 8.0f}, new float[]{315.0f, 4.3f, 8.0f}, new float[]{6300.0f, 2.18f, 8.0f}, new float[]{12500.0f, 3.3f, 8.0f}};
    private float[][] ktvEQ = {new float[]{31.25f, 2.0f, 20.0f}, new float[]{62.5f, 2.0f, 20.0f}, new float[]{125.0f, 1.5f, 10.0f}, new float[]{250.0f, 1.5f, -3.0f}, new float[]{2000.0f, 1.5f, 6.0f}, new float[]{4000.0f, 1.5f, 0.0f}, new float[]{8000.0f, 1.5f, 0.0f}};
    private float[][] bathroomEQ = {new float[]{63.0f, 1.4f, 8.0f}, new float[]{160.0f, 2.1f, 8.0f}, new float[]{315.0f, 4.3f, 8.0f}, new float[]{6300.0f, 2.18f, 8.0f}, new float[]{12500.0f, 3.3f, 8.0f}};
    private float[][] basementEQ = {new float[]{63.0f, 1.4f, 8.0f}, new float[]{160.0f, 2.1f, 8.0f}, new float[]{315.0f, 4.3f, 8.0f}};
    private float[][] newKtvEQ = {new float[]{31.25f, 1.0f, 9.0f}, new float[]{62.5f, 1.0f, 7.0f}, new float[]{125.0f, 1.5f, 5.0f}, new float[]{250.0f, 1.5f, 4.0f}, new float[]{2000.0f, 1.0f, 7.0f}, new float[]{4000.0f, 1.5f, 3.0f}, new float[]{8000.0f, 1.5f, 2.0f}, new float[]{16000.0f, 1.5f, 2.0f}};

    /* JADX INFO: renamed from: com.immomo.audioeffect.AudioEffect$a */
    public class C3743a implements InterfaceC3744b {
        public C3743a() {
        }

        @Override // com.immomo.audioeffect.AudioEffect.InterfaceC3744b
        /* JADX INFO: renamed from: a */
        public byte[] mo18289a(byte[] bArr, int i) {
            AudioEffect audioEffect = AudioEffect.this;
            return audioEffect.m18268f(audioEffect.ELC, bArr, i);
        }
    }

    /* JADX INFO: renamed from: com.immomo.audioeffect.AudioEffect$b */
    public interface InterfaceC3744b {
        /* JADX INFO: renamed from: a */
        byte[] mo18289a(byte[] bArr, int i);
    }

    /* JADX INFO: renamed from: com.immomo.audioeffect.AudioEffect$c */
    public class C3745c implements InterfaceC3744b {
        public C3745c() {
        }

        @Override // com.immomo.audioeffect.AudioEffect.InterfaceC3744b
        /* JADX INFO: renamed from: a */
        public byte[] mo18289a(byte[] bArr, int i) {
            AudioEffect audioEffect = AudioEffect.this;
            byte[] bArrM18268f = audioEffect.m18268f(audioEffect.REVERB, bArr, i);
            AudioEffect audioEffect2 = AudioEffect.this;
            return audioEffect2.m18268f(audioEffect2.f12891EQ, bArrM18268f, bArrM18268f.length);
        }
    }

    public AudioEffect() {
        if (mIsLibLoaded) {
            return;
        }
        try {
            System.loadLibrary("audioeffect");
            mIsLibLoaded = true;
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        }
    }

    private native int _endChain(long j, String str);

    private native int _setElcChain(long j, ElctronicInfo elctronicInfo);

    private native int _setEqChain(long j, EqEffectInfo eqEffectInfo);

    private native int _setReverbChain(long j, ReverbEffectInfo reverbEffectInfo);

    private native int _startChain(long j, String str);

    private native void destroy(long j);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public byte[] m18268f(String str, byte[] bArr, int i) {
        Log.e("sox", "sox process");
        synchronized (this.mSyncObj) {
            try {
                long j = this.handle;
                if (j != 0) {
                    processNew(j, str, ByteBuffer.wrap(bArr), i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bArr;
    }

    /* JADX INFO: renamed from: h */
    private void m18269h() {
        m18287q(new ReverbEffectInfo(80, 0, 70, 0, 0, -3));
        m18271k(this.basementEQ);
        m18276r();
    }

    /* JADX INFO: renamed from: i */
    private void m18270i() {
        m18287q(new ReverbEffectInfo(87, 0, 19, 0, 21, -4));
        m18271k(this.bathroomEQ);
        m18276r();
    }

    private native void init_chain(long j);

    private native int init_effect(int i, int i2, int i3);

    /* JADX INFO: renamed from: k */
    private void m18271k(float[][] fArr) {
        ArrayList arrayList = new ArrayList(6);
        m18288v(this.f12891EQ);
        for (float[] fArr2 : fArr) {
            arrayList.add(new EqEffectInfo(fArr2));
        }
        m18285j(arrayList);
        m18281c(this.f12891EQ);
    }

    /* JADX INFO: renamed from: m */
    private void m18272m() {
        synchronized (this.mSyncObj) {
            this.procfun = new C3743a();
        }
    }

    /* JADX INFO: renamed from: n */
    private void m18273n() {
        m18287q(new ReverbEffectInfo(70, 0, 100, 0, 10, 6));
        m18271k(this.ktvEQ);
        m18276r();
    }

    /* JADX INFO: renamed from: o */
    private void m18274o() {
        m18287q(new ReverbEffectInfo(50, 0, 80, 0, 33, -2));
        m18271k(this.newKtvEQ);
        m18276r();
    }

    /* JADX INFO: renamed from: p */
    private void m18275p() {
        synchronized (this.mSyncObj) {
            try {
                if (this.procfun != null) {
                    this.procfun = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private native int process(long j, ByteBuffer byteBuffer, int i);

    private native int processNew(long j, String str, ByteBuffer byteBuffer, int i);

    /* JADX INFO: renamed from: r */
    private void m18276r() {
        synchronized (this.mSyncObj) {
            this.procfun = new C3745c();
        }
    }

    /* JADX INFO: renamed from: s */
    private void m18277s() {
        m18287q(new ReverbEffectInfo(80, 30, 30, 0, 0, 0));
        m18271k(this.studioEQ);
        m18276r();
    }

    /* JADX INFO: renamed from: t */
    private void m18278t() {
        m18287q(new ReverbEffectInfo(50, 20, 90, 0, 500, -6));
        m18271k(this.theaterEQ);
        m18276r();
    }

    /* JADX INFO: renamed from: u */
    private void m18279u() {
        m18287q(new ReverbEffectInfo(5, 15, 50, 0, 0, -7));
        m18271k(this.workplaceEQ);
        m18276r();
    }

    /* JADX INFO: renamed from: b */
    public void m18280b() {
        synchronized (this.mSyncObj) {
            destroy(this.handle);
            this.handle = 0L;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m18281c(String str) {
        _endChain(this.handle, str);
    }

    /* JADX INFO: renamed from: d */
    public byte[] m18282d(byte[] bArr, int i) {
        InterfaceC3744b interfaceC3744b = this.procfun;
        return interfaceC3744b == null ? bArr : interfaceC3744b.mo18289a(bArr, i);
    }

    /* JADX INFO: renamed from: e */
    public void m18283e(int i, int i2, int i3) {
        this.handle = init_effect(i, i2, i3);
    }

    /* JADX INFO: renamed from: g */
    public void m18284g(int i) {
        switch (i) {
            case 0:
                m18275p();
                break;
            case 1:
                m18278t();
                break;
            case 2:
                m18269h();
                break;
            case 3:
                m18270i();
                break;
            case 4:
                m18279u();
                break;
            case 5:
                m18273n();
                break;
            case 6:
                m18277s();
                break;
            case 7:
                m18274o();
                break;
            case 8:
                m18286l();
                break;
        }
    }

    /* JADX INFO: renamed from: j */
    public void m18285j(List<EqEffectInfo> list) {
        Iterator<EqEffectInfo> it = list.iterator();
        while (it.hasNext()) {
            _setEqChain(this.handle, it.next());
        }
    }

    /* JADX INFO: renamed from: l */
    public void m18286l() {
        _setElcChain(this.handle, new ElctronicInfo(35, 80));
        m18272m();
    }

    /* JADX INFO: renamed from: q */
    public void m18287q(ReverbEffectInfo reverbEffectInfo) {
        _setReverbChain(this.handle, reverbEffectInfo);
    }

    /* JADX INFO: renamed from: v */
    public void m18288v(String str) {
        _startChain(this.handle, str);
    }
}
