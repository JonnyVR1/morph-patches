package p002l;

import com.p1.mobile.putong.live.base.data.BLiveSuperGodDetail;
import kotlin.Metadata;
import l.bwr;
import l.e30;
import l.ffw;
import l.soj0;
import org.jetbrains.annotations.Nullable;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0010\u0010\u0005\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0002\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Ll/svg0;", "Ll/x6s;", "Ll/ho2;", "Ll/pvg0;", "Ll/bsm;", "info", "<init>", "(Ll/bsm;)V", "", "T", "()V", "U3", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class svg0 extends x6s<ho2, pvg0> {
    public svg0(@Nullable bsm<? extends ho2> bsmVar) {
        super(bsmVar);
        bsmVar.getClass();
        C(new pvg0(bsmVar.f8332a, this));
    }

    /* JADX INFO: renamed from: S3 */
    public static void m22707S3(svg0 svg0Var, BLiveSuperGodDetail bLiveSuperGodDetail) {
        if (bLiveSuperGodDetail != null) {
            ((pvg0) ((bwr) svg0Var).viewModel).m20717f0(bLiveSuperGodDetail);
        }
    }

    /* JADX INFO: renamed from: T3 */
    public static void m22708T3(svg0 svg0Var, soj0 soj0Var) {
        svg0Var.m22710U3();
    }

    /* JADX INFO: renamed from: T */
    public void m22709T() {
        super.T();
        duringCreated((c) m25548F2().SuperGodEvent.showSuperGidDialog().g()).subscribe(ffw.h(new e30() { // from class: l.qvg0
            public final void call(Object obj) {
                svg0.m22708T3(this.f18247a, (soj0) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX INFO: renamed from: U3 */
    public final void m22710U3() {
        String strM14576j0 = m25547E2().m14576j0();
        strM14576j0.getClass();
        duringCreated(kvg0.m16834c(strM14576j0)).subscribe(ffw.h(new e30() { // from class: l.rvg0
            public final void call(Object obj) {
                svg0.m22707S3(this.f18692a, (BLiveSuperGodDetail) obj);
            }
        }));
    }
}
