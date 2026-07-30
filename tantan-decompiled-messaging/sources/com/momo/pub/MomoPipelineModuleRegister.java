package com.momo.pub;

import com.momo.pipline.MomoInterface.MomoPipeline;
import com.momo.piplinemomoext.input.audio.InterfaceC4109a;
import p149l.btl;
import p149l.bw00;
import p149l.ccj;
import p149l.e95;
import p149l.eix;
import p149l.etf;
import p149l.gxl;
import p149l.iql;
import p149l.j1m;
import p149l.qmr;
import p149l.rnl;
import p149l.slw;
import p149l.sml;
import p149l.sol;
import p149l.ts2;
import p149l.ttl;
import p149l.v2m;
import p149l.vlw;
import p149l.xgf0;
import p149l.xsl;
import p149l.zv00;

/* JADX INFO: loaded from: classes8.dex */
public interface MomoPipelineModuleRegister {

    public enum LinkType {
        AGORALINK,
        WEILALINK,
        TXLINK,
        MOMORTCLINK,
        VOLCLINK
    }

    /* JADX INFO: renamed from: com.momo.pub.MomoPipelineModuleRegister$a */
    public interface InterfaceC4110a {
        /* JADX INFO: renamed from: a */
        void mo18362a(int i, int i2, j1m j1mVar);

        /* JADX INFO: renamed from: b */
        void mo18363b(int i, int i2, j1m j1mVar);
    }

    /* JADX INFO: renamed from: com.momo.pub.MomoPipelineModuleRegister$b */
    public interface InterfaceC4111b {
        /* JADX INFO: renamed from: a */
        void mo18370a(int i, int i2, j1m j1mVar);
    }

    /* JADX INFO: renamed from: com.momo.pub.MomoPipelineModuleRegister$c */
    public interface InterfaceC4112c {
        /* JADX INFO: renamed from: a */
        void mo18371a(j1m j1mVar);

        /* JADX INFO: renamed from: b */
        void mo18372b(j1m j1mVar);
    }

    /* JADX INFO: renamed from: A */
    void mo20141A(InterfaceC4111b interfaceC4111b);

    /* JADX INFO: renamed from: B */
    void mo20142B(btl btlVar);

    /* JADX INFO: renamed from: C */
    void mo20143C(j1m j1mVar);

    /* JADX INFO: renamed from: D */
    void mo20144D(bw00.InterfaceC15993b interfaceC15993b);

    /* JADX INFO: renamed from: E */
    rnl mo20145E(slw slwVar, ts2 ts2Var);

    /* JADX INFO: renamed from: F */
    MomoPipeline mo20146F();

    /* JADX INFO: renamed from: G */
    e95 mo20147G(sol solVar);

    /* JADX INFO: renamed from: H */
    void mo20148H(etf etfVar);

    /* JADX INFO: renamed from: I */
    void mo20149I(ccj ccjVar, String str);

    /* JADX INFO: renamed from: J */
    void mo20150J(sml smlVar);

    /* JADX INFO: renamed from: K */
    void mo20151K();

    /* JADX INFO: renamed from: L */
    iql mo20152L();

    /* JADX INFO: renamed from: M */
    ttl mo20153M(LinkType linkType, String str, eix eixVar);

    /* JADX INFO: renamed from: N */
    void mo20154N();

    /* JADX INFO: renamed from: O */
    void mo20155O(boolean z);

    /* JADX INFO: renamed from: P */
    gxl mo20156P(eix eixVar);

    /* JADX INFO: renamed from: b */
    void mo20157b(vlw vlwVar);

    /* JADX INFO: renamed from: c */
    void mo20158c(vlw vlwVar);

    /* JADX INFO: renamed from: d */
    void mo20159d(qmr qmrVar);

    /* JADX INFO: renamed from: e */
    void mo20160e(InterfaceC4110a interfaceC4110a);

    /* JADX INFO: renamed from: f */
    void mo20161f(InterfaceC4112c interfaceC4112c);

    /* JADX INFO: renamed from: g */
    void mo20162g(zv00.InterfaceC21782e interfaceC21782e);

    qmr getParameters();

    /* JADX INFO: renamed from: h */
    void mo20163h(qmr qmrVar, boolean z);

    /* JADX INFO: renamed from: i */
    void mo20164i(int i, int i2, xgf0 xgf0Var);

    /* JADX INFO: renamed from: j */
    void mo20165j(btl btlVar);

    /* JADX INFO: renamed from: k */
    void mo20166k(btl btlVar, String str, float f, float f2, float f3, float f4, float f5, int i, int i2, int i3);

    /* JADX INFO: renamed from: l */
    InterfaceC4109a mo20167l();

    /* JADX INFO: renamed from: m */
    void mo20168m(qmr qmrVar);

    /* JADX INFO: renamed from: n */
    void mo20169n();

    /* JADX INFO: renamed from: o */
    v2m mo20170o();

    /* JADX INFO: renamed from: p */
    void mo20171p(qmr qmrVar);

    /* JADX INFO: renamed from: q */
    void mo20172q(btl btlVar, String str);

    /* JADX INFO: renamed from: r */
    xsl mo20173r(int i, boolean z, eix eixVar);

    /* JADX INFO: renamed from: s */
    void mo20174s(int i, int i2);

    /* JADX INFO: renamed from: t */
    void mo20175t();

    /* JADX INFO: renamed from: u */
    void mo20176u(int i, int i2, int i3, int i4, boolean z);

    /* JADX INFO: renamed from: v */
    void mo20177v(qmr qmrVar);

    /* JADX INFO: renamed from: w */
    void mo20178w(btl btlVar, String str, float f, float f2, float f3, float f4, float f5, int i);

    /* JADX INFO: renamed from: x */
    sml mo20179x();

    /* JADX INFO: renamed from: y */
    void mo20180y(qmr qmrVar);

    /* JADX INFO: renamed from: z */
    void mo20181z(j1m j1mVar);
}
