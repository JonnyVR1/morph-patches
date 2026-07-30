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
    public String f13630EQ = "equalizer";
    public String REVERB = "reverb";
    public String GAIN = "gain";
    public String ELC = "tremolo";
    private InterfaceC3903b procfun = null;
    private Object mSyncObj = new Object();
    private float[][] workplaceEQ = {new float[]{31.25f, 1.0f, 12.0f}, new float[]{62.5f, 1.0f, 12.0f}, new float[]{125.0f, 1.0f, 12.0f}, new float[]{250.0f, 1.0f, 5.0f}, new float[]{2000.0f, 1.0f, 5.0f}, new float[]{6000.0f, 1.5f, -5.0f}};
    private float[][] studioEQ = {new float[]{250.0f, 1.5f, 10.0f}, new float[]{2000.0f, 1.0f, 7.0f}, new float[]{4000.0f, 1.5f, 0.0f}, new float[]{8000.0f, 1.5f, 0.0f}};
    private float[][] theaterEQ = {new float[]{63.0f, 1.4f, 8.0f}, new float[]{160.0f, 2.1f, 8.0f}, new float[]{315.0f, 4.3f, 8.0f}, new float[]{6300.0f, 2.18f, 8.0f}, new float[]{12500.0f, 3.3f, 8.0f}};
    private float[][] ktvEQ = {new float[]{31.25f, 2.0f, 20.0f}, new float[]{62.5f, 2.0f, 20.0f}, new float[]{125.0f, 1.5f, 10.0f}, new float[]{250.0f, 1.5f, -3.0f}, new float[]{2000.0f, 1.5f, 6.0f}, new float[]{4000.0f, 1.5f, 0.0f}, new float[]{8000.0f, 1.5f, 0.0f}};
    private float[][] bathroomEQ = {new float[]{63.0f, 1.4f, 8.0f}, new float[]{160.0f, 2.1f, 8.0f}, new float[]{315.0f, 4.3f, 8.0f}, new float[]{6300.0f, 2.18f, 8.0f}, new float[]{12500.0f, 3.3f, 8.0f}};
    private float[][] basementEQ = {new float[]{63.0f, 1.4f, 8.0f}, new float[]{160.0f, 2.1f, 8.0f}, new float[]{315.0f, 4.3f, 8.0f}};
    private float[][] newKtvEQ = {new float[]{31.25f, 1.0f, 9.0f}, new float[]{62.5f, 1.0f, 7.0f}, new float[]{125.0f, 1.5f, 5.0f}, new float[]{250.0f, 1.5f, 4.0f}, new float[]{2000.0f, 1.0f, 7.0f}, new float[]{4000.0f, 1.5f, 3.0f}, new float[]{8000.0f, 1.5f, 2.0f}, new float[]{16000.0f, 1.5f, 2.0f}};

    /* JADX INFO: renamed from: com.immomo.audioeffect.AudioEffect$a */
    public class C3902a implements InterfaceC3903b {
        public C3902a() {
        }

        @Override // com.immomo.audioeffect.AudioEffect.InterfaceC3903b
        /* JADX INFO: renamed from: a */
        public byte[] mo19366a(byte[] bArr, int i) {
            AudioEffect audioEffect = AudioEffect.this;
            return audioEffect.m19345f(audioEffect.ELC, bArr, i);
        }
    }

    /* JADX INFO: renamed from: com.immomo.audioeffect.AudioEffect$b */
    public interface InterfaceC3903b {
        /* JADX INFO: renamed from: a */
        byte[] mo19366a(byte[] bArr, int i);
    }

    /* JADX INFO: renamed from: com.immomo.audioeffect.AudioEffect$c */
    public class C3904c implements InterfaceC3903b {
        public C3904c() {
        }

        @Override // com.immomo.audioeffect.AudioEffect.InterfaceC3903b
        /* JADX INFO: renamed from: a */
        public byte[] mo19366a(byte[] bArr, int i) {
            AudioEffect audioEffect = AudioEffect.this;
            byte[] bArrM19345f = audioEffect.m19345f(audioEffect.REVERB, bArr, i);
            AudioEffect audioEffect2 = AudioEffect.this;
            return audioEffect2.m19345f(audioEffect2.f13630EQ, bArrM19345f, bArrM19345f.length);
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
    public byte[] m19345f(String str, byte[] bArr, int i) {
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
    private void m19346h() {
        m19364q(new ReverbEffectInfo(80, 0, 70, 0, 0, -3));
        m19348k(this.basementEQ);
        m19353r();
    }

    /* JADX INFO: renamed from: i */
    private void m19347i() {
        m19364q(new ReverbEffectInfo(87, 0, 19, 0, 21, -4));
        m19348k(this.bathroomEQ);
        m19353r();
    }

    private native void init_chain(long j);

    private native int init_effect(int i, int i2, int i3);

    /* JADX INFO: renamed from: k */
    private void m19348k(float[][] fArr) {
        ArrayList arrayList = new ArrayList(6);
        m19365v(this.f13630EQ);
        for (float[] fArr2 : fArr) {
            arrayList.add(new EqEffectInfo(fArr2));
        }
        m19362j(arrayList);
        m19358c(this.f13630EQ);
    }

    /* JADX INFO: renamed from: m */
    private void m19349m() {
        synchronized (this.mSyncObj) {
            this.procfun = new C3902a();
        }
    }

    /* JADX INFO: renamed from: n */
    private void m19350n() {
        m19364q(new ReverbEffectInfo(70, 0, 100, 0, 10, 6));
        m19348k(this.ktvEQ);
        m19353r();
    }

    /* JADX INFO: renamed from: o */
    private void m19351o() {
        m19364q(new ReverbEffectInfo(50, 0, 80, 0, 33, -2));
        m19348k(this.newKtvEQ);
        m19353r();
    }

    /* JADX INFO: renamed from: p */
    private void m19352p() {
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
    private void m19353r() {
        synchronized (this.mSyncObj) {
            this.procfun = new C3904c();
        }
    }

    /* JADX INFO: renamed from: s */
    private void m19354s() {
        m19364q(new ReverbEffectInfo(80, 30, 30, 0, 0, 0));
        m19348k(this.studioEQ);
        m19353r();
    }

    /* JADX INFO: renamed from: t */
    private void m19355t() {
        m19364q(new ReverbEffectInfo(50, 20, 90, 0, 500, -6));
        m19348k(this.theaterEQ);
        m19353r();
    }

    /* JADX INFO: renamed from: u */
    private void m19356u() {
        m19364q(new ReverbEffectInfo(5, 15, 50, 0, 0, -7));
        m19348k(this.workplaceEQ);
        m19353r();
    }

    /* JADX INFO: renamed from: b */
    public void m19357b() {
        synchronized (this.mSyncObj) {
            destroy(this.handle);
            this.handle = 0L;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m19358c(String str) {
        _endChain(this.handle, str);
    }

    /* JADX INFO: renamed from: d */
    public byte[] m19359d(byte[] bArr, int i) {
        InterfaceC3903b interfaceC3903b = this.procfun;
        return interfaceC3903b == null ? bArr : interfaceC3903b.mo19366a(bArr, i);
    }

    /* JADX INFO: renamed from: e */
    public void m19360e(int i, int i2, int i3) {
        this.handle = init_effect(i, i2, i3);
    }

    /* JADX INFO: renamed from: g */
    public void m19361g(int i) {
        switch (i) {
            case 0:
                m19352p();
                break;
            case 1:
                m19355t();
                break;
            case 2:
                m19346h();
                break;
            case 3:
                m19347i();
                break;
            case 4:
                m19356u();
                break;
            case 5:
                m19350n();
                break;
            case 6:
                m19354s();
                break;
            case 7:
                m19351o();
                break;
            case 8:
                m19363l();
                break;
        }
    }

    /* JADX INFO: renamed from: j */
    public void m19362j(List<EqEffectInfo> list) {
        Iterator<EqEffectInfo> it = list.iterator();
        while (it.hasNext()) {
            _setEqChain(this.handle, it.next());
        }
    }

    /* JADX INFO: renamed from: l */
    public void m19363l() {
        _setElcChain(this.handle, new ElctronicInfo(35, 80));
        m19349m();
    }

    /* JADX INFO: renamed from: q */
    public void m19364q(ReverbEffectInfo reverbEffectInfo) {
        _setReverbChain(this.handle, reverbEffectInfo);
    }

    /* JADX INFO: renamed from: v */
    public void m19365v(String str) {
        _startChain(this.handle, str);
    }
}
