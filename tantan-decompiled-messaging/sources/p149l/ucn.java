package p149l;

import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveIntlFamilyShareInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveType;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0019\u0012\u0010\u0010\u0005\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0002\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m87232d2 = {"Ll/ucn;", "Ll/x6s;", "Ll/ho2;", "Ll/pcn;", "Ll/bsm;", BaseSei.INFO, "<init>", "(Ll/bsm;)V", "", "W3", "()V", "", "familyId", "X3", "(Ljava/lang/String;)V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class ucn extends x6s<ho2, pcn> {
    public ucn(@Nullable bsm<? extends ho2> bsmVar) {
        super(bsmVar);
    }

    /* JADX INFO: renamed from: S3 */
    public static void m193097S3(ucn ucnVar, roj0 roj0Var) {
        lsi0.m151593w(R$string.f47418nj);
        V v2 = ucnVar.viewModel;
        v2.getClass();
        ((pcn) v2).mo71838p();
    }

    /* JADX INFO: renamed from: T3 */
    public static void m193098T3(Throwable th) {
        xtr.m211023c(th);
    }

    /* JADX INFO: renamed from: U3 */
    public static void m193099U3(Throwable th) {
        xtr.m211023c(th);
    }

    /* JADX INFO: renamed from: V3 */
    public static void m193100V3(ucn ucnVar, BLiveIntlFamilyShareInfo bLiveIntlFamilyShareInfo) {
        if (ucnVar.viewModel == 0) {
            Act act = ucnVar.f188512e.f77095a;
            act.getClass();
            pcn pcnVar = new pcn(act, ucnVar);
            ucnVar.viewModel = pcnVar;
            ucnVar.mo51532C(pcnVar);
        }
        V v2 = ucnVar.viewModel;
        v2.getClass();
        bLiveIntlFamilyShareInfo.getClass();
        ((pcn) v2).m168359K(bLiveIntlFamilyShareInfo);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, l.ho2] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, l.ho2, l.lh20] */
    /* JADX INFO: renamed from: W3 */
    public final void m193101W3() {
        ?? M206027E2 = m206027E2();
        M206027E2.getClass();
        String str = M206027E2.m132112Z0() ? BLiveType.voiceLive : "live";
        ?? M206027E3 = m206027E2();
        M206027E3.getClass();
        duringCreated(k9o.m145108h(str, M206027E3.m149814k())).subscribe(ffw.m121194e(new e30() { // from class: l.qcn
            @Override // p149l.e30
            public final void call(Object obj) {
                ucn.m193100V3(this.f153766a, (BLiveIntlFamilyShareInfo) obj);
            }
        }, new e30() { // from class: l.rcn
            @Override // p149l.e30
            public final void call(Object obj) {
                ucn.m193099U3((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, l.ho2] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, l.ho2, l.lh20] */
    /* JADX INFO: renamed from: X3 */
    public final void m193102X3(@NotNull String familyId) {
        familyId.getClass();
        ?? M206027E2 = m206027E2();
        M206027E2.getClass();
        String str = M206027E2.m132112Z0() ? BLiveType.voiceLive : "live";
        ?? M206027E3 = m206027E2();
        M206027E3.getClass();
        duringCreated(k9o.m145113m(str, M206027E3.m149818o(), familyId)).subscribe(ffw.m121194e(new e30() { // from class: l.scn
            @Override // p149l.e30
            public final void call(Object obj) {
                ucn.m193097S3(this.f163757a, (roj0) obj);
            }
        }, new e30() { // from class: l.tcn
            @Override // p149l.e30
            public final void call(Object obj) {
                ucn.m193098T3((Throwable) obj);
            }
        }));
    }
}
