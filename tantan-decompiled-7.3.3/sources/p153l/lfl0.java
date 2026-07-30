package p153l;

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

/* JADX INFO: loaded from: classes6.dex */
class lfl0 implements fam, rpw {

    /* JADX INFO: renamed from: a */
    @NonNull
    private n410 f131856a;

    /* JADX INFO: renamed from: c */
    @NonNull
    private ile f131858c;

    /* JADX INFO: renamed from: d */
    private a5g0 f131859d;

    /* JADX INFO: renamed from: e */
    private kt2 f131860e;

    /* JADX INFO: renamed from: g */
    private kqf0 f131862g;

    /* JADX INFO: renamed from: h */
    private l13 f131863h;

    /* JADX INFO: renamed from: i */
    private n610 f131864i;

    /* JADX INFO: renamed from: j */
    @NonNull
    private EffectModel f131865j;

    /* JADX INFO: renamed from: k */
    public fe00 f131866k;

    /* JADX INFO: renamed from: l */
    private int f131867l;

    /* JADX INFO: renamed from: m */
    private int f131868m;

    /* JADX INFO: renamed from: n */
    private int f131869n;

    /* JADX INFO: renamed from: o */
    private int f131870o;

    /* JADX INFO: renamed from: p */
    private boolean f131871p;

    /* JADX INFO: renamed from: r */
    private oli f131873r;

    /* JADX INFO: renamed from: s */
    private rpw f131874s;

    /* JADX INFO: renamed from: t */
    private rer f131875t;

    /* JADX INFO: renamed from: x */
    kqf0 f131879x;

    /* JADX INFO: renamed from: b */
    private boolean f131857b = true;

    /* JADX INFO: renamed from: f */
    private boolean f131861f = false;

    /* JADX INFO: renamed from: q */
    private List<MMPresetFilter> f131872q = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: u */
    private float f131876u = 0.0f;

    /* JADX INFO: renamed from: v */
    private float f131877v = 1.0f;

    /* JADX INFO: renamed from: w */
    List<Object> f131878w = new ArrayList();

    public lfl0() {
        n410 n410Var = new n410();
        this.f131856a = n410Var;
        n410Var.m161494f1(false);
        this.f131856a.m161486X0(new dp50());
        this.f131856a.m161487Y0(this);
        this.f131858c = new ile();
        this.f131859d = m154009z();
        lrw.m155653j().m155658d();
    }

    /* JADX INFO: renamed from: A */
    private void m154001A() {
        this.f131860e = null;
        this.f131862g = null;
        this.f131863h = null;
        this.f131864i = null;
    }

    /* JADX INFO: renamed from: C */
    private void m154002C(String str, long j, boolean z) {
        this.f131856a.m161499k1(str, j, z);
    }

    /* JADX INFO: renamed from: s */
    private boolean m154003s(Bitmap bitmap) {
        return (bitmap == null || bitmap.isRecycled()) ? false : true;
    }

    /* JADX INFO: renamed from: t */
    private EffectModel m154004t() {
        List<VideoCut> videoCuts;
        fe00 fe00Var = this.f131866k;
        if (fe00Var == null) {
            return this.f131865j;
        }
        List<TimeRangeScale> timeRangeScales = null;
        String str = fe00Var.m125154a() ? this.f131866k.f98534b : null;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        VideoEffects videoEffects = this.f131866k.f98539g;
        if (videoEffects != null) {
            timeRangeScales = videoEffects.getTimeRangeScales();
            videoCuts = this.f131866k.f98539g.getVideoCuts();
        } else {
            videoCuts = null;
        }
        fe00 fe00Var2 = this.f131866k;
        EffectModel effectModelM117654c = !zIsEmpty ? dr00.m117654c(fe00Var2.f98533a, this.f131877v, str, this.f131876u, fe00Var2.f98535c, fe00Var2.f98536d, videoCuts) : dr00.m117653b(fe00Var2.f98533a, this.f131877v, videoCuts);
        if (timeRangeScales != null) {
            effectModelM117654c.getVideoEffects().setTimeRangeScales(timeRangeScales);
        }
        return effectModelM117654c;
    }

    /* JADX INFO: renamed from: u */
    private kt2 m154005u(Bitmap bitmap, Bitmap bitmap2, a5g0 a5g0Var) {
        boolean zM154003s = m154003s(bitmap);
        boolean zM154003s2 = m154003s(bitmap2);
        if (this.f131863h == null) {
            this.f131863h = new l13();
        }
        if (this.f131864i == null) {
            this.f131864i = new n610();
        }
        n610 n610Var = this.f131864i;
        if (n610Var != null) {
            n610Var.m161749X((bitmap2 != null && bitmap == null) || !(bitmap2 == null || bitmap == null));
        }
        if (this.f131862g == null) {
            ArrayList arrayList = new ArrayList();
            if (a5g0Var != null) {
                arrayList.add(a5g0Var);
            }
            this.f131862g = new kqf0(arrayList);
        }
        if (zM154003s) {
            this.f131863h.m152455n0(bitmap);
            if (!this.f131862g.m150862Z().contains(this.f131863h)) {
                this.f131862g.m150861X(this.f131863h);
            }
        }
        if (zM154003s2) {
            this.f131864i.m161748W(bitmap2);
            if (!this.f131862g.m150862Z().contains(this.f131864i)) {
                this.f131862g.m150861X(this.f131864i);
            }
        }
        return this.f131862g;
    }

    /* JADX INFO: renamed from: v */
    private void m154006v() {
        rer rerVar = new rer(IProcessOutput.ProcessType.PROCESS_VIDEO_TYPE, true);
        this.f131875t = rerVar;
        this.f131856a.m161483S0(rerVar);
        oli oliVar = new oli(this.f131872q, this.f131875t);
        this.f131873r = oliVar;
        oliVar.m168119d(-1);
        this.f131858c.m140622b(this.f131873r.m168117b());
        kqf0 kqf0Var = this.f131879x;
        if (kqf0Var != null) {
            this.f131858c.m140622b(kqf0Var);
        }
    }

    /* JADX INFO: renamed from: w */
    private void m154007w() {
        kt2 kt2Var = this.f131860e;
        a5g0 a5g0Var = this.f131859d;
        if (kt2Var != null) {
            m154005u(null, null, a5g0Var);
            return;
        }
        kt2 kt2VarM154005u = m154005u(null, null, a5g0Var);
        this.f131860e = kt2VarM154005u;
        this.f131858c.m140621a(kt2VarM154005u);
    }

    /* JADX INFO: renamed from: y */
    private void m154008y(fe00 fe00Var) {
        if (fe00Var != null) {
            float f = fe00Var.f98537e / 100.0f;
            this.f131877v = f;
            this.f131876u = fe00Var.f98538f / 100.0f;
            MDLog.m7450i("VideoProcess", "initVolume mVideoVolume:%f  mMusicVolume:%f", Float.valueOf(f), Float.valueOf(this.f131876u));
        }
    }

    /* JADX INFO: renamed from: z */
    private a5g0 m154009z() {
        return new a5g0(kv0.m151647a());
    }

    /* JADX INFO: renamed from: B */
    public void m154010B(int i, int i2, int i3, int i4, boolean z) {
        this.f131867l = (i >> 4) << 4;
        this.f131868m = (i2 >> 4) << 4;
        this.f131869n = i3;
        this.f131870o = i4;
        this.f131871p = z;
        this.f131856a.m161490b1(i, i2, i3, i4, z);
    }

    @Override // p153l.fam
    /* JADX INFO: renamed from: a */
    public void mo124749a() {
        this.f131856a.m161481O0();
        this.f131856a.m161498j1();
    }

    @Override // p153l.fam
    /* JADX INFO: renamed from: b */
    public boolean mo124750b(fe00 fe00Var) {
        this.f131866k = fe00Var;
        m154008y(fe00Var);
        this.f131865j = m154004t();
        m154007w();
        boolean zM161479K0 = this.f131856a.m161479K0(EffectModel.toEffectCmd(this.f131865j));
        m154012x(this.f131858c.m140623c());
        m154006v();
        return zM161479K0;
    }

    @Override // p153l.fam
    /* JADX INFO: renamed from: c */
    public void mo124751c(List<VideoCut> list, @Nullable List<TimeRangeScale> list2, long j, boolean z) {
        fe00 fe00Var = this.f131866k;
        if (fe00Var.f98539g == null) {
            fe00Var.f98539g = new VideoEffects();
        }
        this.f131866k.f98539g.setTimeRangeScales(list2);
        this.f131866k.f98539g.setVideoCuts(list);
        mo124760m(j, z);
    }

    @Override // p153l.fam
    /* JADX INFO: renamed from: d */
    public void mo124752d(boolean z) {
        this.f131856a.m161485V0(z);
    }

    @Override // p153l.fam
    /* JADX INFO: renamed from: e */
    public void mo124753e(boolean z) {
        this.f131856a.m161494f1(z);
    }

    @Override // p153l.fam
    /* JADX INFO: renamed from: f */
    public boolean mo124754f() {
        return this.f131856a.m161500q0();
    }

    @Override // p153l.fam
    /* JADX INFO: renamed from: g */
    public void mo124755g() {
        this.f131861f = true;
        this.f131856a.m161496h1();
    }

    @Override // p153l.fam
    /* JADX INFO: renamed from: h */
    public void mo124756h(SurfaceTexture surfaceTexture) {
        this.f131856a.m161497i0(surfaceTexture);
    }

    @Override // p153l.fam
    /* JADX INFO: renamed from: i */
    public void mo124757i(float f) {
        MDLog.m7450i("VideoProcess", "setPlayingMusicAudioRatio %f", Float.valueOf(f));
        this.f131876u = f;
        this.f131856a.m161491c1(f);
    }

    @Override // p153l.fam
    /* JADX INFO: renamed from: j */
    public void mo124758j(jpw jpwVar) {
        this.f131856a.m161488Z0(jpwVar);
    }

    @Override // p153l.fam
    /* JADX INFO: renamed from: k */
    public void mo124759k(int i, int i2, int i3, int i4) {
        m154010B(i, i2, i3, i4, true);
    }

    @Override // p153l.rpw
    /* JADX INFO: renamed from: l */
    public void mo154011l() {
        rpw rpwVar = this.f131874s;
        if (rpwVar != null) {
            rpwVar.mo154011l();
        }
    }

    @Override // p153l.fam
    /* JADX INFO: renamed from: m */
    public void mo124760m(long j, boolean z) {
        EffectModel effectModelM154004t = m154004t();
        this.f131865j = effectModelM154004t;
        AudioEffects audioEffects = effectModelM154004t.getAudioEffects();
        if (audioEffects != null) {
            AudioEffects.C3989a audioSource = audioEffects.getAudioSource();
            if (audioSource != null) {
                audioSource.m19695c(this.f131877v);
            }
            List<AudioBackground> audioBackgrounds = audioEffects.getAudioBackgrounds();
            if (audioBackgrounds != null && audioBackgrounds.size() > 0) {
                audioBackgrounds.get(0).setRatio(this.f131876u);
            }
        }
        this.f131856a.m161492d1(this.f131877v);
        this.f131856a.m161491c1(this.f131876u);
        m154002C(EffectModel.toEffectCmd(this.f131865j), j, z);
    }

    @Override // p153l.fam
    /* JADX INFO: renamed from: n */
    public void mo124761n(String str) {
        this.f131865j = m154004t();
        MDLog.m7450i("VideoProcess", "makeVideo mVideoVolume:%f  mMusicVolume:%f", Float.valueOf(this.f131877v), Float.valueOf(this.f131876u));
        AudioEffects audioEffects = this.f131865j.getAudioEffects();
        if (audioEffects != null) {
            AudioEffects.C3989a audioSource = audioEffects.getAudioSource();
            if (audioSource != null) {
                audioSource.m19695c(this.f131877v);
            }
            List<AudioBackground> audioBackgrounds = audioEffects.getAudioBackgrounds();
            if (audioBackgrounds != null && audioBackgrounds.size() > 0) {
                audioBackgrounds.get(0).setRatio(this.f131876u);
            }
        }
        this.f131856a.m161484T0(this.f131865j);
        this.f131856a.m161477I0(str);
    }

    @Override // p153l.fam
    /* JADX INFO: renamed from: o */
    public void mo124762o(kpw kpwVar) {
        this.f131856a.m161489a1(new en50(kpwVar));
    }

    @Override // p153l.fam
    /* JADX INFO: renamed from: p */
    public boolean mo124763p() {
        if (!this.f131861f || !this.f131857b) {
            return false;
        }
        this.f131856a.m161482Q0();
        return true;
    }

    @Override // p153l.fam
    public void pause() {
        this.f131856a.m161478J0();
    }

    @Override // p153l.fam
    /* JADX INFO: renamed from: q */
    public void mo124764q(float f) {
        MDLog.m7450i("VideoProcess", "setPlayingSrcAudioRatio %f", Float.valueOf(f));
        this.f131877v = f;
        this.f131856a.m161492d1(f);
    }

    @Override // p153l.fam
    /* JADX INFO: renamed from: r */
    public void mo124765r(ipw ipwVar) {
        this.f131856a.m161493e1(ipwVar);
    }

    @Override // p153l.fam
    public void release() {
        this.f131879x = null;
        this.f131878w.clear();
        this.f131856a.m161480L0();
        m154001A();
        this.f131861f = false;
        yqc0.m217079c();
    }

    @Override // p153l.fam
    public void resume() {
        if (this.f131861f) {
            this.f131856a.m161482Q0();
        }
    }

    /* JADX INFO: renamed from: x */
    public void m154012x(kt2 kt2Var) {
        this.f131856a.m161495h0(kt2Var);
    }
}
