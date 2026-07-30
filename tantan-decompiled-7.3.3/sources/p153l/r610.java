package p153l;

import com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12876a;
import com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12877b;
import com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class r610 implements h0m {

    /* JADX INFO: renamed from: e */
    public static final C12877b f161437e = new C12877b(new C12876a());

    /* JADX INFO: renamed from: a */
    public final u1f f161438a;

    /* JADX INFO: renamed from: b */
    public C12877b f161439b;

    /* JADX INFO: renamed from: c */
    public ArrayList<C12877b> f161440c = new ArrayList<>();

    /* JADX INFO: renamed from: d */
    public x84.InterfaceC21264a f161441d;

    public r610(u1f u1fVar) {
        this.f161438a = u1fVar;
    }

    @Override // p153l.h0m
    /* JADX INFO: renamed from: a */
    public C12877b mo133182a() {
        C12877b c12877b = this.f161439b;
        if (c12877b != null) {
            return c12877b;
        }
        nsh0.m164608j("[live][motion]", "currentMotion is null  ");
        return f161437e;
    }

    @Override // p153l.h0m
    /* JADX INFO: renamed from: b */
    public void mo133183b() {
        m179986j();
        this.f161438a.f176999h.m179840g();
        nsh0.m164608j("[live][motion]", "stop motion push ");
    }

    @Override // p153l.h0m
    /* JADX INFO: renamed from: c */
    public void mo133184c(z20<Integer, Object> z20Var) {
        C12877b c12877b = this.f161439b;
        if (c12877b != null) {
            c12877b.mo73092m1(z20Var);
        }
    }

    @Override // p153l.h0m
    /* JADX INFO: renamed from: d */
    public int mo133185d(MotionParams motionParams) {
        m179981e(motionParams);
        C12877b c12877bM168570a = oob0.m168570a(motionParams);
        this.f161439b = c12877bM168570a;
        if (c12877bM168570a == null) {
            azk0.m101074a("pusher motion create Error");
            return 0;
        }
        x84.InterfaceC21264a interfaceC21264a = this.f161441d;
        if (interfaceC21264a != null) {
            c12877bM168570a.m73091l1(interfaceC21264a);
        }
        this.f161439b.m73082b1(this.f161438a);
        nsh0.m164609k(motionParams.toString(), "[live][motion]", "[start]");
        return this.f161439b.mo73094o1();
    }

    /* JADX INFO: renamed from: e */
    public final void m179981e(MotionParams motionParams) {
        C12877b c12877b = this.f161439b;
        if (c12877b == null) {
            nsh0.m164608j("[live][motion]", "currentMotion is null return");
            return;
        }
        nsh0.m164609k(c12877b.toString(), "[live][motion]", "[clear_old]");
        if (this.f161439b.m73080Z0() == motionParams.mo73071a()) {
            m179986j();
        } else {
            m179987k();
        }
    }

    /* JADX INFO: renamed from: f */
    public void m179982f() {
        mo133183b();
        ArrayList arrayList = new ArrayList(this.f161440c);
        jyb.m147537z(arrayList, new y20() { // from class: l.p610
            @Override // p153l.y20
            public final void call(Object obj) {
                ((C12877b) obj).mo73078X0();
            }
        });
        arrayList.clear();
        this.f161440c.clear();
        nsh0.m164608j("[live][motion]", "end all motion ");
    }

    /* JADX INFO: renamed from: h */
    public void m179984h(C12877b c12877b) {
        this.f161440c.remove(c12877b);
    }

    /* JADX INFO: renamed from: i */
    public void m179985i(C12877b c12877b) {
        this.f161440c.add(c12877b);
    }

    /* JADX INFO: renamed from: j */
    public final void m179986j() {
        C12877b c12877b = this.f161439b;
        if (c12877b != null) {
            c12877b.mo73081a1();
            nsh0.m164608j("[live][motion]", " oldMotionEndNow gotoEnd 调用完成 ,开始 end()");
            this.f161439b.mo73078X0();
            this.f161439b = null;
        }
        nsh0.m164608j("[live][motion]", "set currentMotion  null  ");
    }

    /* JADX INFO: renamed from: k */
    public final void m179987k() {
        C12877b c12877b = this.f161439b;
        if (c12877b != null) {
            c12877b.mo73081a1();
            this.f161439b = null;
        }
        nsh0.m164608j("[live][motion]", "set currentMotion  null  ");
    }

    /* JADX INFO: renamed from: l */
    public void m179988l() {
        this.f161438a.f176995d.m170519Y0();
        C12877b c12877b = this.f161439b;
        if (c12877b != null) {
            c12877b.mo73086g1();
        }
    }

    /* JADX INFO: renamed from: m */
    public void m179989m() {
        m179982f();
    }

    /* JADX INFO: renamed from: n */
    public void m179990n(x84.InterfaceC21264a interfaceC21264a) {
        this.f161441d = interfaceC21264a;
    }

    @Override // p153l.h0m
    public void onResume() {
        this.f161438a.f176995d.m170520Z0();
        C12877b c12877b = this.f161439b;
        if (c12877b != null) {
            c12877b.m73087h1();
        }
    }

    /* JADX INFO: renamed from: g */
    public void m179983g() {
    }
}
