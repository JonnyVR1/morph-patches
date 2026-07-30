package com.immomo.momomediaext;

import android.content.Context;
import android.util.Log;
import com.core.glcore.util.SegmentHelper;
import com.cosmos.mdlog.MDLog;
import com.immomo.medialog.LogLevel;
import com.immomo.momomediaext.utils.MMLiveUserConfig;
import com.momo.mcamera.mask.MaskModel;
import com.momo.mcamera.mask.Sticker;
import com.momo.piplinemomoext.input.audio.InterfaceC4109a;
import com.momo.pub.MomoPipelineModuleRegister;
import com.momo.xeengine.XEnginePreferences;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import org.eclipse.jetty.util.StringUtil;
import p149l.bw00;
import p149l.dix;
import p149l.dkw;
import p149l.eix;
import p149l.ew2;
import p149l.eyx;
import p149l.fjx;
import p149l.g16;
import p149l.g860;
import p149l.ga4;
import p149l.ii70;
import p149l.j1m;
import p149l.ja4;
import p149l.ktf;
import p149l.lrl;
import p149l.nrl;
import p149l.pjw;
import p149l.pw3;
import p149l.qmr;
import p149l.rpl;
import p149l.sol;
import p149l.unl;
import p149l.v2m;
import p149l.vif0;
import p149l.w84;
import p149l.xsl;
import p149l.ysl;
import p149l.za1;
import p149l.zml;
import tv.danmaku.ijk.media.player.OnPlayerStateCallback;
import tv.danmaku.ijk.media.streamer.MediaReportLogManager;
import tv.danmaku.ijk.media.streamer.NetUtil;
import tv.danmaku.ijk.media.streamer.ijkMediaStreamer;

/* JADX INFO: loaded from: classes7.dex */
public class MMLiveSource implements nrl, lrl {

    /* JADX INFO: renamed from: A */
    private lrl f13808A;

    /* JADX INFO: renamed from: E */
    private MMLiveUserConfig f13812E;

    /* JADX INFO: renamed from: a */
    private WeakReference<Context> f13815a;

    /* JADX INFO: renamed from: b */
    private eix f13816b;

    /* JADX INFO: renamed from: c */
    private qmr f13817c;

    /* JADX INFO: renamed from: d */
    private MomoPipelineModuleRegister f13818d;

    /* JADX INFO: renamed from: e */
    private ga4 f13819e;

    /* JADX INFO: renamed from: f */
    private xsl f13820f;

    /* JADX INFO: renamed from: h */
    private InterfaceC4109a f13822h;

    /* JADX INFO: renamed from: i */
    private zml f13823i;

    /* JADX INFO: renamed from: j */
    private C3913b f13824j;

    /* JADX INFO: renamed from: k */
    private ijkMediaStreamer.OnErrorListener f13825k;

    /* JADX INFO: renamed from: l */
    private ijkMediaStreamer.OnInfoListener f13826l;

    /* JADX INFO: renamed from: r */
    private MediaReportLogManager.LogUploadCallBack f13832r;

    /* JADX INFO: renamed from: s */
    eix f13833s;

    /* JADX INFO: renamed from: z */
    private nrl f13840z;

    /* JADX INFO: renamed from: g */
    private boolean f13821g = true;

    /* JADX INFO: renamed from: m */
    private NetUtil f13827m = null;

    /* JADX INFO: renamed from: n */
    private String f13828n = "";

    /* JADX INFO: renamed from: o */
    private String f13829o = "";

    /* JADX INFO: renamed from: p */
    private int f13830p = 0;

    /* JADX INFO: renamed from: q */
    private int f13831q = 0;

    /* JADX INFO: renamed from: t */
    private MomoMediaConstants$BEAUTY_TYPE f13834t = MomoMediaConstants$BEAUTY_TYPE.BEAUTY_TYPE_DOKI;

    /* JADX INFO: renamed from: u */
    private boolean f13835u = false;

    /* JADX INFO: renamed from: v */
    private int f13836v = 1;

    /* JADX INFO: renamed from: w */
    private OnPlayerStateCallback f13837w = null;

    /* JADX INFO: renamed from: x */
    private ktf f13838x = null;

    /* JADX INFO: renamed from: y */
    private final Queue<Runnable> f13839y = new LinkedList();

    /* JADX INFO: renamed from: B */
    private v2m f13809B = null;

    /* JADX INFO: renamed from: C */
    private ysl f13810C = null;

    /* JADX INFO: renamed from: D */
    private String f13811D = "";

    /* JADX INFO: renamed from: F */
    private za1 f13813F = null;

    /* JADX INFO: renamed from: G */
    private sol f13814G = new C3900f();

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
    public class RunnableC3895a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f13841a;

        public RunnableC3895a(String str) {
            this.f13841a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MMLiveSource.this.f13823i == null || this.f13841a == null) {
                return;
            }
            MMLiveSource.this.f13823i.mo118384b(this.f13841a);
        }
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveSource$b */
    public class C3896b implements bw00.InterfaceC15993b {
        public C3896b() {
        }

        @Override // p149l.bw00.InterfaceC15993b
        /* JADX INFO: renamed from: a */
        public void mo18369a(String str, String str2) {
            if (MMLiveSource.this.f13832r != null) {
                MMLiveSource.this.f13832r.m222379a(str, str2);
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveSource$c */
    public class C3897c implements MomoPipelineModuleRegister.InterfaceC4111b {
        public C3897c() {
        }

        @Override // com.momo.pub.MomoPipelineModuleRegister.InterfaceC4111b
        /* JADX INFO: renamed from: a */
        public void mo18370a(int i, int i2, j1m j1mVar) {
            ii70.m136344d().m136348c("MomoCamera", "what#########" + i);
            if (MMLiveSource.this.f13826l != null) {
                MMLiveSource.this.f13826l.m222830a(null, i, i2);
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveSource$e */
    public class C3899e implements MomoPipelineModuleRegister.InterfaceC4112c {
        public C3899e() {
        }

        @Override // com.momo.pub.MomoPipelineModuleRegister.InterfaceC4112c
        /* JADX INFO: renamed from: a */
        public void mo18371a(j1m j1mVar) {
            synchronized (this) {
                try {
                    if (MMLiveSource.this.f13818d != null) {
                        MMLiveSource.this.f13818d.mo20181z(j1mVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.momo.pub.MomoPipelineModuleRegister.InterfaceC4112c
        /* JADX INFO: renamed from: b */
        public void mo18372b(j1m j1mVar) {
            ii70.m136344d().m136348c("MomoCamera", "onRecordPrepared");
        }
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveSource$f */
    public class C3900f implements sol {
        public C3900f() {
        }

        @Override // p149l.sol
        /* JADX INFO: renamed from: a */
        public int mo18365a() {
            ii70.m136344d().m136348c("pip->PIPLINE2", "getError: mOutErrorCode=" + MMLiveSource.this.f13831q + ";mErrorCode=" + MMLiveSource.this.f13830p);
            int i = MMLiveSource.this.f13831q;
            MMLiveSource mMLiveSource = MMLiveSource.this;
            return i == 0 ? mMLiveSource.f13830p : mMLiveSource.f13831q;
        }

        @Override // p149l.sol
        /* JADX INFO: renamed from: b */
        public String mo18366b() {
            NetUtil netUtil = MMLiveSource.this.f13827m;
            MMLiveSource mMLiveSource = MMLiveSource.this;
            return netUtil == null ? mMLiveSource.f13829o : mMLiveSource.f13829o = String.valueOf(mMLiveSource.f13827m.m222495a());
        }

        @Override // p149l.sol
        /* JADX INFO: renamed from: c */
        public String mo18367c() {
            return StringUtil.ALL_INTERFACES;
        }

        @Override // p149l.sol
        /* JADX INFO: renamed from: d */
        public String mo18368d() {
            NetUtil netUtil = MMLiveSource.this.f13827m;
            MMLiveSource mMLiveSource = MMLiveSource.this;
            if (netUtil == null) {
                return mMLiveSource.f13828n;
            }
            return mMLiveSource.f13828n = mMLiveSource.f13827m.m222498d() ? "wifi" : "other";
        }

        @Override // p149l.sol
        public String getPushType() {
            return "1";
        }
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveSource$g */
    public class RunnableC3901g implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f13848a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f13849b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ float f13850c;

        public RunnableC3901g(String str, String str2, float f) {
            this.f13848a = str;
            this.f13849b = str2;
            this.f13850c = f;
        }

        @Override // java.lang.Runnable
        public void run() {
            MMLiveSource.this.f13823i.mo98794g(this.f13848a, this.f13849b, this.f13850c);
        }
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveSource$h */
    public class RunnableC3902h implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f13852a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f13853b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ float f13854c;

        public RunnableC3902h(String str, String str2, float f) {
            this.f13852a = str;
            this.f13853b = str2;
            this.f13854c = f;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MMLiveSource.this.f13823i != null) {
                MMLiveSource.this.f13823i.updateMakeupStyleValue(this.f13852a, this.f13853b, this.f13854c);
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveSource$i */
    public class RunnableC3903i implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f13856a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f13857b;

        public RunnableC3903i(String str, String str2) {
            this.f13856a = str;
            this.f13857b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MMLiveSource.this.f13823i != null) {
                MMLiveSource.this.f13823i.removeMakeupStyle(this.f13856a, this.f13857b);
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveSource$j */
    public class RunnableC3904j implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ float f13859a;

        public RunnableC3904j(float f) {
            this.f13859a = f;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MMLiveSource.this.f13823i != null) {
                MMLiveSource.this.f13823i.mo118396q(this.f13859a);
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveSource$k */
    public class C3905k implements C3913b.c {
        public C3905k() {
        }

        @Override // com.immomo.momomediaext.C3913b.c
        /* JADX INFO: renamed from: a */
        public void mo19231a(Sticker sticker) {
            MMLiveSource.this.m19221j0(sticker);
        }
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveSource$l */
    public class RunnableC3906l implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Sticker f13862a;

        public RunnableC3906l(Sticker sticker) {
            this.f13862a = sticker;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MMLiveSource.this.f13823i == null || this.f13862a == null) {
                return;
            }
            MMLiveSource.this.f13823i.mo118387e(this.f13862a.getStickerType());
            MMLiveSource.this.f13823i.mo118394o(this.f13862a);
            Log.e("MMLiveSource", "updateWatermark: Refresh");
        }
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveSource$m */
    public class RunnableC3907m implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f13864a;

        public RunnableC3907m(String str) {
            this.f13864a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MMLiveSource.this.f13823i != null) {
                MMLiveSource.this.f13823i.mo98796k(this.f13864a);
                MDLog.m7395i("MMLiveSource", "selectFilter: path:" + this.f13864a);
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveSource$n */
    public class RunnableC3908n implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ float f13866a;

        public RunnableC3908n(float f) {
            this.f13866a = f;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MMLiveSource.this.f13823i != null) {
                MMLiveSource.this.f13823i.mo98795h(this.f13866a);
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveSource$o */
    public class RunnableC3909o implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ MaskModel f13868a;

        public RunnableC3909o(MaskModel maskModel) {
            this.f13868a = maskModel;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MMLiveSource.this.f13823i != null) {
                MMLiveSource.this.f13823i.mo118385c(this.f13868a);
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveSource$p */
    public class RunnableC3910p implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ MaskModel f13870a;

        public RunnableC3910p(MaskModel maskModel) {
            this.f13870a = maskModel;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MMLiveSource.this.f13823i != null) {
                MMLiveSource.this.f13823i.mo118383a(this.f13870a);
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveSource$q */
    public class RunnableC3911q implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f13872a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ MaskModel f13873b;

        public RunnableC3911q(String str, MaskModel maskModel) {
            this.f13872a = str;
            this.f13873b = maskModel;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MMLiveSource.this.f13823i == null || this.f13872a == null || this.f13873b == null) {
                return;
            }
            MMLiveSource.this.f13823i.mo118388f(this.f13872a, this.f13873b);
        }
    }

    public MMLiveSource(MomoPipelineModuleRegister momoPipelineModuleRegister, Context context, MMLiveUserConfig mMLiveUserConfig) {
        this.f13815a = new WeakReference<>(context);
        g16.m124054a(context.getApplicationContext());
        this.f13812E = mMLiveUserConfig;
        this.f13818d = momoPipelineModuleRegister;
        this.f13817c = momoPipelineModuleRegister.getParameters();
        m19184v(this.f13833s);
        ga4 ga4Var = new ga4(momoPipelineModuleRegister);
        this.f13819e = ga4Var;
        dkw.m112274a(ga4Var);
        if (mMLiveUserConfig.isAudioOnly() || !m19185x()) {
            return;
        }
        ew2 ew2Var = new ew2(momoPipelineModuleRegister);
        this.f13823i = ew2Var;
        ew2Var.mo118393n(this.f13815a.get(), this.f13819e, this);
        this.f13823i.mo118386d(this.f13822h);
    }

    /* JADX INFO: renamed from: v */
    private void m19184v(eix eixVar) {
        this.f13816b = eixVar;
        this.f13818d.mo20169n();
        this.f13818d.mo20151K();
        this.f13818d.mo20147G(this.f13814G);
        this.f13818d.mo20144D(new C3896b());
        this.f13818d.mo20141A(new C3897c());
        this.f13818d.mo20160e(new C3898d());
        this.f13822h = this.f13818d.mo20167l();
        this.f13818d.mo20161f(new C3899e());
    }

    /* JADX INFO: renamed from: x */
    private boolean m19185x() {
        try {
            XEnginePreferences.checkEngineEnv();
            return true;
        } catch (Exception e) {
            eyx.m118802c().m118808g("xengine checkEngineEnv failed");
            eyx.m118802c().m118807f("MMLiveSource", "isAudioOnly", "false");
            eyx.m118802c().m118803a("MMLiveSource", "xeengine:" + e.toString(), LogLevel.ERROR);
            return false;
        }
    }

    /* JADX INFO: renamed from: A */
    public long m19186A() {
        InterfaceC4109a interfaceC4109a = this.f13822h;
        if (interfaceC4109a != null) {
            return interfaceC4109a.getMusicDuration();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: B */
    public void m19187B(boolean z) {
        this.f13835u = z;
        xsl xslVar = this.f13820f;
        if (xslVar != null) {
            xslVar.mo121002t(z);
        }
    }

    /* JADX INFO: renamed from: C */
    public void m19188C() {
        m19217f0();
        SegmentHelper.release();
        m19216e0();
        dkw.m112275b();
        synchronized (this) {
            try {
                NetUtil netUtil = this.f13827m;
                if (netUtil != null) {
                    netUtil.m222499e();
                    this.f13827m = null;
                }
                InterfaceC4109a interfaceC4109a = this.f13822h;
                if (interfaceC4109a != null) {
                    interfaceC4109a.mo20111d1();
                    this.f13822h = null;
                }
                ga4 ga4Var = this.f13819e;
                if (ga4Var != null) {
                    ga4Var.m124903d0();
                    this.f13819e = null;
                }
                xsl xslVar = this.f13820f;
                if (xslVar != null) {
                    xslVar.mo97705G();
                    this.f13818d.mo20142B(this.f13820f);
                    this.f13820f = null;
                }
                this.f13832r = null;
                this.f13825k = null;
                this.f13815a.clear();
                this.f13815a = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: D */
    public void m19189D(String str) {
        zml zmlVar = this.f13823i;
        if (zmlVar != null) {
            zmlVar.mo118384b(str);
        } else {
            this.f13839y.add(new RunnableC3895a(str));
        }
    }

    /* JADX INFO: renamed from: E */
    public boolean m19190E(String str, String str2) {
        zml zmlVar = this.f13823i;
        if (zmlVar != null) {
            zmlVar.removeMakeupStyle(str, str2);
            return true;
        }
        this.f13839y.add(new RunnableC3903i(str, str2));
        return true;
    }

    /* JADX INFO: renamed from: F */
    public void m19191F(MaskModel maskModel) {
        zml zmlVar = this.f13823i;
        if (zmlVar != null) {
            zmlVar.mo118383a(maskModel);
        } else {
            this.f13839y.add(new RunnableC3910p(maskModel));
        }
    }

    /* JADX INFO: renamed from: G */
    public void m19192G() {
        C3913b c3913b = this.f13824j;
        if (c3913b != null) {
            c3913b.m19292f();
            this.f13824j = null;
        }
    }

    /* JADX INFO: renamed from: H */
    public void m19193H() {
        MomoPipelineModuleRegister momoPipelineModuleRegister = this.f13818d;
        if (momoPipelineModuleRegister != null) {
            momoPipelineModuleRegister.mo20154N();
        }
    }

    /* JADX INFO: renamed from: I */
    public void m19194I(lrl lrlVar) {
        this.f13808A = lrlVar;
    }

    /* JADX INFO: renamed from: J */
    public void m19195J(MomoMediaConstants$BEAUTY_TYPE momoMediaConstants$BEAUTY_TYPE) {
        this.f13834t = momoMediaConstants$BEAUTY_TYPE;
        zml zmlVar = this.f13823i;
        if (zmlVar != null) {
            zmlVar.mo98797r(momoMediaConstants$BEAUTY_TYPE.value());
        }
        ga4 ga4Var = this.f13819e;
        if (ga4Var != null) {
            ga4Var.m124892W(dkw.m112276c());
            this.f13819e.mo124904e(this.f13834t != MomoMediaConstants$BEAUTY_TYPE.BEAUTY_TYPE_BYTE);
        }
    }

    /* JADX INFO: renamed from: K */
    public void m19196K(boolean z) {
        ga4 ga4Var = this.f13819e;
        if (ga4Var != null) {
            ga4Var.mo124918w(z);
        }
    }

    /* JADX INFO: renamed from: L */
    public void m19197L(int i) {
        ga4 ga4Var = this.f13819e;
        if (ga4Var != null) {
            ga4Var.m124888S(i);
        }
    }

    /* JADX INFO: renamed from: M */
    public void m19198M(ja4.InterfaceC17734l interfaceC17734l) {
        ga4 ga4Var = this.f13819e;
        if (ga4Var == null || interfaceC17734l == null) {
            return;
        }
        ga4Var.m124890U(interfaceC17734l);
    }

    /* JADX INFO: renamed from: N */
    public void m19199N(int i, int i2) {
        ga4 ga4Var = this.f13819e;
        if (ga4Var != null) {
            ga4Var.m124894Y(new vif0(i2, i));
        }
        MomoPipelineModuleRegister momoPipelineModuleRegister = this.f13818d;
        if (momoPipelineModuleRegister != null) {
            qmr parameters = momoPipelineModuleRegister.getParameters();
            parameters.f177164s = i;
            parameters.f177166t = i2;
            this.f13818d.mo20174s(i, i2);
            this.f13818d.mo20176u(i, i2, i, i2, true);
        }
    }

    /* JADX INFO: renamed from: O */
    public void m19200O(int i, int i2) {
        ga4 ga4Var = this.f13819e;
        if (ga4Var != null) {
            ga4Var.m124891V(new vif0(i, i2));
        }
    }

    /* JADX INFO: renamed from: P */
    public void m19201P(nrl nrlVar) {
        this.f13840z = nrlVar;
    }

    /* JADX INFO: renamed from: Q */
    public void m19202Q(boolean z) {
        ga4 ga4Var = this.f13819e;
        if (ga4Var != null) {
            ga4Var.mo124912k(z);
        }
    }

    /* JADX INFO: renamed from: R */
    public void m19203R(ktf ktfVar) {
        eyx.m118802c().m118808g("setFaceFeatureCallback", ktfVar);
        this.f13838x = ktfVar;
    }

    /* JADX INFO: renamed from: S */
    public void m19204S(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        zml zmlVar = this.f13823i;
        if (zmlVar != null) {
            zmlVar.mo98795h(f);
        } else {
            this.f13839y.add(new RunnableC3908n(f));
        }
        MDLog.m7395i("MMLiveSource", "setIntensity: value:" + f);
    }

    /* JADX INFO: renamed from: T */
    public void m19205T(boolean z) {
        float fMax;
        if (z) {
            qmr qmrVar = this.f13817c;
            fMax = Math.max(qmrVar.f177154n / qmrVar.f177170w, qmrVar.f177152m / qmrVar.f177171x);
        } else {
            fMax = 1.0f;
        }
        ga4 ga4Var = this.f13819e;
        if (ga4Var != null) {
            qmr qmrVar2 = this.f13817c;
            ga4Var.m124907f0(qmrVar2.f177170w, qmrVar2.f177171x);
            this.f13819e.m124893X(fMax);
            w84 w84VarM124884N = this.f13819e.m124884N();
            if (w84VarM124884N != null) {
                w84VarM124884N.m202102C(fMax);
                w84VarM124884N.m202124s(false);
                this.f13819e.m124889T(w84VarM124884N);
            }
        }
        zml zmlVar = this.f13823i;
        if (zmlVar != null) {
            zmlVar.mo118396q(fMax);
        } else {
            this.f13839y.add(new RunnableC3904j(fMax));
        }
    }

    /* JADX INFO: renamed from: U */
    public void m19206U(String str) {
        zml zmlVar = this.f13823i;
        if (zmlVar == null) {
            this.f13839y.add(new RunnableC3907m(str));
            return;
        }
        zmlVar.mo98796k(str);
        MDLog.m7395i("MMLiveSource", "selectFilter: path:" + str);
    }

    /* JADX INFO: renamed from: V */
    public void m19207V(float f) {
        InterfaceC4109a interfaceC4109a = this.f13822h;
        if (interfaceC4109a != null) {
            interfaceC4109a.setMusicVolume(f);
        }
        xsl xslVar = this.f13820f;
        if (xslVar != null) {
            xslVar.setVolume(f);
        }
    }

    /* JADX INFO: renamed from: W */
    public void m19208W(int i, int i2) {
        ga4 ga4Var = this.f13819e;
        if (ga4Var != null) {
            ga4Var.m124897a0(new vif0(i, i2));
        }
        qmr qmrVar = this.f13817c;
        qmrVar.f177168u = i;
        qmrVar.f177169v = i2;
        MomoPipelineModuleRegister momoPipelineModuleRegister = this.f13818d;
        if (momoPipelineModuleRegister != null) {
            momoPipelineModuleRegister.mo20159d(qmrVar);
        }
    }

    /* JADX INFO: renamed from: X */
    public void m19209X(int i) {
        qmr qmrVar = this.f13817c;
        if (qmrVar != null) {
            qmrVar.f177105D = i;
        }
        ga4 ga4Var = this.f13819e;
        if (ga4Var != null) {
            ga4Var.m124895Z(i);
        }
    }

    /* JADX INFO: renamed from: Y */
    public void m19210Y(boolean z) {
        InterfaceC4109a interfaceC4109a = this.f13822h;
        if (interfaceC4109a != null) {
            interfaceC4109a.mo20136z(z);
        }
    }

    /* JADX INFO: renamed from: Z */
    public void m19211Z(int i) {
        ga4 ga4Var = this.f13819e;
        if (ga4Var != null) {
            ga4Var.m124899b0(i);
        }
    }

    @Override // p149l.nrl
    /* JADX INFO: renamed from: a */
    public void mo19146a(pjw pjwVar) {
        nrl nrlVar = this.f13840z;
        if (nrlVar != null) {
            nrlVar.mo19146a(pjwVar);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m19212a0(String str) {
        if (this.f13824j == null) {
            C3913b c3913b = new C3913b(str);
            this.f13824j = c3913b;
            c3913b.m19293g(26000, new C3905k());
            Log.e("MMLiveSource", "setWaterMark: " + str);
        }
    }

    @Override // p149l.lrl
    /* JADX INFO: renamed from: b */
    public void mo19147b() {
        lrl lrlVar = this.f13808A;
        if (lrlVar != null) {
            lrlVar.mo19147b();
        }
    }

    /* JADX INFO: renamed from: b0 */
    public int m19213b0(int i, Object obj) {
        eyx.m118802c().m118808g("MMLiveSource", "camera startPreview beautyModule:" + this.f13823i);
        if (!this.f13819e.m124901c0(i, obj)) {
            return 1;
        }
        if (this.f13823i == null) {
            ew2 ew2Var = new ew2(this.f13818d);
            this.f13823i = ew2Var;
            ew2Var.mo118393n(this.f13815a.get(), this.f13819e, this);
        }
        MomoPipelineModuleRegister momoPipelineModuleRegister = this.f13818d;
        if (momoPipelineModuleRegister != null) {
            momoPipelineModuleRegister.mo20177v(this.f13817c);
        }
        ga4 ga4Var = this.f13819e;
        if (ga4Var != null) {
            ga4Var.mo124904e(this.f13834t != MomoMediaConstants$BEAUTY_TYPE.BEAUTY_TYPE_BYTE);
            this.f13819e.m124883M(null, this.f13838x);
        }
        dix.C16387d c16387dM111948h = dix.m111940d().m111948h(this.f13812E.getAppid());
        if (c16387dM111948h != null && c16387dM111948h.f86452e != null) {
            fjx.m121638R().m121731d2(c16387dM111948h.f86452e.f91824O);
            fjx.m121638R().m121743g2(c16387dM111948h.f86452e.f91826P / 100.0f);
            fjx.m121638R().m121739f2(c16387dM111948h.f86452e.f91828Q / 100.0f);
            fjx.m121638R().m121735e2(c16387dM111948h.f86452e.f91830R / 100.0f);
            fjx.m121638R().m121650D1(c16387dM111948h.f86452e.f91836U);
            fjx.m121638R().m121656F1(c16387dM111948h.f86452e.f91838V);
            fjx.m121638R().m121653E1(c16387dM111948h.f86452e.f91840W / 100.0f);
            ga4 ga4Var2 = this.f13819e;
            if (ga4Var2 != null) {
                ga4Var2.mo124916s(c16387dM111948h.f86452e.f91834T);
                fjx.C16864c c16864c = c16387dM111948h.f86452e.f91803D0;
                if (c16864c != null) {
                    this.f13819e.m124887R(pw3.m171703a(c16864c));
                }
            }
            zml zmlVar = this.f13823i;
            if (zmlVar != null) {
                zmlVar.mo118395p();
            }
        }
        zml zmlVar2 = this.f13823i;
        if (zmlVar2 != null) {
            zmlVar2.mo118386d(this.f13822h);
            this.f13823i.mo98797r(this.f13834t.value());
            this.f13823i.mo118390j(this);
        }
        Iterator<Runnable> it = this.f13839y.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
        this.f13839y.clear();
        eyx.m118802c().m118808g("camera startPreview", "camera obj is" + this.f13819e.hashCode());
        return 0;
    }

    /* JADX INFO: renamed from: c0 */
    public void m19214c0() {
        InterfaceC4109a interfaceC4109a = this.f13822h;
        if (interfaceC4109a != null) {
            interfaceC4109a.stopSurroundMusic();
        }
    }

    /* JADX INFO: renamed from: d0 */
    public void m19215d0(int i) {
        InterfaceC4109a interfaceC4109a = this.f13822h;
        if (interfaceC4109a != null) {
            interfaceC4109a.stopSurroundMusic();
        }
    }

    /* JADX INFO: renamed from: e0 */
    public void m19216e0() {
        InterfaceC4109a interfaceC4109a = this.f13822h;
        if (interfaceC4109a != null) {
            interfaceC4109a.mo20112d2();
        }
    }

    /* JADX INFO: renamed from: f0 */
    public void m19217f0() {
        if (this.f13823i != null) {
            this.f13839y.clear();
            this.f13823i.mo118390j(null);
            this.f13823i.destroy();
            this.f13823i = null;
        }
        if (this.f13819e != null) {
            eyx.m118802c().m118808g("MMLiveSource", "stopPreview camera obj is:" + this.f13819e.hashCode());
            this.f13819e.m124903d0();
        }
        eyx.m118802c().m118808g("MMLiveSource", "stopPreview mSelectFileStop" + this.f13821g);
        if (this.f13820f == null || this.f13821g) {
            return;
        }
        ii70.m136344d().m136348c("pip->PIPLINE2", "stopRenderer: stopRenderer()");
        this.f13821g = true;
        this.f13820f.mo97705G();
        this.f13818d.mo20142B(this.f13820f);
        this.f13820f = null;
        ii70.m136344d().m136348c("pip->PIPLINE2", "stopRenderer: stopRenderer() end");
    }

    /* JADX INFO: renamed from: g0 */
    public int m19218g0() {
        ga4 ga4Var = this.f13819e;
        return ga4Var != null ? ga4Var.m124905e0() : m19229y() ? 1 : 0;
    }

    /* JADX INFO: renamed from: h0 */
    public boolean m19219h0(String str, String str2, float f) {
        zml zmlVar = this.f13823i;
        if (zmlVar != null) {
            zmlVar.mo98794g(str, str2, f);
            return true;
        }
        this.f13839y.add(new RunnableC3901g(str, str2, f));
        return true;
    }

    /* JADX INFO: renamed from: i0 */
    public boolean m19220i0(String str, String str2, float f) {
        zml zmlVar = this.f13823i;
        if (zmlVar != null) {
            zmlVar.updateMakeupStyleValue(str, str2, f);
            return true;
        }
        this.f13839y.add(new RunnableC3902h(str, str2, f));
        return true;
    }

    /* JADX INFO: renamed from: j0 */
    public void m19221j0(Sticker sticker) {
        zml zmlVar = this.f13823i;
        if (zmlVar == null || sticker == null) {
            this.f13839y.add(new RunnableC3906l(sticker));
            return;
        }
        zmlVar.mo118387e(sticker.getStickerType());
        this.f13823i.mo118394o(sticker);
        Log.e("MMLiveSource", "updateWatermark: Refresh");
    }

    @Override // p149l.lrl
    public void onBeautyError(int i, String str) {
        lrl lrlVar = this.f13808A;
        if (lrlVar != null) {
            lrlVar.onBeautyError(i, str);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m19222p(String str, MaskModel maskModel) {
        zml zmlVar = this.f13823i;
        if (zmlVar == null || str == null || maskModel == null) {
            this.f13839y.add(new RunnableC3911q(str, maskModel));
        } else {
            zmlVar.mo118388f(str, maskModel);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m19223q(MaskModel maskModel) {
        zml zmlVar = this.f13823i;
        if (zmlVar != null) {
            zmlVar.mo118385c(maskModel);
        } else {
            this.f13839y.add(new RunnableC3909o(maskModel));
        }
    }

    /* JADX INFO: renamed from: r */
    public zml m19224r() {
        return this.f13823i;
    }

    /* JADX INFO: renamed from: s */
    public unl m19225s() {
        return this.f13819e;
    }

    /* JADX INFO: renamed from: t */
    public rpl m19226t() {
        return this.f13819e;
    }

    /* JADX INFO: renamed from: u */
    public InterfaceC4109a m19227u() {
        return this.f13822h;
    }

    /* JADX INFO: renamed from: w */
    public boolean m19228w() {
        ga4 ga4Var = this.f13819e;
        if (ga4Var != null) {
            return ga4Var.getIsCameraCreate();
        }
        return false;
    }

    /* JADX INFO: renamed from: y */
    public boolean m19229y() {
        ga4 ga4Var = this.f13819e;
        if (ga4Var != null) {
            return ga4Var.m124886P();
        }
        return true;
    }

    /* JADX INFO: renamed from: z */
    public long m19230z() {
        InterfaceC4109a interfaceC4109a = this.f13822h;
        if (interfaceC4109a != null) {
            return interfaceC4109a.mo20130w();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveSource$d */
    public class C3898d implements MomoPipelineModuleRegister.InterfaceC4110a {
        public C3898d() {
        }

        @Override // com.momo.pub.MomoPipelineModuleRegister.InterfaceC4110a
        /* JADX INFO: renamed from: b */
        public void mo18363b(int i, int i2, j1m j1mVar) {
            MMLiveSource.this.f13830p = g860.m124745a(i, i2);
            if (MMLiveSource.this.f13825k != null) {
                MMLiveSource.this.f13825k.m222829a(null, i, i2);
            }
        }

        @Override // com.momo.pub.MomoPipelineModuleRegister.InterfaceC4110a
        /* JADX INFO: renamed from: a */
        public void mo18362a(int i, int i2, j1m j1mVar) {
        }
    }
}
