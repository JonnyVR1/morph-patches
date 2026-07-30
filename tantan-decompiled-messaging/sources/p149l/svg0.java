package p149l;

import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.live.base.data.BLiveSuperGodDetail;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0010\u0010\u0005\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0002\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\n¨\u0006\f"}, m87232d2 = {"Ll/svg0;", "Ll/x6s;", "Ll/ho2;", "Ll/pvg0;", "Ll/bsm;", BaseSei.INFO, "<init>", "(Ll/bsm;)V", "", j6f.GPS_DIRECTION_TRUE, "()V", "U3", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class svg0 extends x6s<ho2, pvg0> {
    public svg0(@Nullable bsm<? extends ho2> bsmVar) {
        super(bsmVar);
        bsmVar.getClass();
        mo51532C(new pvg0(bsmVar.f77095a, this));
    }

    /* JADX INFO: renamed from: S3 */
    public static void m186079S3(svg0 svg0Var, BLiveSuperGodDetail bLiveSuperGodDetail) {
        if (bLiveSuperGodDetail != null) {
            ((pvg0) svg0Var.viewModel).m171650f0(bLiveSuperGodDetail);
        }
    }

    /* JADX INFO: renamed from: T3 */
    public static void m186080T3(svg0 svg0Var, soj0 soj0Var) {
        svg0Var.m186081U3();
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated(m206028F2().SuperGodEvent.showSuperGidDialog().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.qvg0
            @Override // p149l.e30
            public final void call(Object obj) {
                svg0.m186080T3(this.f156606a, (soj0) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX INFO: renamed from: U3 */
    public final void m186081U3() {
        String strM132140j0 = m206027E2().m132140j0();
        strM132140j0.getClass();
        duringCreated(kvg0.m147373c(strM132140j0)).subscribe(ffw.m121197h(new e30() { // from class: l.rvg0
            @Override // p149l.e30
            public final void call(Object obj) {
                svg0.m186079S3(this.f161201a, (BLiveSuperGodDetail) obj);
            }
        }));
    }
}
