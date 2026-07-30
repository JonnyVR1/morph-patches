package p149l;

import com.p046p1.mobile.putong.data.Followship;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceFollowship;
import com.tantan.live.generate.AutoLongLinkHandlerRegister;

/* JADX INFO: loaded from: classes4.dex */
public class a2w {

    /* JADX INFO: renamed from: l.a2w$a */
    public class C15515a implements n1m {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ n0w f67300a;

        public C15515a(n0w n0wVar) {
            this.f67300a = n0wVar;
        }

        @Override // p149l.n1m
        /* JADX INFO: renamed from: a */
        public Followship mo94630a() {
            return this.f67300a.m157293f().m221515e();
        }

        @Override // p149l.n1m
        /* JADX INFO: renamed from: b */
        public BLiveVoiceFollowship mo94631b() {
            return BLiveVoiceFollowship.new_();
        }

        @Override // p149l.n1m
        /* JADX INFO: renamed from: c */
        public User mo94632c() {
            return this.f67300a.m157290c().m221515e();
        }
    }

    /* JADX INFO: renamed from: a */
    public static pwz m94625a(n0w n0wVar) {
        pwz pwzVar = new pwz(n0wVar.m157296i());
        pwzVar.m171770c(vwb.m200324f0(m94626b(n0wVar), new g6k0(), new ogx(n0wVar.m157292e().f108741B), new de4(), new frw(n0wVar.m157295h()), new vvf0(), new zwj(), new vqd(), new ram(), new rod0(), new bu20(), new cyx(), new x21(), new o6k(), new uj10(), new y920(), new lz50(), new vre0(), new euf0()));
        return pwzVar;
    }

    /* JADX INFO: renamed from: b */
    public static zl3 m94626b(n0w n0wVar) {
        return new zl3(new C15515a(n0wVar));
    }

    /* JADX INFO: renamed from: c */
    public static void m94627c(rzv rzvVar) {
        AutoLongLinkHandlerRegister.register(rzvVar);
    }

    /* JADX INFO: renamed from: d */
    public static void m94628d(vp2 vp2Var) {
        lz00.m152304d().m152312j(vp2Var);
    }

    /* JADX INFO: renamed from: e */
    public static void m94629e() {
        lz00.m152304d().m152313k();
    }
}
