package com.immomo.velib.player;

import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import com.immomo.velib.anim.model.MixSetting;
import com.immomo.velib.anim.model.PostProcessingModel;
import com.immomo.velib.anim.model.VideoEffectModel;
import java.util.List;
import p149l.abl0;
import p149l.ecj;
import p149l.eqe;
import p149l.fqe;
import p149l.hwl;
import p149l.iqe;
import p149l.jqe;
import p149l.qd80;
import p149l.ss2;
import p149l.v5l0;
import p149l.vpe;
import p149l.w5l0;
import p149l.x6k;
import p149l.zal0;

/* JADX INFO: renamed from: com.immomo.velib.player.c */
/* JADX INFO: loaded from: classes7.dex */
public class C3987c implements InterfaceC3988d, hwl.InterfaceC17417a, hwl.InterfaceC17418b, hwl.InterfaceC17419c, hwl.InterfaceC17420d {

    /* JADX INFO: renamed from: a */
    private fqe f14198a;

    /* JADX INFO: renamed from: b */
    private eqe f14199b;

    /* JADX INFO: renamed from: c */
    private ecj f14200c;

    /* JADX INFO: renamed from: d */
    private ss2 f14201d;

    /* JADX INFO: renamed from: e */
    private abl0 f14202e;

    /* JADX INFO: renamed from: f */
    private Uri f14203f;

    /* JADX INFO: renamed from: g */
    private Context f14204g;

    /* JADX INFO: renamed from: h */
    private int f14205h;

    /* JADX INFO: renamed from: i */
    private C3985a f14206i;

    /* JADX INFO: renamed from: j */
    private long f14207j;

    /* JADX INFO: renamed from: k */
    private int f14208k;

    /* JADX INFO: renamed from: l */
    private int f14209l;

    /* JADX INFO: renamed from: m */
    private InterfaceC3988d.b f14210m;

    /* JADX INFO: renamed from: n */
    private InterfaceC3988d.e f14211n;

    /* JADX INFO: renamed from: o */
    private InterfaceC3988d.f f14212o;

    /* JADX INFO: renamed from: p */
    private InterfaceC3988d.c f14213p;

    /* JADX INFO: renamed from: q */
    private InterfaceC3988d.d f14214q;

    /* JADX INFO: renamed from: r */
    private qd80 f14215r;

    /* JADX INFO: renamed from: com.immomo.velib.player.c$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C3987c.this.m19585v();
            if (C3987c.this.f14214q != null) {
                C3987c.this.f14214q.mo19527a();
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.velib.player.c$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C3987c.this.m19569u();
            if (C3987c.this.f14210m != null) {
                C3987c.this.f14210m.onCompletion();
            }
        }
    }

    public C3987c(Context context) {
        this.f14204g = context;
    }

    /* JADX INFO: renamed from: r */
    private void m19566r(MixSetting mixSetting) {
        VideoEffectModel videoEffectModel;
        this.f14201d = new w5l0();
        if (mixSetting != null && mixSetting.getRatio() != null) {
            ((w5l0) this.f14201d).m201646Q(mixSetting.getRatio());
        }
        ((w5l0) this.f14201d).f184709E = C3985a.m19532d(this.f14206i) ? this.f14206i.f14168i : "mediump";
        this.f14201d.mo101075E(this.f14208k, this.f14209l);
        C3985a c3985a = this.f14206i;
        List<PostProcessingModel> postProcessing = (c3985a == null || (videoEffectModel = c3985a.f14164e) == null) ? null : videoEffectModel.getPostProcessing();
        C3985a c3985a2 = this.f14206i;
        qd80 qd80Var = new qd80(postProcessing, c3985a2 != null && c3985a2.f14169j, this.f14198a);
        this.f14215r = qd80Var;
        qd80Var.m173999f(C3985a.m19532d(this.f14206i) ? this.f14206i.f14168i : "mediump");
        this.f14199b.m149300H(this.f14201d);
        this.f14201d.m149300H(this.f14215r);
        this.f14215r.m149300H(this.f14202e);
        this.f14202e.m149300H(this.f14200c);
    }

    /* JADX INFO: renamed from: s */
    private void m19567s() {
        VideoEffectModel videoEffectModel;
        int i;
        int i2;
        VideoEffectModel videoEffectModel2;
        fqe fqeVar = new fqe();
        this.f14198a = fqeVar;
        fqeVar.m122722t(true);
        Uri uri = this.f14203f;
        if (uri == null || TextUtils.isEmpty(uri.getPath())) {
            vpe.m199230a("EffectPlayer", "uri : filepath null");
            return;
        }
        eqe eqeVar = new eqe(this.f14204g, this.f14203f.toString());
        this.f14199b = eqeVar;
        this.f14198a.m122714l(eqeVar);
        iqe iqeVarM122716n = this.f14198a.m122716n(this.f14199b);
        this.f14199b.m117728W(this.f14206i);
        this.f14199b.m117730Y(iqeVarM122716n);
        eqe eqeVar2 = this.f14199b;
        C3985a c3985a = this.f14206i;
        eqeVar2.m117729X((c3985a == null || (videoEffectModel2 = c3985a.f14164e) == null || !videoEffectModel2.isLoopOn()) ? false : true);
        abl0 abl0Var = new abl0(this.f14204g);
        this.f14202e = abl0Var;
        abl0Var.f68726k0 = C3985a.m19532d(this.f14206i) ? this.f14206i.f14168i : "mediump";
        m19570w(this.f14203f.getPath());
        this.f14202e.m95683c0(this.f14207j);
        ecj ecjVar = new ecj();
        this.f14200c = ecjVar;
        ecjVar.f90528C = C3985a.m19532d(this.f14206i) ? this.f14206i.f14168i : "mediump";
        this.f14200c.mo101075E(this.f14208k, this.f14209l);
        C3985a c3985a2 = this.f14206i;
        if (c3985a2 != null && (i = c3985a2.f14170k) != 0 && (i2 = c3985a2.f14171l) != 0) {
            this.f14200c.m115728K(i, i2);
        }
        this.f14200c.m101071A(0.0f, 0.0f, 0.0f, 0.0f);
        if (this.f14205h == 2) {
            x6k x6kVar = new x6k();
            this.f14201d = x6kVar;
            x6kVar.mo101075E(this.f14208k, this.f14209l);
            this.f14199b.m149300H(this.f14201d);
            this.f14201d.m149300H(this.f14202e);
            this.f14202e.m149300H(this.f14200c);
        } else {
            C3985a c3985a3 = this.f14206i;
            if (c3985a3 == null || (videoEffectModel = c3985a3.f14164e) == null || videoEffectModel.getMixSetting() == null) {
                m19568t();
            } else {
                m19566r(this.f14206i.f14164e.getMixSetting());
            }
        }
        this.f14199b.m117734b0(this);
        this.f14199b.m117731Z(this);
        this.f14199b.m117733a0(this);
        this.f14199b.m117736c0(this);
        this.f14199b.m117737d0();
    }

    /* JADX INFO: renamed from: t */
    private void m19568t() {
        VideoEffectModel videoEffectModel;
        v5l0 v5l0Var = new v5l0();
        this.f14201d = v5l0Var;
        v5l0Var.f180094E = C3985a.m19532d(this.f14206i) ? this.f14206i.f14168i : "mediump";
        this.f14201d.mo101075E(this.f14208k, this.f14209l);
        C3985a c3985a = this.f14206i;
        List<PostProcessingModel> postProcessing = (c3985a == null || (videoEffectModel = c3985a.f14164e) == null) ? null : videoEffectModel.getPostProcessing();
        C3985a c3985a2 = this.f14206i;
        qd80 qd80Var = new qd80(postProcessing, c3985a2 != null && c3985a2.f14169j, this.f14198a);
        this.f14215r = qd80Var;
        qd80Var.m173999f(C3985a.m19532d(this.f14206i) ? this.f14206i.f14168i : "mediump");
        this.f14199b.m149300H(this.f14201d);
        this.f14201d.m149300H(this.f14215r);
        this.f14215r.m149300H(this.f14202e);
        this.f14202e.m149300H(this.f14200c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public void m19569u() {
        fqe fqeVar = this.f14198a;
        if (fqeVar != null) {
            ss2 ss2Var = this.f14201d;
            if (ss2Var != null) {
                fqeVar.m122713k(ss2Var, this.f14199b.toString());
            }
            this.f14198a.m122713k(this.f14215r, this.f14199b.toString());
            this.f14198a.m122713k(this.f14202e, this.f14199b.toString());
            this.f14198a.m122713k(this.f14200c, this.f14199b.toString());
            this.f14198a.m122715m();
            this.f14199b.m117738e0();
            this.f14199b.m117734b0(null);
            this.f14199b.m117731Z(null);
            this.f14199b.m117733a0(null);
            this.f14199b.m117736c0(null);
        }
    }

    /* JADX INFO: renamed from: w */
    private void m19570w(String str) {
        try {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(str);
            String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
            String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(18);
            String strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(19);
            this.f14207j = Long.parseLong(strExtractMetadata);
            int i = this.f14205h == 1 ? Integer.parseInt(strExtractMetadata2) / 2 : Integer.parseInt(strExtractMetadata2);
            int i2 = Integer.parseInt(strExtractMetadata3);
            if (this.f14208k == 0 && i > 0) {
                this.f14208k = i;
            }
            if (this.f14209l == 0 && i2 > 0) {
                this.f14209l = i2;
            }
            mediaMetadataRetriever.release();
        } catch (Exception e) {
            e.printStackTrace();
            this.f14208k = 720;
            this.f14209l = EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK;
        }
    }

    @Override // p149l.hwl.InterfaceC17419c
    /* JADX INFO: renamed from: a */
    public void mo19571a(hwl hwlVar, int i, int i2, int i3, int i4) {
        VideoEffectModel videoEffectModel;
        if (this.f14211n != null) {
            if (this.f14205h == 1) {
                C3985a c3985a = this.f14206i;
                if (c3985a == null || (videoEffectModel = c3985a.f14164e) == null || videoEffectModel.getMixSetting() == null) {
                    i /= 2;
                } else {
                    float[] ratio = this.f14206i.f14164e.getMixSetting().getRatio();
                    if (ratio != null && ratio.length == 8) {
                        i = (int) (i * ratio[6]);
                    }
                    if (ratio != null && ratio.length == 8) {
                        i2 = (int) (i2 * ratio[7]);
                    }
                }
            }
            this.f14211n.mo19526a(i, i2);
        }
    }

    @Override // p149l.hwl.InterfaceC17418b
    /* JADX INFO: renamed from: b */
    public boolean mo19572b(hwl hwlVar, int i, String str) {
        InterfaceC3988d.c cVar = this.f14213p;
        return cVar != null && cVar.onError(this, i, str);
    }

    @Override // com.immomo.velib.player.InterfaceC3988d
    /* JADX INFO: renamed from: c */
    public void mo19573c() {
        fqe fqeVar;
        eqe eqeVar = this.f14199b;
        if (eqeVar == null || (fqeVar = this.f14198a) == null) {
            return;
        }
        ss2 ss2Var = this.f14201d;
        if (ss2Var != null) {
            fqeVar.m122713k(ss2Var, eqeVar.toString());
        }
        this.f14198a.m122713k(this.f14202e, this.f14199b.toString());
        this.f14198a.m122713k(this.f14200c, this.f14199b.toString());
        this.f14198a.m122715m();
        this.f14199b.m117738e0();
    }

    @Override // com.immomo.velib.player.InterfaceC3988d
    /* JADX INFO: renamed from: d */
    public void mo19574d(Object obj) {
        this.f14198a.m122723u(obj);
    }

    @Override // com.immomo.velib.player.InterfaceC3988d
    /* JADX INFO: renamed from: e */
    public void mo19575e(InterfaceC3988d.d dVar) {
        this.f14214q = dVar;
    }

    @Override // com.immomo.velib.player.InterfaceC3988d
    /* JADX INFO: renamed from: f */
    public void mo19576f(int i, int i2) {
        this.f14208k = i;
        this.f14209l = i2;
    }

    @Override // com.immomo.velib.player.InterfaceC3988d
    /* JADX INFO: renamed from: g */
    public void mo19577g(InterfaceC3988d.e eVar) {
        this.f14211n = eVar;
    }

    @Override // p149l.hwl.InterfaceC17417a
    /* JADX INFO: renamed from: h */
    public void mo19578h(hwl hwlVar) {
        new Handler(Looper.getMainLooper()).postDelayed(new b(), 100L);
    }

    @Override // com.immomo.velib.player.InterfaceC3988d
    /* JADX INFO: renamed from: i */
    public void mo19579i(zal0 zal0Var) {
        abl0 abl0Var = this.f14202e;
        if (abl0Var != null) {
            abl0Var.m95678R(zal0Var);
        }
    }

    @Override // com.immomo.velib.player.InterfaceC3988d
    /* JADX INFO: renamed from: j */
    public void mo19580j(InterfaceC3988d.b bVar) {
        this.f14210m = bVar;
    }

    @Override // com.immomo.velib.player.InterfaceC3988d
    /* JADX INFO: renamed from: k */
    public void mo19581k(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            Log.e("EffectPlayer", "path must be not null");
        } else {
            this.f14203f = Uri.parse(str);
            this.f14205h = i;
        }
    }

    @Override // com.immomo.velib.player.InterfaceC3988d
    /* JADX INFO: renamed from: l */
    public void mo19582l(InterfaceC3988d.c cVar) {
        this.f14213p = cVar;
    }

    @Override // com.immomo.velib.player.InterfaceC3988d
    /* JADX INFO: renamed from: m */
    public void mo19583m(C3985a c3985a) {
        this.f14206i = c3985a;
    }

    @Override // com.immomo.velib.player.InterfaceC3988d
    /* JADX INFO: renamed from: n */
    public void mo19584n(InterfaceC3988d.f fVar) {
        this.f14212o = fVar;
    }

    @Override // p149l.hwl.InterfaceC17420d
    public void onRenderTimestampChanged(long j) {
        vpe.m199231b("EffectPlayer", "pos : " + j);
        InterfaceC3988d.f fVar = this.f14212o;
        if (fVar != null) {
            fVar.renderPositionChanged(j);
        }
        abl0 abl0Var = this.f14202e;
        if (abl0Var != null) {
            abl0Var.m95682b0(j);
        }
    }

    @Override // com.immomo.velib.player.InterfaceC3988d
    public void prepareAsync() {
        jqe.m142789a(new a());
    }

    /* JADX INFO: renamed from: v */
    public void m19585v() {
        m19567s();
    }
}
