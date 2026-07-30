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
import p153l.afl0;
import p153l.dkl0;
import p153l.ekl0;
import p153l.ire;
import p153l.it2;
import p153l.jre;
import p153l.mre;
import p153l.nre;
import p153l.o9k;
import p153l.yej;
import p153l.zel0;
import p153l.zl80;
import p153l.zqe;
import p153l.zyl;

/* JADX INFO: renamed from: com.immomo.velib.player.c */
/* JADX INFO: loaded from: classes7.dex */
public class C4138c implements InterfaceC4139d, zyl.InterfaceC21932a, zyl.InterfaceC21933b, zyl.InterfaceC21934c, zyl.InterfaceC21935d {

    /* JADX INFO: renamed from: a */
    private jre f14917a;

    /* JADX INFO: renamed from: b */
    private ire f14918b;

    /* JADX INFO: renamed from: c */
    private yej f14919c;

    /* JADX INFO: renamed from: d */
    private it2 f14920d;

    /* JADX INFO: renamed from: e */
    private ekl0 f14921e;

    /* JADX INFO: renamed from: f */
    private Uri f14922f;

    /* JADX INFO: renamed from: g */
    private Context f14923g;

    /* JADX INFO: renamed from: h */
    private int f14924h;

    /* JADX INFO: renamed from: i */
    private C4136a f14925i;

    /* JADX INFO: renamed from: j */
    private long f14926j;

    /* JADX INFO: renamed from: k */
    private int f14927k;

    /* JADX INFO: renamed from: l */
    private int f14928l;

    /* JADX INFO: renamed from: m */
    private InterfaceC4139d.b f14929m;

    /* JADX INFO: renamed from: n */
    private InterfaceC4139d.e f14930n;

    /* JADX INFO: renamed from: o */
    private InterfaceC4139d.f f14931o;

    /* JADX INFO: renamed from: p */
    private InterfaceC4139d.c f14932p;

    /* JADX INFO: renamed from: q */
    private InterfaceC4139d.d f14933q;

    /* JADX INFO: renamed from: r */
    private zl80 f14934r;

    /* JADX INFO: renamed from: com.immomo.velib.player.c$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C4138c.this.m20584v();
            if (C4138c.this.f14933q != null) {
                C4138c.this.f14933q.mo20526a();
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.velib.player.c$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C4138c.this.m20568u();
            if (C4138c.this.f14929m != null) {
                C4138c.this.f14929m.onCompletion();
            }
        }
    }

    public C4138c(Context context) {
        this.f14923g = context;
    }

    /* JADX INFO: renamed from: r */
    private void m20565r(MixSetting mixSetting) {
        VideoEffectModel videoEffectModel;
        this.f14920d = new afl0();
        if (mixSetting != null && mixSetting.getRatio() != null) {
            ((afl0) this.f14920d).m97354Q(mixSetting.getRatio());
        }
        ((afl0) this.f14920d).f70922E = C4136a.m20531d(this.f14925i) ? this.f14925i.f14887i : "mediump";
        this.f14920d.mo162984E(this.f14927k, this.f14928l);
        C4136a c4136a = this.f14925i;
        List<PostProcessingModel> postProcessing = (c4136a == null || (videoEffectModel = c4136a.f14883e) == null) ? null : videoEffectModel.getPostProcessing();
        C4136a c4136a2 = this.f14925i;
        zl80 zl80Var = new zl80(postProcessing, c4136a2 != null && c4136a2.f14888j, this.f14917a);
        this.f14934r = zl80Var;
        zl80Var.m220172f(C4136a.m20531d(this.f14925i) ? this.f14925i.f14887i : "mediump");
        this.f14918b.m125376H(this.f14920d);
        this.f14920d.m125376H(this.f14934r);
        this.f14934r.m125376H(this.f14921e);
        this.f14921e.m125376H(this.f14919c);
    }

    /* JADX INFO: renamed from: s */
    private void m20566s() {
        VideoEffectModel videoEffectModel;
        int i;
        int i2;
        VideoEffectModel videoEffectModel2;
        jre jreVar = new jre();
        this.f14917a = jreVar;
        jreVar.m146730t(true);
        Uri uri = this.f14922f;
        if (uri == null || TextUtils.isEmpty(uri.getPath())) {
            zqe.m221010a("EffectPlayer", "uri : filepath null");
            return;
        }
        ire ireVar = new ire(this.f14923g, this.f14922f.toString());
        this.f14918b = ireVar;
        this.f14917a.m146722l(ireVar);
        mre mreVarM146724n = this.f14917a.m146724n(this.f14918b);
        this.f14918b.m141796W(this.f14925i);
        this.f14918b.m141798Y(mreVarM146724n);
        ire ireVar2 = this.f14918b;
        C4136a c4136a = this.f14925i;
        ireVar2.m141797X((c4136a == null || (videoEffectModel2 = c4136a.f14883e) == null || !videoEffectModel2.isLoopOn()) ? false : true);
        ekl0 ekl0Var = new ekl0(this.f14923g);
        this.f14921e = ekl0Var;
        ekl0Var.f94405k0 = C4136a.m20531d(this.f14925i) ? this.f14925i.f14887i : "mediump";
        m20569w(this.f14922f.getPath());
        this.f14921e.m121065c0(this.f14926j);
        yej yejVar = new yej();
        this.f14919c = yejVar;
        yejVar.f199350C = C4136a.m20531d(this.f14925i) ? this.f14925i.f14887i : "mediump";
        this.f14919c.mo162984E(this.f14927k, this.f14928l);
        C4136a c4136a2 = this.f14925i;
        if (c4136a2 != null && (i = c4136a2.f14889k) != 0 && (i2 = c4136a2.f14890l) != 0) {
            this.f14919c.m215415K(i, i2);
        }
        this.f14919c.m201052A(0.0f, 0.0f, 0.0f, 0.0f);
        if (this.f14924h == 2) {
            o9k o9kVar = new o9k();
            this.f14920d = o9kVar;
            o9kVar.mo162984E(this.f14927k, this.f14928l);
            this.f14918b.m125376H(this.f14920d);
            this.f14920d.m125376H(this.f14921e);
            this.f14921e.m125376H(this.f14919c);
        } else {
            C4136a c4136a3 = this.f14925i;
            if (c4136a3 == null || (videoEffectModel = c4136a3.f14883e) == null || videoEffectModel.getMixSetting() == null) {
                m20567t();
            } else {
                m20565r(this.f14925i.f14883e.getMixSetting());
            }
        }
        this.f14918b.m141802b0(this);
        this.f14918b.m141799Z(this);
        this.f14918b.m141801a0(this);
        this.f14918b.m141804c0(this);
        this.f14918b.m141805d0();
    }

    /* JADX INFO: renamed from: t */
    private void m20567t() {
        VideoEffectModel videoEffectModel;
        zel0 zel0Var = new zel0();
        this.f14920d = zel0Var;
        zel0Var.f204037E = C4136a.m20531d(this.f14925i) ? this.f14925i.f14887i : "mediump";
        this.f14920d.mo162984E(this.f14927k, this.f14928l);
        C4136a c4136a = this.f14925i;
        List<PostProcessingModel> postProcessing = (c4136a == null || (videoEffectModel = c4136a.f14883e) == null) ? null : videoEffectModel.getPostProcessing();
        C4136a c4136a2 = this.f14925i;
        zl80 zl80Var = new zl80(postProcessing, c4136a2 != null && c4136a2.f14888j, this.f14917a);
        this.f14934r = zl80Var;
        zl80Var.m220172f(C4136a.m20531d(this.f14925i) ? this.f14925i.f14887i : "mediump");
        this.f14918b.m125376H(this.f14920d);
        this.f14920d.m125376H(this.f14934r);
        this.f14934r.m125376H(this.f14921e);
        this.f14921e.m125376H(this.f14919c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public void m20568u() {
        jre jreVar = this.f14917a;
        if (jreVar != null) {
            it2 it2Var = this.f14920d;
            if (it2Var != null) {
                jreVar.m146721k(it2Var, this.f14918b.toString());
            }
            this.f14917a.m146721k(this.f14934r, this.f14918b.toString());
            this.f14917a.m146721k(this.f14921e, this.f14918b.toString());
            this.f14917a.m146721k(this.f14919c, this.f14918b.toString());
            this.f14917a.m146723m();
            this.f14918b.m141807e0();
            this.f14918b.m141802b0(null);
            this.f14918b.m141799Z(null);
            this.f14918b.m141801a0(null);
            this.f14918b.m141804c0(null);
        }
    }

    /* JADX INFO: renamed from: w */
    private void m20569w(String str) {
        try {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(str);
            String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
            String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(18);
            String strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(19);
            this.f14926j = Long.parseLong(strExtractMetadata);
            int i = this.f14924h == 1 ? Integer.parseInt(strExtractMetadata2) / 2 : Integer.parseInt(strExtractMetadata2);
            int i2 = Integer.parseInt(strExtractMetadata3);
            if (this.f14927k == 0 && i > 0) {
                this.f14927k = i;
            }
            if (this.f14928l == 0 && i2 > 0) {
                this.f14928l = i2;
            }
            mediaMetadataRetriever.release();
        } catch (Exception e) {
            e.printStackTrace();
            this.f14927k = 720;
            this.f14928l = EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK;
        }
    }

    @Override // p153l.zyl.InterfaceC21934c
    /* JADX INFO: renamed from: a */
    public void mo20570a(zyl zylVar, int i, int i2, int i3, int i4) {
        VideoEffectModel videoEffectModel;
        if (this.f14930n != null) {
            if (this.f14924h == 1) {
                C4136a c4136a = this.f14925i;
                if (c4136a == null || (videoEffectModel = c4136a.f14883e) == null || videoEffectModel.getMixSetting() == null) {
                    i /= 2;
                } else {
                    float[] ratio = this.f14925i.f14883e.getMixSetting().getRatio();
                    if (ratio != null && ratio.length == 8) {
                        i = (int) (i * ratio[6]);
                    }
                    if (ratio != null && ratio.length == 8) {
                        i2 = (int) (i2 * ratio[7]);
                    }
                }
            }
            this.f14930n.mo20525a(i, i2);
        }
    }

    @Override // p153l.zyl.InterfaceC21933b
    /* JADX INFO: renamed from: b */
    public boolean mo20571b(zyl zylVar, int i, String str) {
        InterfaceC4139d.c cVar = this.f14932p;
        return cVar != null && cVar.onError(this, i, str);
    }

    @Override // com.immomo.velib.player.InterfaceC4139d
    /* JADX INFO: renamed from: c */
    public void mo20572c() {
        jre jreVar;
        ire ireVar = this.f14918b;
        if (ireVar == null || (jreVar = this.f14917a) == null) {
            return;
        }
        it2 it2Var = this.f14920d;
        if (it2Var != null) {
            jreVar.m146721k(it2Var, ireVar.toString());
        }
        this.f14917a.m146721k(this.f14921e, this.f14918b.toString());
        this.f14917a.m146721k(this.f14919c, this.f14918b.toString());
        this.f14917a.m146723m();
        this.f14918b.m141807e0();
    }

    @Override // com.immomo.velib.player.InterfaceC4139d
    /* JADX INFO: renamed from: d */
    public void mo20573d(Object obj) {
        this.f14917a.m146731u(obj);
    }

    @Override // com.immomo.velib.player.InterfaceC4139d
    /* JADX INFO: renamed from: e */
    public void mo20574e(InterfaceC4139d.d dVar) {
        this.f14933q = dVar;
    }

    @Override // com.immomo.velib.player.InterfaceC4139d
    /* JADX INFO: renamed from: f */
    public void mo20575f(int i, int i2) {
        this.f14927k = i;
        this.f14928l = i2;
    }

    @Override // com.immomo.velib.player.InterfaceC4139d
    /* JADX INFO: renamed from: g */
    public void mo20576g(InterfaceC4139d.e eVar) {
        this.f14930n = eVar;
    }

    @Override // p153l.zyl.InterfaceC21932a
    /* JADX INFO: renamed from: h */
    public void mo20577h(zyl zylVar) {
        new Handler(Looper.getMainLooper()).postDelayed(new b(), 100L);
    }

    @Override // com.immomo.velib.player.InterfaceC4139d
    /* JADX INFO: renamed from: i */
    public void mo20578i(dkl0 dkl0Var) {
        ekl0 ekl0Var = this.f14921e;
        if (ekl0Var != null) {
            ekl0Var.m121061R(dkl0Var);
        }
    }

    @Override // com.immomo.velib.player.InterfaceC4139d
    /* JADX INFO: renamed from: j */
    public void mo20579j(InterfaceC4139d.b bVar) {
        this.f14929m = bVar;
    }

    @Override // com.immomo.velib.player.InterfaceC4139d
    /* JADX INFO: renamed from: k */
    public void mo20580k(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            Log.e("EffectPlayer", "path must be not null");
        } else {
            this.f14922f = Uri.parse(str);
            this.f14924h = i;
        }
    }

    @Override // com.immomo.velib.player.InterfaceC4139d
    /* JADX INFO: renamed from: l */
    public void mo20581l(InterfaceC4139d.c cVar) {
        this.f14932p = cVar;
    }

    @Override // com.immomo.velib.player.InterfaceC4139d
    /* JADX INFO: renamed from: m */
    public void mo20582m(C4136a c4136a) {
        this.f14925i = c4136a;
    }

    @Override // com.immomo.velib.player.InterfaceC4139d
    /* JADX INFO: renamed from: n */
    public void mo20583n(InterfaceC4139d.f fVar) {
        this.f14931o = fVar;
    }

    @Override // p153l.zyl.InterfaceC21935d
    public void onRenderTimestampChanged(long j) {
        zqe.m221011b("EffectPlayer", "pos : " + j);
        InterfaceC4139d.f fVar = this.f14931o;
        if (fVar != null) {
            fVar.renderPositionChanged(j);
        }
        ekl0 ekl0Var = this.f14921e;
        if (ekl0Var != null) {
            ekl0Var.m121064b0(j);
        }
    }

    @Override // com.immomo.velib.player.InterfaceC4139d
    public void prepareAsync() {
        nre.m164481a(new a());
    }

    /* JADX INFO: renamed from: v */
    public void m20584v() {
        m20566s();
    }
}
