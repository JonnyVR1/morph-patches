package p149l;

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
public class qwf0 extends bxf0 implements r7m, f3w {

    /* JADX INFO: renamed from: I */
    ConcurrentHashMap<String, swf0> f156697I;

    /* JADX INFO: renamed from: J */
    ConcurrentHashMap<String, h3x> f156698J;

    /* JADX INFO: renamed from: M */
    private List<dcj> f156701M;

    /* JADX INFO: renamed from: N */
    private us2 f156702N;

    /* JADX INFO: renamed from: O */
    private Context f156703O;

    /* JADX INFO: renamed from: P */
    private us2 f156704P;

    /* JADX INFO: renamed from: R */
    private SoundPool f156706R;

    /* JADX INFO: renamed from: S */
    private MediaPlayer f156707S;

    /* JADX INFO: renamed from: Z */
    private List<mwf0> f156714Z;

    /* JADX INFO: renamed from: a0 */
    upe f156715a0;

    /* JADX INFO: renamed from: H */
    public boolean f156696H = false;

    /* JADX INFO: renamed from: K */
    int f156699K = 0;

    /* JADX INFO: renamed from: L */
    PointF f156700L = new PointF(0.0f, 0.0f);

    /* JADX INFO: renamed from: T */
    private long f156708T = 0;

    /* JADX INFO: renamed from: U */
    private int f156709U = 0;

    /* JADX INFO: renamed from: V */
    private int f156710V = 0;

    /* JADX INFO: renamed from: W */
    private float f156711W = 1.0f;

    /* JADX INFO: renamed from: X */
    private float f156712X = 1.0f;

    /* JADX INFO: renamed from: Y */
    private boolean f156713Y = false;

    /* JADX INFO: renamed from: b0 */
    private a3x f156716b0 = null;

    /* JADX INFO: renamed from: c0 */
    private ku2 f156717c0 = null;

    /* JADX INFO: renamed from: d0 */
    private int f156718d0 = 0;

    /* JADX INFO: renamed from: e0 */
    private long f156719e0 = 0;

    /* JADX INFO: renamed from: f0 */
    private zhf0 f156720f0 = null;

    /* JADX INFO: renamed from: g0 */
    private Map<Integer, Object> f156721g0 = new HashMap();

    /* JADX INFO: renamed from: Q */
    private dki f156705Q = new dki();

    public qwf0(Context context) {
        this.f156703O = context;
        us2 us2Var = new us2();
        this.f156702N = us2Var;
        us2Var.m158945C(this);
        this.f156697I = new ConcurrentHashMap<>();
        this.f156698J = new ConcurrentHashMap<>();
        m218168R(this.f156702N);
        m218169S(this.f156702N);
        this.f156704P = this.f156702N;
        this.f156701M = new ArrayList();
        this.f156706R = new SoundPool(5, 3, 5);
    }

    /* JADX INFO: renamed from: W */
    private synchronized void m176824W() {
        MDLog.m7389d("media", "[SoundPool]clear all soundInfo ");
        this.f156721g0.clear();
    }

    @Override // p149l.ncj
    /* JADX INFO: renamed from: K */
    public void mo158949K() {
        super.mo158949K();
    }

    /* JADX INFO: renamed from: X */
    public void m176825X() {
        m176824W();
        SoundPool soundPool = this.f156706R;
        if (soundPool != null) {
            soundPool.release();
        }
        MediaPlayer mediaPlayer = this.f156707S;
        if (mediaPlayer != null) {
            mediaPlayer.release();
            this.f156707S = null;
        }
    }

    @Override // p149l.zdk, p149l.us2, p149l.kcj
    /* JADX INFO: renamed from: c */
    public void mo102037c(int i, ncj ncjVar, boolean z) {
        synchronized (m158947I()) {
            try {
                if (this.f156709U == 0) {
                    this.f156709U = m110705r();
                    this.f156711W = 1.0f;
                } else if (m110705r() > 0) {
                    this.f156711W = (this.f156709U * 1.0f) / m110705r();
                }
                if (this.f156710V == 0) {
                    this.f156710V = m110701n();
                    this.f156712X = 1.0f;
                } else if (m110701n() > 0) {
                    this.f156712X = (this.f156710V * 1.0f) / m110701n();
                }
                if (this.f156696H) {
                    if (this.f156708T == 0) {
                        this.f156708T = System.currentTimeMillis();
                    }
                    setTimeStamp(System.currentTimeMillis() - this.f156708T);
                }
                Iterator<dcj> it = this.f156701M.iterator();
                while (it.hasNext()) {
                    it.next().mo102038f();
                }
                this.f156701M.clear();
                super.mo102037c(i, ncjVar, z);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p149l.zdk, p149l.ncj, p149l.dcj
    /* JADX INFO: renamed from: f */
    public synchronized void mo102038f() {
        try {
            for (swf0 swf0Var : this.f156697I.values()) {
                swf0Var.m186162W();
                swf0Var.mo102038f();
            }
            upe upeVar = this.f156715a0;
            if (upeVar != null) {
                upeVar.mo102038f();
            }
            super.mo102038f();
            us2 us2Var = this.f156702N;
            if (us2Var != null) {
                us2Var.mo102038f();
            }
            m176825X();
            List<mwf0> list = this.f156714Z;
            if (list != null) {
                list.clear();
                this.f156714Z = null;
            }
            zhf0 zhf0Var = this.f156720f0;
            if (zhf0Var != null) {
                zhf0Var.mo102038f();
                this.f156720f0 = null;
            }
            List<dcj> list2 = this.f156701M;
            if (list2 != null && list2.size() > 0) {
                Iterator<dcj> it = this.f156701M.iterator();
                while (it.hasNext()) {
                    it.next().mo102038f();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p149l.r7m
    public void setTimeStamp(long j) {
        Iterator<swf0> it = this.f156697I.values().iterator();
        while (it.hasNext()) {
            it.next().setTimeStamp(j);
        }
        if (this.f156696H) {
            mo104314d(mow.m155709j().m155718h());
        }
        if (this.f156715a0 != null) {
            if (this.f156719e0 == 0) {
                this.f156719e0 = System.currentTimeMillis();
            }
            this.f156715a0.setTimeStamp(j - this.f156719e0);
        }
    }
}
