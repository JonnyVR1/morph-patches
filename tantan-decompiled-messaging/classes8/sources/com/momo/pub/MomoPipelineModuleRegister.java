package com.momo.pub;

import com.momo.pipline.MomoInterface.MomoPipeline;
import com.momo.piplinemomoext.input.audio.InterfaceC0021a;
import l.bw00;
import l.ccj;
import l.eix;
import l.etf;
import l.slw;
import l.sml;
import l.sol;
import l.ts2;
import l.vlw;
import l.xgf0;
import p007l.btl;
import p007l.e95;
import p007l.gxl;
import p007l.iql;
import p007l.j1m;
import p007l.qmr;
import p007l.rnl;
import p007l.ttl;
import p007l.v2m;
import p007l.xsl;
import p007l.zv00;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public interface MomoPipelineModuleRegister {

    public enum LinkType {
        AGORALINK,
        WEILALINK,
        TXLINK,
        MOMORTCLINK,
        VOLCLINK
    }

    /* JADX INFO: renamed from: com.momo.pub.MomoPipelineModuleRegister$a */
    public interface InterfaceC0022a {
        /* JADX INFO: renamed from: a */
        void m448a(int i, int i2, j1m j1mVar);

        /* JADX INFO: renamed from: b */
        void m449b(int i, int i2, j1m j1mVar);
    }

    /* JADX INFO: renamed from: com.momo.pub.MomoPipelineModuleRegister$b */
    public interface InterfaceC0023b {
        /* JADX INFO: renamed from: a */
        void m450a(int i, int i2, j1m j1mVar);
    }

    /* JADX INFO: renamed from: com.momo.pub.MomoPipelineModuleRegister$c */
    public interface InterfaceC0024c {
        /* JADX INFO: renamed from: a */
        void m451a(j1m j1mVar);

        /* JADX INFO: renamed from: b */
        void m452b(j1m j1mVar);
    }

    /* JADX INFO: renamed from: A */
    void mo407A(InterfaceC0023b interfaceC0023b);

    /* JADX INFO: renamed from: B */
    void mo408B(btl btlVar);

    /* JADX INFO: renamed from: C */
    void mo409C(j1m j1mVar);

    /* JADX INFO: renamed from: D */
    void mo410D(bw00.b bVar);

    /* JADX INFO: renamed from: E */
    rnl mo411E(slw slwVar, ts2 ts2Var);

    /* JADX INFO: renamed from: F */
    MomoPipeline mo412F();

    /* JADX INFO: renamed from: G */
    e95 mo413G(sol solVar);

    /* JADX INFO: renamed from: H */
    void mo414H(etf etfVar);

    /* JADX INFO: renamed from: I */
    void mo415I(ccj ccjVar, String str);

    /* JADX INFO: renamed from: J */
    void mo416J(sml smlVar);

    /* JADX INFO: renamed from: K */
    void mo417K();

    /* JADX INFO: renamed from: L */
    iql mo418L();

    /* JADX INFO: renamed from: M */
    ttl mo419M(LinkType linkType, String str, eix eixVar);

    /* JADX INFO: renamed from: N */
    void mo420N();

    /* JADX INFO: renamed from: O */
    void mo421O(boolean z);

    /* JADX INFO: renamed from: P */
    gxl mo422P(eix eixVar);

    /* JADX INFO: renamed from: b */
    void mo423b(vlw vlwVar);

    /* JADX INFO: renamed from: c */
    void mo424c(vlw vlwVar);

    /* JADX INFO: renamed from: d */
    void mo425d(qmr qmrVar);

    /* JADX INFO: renamed from: e */
    void mo426e(InterfaceC0022a interfaceC0022a);

    /* JADX INFO: renamed from: f */
    void mo427f(InterfaceC0024c interfaceC0024c);

    /* JADX INFO: renamed from: g */
    void mo428g(zv00.InterfaceC0816e interfaceC0816e);

    qmr getParameters();

    /* JADX INFO: renamed from: h */
    void mo429h(qmr qmrVar, boolean z);

    /* JADX INFO: renamed from: i */
    void mo430i(int i, int i2, xgf0 xgf0Var);

    /* JADX INFO: renamed from: j */
    void mo431j(btl btlVar);

    /* JADX INFO: renamed from: k */
    void mo432k(btl btlVar, String str, float f, float f2, float f3, float f4, float f5, int i, int i2, int i3);

    /* JADX INFO: renamed from: l */
    InterfaceC0021a mo433l();

    /* JADX INFO: renamed from: m */
    void mo434m(qmr qmrVar);

    /* JADX INFO: renamed from: n */
    void mo435n();

    /* JADX INFO: renamed from: o */
    v2m mo436o();

    /* JADX INFO: renamed from: p */
    void mo437p(qmr qmrVar);

    /* JADX INFO: renamed from: q */
    void mo438q(btl btlVar, String str);

    /* JADX INFO: renamed from: r */
    xsl mo439r(int i, boolean z, eix eixVar);

    /* JADX INFO: renamed from: s */
    void mo440s(int i, int i2);

    /* JADX INFO: renamed from: t */
    void mo441t();

    /* JADX INFO: renamed from: u */
    void mo442u(int i, int i2, int i3, int i4, boolean z);

    /* JADX INFO: renamed from: v */
    void mo443v(qmr qmrVar);

    /* JADX INFO: renamed from: w */
    void mo444w(btl btlVar, String str, float f, float f2, float f3, float f4, float f5, int i);

    /* JADX INFO: renamed from: x */
    sml mo445x();

    /* JADX INFO: renamed from: y */
    void mo446y(qmr qmrVar);

    /* JADX INFO: renamed from: z */
    void mo447z(j1m j1mVar);
}
