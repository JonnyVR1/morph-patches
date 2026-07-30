package p153l;

import android.content.Context;
import android.graphics.PointF;
import android.media.MediaPlayer;
import android.media.SoundPool;
import com.cosmos.mdlog.MDLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes7.dex */
public class a5g0 extends l5g0 implements ham, d5w {

    /* JADX INFO: renamed from: I */
    ConcurrentHashMap<String, c5g0> f68558I;

    /* JADX INFO: renamed from: J */
    ConcurrentHashMap<String, g6x> f68559J;

    /* JADX INFO: renamed from: M */
    private List<xej> f68562M;

    /* JADX INFO: renamed from: N */
    private kt2 f68563N;

    /* JADX INFO: renamed from: O */
    private Context f68564O;

    /* JADX INFO: renamed from: P */
    private kt2 f68565P;

    /* JADX INFO: renamed from: R */
    private SoundPool f68567R;

    /* JADX INFO: renamed from: S */
    private MediaPlayer f68568S;

    /* JADX INFO: renamed from: Z */
    private List<w4g0> f68575Z;

    /* JADX INFO: renamed from: a0 */
    yqe f68576a0;

    /* JADX INFO: renamed from: H */
    public boolean f68557H = false;

    /* JADX INFO: renamed from: K */
    int f68560K = 0;

    /* JADX INFO: renamed from: L */
    PointF f68561L = new PointF(0.0f, 0.0f);

    /* JADX INFO: renamed from: T */
    private long f68569T = 0;

    /* JADX INFO: renamed from: U */
    private int f68570U = 0;

    /* JADX INFO: renamed from: V */
    private int f68571V = 0;

    /* JADX INFO: renamed from: W */
    private float f68572W = 1.0f;

    /* JADX INFO: renamed from: X */
    private float f68573X = 1.0f;

    /* JADX INFO: renamed from: Y */
    private boolean f68574Y = false;

    /* JADX INFO: renamed from: b0 */
    private z5x f68577b0 = null;

    /* JADX INFO: renamed from: c0 */
    private av2 f68578c0 = null;

    /* JADX INFO: renamed from: d0 */
    private int f68579d0 = 0;

    /* JADX INFO: renamed from: e0 */
    private long f68580e0 = 0;

    /* JADX INFO: renamed from: f0 */
    private iqf0 f68581f0 = null;

    /* JADX INFO: renamed from: g0 */
    private Map<Integer, Object> f68582g0 = new HashMap();

    /* JADX INFO: renamed from: Q */
    private zmi f68566Q = new zmi();

    public a5g0(Context context) {
        this.f68564O = context;
        kt2 kt2Var = new kt2();
        this.f68563N = kt2Var;
        kt2Var.m134795C(this);
        this.f68558I = new ConcurrentHashMap<>();
        this.f68559J = new ConcurrentHashMap<>();
        m172256R(this.f68563N);
        m172257S(this.f68563N);
        this.f68565P = this.f68563N;
        this.f68562M = new ArrayList();
        this.f68567R = new SoundPool(5, 3, 5);
    }

    /* JADX INFO: renamed from: W */
    private synchronized void m96076W() {
        MDLog.m7443d("media", "[SoundPool]clear all soundInfo ");
        this.f68582g0.clear();
    }

    @Override // p153l.hfj
    /* JADX INFO: renamed from: K */
    public void mo96077K() {
        super.mo96077K();
    }

    /* JADX INFO: renamed from: X */
    public void m96078X() {
        m96076W();
        SoundPool soundPool = this.f68567R;
        if (soundPool != null) {
            soundPool.release();
        }
        MediaPlayer mediaPlayer = this.f68568S;
        if (mediaPlayer != null) {
            mediaPlayer.release();
            this.f68568S = null;
        }
    }

    @Override // p153l.pgk, p153l.kt2, p153l.efj
    /* JADX INFO: renamed from: c */
    public void mo96079c(int i, hfj hfjVar, boolean z) {
        synchronized (m134800I()) {
            try {
                if (this.f68570U == 0) {
                    this.f68570U = m210702r();
                    this.f68572W = 1.0f;
                } else if (m210702r() > 0) {
                    this.f68572W = (this.f68570U * 1.0f) / m210702r();
                }
                if (this.f68571V == 0) {
                    this.f68571V = m210701n();
                    this.f68573X = 1.0f;
                } else if (m210701n() > 0) {
                    this.f68573X = (this.f68571V * 1.0f) / m210701n();
                }
                if (this.f68557H) {
                    if (this.f68569T == 0) {
                        this.f68569T = System.currentTimeMillis();
                    }
                    setTimeStamp(System.currentTimeMillis() - this.f68569T);
                }
                Iterator<xej> it = this.f68562M.iterator();
                while (it.hasNext()) {
                    it.next().mo96080f();
                }
                this.f68562M.clear();
                super.mo96079c(i, hfjVar, z);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p153l.pgk, p153l.hfj, p153l.xej
    /* JADX INFO: renamed from: f */
    public synchronized void mo96080f() {
        try {
            for (c5g0 c5g0Var : this.f68558I.values()) {
                c5g0Var.m108053W();
                c5g0Var.mo96080f();
            }
            yqe yqeVar = this.f68576a0;
            if (yqeVar != null) {
                yqeVar.mo96080f();
            }
            super.mo96080f();
            kt2 kt2Var = this.f68563N;
            if (kt2Var != null) {
                kt2Var.mo96080f();
            }
            m96078X();
            List<w4g0> list = this.f68575Z;
            if (list != null) {
                list.clear();
                this.f68575Z = null;
            }
            iqf0 iqf0Var = this.f68581f0;
            if (iqf0Var != null) {
                iqf0Var.mo96080f();
                this.f68581f0 = null;
            }
            List<xej> list2 = this.f68562M;
            if (list2 != null && list2.size() > 0) {
                Iterator<xej> it = this.f68562M.iterator();
                while (it.hasNext()) {
                    it.next().mo96080f();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p153l.ham
    public void setTimeStamp(long j) {
        Iterator<c5g0> it = this.f68558I.values().iterator();
        while (it.hasNext()) {
            it.next().setTimeStamp(j);
        }
        if (this.f68557H) {
            mo102835d(lrw.m155653j().m155662h());
        }
        if (this.f68576a0 != null) {
            if (this.f68580e0 == 0) {
                this.f68580e0 = System.currentTimeMillis();
            }
            this.f68576a0.setTimeStamp(j - this.f68580e0);
        }
    }
}
