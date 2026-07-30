package p153l;

import com.p051p1.mobile.putong.live.external.internal.vchat.sdk.base.C12694a;
import com.p051p1.mobile.putong.live.external.internal.vchat.sdk.base.C12695b;
import com.p051p1.mobile.putong.live.external.internal.vchat.sdk.base.MotionParams;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public class s610 implements i0m {

    /* JADX INFO: renamed from: d */
    public static final C12695b f166531d = new C12695b(new C12694a());

    /* JADX INFO: renamed from: a */
    public final v1f f166532a;

    /* JADX INFO: renamed from: b */
    public C12695b f166533b;

    /* JADX INFO: renamed from: c */
    public ArrayList<C12695b> f166534c = new ArrayList<>();

    public s610(v1f v1fVar) {
        this.f166532a = v1fVar;
    }

    @Override // p153l.i0m
    /* JADX INFO: renamed from: a */
    public C12695b mo138017a() {
        C12695b c12695b = this.f166533b;
        if (c12695b != null) {
            return c12695b;
        }
        nsh0.m164608j("videoChat", "currentMotion is null  ");
        return f166531d;
    }

    @Override // p153l.i0m
    /* JADX INFO: renamed from: b */
    public void mo138018b() {
        m184840i();
        this.f166532a.f181968h.m175282f();
        nsh0.m164608j("videoChat", "stop motion push ");
    }

    @Override // p153l.i0m
    /* JADX INFO: renamed from: c */
    public int mo138019c(MotionParams motionParams) {
        m184835d(motionParams);
        C12695b c12695bM164111a = nob0.m164111a(motionParams);
        this.f166533b = c12695bM164111a;
        if (c12695bM164111a == null) {
            azk0.m101074a("pusher motion create Error");
            return 0;
        }
        c12695bM164111a.m70876X0(this.f166532a);
        nsh0.m164609k(motionParams.toString(), "videoChat", "[start]");
        return this.f166533b.mo70880b1();
    }

    /* JADX INFO: renamed from: d */
    public final void m184835d(MotionParams motionParams) {
        C12695b c12695b = this.f166533b;
        if (c12695b == null) {
            nsh0.m164608j("videoChat", "currentMotion is null return");
            return;
        }
        nsh0.m164609k(c12695b.toString(), "videoChat", "[clear_old]");
        if (this.f166533b.m70874V0() == motionParams.mo70870a()) {
            m184840i();
        } else {
            m184841j();
        }
    }

    /* JADX INFO: renamed from: e */
    public void m184836e() {
        mo138018b();
        ArrayList arrayList = new ArrayList(this.f166534c);
        jyb.m147537z(arrayList, new y20() { // from class: l.q610
            @Override // p153l.y20
            public final void call(Object obj) {
                ((C12695b) obj).mo70873U0();
            }
        });
        arrayList.clear();
        this.f166534c.clear();
        nsh0.m164608j("videoChat", "end all motion ");
    }

    /* JADX INFO: renamed from: g */
    public void m184838g(C12695b c12695b) {
        this.f166534c.remove(c12695b);
    }

    /* JADX INFO: renamed from: h */
    public void m184839h(C12695b c12695b) {
        this.f166534c.add(c12695b);
    }

    /* JADX INFO: renamed from: i */
    public final void m184840i() {
        C12695b c12695b = this.f166533b;
        if (c12695b != null) {
            c12695b.mo70875W0();
            nsh0.m164608j("videoChat", " oldMotionEndNow gotoEnd 调用完成 ,开始 end()");
            this.f166533b.mo70873U0();
            this.f166533b = null;
        }
        nsh0.m164608j("videoChat", "set currentMotion  null  ");
    }

    /* JADX INFO: renamed from: j */
    public final void m184841j() {
        C12695b c12695b = this.f166533b;
        if (c12695b != null) {
            c12695b.mo70875W0();
            this.f166533b = null;
        }
        nsh0.m164608j("videoChat", "set currentMotion  null  ");
    }

    /* JADX INFO: renamed from: k */
    public void m184842k() {
        this.f166532a.f181964d.m175182V0();
        C12695b c12695b = this.f166533b;
        if (c12695b != null) {
            c12695b.m70878Z0();
        }
    }

    /* JADX INFO: renamed from: l */
    public void m184843l() {
        this.f166532a.f181964d.m175183W0();
        C12695b c12695b = this.f166533b;
        if (c12695b != null) {
            c12695b.m70879a1();
        }
    }

    /* JADX INFO: renamed from: m */
    public void m184844m() {
        m184836e();
    }

    /* JADX INFO: renamed from: f */
    public void m184837f() {
    }
}
