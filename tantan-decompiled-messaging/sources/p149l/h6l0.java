package p149l;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.cosmos.mdlog.MDLog;
import com.immomo.components.interfaces.IProcessOutput;
import com.immomo.moment.filtermanager.MMPresetFilter;
import com.immomo.moment.mediautils.cmds.AudioBackground;
import com.immomo.moment.mediautils.cmds.AudioEffects;
import com.immomo.moment.mediautils.cmds.EffectModel;
import com.immomo.moment.mediautils.cmds.TimeRangeScale;
import com.immomo.moment.mediautils.cmds.VideoCut;
import com.immomo.moment.mediautils.cmds.VideoEffects;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes7.dex */
class h6l0 implements p7m, smw {

    /* JADX INFO: renamed from: a */
    @NonNull
    private fw00 f106071a;

    /* JADX INFO: renamed from: c */
    @NonNull
    private eke f106073c;

    /* JADX INFO: renamed from: d */
    private qwf0 f106074d;

    /* JADX INFO: renamed from: e */
    private us2 f106075e;

    /* JADX INFO: renamed from: g */
    private bif0 f106077g;

    /* JADX INFO: renamed from: h */
    private w03 f106078h;

    /* JADX INFO: renamed from: i */
    private dy00 f106079i;

    /* JADX INFO: renamed from: j */
    @NonNull
    private EffectModel f106080j;

    /* JADX INFO: renamed from: k */
    public v500 f106081k;

    /* JADX INFO: renamed from: l */
    private int f106082l;

    /* JADX INFO: renamed from: m */
    private int f106083m;

    /* JADX INFO: renamed from: n */
    private int f106084n;

    /* JADX INFO: renamed from: o */
    private int f106085o;

    /* JADX INFO: renamed from: p */
    private boolean f106086p;

    /* JADX INFO: renamed from: r */
    private rii f106088r;

    /* JADX INFO: renamed from: s */
    private smw f106089s;

    /* JADX INFO: renamed from: t */
    private qcr f106090t;

    /* JADX INFO: renamed from: x */
    bif0 f106094x;

    /* JADX INFO: renamed from: b */
    private boolean f106072b = true;

    /* JADX INFO: renamed from: f */
    private boolean f106076f = false;

    /* JADX INFO: renamed from: q */
    private List<MMPresetFilter> f106087q = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: u */
    private float f106091u = 0.0f;

    /* JADX INFO: renamed from: v */
    private float f106092v = 1.0f;

    /* JADX INFO: renamed from: w */
    List<Object> f106093w = new ArrayList();

    public h6l0() {
        fw00 fw00Var = new fw00();
        this.f106071a = fw00Var;
        fw00Var.m123481f1(false);
        this.f106071a.m123473X0(new xg50());
        this.f106071a.m123474Y0(this);
        this.f106073c = new eke();
        this.f106074d = m129493z();
        mow.m155709j().m155714d();
    }

    /* JADX INFO: renamed from: A */
    private void m129485A() {
        this.f106075e = null;
        this.f106077g = null;
        this.f106078h = null;
        this.f106079i = null;
    }

    /* JADX INFO: renamed from: C */
    private void m129486C(String str, long j, boolean z) {
        this.f106071a.m123486k1(str, j, z);
    }

    /* JADX INFO: renamed from: s */
    private boolean m129487s(Bitmap bitmap) {
        return (bitmap == null || bitmap.isRecycled()) ? false : true;
    }

    /* JADX INFO: renamed from: t */
    private EffectModel m129488t() {
        List<VideoCut> videoCuts;
        v500 v500Var = this.f106081k;
        if (v500Var == null) {
            return this.f106080j;
        }
        List<TimeRangeScale> timeRangeScales = null;
        String str = v500Var.m197095a() ? this.f106081k.f179991b : null;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        VideoEffects videoEffects = this.f106081k.f179996g;
        if (videoEffects != null) {
            timeRangeScales = videoEffects.getTimeRangeScales();
            videoCuts = this.f106081k.f179996g.getVideoCuts();
        } else {
            videoCuts = null;
        }
        v500 v500Var2 = this.f106081k;
        EffectModel effectModelM193836c = !zIsEmpty ? ui00.m193836c(v500Var2.f179990a, this.f106092v, str, this.f106091u, v500Var2.f179992c, v500Var2.f179993d, videoCuts) : ui00.m193835b(v500Var2.f179990a, this.f106092v, videoCuts);
        if (timeRangeScales != null) {
            effectModelM193836c.getVideoEffects().setTimeRangeScales(timeRangeScales);
        }
        return effectModelM193836c;
    }

    /* JADX INFO: renamed from: u */
    private us2 m129489u(Bitmap bitmap, Bitmap bitmap2, qwf0 qwf0Var) {
        boolean zM129487s = m129487s(bitmap);
        boolean zM129487s2 = m129487s(bitmap2);
        if (this.f106078h == null) {
            this.f106078h = new w03();
        }
        if (this.f106079i == null) {
            this.f106079i = new dy00();
        }
        dy00 dy00Var = this.f106079i;
        if (dy00Var != null) {
            dy00Var.m114043X((bitmap2 != null && bitmap == null) || !(bitmap2 == null || bitmap == null));
        }
        if (this.f106077g == null) {
            ArrayList arrayList = new ArrayList();
            if (qwf0Var != null) {
                arrayList.add(qwf0Var);
            }
            this.f106077g = new bif0(arrayList);
        }
        if (zM129487s) {
            this.f106078h.m200820n0(bitmap);
            if (!this.f106077g.m102036Z().contains(this.f106078h)) {
                this.f106077g.m102035X(this.f106078h);
            }
        }
        if (zM129487s2) {
            this.f106079i.m114042W(bitmap2);
            if (!this.f106077g.m102036Z().contains(this.f106079i)) {
                this.f106077g.m102035X(this.f106079i);
            }
        }
        return this.f106077g;
    }

    /* JADX INFO: renamed from: v */
    private void m129490v() {
        qcr qcrVar = new qcr(IProcessOutput.ProcessType.PROCESS_VIDEO_TYPE, true);
        this.f106090t = qcrVar;
        this.f106071a.m123470S0(qcrVar);
        rii riiVar = new rii(this.f106087q, this.f106090t);
        this.f106088r = riiVar;
        riiVar.m179513d(-1);
        this.f106073c.m116957b(this.f106088r.m179511b());
        bif0 bif0Var = this.f106094x;
        if (bif0Var != null) {
            this.f106073c.m116957b(bif0Var);
        }
    }

    /* JADX INFO: renamed from: w */
    private void m129491w() {
        us2 us2Var = this.f106075e;
        qwf0 qwf0Var = this.f106074d;
        if (us2Var != null) {
            m129489u(null, null, qwf0Var);
            return;
        }
        us2 us2VarM129489u = m129489u(null, null, qwf0Var);
        this.f106075e = us2VarM129489u;
        this.f106073c.m116956a(us2VarM129489u);
    }

    /* JADX INFO: renamed from: y */
    private void m129492y(v500 v500Var) {
        if (v500Var != null) {
            float f = v500Var.f179994e / 100.0f;
            this.f106092v = f;
            this.f106091u = v500Var.f179995f / 100.0f;
            MDLog.m7396i("VideoProcess", "initVolume mVideoVolume:%f  mMusicVolume:%f", Float.valueOf(f), Float.valueOf(this.f106091u));
        }
    }

    /* JADX INFO: renamed from: z */
    private qwf0 m129493z() {
        return new qwf0(dv0.m113757a());
    }

    /* JADX INFO: renamed from: B */
    public void m129494B(int i, int i2, int i3, int i4, boolean z) {
        this.f106082l = (i >> 4) << 4;
        this.f106083m = (i2 >> 4) << 4;
        this.f106084n = i3;
        this.f106085o = i4;
        this.f106086p = z;
        this.f106071a.m123477b1(i, i2, i3, i4, z);
    }

    @Override // p149l.p7m
    /* JADX INFO: renamed from: a */
    public void mo129495a() {
        this.f106071a.m123468O0();
        this.f106071a.m123485j1();
    }

    @Override // p149l.p7m
    /* JADX INFO: renamed from: b */
    public boolean mo129496b(v500 v500Var) {
        this.f106081k = v500Var;
        m129492y(v500Var);
        this.f106080j = m129488t();
        m129491w();
        boolean zM123466K0 = this.f106071a.m123466K0(EffectModel.toEffectCmd(this.f106080j));
        m129513x(this.f106073c.m116958c());
        m129490v();
        return zM123466K0;
    }

    @Override // p149l.p7m
    /* JADX INFO: renamed from: c */
    public void mo129497c(List<VideoCut> list, @Nullable List<TimeRangeScale> list2, long j, boolean z) {
        v500 v500Var = this.f106081k;
        if (v500Var.f179996g == null) {
            v500Var.f179996g = new VideoEffects();
        }
        this.f106081k.f179996g.setTimeRangeScales(list2);
        this.f106081k.f179996g.setVideoCuts(list);
        mo129507m(j, z);
    }

    @Override // p149l.p7m
    /* JADX INFO: renamed from: d */
    public void mo129498d(boolean z) {
        this.f106071a.m123472V0(z);
    }

    @Override // p149l.p7m
    /* JADX INFO: renamed from: e */
    public void mo129499e(boolean z) {
        this.f106071a.m123481f1(z);
    }

    @Override // p149l.p7m
    /* JADX INFO: renamed from: f */
    public boolean mo129500f() {
        return this.f106071a.m123487q0();
    }

    @Override // p149l.p7m
    /* JADX INFO: renamed from: g */
    public void mo129501g() {
        this.f106076f = true;
        this.f106071a.m123483h1();
    }

    @Override // p149l.p7m
    /* JADX INFO: renamed from: h */
    public void mo129502h(SurfaceTexture surfaceTexture) {
        this.f106071a.m123484i0(surfaceTexture);
    }

    @Override // p149l.p7m
    /* JADX INFO: renamed from: i */
    public void mo129503i(float f) {
        MDLog.m7396i("VideoProcess", "setPlayingMusicAudioRatio %f", Float.valueOf(f));
        this.f106091u = f;
        this.f106071a.m123478c1(f);
    }

    @Override // p149l.p7m
    /* JADX INFO: renamed from: j */
    public void mo129504j(kmw kmwVar) {
        this.f106071a.m123475Z0(kmwVar);
    }

    @Override // p149l.p7m
    /* JADX INFO: renamed from: k */
    public void mo129505k(int i, int i2, int i3, int i4) {
        m129494B(i, i2, i3, i4, true);
    }

    @Override // p149l.smw
    /* JADX INFO: renamed from: l */
    public void mo129506l() {
        smw smwVar = this.f106089s;
        if (smwVar != null) {
            smwVar.mo129506l();
        }
    }

    @Override // p149l.p7m
    /* JADX INFO: renamed from: m */
    public void mo129507m(long j, boolean z) {
        EffectModel effectModelM129488t = m129488t();
        this.f106080j = effectModelM129488t;
        AudioEffects audioEffects = effectModelM129488t.getAudioEffects();
        if (audioEffects != null) {
            AudioEffects.C3846a audioSource = audioEffects.getAudioSource();
            if (audioSource != null) {
                audioSource.m18715c(this.f106092v);
            }
            List<AudioBackground> audioBackgrounds = audioEffects.getAudioBackgrounds();
            if (audioBackgrounds != null && audioBackgrounds.size() > 0) {
                audioBackgrounds.get(0).setRatio(this.f106091u);
            }
        }
        this.f106071a.m123479d1(this.f106092v);
        this.f106071a.m123478c1(this.f106091u);
        m129486C(EffectModel.toEffectCmd(this.f106080j), j, z);
    }

    @Override // p149l.p7m
    /* JADX INFO: renamed from: n */
    public void mo129508n(String str) {
        this.f106080j = m129488t();
        MDLog.m7396i("VideoProcess", "makeVideo mVideoVolume:%f  mMusicVolume:%f", Float.valueOf(this.f106092v), Float.valueOf(this.f106091u));
        AudioEffects audioEffects = this.f106080j.getAudioEffects();
        if (audioEffects != null) {
            AudioEffects.C3846a audioSource = audioEffects.getAudioSource();
            if (audioSource != null) {
                audioSource.m18715c(this.f106092v);
            }
            List<AudioBackground> audioBackgrounds = audioEffects.getAudioBackgrounds();
            if (audioBackgrounds != null && audioBackgrounds.size() > 0) {
                audioBackgrounds.get(0).setRatio(this.f106091u);
            }
        }
        this.f106071a.m123471T0(this.f106080j);
        this.f106071a.m123464I0(str);
    }

    @Override // p149l.p7m
    /* JADX INFO: renamed from: o */
    public void mo129509o(lmw lmwVar) {
        this.f106071a.m123476a1(new xe50(lmwVar));
    }

    @Override // p149l.p7m
    /* JADX INFO: renamed from: p */
    public boolean mo129510p() {
        if (!this.f106076f || !this.f106072b) {
            return false;
        }
        this.f106071a.m123469Q0();
        return true;
    }

    @Override // p149l.p7m
    public void pause() {
        this.f106071a.m123465J0();
    }

    @Override // p149l.p7m
    /* JADX INFO: renamed from: q */
    public void mo129511q(float f) {
        MDLog.m7396i("VideoProcess", "setPlayingSrcAudioRatio %f", Float.valueOf(f));
        this.f106092v = f;
        this.f106071a.m123479d1(f);
    }

    @Override // p149l.p7m
    /* JADX INFO: renamed from: r */
    public void mo129512r(jmw jmwVar) {
        this.f106071a.m123480e1(jmwVar);
    }

    @Override // p149l.p7m
    public void release() {
        this.f106094x = null;
        this.f106093w.clear();
        this.f106071a.m123467L0();
        m129485A();
        this.f106076f = false;
        ric0.m179491c();
    }

    @Override // p149l.p7m
    public void resume() {
        if (this.f106076f) {
            this.f106071a.m123469Q0();
        }
    }

    /* JADX INFO: renamed from: x */
    public void m129513x(us2 us2Var) {
        this.f106071a.m123482h0(us2Var);
    }
}
