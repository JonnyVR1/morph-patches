package p153l;

import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.live.base.data.BLiveSuperGodDetail;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0010\u0010\u0005\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0002\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\n¨\u0006\f"}, m88121d2 = {"Ll/a4h0;", "Ll/y8s;", "Ll/oo2;", "Ll/x3h0;", "Ll/dum;", BaseSei.INFO, "<init>", "(Ll/dum;)V", "", p7f.GPS_DIRECTION_TRUE, "()V", "U3", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class a4h0 extends y8s<oo2, x3h0> {
    public a4h0(@Nullable dum<? extends oo2> dumVar) {
        super(dumVar);
        dumVar.getClass();
        mo52715C(new x3h0(dumVar.f90815a, this));
    }

    /* JADX INFO: renamed from: S3 */
    public static void m95930S3(a4h0 a4h0Var, BLiveSuperGodDetail bLiveSuperGodDetail) {
        if (bLiveSuperGodDetail != null) {
            ((x3h0) a4h0Var.viewModel).m209242f0(bLiveSuperGodDetail);
        }
    }

    /* JADX INFO: renamed from: T3 */
    public static void m95931T3(a4h0 a4h0Var, vxj0 vxj0Var) {
        a4h0Var.m95932U3();
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(m213811F2().SuperGodEvent.showSuperGidDialog().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.y3h0
            @Override // p153l.y20
            public final void call(Object obj) {
                a4h0.m95931T3(this.f197364a, (vxj0) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    /* JADX INFO: renamed from: U3 */
    public final void m95932U3() {
        String strM168526j0 = m213810E2().m168526j0();
        strM168526j0.getClass();
        duringCreated(s3h0.m184278c(strM168526j0)).subscribe(dhw.m115829h(new y20() { // from class: l.z3h0
            @Override // p153l.y20
            public final void call(Object obj) {
                a4h0.m95930S3(this.f202830a, (BLiveSuperGodDetail) obj);
            }
        }));
    }
}
