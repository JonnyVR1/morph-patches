package p153l;

import com.p051p1.mobile.putong.data.Followship;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceFollowship;
import com.tantan.live.generate.AutoLongLinkHandlerRegister;

/* JADX INFO: loaded from: classes4.dex */
public class y3w {

    /* JADX INFO: renamed from: l.y3w$a */
    public class C21507a implements g4m {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ l2w f197394a;

        public C21507a(l2w l2wVar) {
            this.f197394a = l2wVar;
        }

        @Override // p153l.g4m
        /* JADX INFO: renamed from: a */
        public Followship mo128897a() {
            return this.f197394a.m152642f().m222761e();
        }

        @Override // p153l.g4m
        /* JADX INFO: renamed from: b */
        public BLiveVoiceFollowship mo128898b() {
            return BLiveVoiceFollowship.new_();
        }

        @Override // p153l.g4m
        /* JADX INFO: renamed from: c */
        public User mo128899c() {
            return this.f197394a.m152639c().m222761e();
        }
    }

    /* JADX INFO: renamed from: a */
    public static m500 m214171a(l2w l2wVar) {
        m500 m500Var = new m500(l2wVar.m152645i());
        m500Var.m157076c(jyb.m147507f0(m214172b(l2wVar), new mfk0(), new mpx(l2wVar.m152641e().f148254B), new cf4(), new euw(l2wVar.m152644h()), new e4g0(), new pzj(), new ksd(), new hdm(), new twd0(), new l230(), new z6y(), new e31(), new g9k(), new es10(), new gi20(), new q760(), new c0f0(), new n2g0()));
        return m500Var;
    }

    /* JADX INFO: renamed from: b */
    public static zm3 m214172b(l2w l2wVar) {
        return new zm3(new C21507a(l2wVar));
    }

    /* JADX INFO: renamed from: c */
    public static void m214173c(p1w p1wVar) {
        AutoLongLinkHandlerRegister.register(p1wVar);
    }

    /* JADX INFO: renamed from: d */
    public static void m214174d(mq2 mq2Var) {
        v710.m200166d().m200174j(mq2Var);
    }

    /* JADX INFO: renamed from: e */
    public static void m214175e() {
        v710.m200166d().m200175k();
    }
}
