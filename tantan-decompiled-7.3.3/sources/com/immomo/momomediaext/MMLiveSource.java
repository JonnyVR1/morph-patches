package com.immomo.momomediaext;

import android.content.Context;
import android.util.Log;
import com.core.glcore.util.SegmentHelper;
import com.cosmos.mdlog.MDLog;
import com.immomo.medialog.LogLevel;
import com.immomo.momomediaext.utils.MMLiveUserConfig;
import com.momo.mcamera.mask.MaskModel;
import com.momo.mcamera.mask.Sticker;
import com.momo.piplinemomoext.input.audio.InterfaceC4260a;
import com.momo.pub.MomoPipelineModuleRegister;
import com.momo.xeengine.XEnginePreferences;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import org.eclipse.jetty.util.StringUtil;
import p153l.arx;
import p153l.aul;
import p153l.b7y;
import p153l.brx;
import p153l.c4m;
import p153l.cnw;
import p153l.csx;
import p153l.drl;
import p153l.erf0;
import p153l.esl;
import p153l.fb4;
import p153l.fql;
import p153l.gb1;
import p153l.ib4;
import p153l.j410;
import p153l.kpl;
import p153l.l26;
import p153l.lg60;
import p153l.lvl;
import p153l.mvl;
import p153l.n5m;
import p153l.omw;
import p153l.oq70;
import p153l.ox3;
import p153l.ror;
import p153l.uw2;
import p153l.v94;
import p153l.ytl;
import p153l.yuf;
import tv.danmaku.ijk.media.player.OnPlayerStateCallback;
import tv.danmaku.ijk.media.streamer.MediaReportLogManager;
import tv.danmaku.ijk.media.streamer.NetUtil;
import tv.danmaku.ijk.media.streamer.ijkMediaStreamer;

/* JADX INFO: loaded from: classes7.dex */
public class MMLiveSource implements aul, ytl {

    /* JADX INFO: renamed from: A */
    private ytl f14502A;

    /* JADX INFO: renamed from: E */
    private MMLiveUserConfig f14506E;

    /* JADX INFO: renamed from: a */
    private WeakReference<Context> f14509a;

    /* JADX INFO: renamed from: b */
    private brx f14510b;

    /* JADX INFO: renamed from: c */
    private ror f14511c;

    /* JADX INFO: renamed from: d */
    private MomoPipelineModuleRegister f14512d;

    /* JADX INFO: renamed from: e */
    private fb4 f14513e;

    /* JADX INFO: renamed from: f */
    private lvl f14514f;

    /* JADX INFO: renamed from: h */
    private InterfaceC4260a f14516h;

    /* JADX INFO: renamed from: i */
    private kpl f14517i;

    /* JADX INFO: renamed from: j */
    private C4056b f14518j;

    /* JADX INFO: renamed from: k */
    private ijkMediaStreamer.OnErrorListener f14519k;

    /* JADX INFO: renamed from: l */
    private ijkMediaStreamer.OnInfoListener f14520l;

    /* JADX INFO: renamed from: r */
    private MediaReportLogManager.LogUploadCallBack f14526r;

    /* JADX INFO: renamed from: s */
    brx f14527s;

    /* JADX INFO: renamed from: z */
    private aul f14534z;

    /* JADX INFO: renamed from: g */
    private boolean f14515g = true;

    /* JADX INFO: renamed from: m */
    private NetUtil f14521m = null;

    /* JADX INFO: renamed from: n */
    private String f14522n = "";

    /* JADX INFO: renamed from: o */
    private String f14523o = "";

    /* JADX INFO: renamed from: p */
    private int f14524p = 0;

    /* JADX INFO: renamed from: q */
    private int f14525q = 0;

    /* JADX INFO: renamed from: t */
    private MomoMediaConstants$BEAUTY_TYPE f14528t = MomoMediaConstants$BEAUTY_TYPE.BEAUTY_TYPE_DOKI;

    /* JADX INFO: renamed from: u */
    private boolean f14529u = false;

    /* JADX INFO: renamed from: v */
    private int f14530v = 1;

    /* JADX INFO: renamed from: w */
    private OnPlayerStateCallback f14531w = null;

    /* JADX INFO: renamed from: x */
    private yuf f14532x = null;

    /* JADX INFO: renamed from: y */
    private final Queue<Runnable> f14533y = new LinkedList();

    /* JADX INFO: renamed from: B */
    private n5m f14503B = null;

    /* JADX INFO: renamed from: C */
    private mvl f14504C = null;

    /* JADX INFO: renamed from: D */
    private String f14505D = "";

    /* JADX INFO: renamed from: F */
    private gb1 f14507F = null;

    /* JADX INFO: renamed from: G */
    private drl f14508G = new C4043f();

    public enum MMAEFILETER {
        MMLiveAEFilterYUYIN,
        MMLiveAEFilterET,
        MMLiveAEFilterPaPi,
        MMLiveAEFilterTransformer,
        MMLiveAEFilterRobot,
        MMLiveAEFilterMan,
        MMLiveAEFilterWoman,
        MMLiveAEFilterBaby,
        MMLiveAEFilterMC,
        MMLiveAEFilterELE,
        MMLiveAEFilterMinions,
        MMLiveAEFilterMute,
        MMLiveAEFilterGiftRobot
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveSource$a */
    public class RunnableC4038a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f14535a;

        public RunnableC4038a(String str) {
            this.f14535a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MMLiveSource.this.f14517i == null || this.f14535a == null) {
                return;
            }
            MMLiveSource.this.f14517i.mo137087b(this.f14535a);
        }
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveSource$b */
    public class C4039b implements j410.InterfaceC17870b {
        public C4039b() {
        }

        @Override // p153l.j410.InterfaceC17870b
        /* JADX INFO: renamed from: a */
        public void mo19378a(String str, String str2) {
            if (MMLiveSource.this.f14526r != null) {
                MMLiveSource.this.f14526r.m223625a(str, str2);
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveSource$c */
    public class C4040c implements MomoPipelineModuleRegister.InterfaceC4262b {
        public C4040c() {
        }

        @Override // com.momo.pub.MomoPipelineModuleRegister.InterfaceC4262b
        /* JADX INFO: renamed from: a */
        public void mo19379a(int i, int i2, c4m c4mVar) {
            oq70.m168791d().m168795c("MomoCamera", "what#########" + i);
            if (MMLiveSource.this.f14520l != null) {
                MMLiveSource.this.f14520l.m224076a(null, i, i2);
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveSource$e */
    public class C4042e implements MomoPipelineModuleRegister.InterfaceC4263c {
        public C4042e() {
        }

        @Override // com.momo.pub.MomoPipelineModuleRegister.InterfaceC4263c
        /* JADX INFO: renamed from: a */
        public void mo19380a(c4m c4mVar) {
            synchronized (this) {
                try {
                    if (MMLiveSource.this.f14512d != null) {
                        MMLiveSource.this.f14512d.mo21180z(c4mVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.momo.pub.MomoPipelineModuleRegister.InterfaceC4263c
        /* JADX INFO: renamed from: b */
        public void mo19381b(c4m c4mVar) {
            oq70.m168791d().m168795c("MomoCamera", "onRecordPrepared");
        }
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveSource$f */
    public class C4043f implements drl {
        public C4043f() {
        }

        @Override // p153l.drl
        /* JADX INFO: renamed from: a */
        public int mo19374a() {
            oq70.m168791d().m168795c("pip->PIPLINE2", "getError: mOutErrorCode=" + MMLiveSource.this.f14525q + ";mErrorCode=" + MMLiveSource.this.f14524p);
            int i = MMLiveSource.this.f14525q;
            MMLiveSource mMLiveSource = MMLiveSource.this;
            return i == 0 ? mMLiveSource.f14524p : mMLiveSource.f14525q;
        }

        @Override // p153l.drl
        /* JADX INFO: renamed from: b */
        public String mo19375b() {
            NetUtil netUtil = MMLiveSource.this.f14521m;
            MMLiveSource mMLiveSource = MMLiveSource.this;
            return netUtil == null ? mMLiveSource.f14523o : mMLiveSource.f14523o = String.valueOf(mMLiveSource.f14521m.m223741a());
        }

        @Override // p153l.drl
        /* JADX INFO: renamed from: c */
        public String mo19376c() {
            return StringUtil.ALL_INTERFACES;
        }

        @Override // p153l.drl
        /* JADX INFO: renamed from: d */
        public String mo19377d() {
            NetUtil netUtil = MMLiveSource.this.f14521m;
            MMLiveSource mMLiveSource = MMLiveSource.this;
            if (netUtil == null) {
                return mMLiveSource.f14522n;
            }
            return mMLiveSource.f14522n = mMLiveSource.f14521m.m223744d() ? "wifi" : "other";
        }

        @Override // p153l.drl
        public String getPushType() {
            return "1";
        }
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveSource$g */
    public class RunnableC4044g implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f14542a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f14543b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ float f14544c;

        public RunnableC4044g(String str, String str2, float f) {
            this.f14542a = str;
            this.f14543b = str2;
            this.f14544c = f;
        }

        @Override // java.lang.Runnable
        public void run() {
            MMLiveSource.this.f14517i.mo132241g(this.f14542a, this.f14543b, this.f14544c);
        }
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveSource$h */
    public class RunnableC4045h implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f14546a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f14547b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ float f14548c;

        public RunnableC4045h(String str, String str2, float f) {
            this.f14546a = str;
            this.f14547b = str2;
            this.f14548c = f;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MMLiveSource.this.f14517i != null) {
                MMLiveSource.this.f14517i.updateMakeupStyleValue(this.f14546a, this.f14547b, this.f14548c);
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveSource$i */
    public class RunnableC4046i implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f14550a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f14551b;

        public RunnableC4046i(String str, String str2) {
            this.f14550a = str;
            this.f14551b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MMLiveSource.this.f14517i != null) {
                MMLiveSource.this.f14517i.removeMakeupStyle(this.f14550a, this.f14551b);
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveSource$j */
    public class RunnableC4047j implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ float f14553a;

        public RunnableC4047j(float f) {
            this.f14553a = f;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MMLiveSource.this.f14517i != null) {
                MMLiveSource.this.f14517i.mo150745q(this.f14553a);
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveSource$k */
    public class C4048k implements C4056b.c {
        public C4048k() {
        }

        @Override // com.immomo.momomediaext.C4056b.c
        /* JADX INFO: renamed from: a */
        public void mo20211a(Sticker sticker) {
            MMLiveSource.this.m20201j0(sticker);
        }
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveSource$l */
    public class RunnableC4049l implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Sticker f14556a;

        public RunnableC4049l(Sticker sticker) {
            this.f14556a = sticker;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MMLiveSource.this.f14517i == null || this.f14556a == null) {
                return;
            }
            MMLiveSource.this.f14517i.mo137090e(this.f14556a.getStickerType());
            MMLiveSource.this.f14517i.mo137095o(this.f14556a);
            Log.e("MMLiveSource", "updateWatermark: Refresh");
        }
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveSource$m */
    public class RunnableC4050m implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f14558a;

        public RunnableC4050m(String str) {
            this.f14558a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MMLiveSource.this.f14517i != null) {
                MMLiveSource.this.f14517i.mo132243k(this.f14558a);
                MDLog.m7449i("MMLiveSource", "selectFilter: path:" + this.f14558a);
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveSource$n */
    public class RunnableC4051n implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ float f14560a;

        public RunnableC4051n(float f) {
            this.f14560a = f;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MMLiveSource.this.f14517i != null) {
                MMLiveSource.this.f14517i.mo132242h(this.f14560a);
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveSource$o */
    public class RunnableC4052o implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ MaskModel f14562a;

        public RunnableC4052o(MaskModel maskModel) {
            this.f14562a = maskModel;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MMLiveSource.this.f14517i != null) {
                MMLiveSource.this.f14517i.mo137088c(this.f14562a);
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveSource$p */
    public class RunnableC4053p implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ MaskModel f14564a;

        public RunnableC4053p(MaskModel maskModel) {
            this.f14564a = maskModel;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MMLiveSource.this.f14517i != null) {
                MMLiveSource.this.f14517i.mo137086a(this.f14564a);
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveSource$q */
    public class RunnableC4054q implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f14566a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ MaskModel f14567b;

        public RunnableC4054q(String str, MaskModel maskModel) {
            this.f14566a = str;
            this.f14567b = maskModel;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MMLiveSource.this.f14517i == null || this.f14566a == null || this.f14567b == null) {
                return;
            }
            MMLiveSource.this.f14517i.mo137091f(this.f14566a, this.f14567b);
        }
    }

    public MMLiveSource(MomoPipelineModuleRegister momoPipelineModuleRegister, Context context, MMLiveUserConfig mMLiveUserConfig) {
        this.f14509a = new WeakReference<>(context);
        l26.m152569a(context.getApplicationContext());
        this.f14506E = mMLiveUserConfig;
        this.f14512d = momoPipelineModuleRegister;
        this.f14511c = momoPipelineModuleRegister.getParameters();
        m20164v(this.f14527s);
        fb4 fb4Var = new fb4(momoPipelineModuleRegister);
        this.f14513e = fb4Var;
        cnw.m111542a(fb4Var);
        if (mMLiveUserConfig.isAudioOnly() || !m20165x()) {
            return;
        }
        uw2 uw2Var = new uw2(momoPipelineModuleRegister);
        this.f14517i = uw2Var;
        uw2Var.mo150743n(this.f14509a.get(), this.f14513e, this);
        this.f14517i.mo137089d(this.f14516h);
    }

    /* JADX INFO: renamed from: v */
    private void m20164v(brx brxVar) {
        this.f14510b = brxVar;
        this.f14512d.mo21168n();
        this.f14512d.mo21150K();
        this.f14512d.mo21146G(this.f14508G);
        this.f14512d.mo21143D(new C4039b());
        this.f14512d.mo21140A(new C4040c());
        this.f14512d.mo21159e(new C4041d());
        this.f14516h = this.f14512d.mo21166l();
        this.f14512d.mo21160f(new C4042e());
    }

    /* JADX INFO: renamed from: x */
    private boolean m20165x() {
        try {
            XEnginePreferences.checkEngineEnv();
            return true;
        } catch (Exception e) {
            b7y.m102882c().m102888g("xengine checkEngineEnv failed");
            b7y.m102882c().m102887f("MMLiveSource", "isAudioOnly", "false");
            b7y.m102882c().m102883a("MMLiveSource", "xeengine:" + e.toString(), LogLevel.ERROR);
            return false;
        }
    }

    /* JADX INFO: renamed from: A */
    public long m20166A() {
        InterfaceC4260a interfaceC4260a = this.f14516h;
        if (interfaceC4260a != null) {
            return interfaceC4260a.getMusicDuration();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: B */
    public void m20167B(boolean z) {
        this.f14529u = z;
        lvl lvlVar = this.f14514f;
        if (lvlVar != null) {
            lvlVar.mo155998t(z);
        }
    }

    /* JADX INFO: renamed from: C */
    public void m20168C() {
        m20197f0();
        SegmentHelper.release();
        m20196e0();
        cnw.m111543b();
        synchronized (this) {
            try {
                NetUtil netUtil = this.f14521m;
                if (netUtil != null) {
                    netUtil.m223745e();
                    this.f14521m = null;
                }
                InterfaceC4260a interfaceC4260a = this.f14516h;
                if (interfaceC4260a != null) {
                    interfaceC4260a.mo21110d1();
                    this.f14516h = null;
                }
                fb4 fb4Var = this.f14513e;
                if (fb4Var != null) {
                    fb4Var.m124855d0();
                    this.f14513e = null;
                }
                lvl lvlVar = this.f14514f;
                if (lvlVar != null) {
                    lvlVar.mo109166G();
                    this.f14512d.mo21141B(this.f14514f);
                    this.f14514f = null;
                }
                this.f14526r = null;
                this.f14519k = null;
                this.f14509a.clear();
                this.f14509a = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: D */
    public void m20169D(String str) {
        kpl kplVar = this.f14517i;
        if (kplVar != null) {
            kplVar.mo137087b(str);
        } else {
            this.f14533y.add(new RunnableC4038a(str));
        }
    }

    /* JADX INFO: renamed from: E */
    public boolean m20170E(String str, String str2) {
        kpl kplVar = this.f14517i;
        if (kplVar != null) {
            kplVar.removeMakeupStyle(str, str2);
            return true;
        }
        this.f14533y.add(new RunnableC4046i(str, str2));
        return true;
    }

    /* JADX INFO: renamed from: F */
    public void m20171F(MaskModel maskModel) {
        kpl kplVar = this.f14517i;
        if (kplVar != null) {
            kplVar.mo137086a(maskModel);
        } else {
            this.f14533y.add(new RunnableC4053p(maskModel));
        }
    }

    /* JADX INFO: renamed from: G */
    public void m20172G() {
        C4056b c4056b = this.f14518j;
        if (c4056b != null) {
            c4056b.m20272f();
            this.f14518j = null;
        }
    }

    /* JADX INFO: renamed from: H */
    public void m20173H() {
        MomoPipelineModuleRegister momoPipelineModuleRegister = this.f14512d;
        if (momoPipelineModuleRegister != null) {
            momoPipelineModuleRegister.mo21153N();
        }
    }

    /* JADX INFO: renamed from: I */
    public void m20174I(ytl ytlVar) {
        this.f14502A = ytlVar;
    }

    /* JADX INFO: renamed from: J */
    public void m20175J(MomoMediaConstants$BEAUTY_TYPE momoMediaConstants$BEAUTY_TYPE) {
        this.f14528t = momoMediaConstants$BEAUTY_TYPE;
        kpl kplVar = this.f14517i;
        if (kplVar != null) {
            kplVar.mo132244r(momoMediaConstants$BEAUTY_TYPE.value());
        }
        fb4 fb4Var = this.f14513e;
        if (fb4Var != null) {
            fb4Var.m124845W(cnw.m111544c());
            this.f14513e.mo122373e(this.f14528t != MomoMediaConstants$BEAUTY_TYPE.BEAUTY_TYPE_BYTE);
        }
    }

    /* JADX INFO: renamed from: K */
    public void m20176K(boolean z) {
        fb4 fb4Var = this.f14513e;
        if (fb4Var != null) {
            fb4Var.mo122381w(z);
        }
    }

    /* JADX INFO: renamed from: L */
    public void m20177L(int i) {
        fb4 fb4Var = this.f14513e;
        if (fb4Var != null) {
            fb4Var.m124841S(i);
        }
    }

    /* JADX INFO: renamed from: M */
    public void m20178M(ib4.InterfaceC17689l interfaceC17689l) {
        fb4 fb4Var = this.f14513e;
        if (fb4Var == null || interfaceC17689l == null) {
            return;
        }
        fb4Var.m124843U(interfaceC17689l);
    }

    /* JADX INFO: renamed from: N */
    public void m20179N(int i, int i2) {
        fb4 fb4Var = this.f14513e;
        if (fb4Var != null) {
            fb4Var.m124847Y(new erf0(i2, i));
        }
        MomoPipelineModuleRegister momoPipelineModuleRegister = this.f14512d;
        if (momoPipelineModuleRegister != null) {
            ror parameters = momoPipelineModuleRegister.getParameters();
            parameters.f175506s = i;
            parameters.f175508t = i2;
            this.f14512d.mo21173s(i, i2);
            this.f14512d.mo21175u(i, i2, i, i2, true);
        }
    }

    /* JADX INFO: renamed from: O */
    public void m20180O(int i, int i2) {
        fb4 fb4Var = this.f14513e;
        if (fb4Var != null) {
            fb4Var.m124844V(new erf0(i, i2));
        }
    }

    /* JADX INFO: renamed from: P */
    public void m20181P(aul aulVar) {
        this.f14534z = aulVar;
    }

    /* JADX INFO: renamed from: Q */
    public void m20182Q(boolean z) {
        fb4 fb4Var = this.f14513e;
        if (fb4Var != null) {
            fb4Var.mo122377k(z);
        }
    }

    /* JADX INFO: renamed from: R */
    public void m20183R(yuf yufVar) {
        b7y.m102882c().m102888g("setFaceFeatureCallback", yufVar);
        this.f14532x = yufVar;
    }

    /* JADX INFO: renamed from: S */
    public void m20184S(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        kpl kplVar = this.f14517i;
        if (kplVar != null) {
            kplVar.mo132242h(f);
        } else {
            this.f14533y.add(new RunnableC4051n(f));
        }
        MDLog.m7449i("MMLiveSource", "setIntensity: value:" + f);
    }

    /* JADX INFO: renamed from: T */
    public void m20185T(boolean z) {
        float fMax;
        if (z) {
            ror rorVar = this.f14511c;
            fMax = Math.max(rorVar.f175496n / rorVar.f175512w, rorVar.f175494m / rorVar.f175513x);
        } else {
            fMax = 1.0f;
        }
        fb4 fb4Var = this.f14513e;
        if (fb4Var != null) {
            ror rorVar2 = this.f14511c;
            fb4Var.m124857f0(rorVar2.f175512w, rorVar2.f175513x);
            this.f14513e.m124846X(fMax);
            v94 v94VarM124837N = this.f14513e.m124837N();
            if (v94VarM124837N != null) {
                v94VarM124837N.m200373C(fMax);
                v94VarM124837N.m200395s(false);
                this.f14513e.m124842T(v94VarM124837N);
            }
        }
        kpl kplVar = this.f14517i;
        if (kplVar != null) {
            kplVar.mo150745q(fMax);
        } else {
            this.f14533y.add(new RunnableC4047j(fMax));
        }
    }

    /* JADX INFO: renamed from: U */
    public void m20186U(String str) {
        kpl kplVar = this.f14517i;
        if (kplVar == null) {
            this.f14533y.add(new RunnableC4050m(str));
            return;
        }
        kplVar.mo132243k(str);
        MDLog.m7449i("MMLiveSource", "selectFilter: path:" + str);
    }

    /* JADX INFO: renamed from: V */
    public void m20187V(float f) {
        InterfaceC4260a interfaceC4260a = this.f14516h;
        if (interfaceC4260a != null) {
            interfaceC4260a.setMusicVolume(f);
        }
        lvl lvlVar = this.f14514f;
        if (lvlVar != null) {
            lvlVar.setVolume(f);
        }
    }

    /* JADX INFO: renamed from: W */
    public void m20188W(int i, int i2) {
        fb4 fb4Var = this.f14513e;
        if (fb4Var != null) {
            fb4Var.m124849a0(new erf0(i, i2));
        }
        ror rorVar = this.f14511c;
        rorVar.f175510u = i;
        rorVar.f175511v = i2;
        MomoPipelineModuleRegister momoPipelineModuleRegister = this.f14512d;
        if (momoPipelineModuleRegister != null) {
            momoPipelineModuleRegister.mo21158d(rorVar);
        }
    }

    /* JADX INFO: renamed from: X */
    public void m20189X(int i) {
        ror rorVar = this.f14511c;
        if (rorVar != null) {
            rorVar.f175447D = i;
        }
        fb4 fb4Var = this.f14513e;
        if (fb4Var != null) {
            fb4Var.m124848Z(i);
        }
    }

    /* JADX INFO: renamed from: Y */
    public void m20190Y(boolean z) {
        InterfaceC4260a interfaceC4260a = this.f14516h;
        if (interfaceC4260a != null) {
            interfaceC4260a.mo21135z(z);
        }
    }

    /* JADX INFO: renamed from: Z */
    public void m20191Z(int i) {
        fb4 fb4Var = this.f14513e;
        if (fb4Var != null) {
            fb4Var.m124851b0(i);
        }
    }

    @Override // p153l.aul
    /* JADX INFO: renamed from: a */
    public void mo20126a(omw omwVar) {
        aul aulVar = this.f14534z;
        if (aulVar != null) {
            aulVar.mo20126a(omwVar);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m20192a0(String str) {
        if (this.f14518j == null) {
            C4056b c4056b = new C4056b(str);
            this.f14518j = c4056b;
            c4056b.m20273g(26000, new C4048k());
            Log.e("MMLiveSource", "setWaterMark: " + str);
        }
    }

    @Override // p153l.ytl
    /* JADX INFO: renamed from: b */
    public void mo20127b() {
        ytl ytlVar = this.f14502A;
        if (ytlVar != null) {
            ytlVar.mo20127b();
        }
    }

    /* JADX INFO: renamed from: b0 */
    public int m20193b0(int i, Object obj) {
        b7y.m102882c().m102888g("MMLiveSource", "camera startPreview beautyModule:" + this.f14517i);
        if (!this.f14513e.m124853c0(i, obj)) {
            return 1;
        }
        if (this.f14517i == null) {
            uw2 uw2Var = new uw2(this.f14512d);
            this.f14517i = uw2Var;
            uw2Var.mo150743n(this.f14509a.get(), this.f14513e, this);
        }
        MomoPipelineModuleRegister momoPipelineModuleRegister = this.f14512d;
        if (momoPipelineModuleRegister != null) {
            momoPipelineModuleRegister.mo21176v(this.f14511c);
        }
        fb4 fb4Var = this.f14513e;
        if (fb4Var != null) {
            fb4Var.mo122373e(this.f14528t != MomoMediaConstants$BEAUTY_TYPE.BEAUTY_TYPE_BYTE);
            this.f14513e.m124836M(null, this.f14532x);
        }
        arx.C15814d c15814dM99797h = arx.m99789d().m99797h(this.f14506E.getAppid());
        if (c15814dM99797h != null && c15814dM99797h.f73012e != null) {
            csx.m112235R().m112328d2(c15814dM99797h.f73012e.f78224O);
            csx.m112235R().m112340g2(c15814dM99797h.f73012e.f78226P / 100.0f);
            csx.m112235R().m112336f2(c15814dM99797h.f73012e.f78228Q / 100.0f);
            csx.m112235R().m112332e2(c15814dM99797h.f73012e.f78230R / 100.0f);
            csx.m112235R().m112247D1(c15814dM99797h.f73012e.f78236U);
            csx.m112235R().m112253F1(c15814dM99797h.f73012e.f78238V);
            csx.m112235R().m112250E1(c15814dM99797h.f73012e.f78240W / 100.0f);
            fb4 fb4Var2 = this.f14513e;
            if (fb4Var2 != null) {
                fb4Var2.mo122379s(c15814dM99797h.f73012e.f78234T);
                csx.C16355c c16355c = c15814dM99797h.f73012e.f78203D0;
                if (c16355c != null) {
                    this.f14513e.m124840R(ox3.m169674a(c16355c));
                }
            }
            kpl kplVar = this.f14517i;
            if (kplVar != null) {
                kplVar.mo150744p();
            }
        }
        kpl kplVar2 = this.f14517i;
        if (kplVar2 != null) {
            kplVar2.mo137089d(this.f14516h);
            this.f14517i.mo132244r(this.f14528t.value());
            this.f14517i.mo150742j(this);
        }
        Iterator<Runnable> it = this.f14533y.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
        this.f14533y.clear();
        b7y.m102882c().m102888g("camera startPreview", "camera obj is" + this.f14513e.hashCode());
        return 0;
    }

    /* JADX INFO: renamed from: c0 */
    public void m20194c0() {
        InterfaceC4260a interfaceC4260a = this.f14516h;
        if (interfaceC4260a != null) {
            interfaceC4260a.stopSurroundMusic();
        }
    }

    /* JADX INFO: renamed from: d0 */
    public void m20195d0(int i) {
        InterfaceC4260a interfaceC4260a = this.f14516h;
        if (interfaceC4260a != null) {
            interfaceC4260a.stopSurroundMusic();
        }
    }

    /* JADX INFO: renamed from: e0 */
    public void m20196e0() {
        InterfaceC4260a interfaceC4260a = this.f14516h;
        if (interfaceC4260a != null) {
            interfaceC4260a.mo21111d2();
        }
    }

    /* JADX INFO: renamed from: f0 */
    public void m20197f0() {
        if (this.f14517i != null) {
            this.f14533y.clear();
            this.f14517i.mo150742j(null);
            this.f14517i.destroy();
            this.f14517i = null;
        }
        if (this.f14513e != null) {
            b7y.m102882c().m102888g("MMLiveSource", "stopPreview camera obj is:" + this.f14513e.hashCode());
            this.f14513e.m124855d0();
        }
        b7y.m102882c().m102888g("MMLiveSource", "stopPreview mSelectFileStop" + this.f14515g);
        if (this.f14514f == null || this.f14515g) {
            return;
        }
        oq70.m168791d().m168795c("pip->PIPLINE2", "stopRenderer: stopRenderer()");
        this.f14515g = true;
        this.f14514f.mo109166G();
        this.f14512d.mo21141B(this.f14514f);
        this.f14514f = null;
        oq70.m168791d().m168795c("pip->PIPLINE2", "stopRenderer: stopRenderer() end");
    }

    /* JADX INFO: renamed from: g0 */
    public int m20198g0() {
        fb4 fb4Var = this.f14513e;
        return fb4Var != null ? fb4Var.m124856e0() : m20209y() ? 1 : 0;
    }

    /* JADX INFO: renamed from: h0 */
    public boolean m20199h0(String str, String str2, float f) {
        kpl kplVar = this.f14517i;
        if (kplVar != null) {
            kplVar.mo132241g(str, str2, f);
            return true;
        }
        this.f14533y.add(new RunnableC4044g(str, str2, f));
        return true;
    }

    /* JADX INFO: renamed from: i0 */
    public boolean m20200i0(String str, String str2, float f) {
        kpl kplVar = this.f14517i;
        if (kplVar != null) {
            kplVar.updateMakeupStyleValue(str, str2, f);
            return true;
        }
        this.f14533y.add(new RunnableC4045h(str, str2, f));
        return true;
    }

    /* JADX INFO: renamed from: j0 */
    public void m20201j0(Sticker sticker) {
        kpl kplVar = this.f14517i;
        if (kplVar == null || sticker == null) {
            this.f14533y.add(new RunnableC4049l(sticker));
            return;
        }
        kplVar.mo137090e(sticker.getStickerType());
        this.f14517i.mo137095o(sticker);
        Log.e("MMLiveSource", "updateWatermark: Refresh");
    }

    @Override // p153l.ytl
    public void onBeautyError(int i, String str) {
        ytl ytlVar = this.f14502A;
        if (ytlVar != null) {
            ytlVar.onBeautyError(i, str);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m20202p(String str, MaskModel maskModel) {
        kpl kplVar = this.f14517i;
        if (kplVar == null || str == null || maskModel == null) {
            this.f14533y.add(new RunnableC4054q(str, maskModel));
        } else {
            kplVar.mo137091f(str, maskModel);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m20203q(MaskModel maskModel) {
        kpl kplVar = this.f14517i;
        if (kplVar != null) {
            kplVar.mo137088c(maskModel);
        } else {
            this.f14533y.add(new RunnableC4052o(maskModel));
        }
    }

    /* JADX INFO: renamed from: r */
    public kpl m20204r() {
        return this.f14517i;
    }

    /* JADX INFO: renamed from: s */
    public fql m20205s() {
        return this.f14513e;
    }

    /* JADX INFO: renamed from: t */
    public esl m20206t() {
        return this.f14513e;
    }

    /* JADX INFO: renamed from: u */
    public InterfaceC4260a m20207u() {
        return this.f14516h;
    }

    /* JADX INFO: renamed from: w */
    public boolean m20208w() {
        fb4 fb4Var = this.f14513e;
        if (fb4Var != null) {
            return fb4Var.getIsCameraCreate();
        }
        return false;
    }

    /* JADX INFO: renamed from: y */
    public boolean m20209y() {
        fb4 fb4Var = this.f14513e;
        if (fb4Var != null) {
            return fb4Var.m124839P();
        }
        return true;
    }

    /* JADX INFO: renamed from: z */
    public long m20210z() {
        InterfaceC4260a interfaceC4260a = this.f14516h;
        if (interfaceC4260a != null) {
            return interfaceC4260a.mo21129w();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveSource$d */
    public class C4041d implements MomoPipelineModuleRegister.InterfaceC4261a {
        public C4041d() {
        }

        @Override // com.momo.pub.MomoPipelineModuleRegister.InterfaceC4261a
        /* JADX INFO: renamed from: b */
        public void mo19372b(int i, int i2, c4m c4mVar) {
            MMLiveSource.this.f14524p = lg60.m154064a(i, i2);
            if (MMLiveSource.this.f14519k != null) {
                MMLiveSource.this.f14519k.m224075a(null, i, i2);
            }
        }

        @Override // com.momo.pub.MomoPipelineModuleRegister.InterfaceC4261a
        /* JADX INFO: renamed from: a */
        public void mo19371a(int i, int i2, c4m c4mVar) {
        }
    }
}
