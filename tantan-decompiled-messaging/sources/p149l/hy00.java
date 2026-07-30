package p149l;

import com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12713a;
import com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12714b;
import com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class hy00 implements oxl {

    /* JADX INFO: renamed from: e */
    public static final C12714b f110007e = new C12714b(new C12713a());

    /* JADX INFO: renamed from: a */
    public final q0f f110008a;

    /* JADX INFO: renamed from: b */
    public C12714b f110009b;

    /* JADX INFO: renamed from: c */
    public ArrayList<C12714b> f110010c = new ArrayList<>();

    /* JADX INFO: renamed from: d */
    public y74.InterfaceC21330a f110011d;

    public hy00(q0f q0fVar) {
        this.f110008a = q0fVar;
    }

    @Override // p149l.oxl
    /* JADX INFO: renamed from: a */
    public C12714b mo133471a() {
        C12714b c12714b = this.f110009b;
        if (c12714b != null) {
            return c12714b;
        }
        gkh0.m126627j("[live][motion]", "currentMotion is null  ");
        return f110007e;
    }

    @Override // p149l.oxl
    /* JADX INFO: renamed from: b */
    public void mo133472b() {
        m133480j();
        this.f110008a.f152056h.m133288g();
        gkh0.m126627j("[live][motion]", "stop motion push ");
    }

    @Override // p149l.oxl
    /* JADX INFO: renamed from: c */
    public void mo133473c(f30<Integer, Object> f30Var) {
        C12714b c12714b = this.f110009b;
        if (c12714b != null) {
            c12714b.mo71909m1(f30Var);
        }
    }

    @Override // p149l.oxl
    /* JADX INFO: renamed from: d */
    public int mo133474d(MotionParams motionParams) {
        m133475e(motionParams);
        C12714b c12714bM145887a = kgb0.m145887a(motionParams);
        this.f110009b = c12714bM145887a;
        if (c12714bM145887a == null) {
            upk0.m194883a("pusher motion create Error");
            return 0;
        }
        y74.InterfaceC21330a interfaceC21330a = this.f110011d;
        if (interfaceC21330a != null) {
            c12714bM145887a.m71908l1(interfaceC21330a);
        }
        this.f110009b.m71899b1(this.f110008a);
        gkh0.m126628k(motionParams.toString(), "[live][motion]", "[start]");
        return this.f110009b.mo71911o1();
    }

    /* JADX INFO: renamed from: e */
    public final void m133475e(MotionParams motionParams) {
        C12714b c12714b = this.f110009b;
        if (c12714b == null) {
            gkh0.m126627j("[live][motion]", "currentMotion is null return");
            return;
        }
        gkh0.m126628k(c12714b.toString(), "[live][motion]", "[clear_old]");
        if (this.f110009b.m71897Z0() == motionParams.mo71888a()) {
            m133480j();
        } else {
            m133481k();
        }
    }

    /* JADX INFO: renamed from: f */
    public void m133476f() {
        mo133472b();
        ArrayList arrayList = new ArrayList(this.f110010c);
        vwb.m200354z(arrayList, new e30() { // from class: l.fy00
            @Override // p149l.e30
            public final void call(Object obj) {
                ((C12714b) obj).mo71895X0();
            }
        });
        arrayList.clear();
        this.f110010c.clear();
        gkh0.m126627j("[live][motion]", "end all motion ");
    }

    /* JADX INFO: renamed from: h */
    public void m133478h(C12714b c12714b) {
        this.f110010c.remove(c12714b);
    }

    /* JADX INFO: renamed from: i */
    public void m133479i(C12714b c12714b) {
        this.f110010c.add(c12714b);
    }

    /* JADX INFO: renamed from: j */
    public final void m133480j() {
        C12714b c12714b = this.f110009b;
        if (c12714b != null) {
            c12714b.mo71898a1();
            gkh0.m126627j("[live][motion]", " oldMotionEndNow gotoEnd 调用完成 ,开始 end()");
            this.f110009b.mo71895X0();
            this.f110009b = null;
        }
        gkh0.m126627j("[live][motion]", "set currentMotion  null  ");
    }

    /* JADX INFO: renamed from: k */
    public final void m133481k() {
        C12714b c12714b = this.f110009b;
        if (c12714b != null) {
            c12714b.mo71898a1();
            this.f110009b = null;
        }
        gkh0.m126627j("[live][motion]", "set currentMotion  null  ");
    }

    /* JADX INFO: renamed from: l */
    public void m133482l() {
        this.f110008a.f152052d.m133215Y0();
        C12714b c12714b = this.f110009b;
        if (c12714b != null) {
            c12714b.mo71903g1();
        }
    }

    /* JADX INFO: renamed from: m */
    public void m133483m() {
        m133476f();
    }

    /* JADX INFO: renamed from: n */
    public void m133484n(y74.InterfaceC21330a interfaceC21330a) {
        this.f110011d = interfaceC21330a;
    }

    @Override // p149l.oxl
    public void onResume() {
        this.f110008a.f152052d.m133216Z0();
        C12714b c12714b = this.f110009b;
        if (c12714b != null) {
            c12714b.m71904h1();
        }
    }

    /* JADX INFO: renamed from: g */
    public void m133477g() {
    }
}
