package p149l;

import com.p046p1.mobile.putong.live.external.internal.vchat.sdk.base.C12531a;
import com.p046p1.mobile.putong.live.external.internal.vchat.sdk.base.C12532b;
import com.p046p1.mobile.putong.live.external.internal.vchat.sdk.base.MotionParams;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class iy00 implements pxl {

    /* JADX INFO: renamed from: d */
    public static final C12532b f115419d = new C12532b(new C12531a());

    /* JADX INFO: renamed from: a */
    public final r0f f115420a;

    /* JADX INFO: renamed from: b */
    public C12532b f115421b;

    /* JADX INFO: renamed from: c */
    public ArrayList<C12532b> f115422c = new ArrayList<>();

    public iy00(r0f r0fVar) {
        this.f115420a = r0fVar;
    }

    @Override // p149l.pxl
    /* JADX INFO: renamed from: a */
    public C12532b mo138913a() {
        C12532b c12532b = this.f115421b;
        if (c12532b != null) {
            return c12532b;
        }
        gkh0.m126627j("videoChat", "currentMotion is null  ");
        return f115419d;
    }

    @Override // p149l.pxl
    /* JADX INFO: renamed from: b */
    public void mo138914b() {
        m138921i();
        this.f115420a.f157173h.m128522f();
        gkh0.m126627j("videoChat", "stop motion push ");
    }

    @Override // p149l.pxl
    /* JADX INFO: renamed from: c */
    public int mo138915c(MotionParams motionParams) {
        m138916d(motionParams);
        C12532b c12532bM141280a = jgb0.m141280a(motionParams);
        this.f115421b = c12532bM141280a;
        if (c12532bM141280a == null) {
            upk0.m194883a("pusher motion create Error");
            return 0;
        }
        c12532bM141280a.m69693X0(this.f115420a);
        gkh0.m126628k(motionParams.toString(), "videoChat", "[start]");
        return this.f115421b.mo69697b1();
    }

    /* JADX INFO: renamed from: d */
    public final void m138916d(MotionParams motionParams) {
        C12532b c12532b = this.f115421b;
        if (c12532b == null) {
            gkh0.m126627j("videoChat", "currentMotion is null return");
            return;
        }
        gkh0.m126628k(c12532b.toString(), "videoChat", "[clear_old]");
        if (this.f115421b.m69691V0() == motionParams.mo69687a()) {
            m138921i();
        } else {
            m138922j();
        }
    }

    /* JADX INFO: renamed from: e */
    public void m138917e() {
        mo138914b();
        ArrayList arrayList = new ArrayList(this.f115422c);
        vwb.m200354z(arrayList, new e30() { // from class: l.gy00
            @Override // p149l.e30
            public final void call(Object obj) {
                ((C12532b) obj).mo69690U0();
            }
        });
        arrayList.clear();
        this.f115422c.clear();
        gkh0.m126627j("videoChat", "end all motion ");
    }

    /* JADX INFO: renamed from: g */
    public void m138919g(C12532b c12532b) {
        this.f115422c.remove(c12532b);
    }

    /* JADX INFO: renamed from: h */
    public void m138920h(C12532b c12532b) {
        this.f115422c.add(c12532b);
    }

    /* JADX INFO: renamed from: i */
    public final void m138921i() {
        C12532b c12532b = this.f115421b;
        if (c12532b != null) {
            c12532b.mo69692W0();
            gkh0.m126627j("videoChat", " oldMotionEndNow gotoEnd 调用完成 ,开始 end()");
            this.f115421b.mo69690U0();
            this.f115421b = null;
        }
        gkh0.m126627j("videoChat", "set currentMotion  null  ");
    }

    /* JADX INFO: renamed from: j */
    public final void m138922j() {
        C12532b c12532b = this.f115421b;
        if (c12532b != null) {
            c12532b.mo69692W0();
            this.f115421b = null;
        }
        gkh0.m126627j("videoChat", "set currentMotion  null  ");
    }

    /* JADX INFO: renamed from: k */
    public void m138923k() {
        this.f115420a.f157169d.m138708V0();
        C12532b c12532b = this.f115421b;
        if (c12532b != null) {
            c12532b.m69695Z0();
        }
    }

    /* JADX INFO: renamed from: l */
    public void m138924l() {
        this.f115420a.f157169d.m138709W0();
        C12532b c12532b = this.f115421b;
        if (c12532b != null) {
            c12532b.m69696a1();
        }
    }

    /* JADX INFO: renamed from: m */
    public void m138925m() {
        m138917e();
    }

    /* JADX INFO: renamed from: f */
    public void m138918f() {
    }
}
