package p002l;

import com.p1.mobile.putong.data.Followship;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.live.base.data.BLiveVoiceFollowship;
import com.tantan.live.generate.AutoLongLinkHandlerRegister;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class a2w {

    /* JADX INFO: renamed from: l.a2w$a */
    public class C0483a implements n1m {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ n0w f7354a;

        public C0483a(n0w n0wVar) {
            this.f7354a = n0wVar;
        }

        @Override // p002l.n1m
        /* JADX INFO: renamed from: a */
        public Followship mo9306a() {
            return (Followship) this.f7354a.m18355f().e();
        }

        @Override // p002l.n1m
        /* JADX INFO: renamed from: b */
        public BLiveVoiceFollowship mo9307b() {
            return BLiveVoiceFollowship.new_();
        }

        @Override // p002l.n1m
        /* JADX INFO: renamed from: c */
        public User mo9308c() {
            return (User) this.f7354a.m18352c().e();
        }
    }

    /* JADX INFO: renamed from: a */
    public static pwz m9301a(n0w n0wVar) {
        pwz pwzVar = new pwz(n0wVar.m18358i());
        pwzVar.m20736c(vwb.f0(new k4m[]{m9302b(n0wVar), new g6k0(), new ogx(n0wVar.m18354e().f12141B), new de4(), new frw(n0wVar.m18357h()), new vvf0(), new zwj(), new vqd(), new ram(), new rod0(), new bu20(), new cyx(), new x21(), new o6k(), new uj10(), new y920(), new lz50(), new vre0(), new euf0()}));
        return pwzVar;
    }

    /* JADX INFO: renamed from: b */
    public static zl3 m9302b(n0w n0wVar) {
        return new zl3(new C0483a(n0wVar));
    }

    /* JADX INFO: renamed from: c */
    public static void m9303c(rzv rzvVar) {
        AutoLongLinkHandlerRegister.register(rzvVar);
    }

    /* JADX INFO: renamed from: d */
    public static void m9304d(vp2 vp2Var) {
        lz00.m17628d().m17636j(vp2Var);
    }

    /* JADX INFO: renamed from: e */
    public static void m9305e() {
        lz00.m17628d().m17637k();
    }
}
