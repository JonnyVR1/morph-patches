package com.momo.pub;

import com.momo.pipline.MomoInterface.MomoPipeline;
import com.momo.piplinemomoext.input.audio.InterfaceC4260a;
import p153l.brx;
import p153l.c4m;
import p153l.cql;
import p153l.dpl;
import p153l.drl;
import p153l.fa5;
import p153l.fpf0;
import p153l.h410;
import p153l.hwl;
import p153l.j410;
import p153l.jt2;
import p153l.lvl;
import p153l.n5m;
import p153l.pvl;
import p153l.ror;
import p153l.row;
import p153l.suf;
import p153l.uow;
import p153l.usl;
import p153l.wej;
import p153l.zzl;

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
    public interface InterfaceC4261a {
        /* JADX INFO: renamed from: a */
        void mo19371a(int i, int i2, c4m c4mVar);

        /* JADX INFO: renamed from: b */
        void mo19372b(int i, int i2, c4m c4mVar);
    }

    /* JADX INFO: renamed from: com.momo.pub.MomoPipelineModuleRegister$b */
    public interface InterfaceC4262b {
        /* JADX INFO: renamed from: a */
        void mo19379a(int i, int i2, c4m c4mVar);
    }

    /* JADX INFO: renamed from: com.momo.pub.MomoPipelineModuleRegister$c */
    public interface InterfaceC4263c {
        /* JADX INFO: renamed from: a */
        void mo19380a(c4m c4mVar);

        /* JADX INFO: renamed from: b */
        void mo19381b(c4m c4mVar);
    }

    /* JADX INFO: renamed from: A */
    void mo21140A(InterfaceC4262b interfaceC4262b);

    /* JADX INFO: renamed from: B */
    void mo21141B(pvl pvlVar);

    /* JADX INFO: renamed from: C */
    void mo21142C(c4m c4mVar);

    /* JADX INFO: renamed from: D */
    void mo21143D(j410.InterfaceC17870b interfaceC17870b);

    /* JADX INFO: renamed from: E */
    cql mo21144E(row rowVar, jt2 jt2Var);

    /* JADX INFO: renamed from: F */
    MomoPipeline mo21145F();

    /* JADX INFO: renamed from: G */
    fa5 mo21146G(drl drlVar);

    /* JADX INFO: renamed from: H */
    void mo21147H(suf sufVar);

    /* JADX INFO: renamed from: I */
    void mo21148I(wej wejVar, String str);

    /* JADX INFO: renamed from: J */
    void mo21149J(dpl dplVar);

    /* JADX INFO: renamed from: K */
    void mo21150K();

    /* JADX INFO: renamed from: L */
    usl mo21151L();

    /* JADX INFO: renamed from: M */
    hwl mo21152M(LinkType linkType, String str, brx brxVar);

    /* JADX INFO: renamed from: N */
    void mo21153N();

    /* JADX INFO: renamed from: O */
    void mo21154O(boolean z);

    /* JADX INFO: renamed from: P */
    zzl mo21155P(brx brxVar);

    /* JADX INFO: renamed from: b */
    void mo21156b(uow uowVar);

    /* JADX INFO: renamed from: c */
    void mo21157c(uow uowVar);

    /* JADX INFO: renamed from: d */
    void mo21158d(ror rorVar);

    /* JADX INFO: renamed from: e */
    void mo21159e(InterfaceC4261a interfaceC4261a);

    /* JADX INFO: renamed from: f */
    void mo21160f(InterfaceC4263c interfaceC4263c);

    /* JADX INFO: renamed from: g */
    void mo21161g(h410.InterfaceC17387e interfaceC17387e);

    ror getParameters();

    /* JADX INFO: renamed from: h */
    void mo21162h(ror rorVar, boolean z);

    /* JADX INFO: renamed from: i */
    void mo21163i(int i, int i2, fpf0 fpf0Var);

    /* JADX INFO: renamed from: j */
    void mo21164j(pvl pvlVar);

    /* JADX INFO: renamed from: k */
    void mo21165k(pvl pvlVar, String str, float f, float f2, float f3, float f4, float f5, int i, int i2, int i3);

    /* JADX INFO: renamed from: l */
    InterfaceC4260a mo21166l();

    /* JADX INFO: renamed from: m */
    void mo21167m(ror rorVar);

    /* JADX INFO: renamed from: n */
    void mo21168n();

    /* JADX INFO: renamed from: o */
    n5m mo21169o();

    /* JADX INFO: renamed from: p */
    void mo21170p(ror rorVar);

    /* JADX INFO: renamed from: q */
    void mo21171q(pvl pvlVar, String str);

    /* JADX INFO: renamed from: r */
    lvl mo21172r(int i, boolean z, brx brxVar);

    /* JADX INFO: renamed from: s */
    void mo21173s(int i, int i2);

    /* JADX INFO: renamed from: t */
    void mo21174t();

    /* JADX INFO: renamed from: u */
    void mo21175u(int i, int i2, int i3, int i4, boolean z);

    /* JADX INFO: renamed from: v */
    void mo21176v(ror rorVar);

    /* JADX INFO: renamed from: w */
    void mo21177w(pvl pvlVar, String str, float f, float f2, float f3, float f4, float f5, int i);

    /* JADX INFO: renamed from: x */
    dpl mo21178x();

    /* JADX INFO: renamed from: y */
    void mo21179y(ror rorVar);

    /* JADX INFO: renamed from: z */
    void mo21180z(c4m c4mVar);
}
