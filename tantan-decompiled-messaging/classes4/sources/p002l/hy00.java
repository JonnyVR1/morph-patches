package p002l;

import com.p000p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C0302a;
import com.p000p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C0303b;
import com.p000p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;
import java.util.ArrayList;
import l.e30;
import l.f30;
import l.gkh0;
import l.upk0;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class hy00 implements oxl {

    /* JADX INFO: renamed from: e */
    public static final C0303b f12355e = new C0303b(new C0302a());

    /* JADX INFO: renamed from: a */
    public final q0f f12356a;

    /* JADX INFO: renamed from: b */
    public C0303b f12357b;

    /* JADX INFO: renamed from: c */
    public ArrayList<C0303b> f12358c = new ArrayList<>();

    /* JADX INFO: renamed from: d */
    public y74.InterfaceC0911a f12359d;

    public hy00(q0f q0fVar) {
        this.f12356a = q0fVar;
    }

    @Override // p002l.oxl
    /* JADX INFO: renamed from: a */
    public C0303b mo14924a() {
        C0303b c0303b = this.f12357b;
        if (c0303b != null) {
            return c0303b;
        }
        gkh0.j("[live][motion]", "currentMotion is null  ");
        return f12355e;
    }

    @Override // p002l.oxl
    /* JADX INFO: renamed from: b */
    public void mo14925b() {
        m14933j();
        this.f12356a.f17749h.m14895g();
        gkh0.j("[live][motion]", "stop motion push ");
    }

    @Override // p002l.oxl
    /* JADX INFO: renamed from: c */
    public void mo14926c(f30<Integer, Object> f30Var) {
        C0303b c0303b = this.f12357b;
        if (c0303b != null) {
            c0303b.mo5288m1(f30Var);
        }
    }

    @Override // p002l.oxl
    /* JADX INFO: renamed from: d */
    public int mo14927d(MotionParams motionParams) {
        m14928e(motionParams);
        C0303b c0303bM16615a = kgb0.m16615a(motionParams);
        this.f12357b = c0303bM16615a;
        if (c0303bM16615a == null) {
            upk0.a("pusher motion create Error");
            return 0;
        }
        y74.InterfaceC0911a interfaceC0911a = this.f12359d;
        if (interfaceC0911a != null) {
            c0303bM16615a.m5287l1(interfaceC0911a);
        }
        this.f12357b.m5277b1(this.f12356a);
        gkh0.k(motionParams.toString(), new String[]{"[live][motion]", "[start]"});
        return this.f12357b.mo5290o1();
    }

    /* JADX INFO: renamed from: e */
    public final void m14928e(MotionParams motionParams) {
        C0303b c0303b = this.f12357b;
        if (c0303b == null) {
            gkh0.j("[live][motion]", "currentMotion is null return");
            return;
        }
        gkh0.k(c0303b.toString(), new String[]{"[live][motion]", "[clear_old]"});
        if (this.f12357b.m5275Z0() == motionParams.mo5266a()) {
            m14933j();
        } else {
            m14934k();
        }
    }

    /* JADX INFO: renamed from: f */
    public void m14929f() {
        mo14925b();
        ArrayList arrayList = new ArrayList(this.f12358c);
        vwb.z(arrayList, new e30() { // from class: l.fy00
            public final void call(Object obj) {
                ((C0303b) obj).mo5273X0();
            }
        });
        arrayList.clear();
        this.f12358c.clear();
        gkh0.j("[live][motion]", "end all motion ");
    }

    /* JADX INFO: renamed from: h */
    public void m14931h(C0303b c0303b) {
        this.f12358c.remove(c0303b);
    }

    /* JADX INFO: renamed from: i */
    public void m14932i(C0303b c0303b) {
        this.f12358c.add(c0303b);
    }

    /* JADX INFO: renamed from: j */
    public final void m14933j() {
        C0303b c0303b = this.f12357b;
        if (c0303b != null) {
            c0303b.mo5276a1();
            gkh0.j("[live][motion]", " oldMotionEndNow gotoEnd 调用完成 ,开始 end()");
            this.f12357b.mo5273X0();
            this.f12357b = null;
        }
        gkh0.j("[live][motion]", "set currentMotion  null  ");
    }

    /* JADX INFO: renamed from: k */
    public final void m14934k() {
        C0303b c0303b = this.f12357b;
        if (c0303b != null) {
            c0303b.mo5276a1();
            this.f12357b = null;
        }
        gkh0.j("[live][motion]", "set currentMotion  null  ");
    }

    /* JADX INFO: renamed from: l */
    public void m14935l() {
        this.f12356a.f17745d.m14866Y0();
        C0303b c0303b = this.f12357b;
        if (c0303b != null) {
            c0303b.mo5282g1();
        }
    }

    /* JADX INFO: renamed from: m */
    public void m14936m() {
        m14929f();
    }

    /* JADX INFO: renamed from: n */
    public void m14937n(y74.InterfaceC0911a interfaceC0911a) {
        this.f12359d = interfaceC0911a;
    }

    @Override // p002l.oxl
    public void onResume() {
        this.f12356a.f17745d.m14867Z0();
        C0303b c0303b = this.f12357b;
        if (c0303b != null) {
            c0303b.m5283h1();
        }
    }

    /* JADX INFO: renamed from: g */
    public void m14930g() {
    }
}
