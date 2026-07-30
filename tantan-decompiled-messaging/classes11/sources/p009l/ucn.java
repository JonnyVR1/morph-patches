package p009l;

import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.live.base.data.BLiveIntlFamilyShareInfo;
import com.p1.mobile.putong.live.livingroom.R;
import kotlin.Metadata;
import l.bsm;
import l.bwr;
import l.e30;
import l.ffw;
import l.ho2;
import l.k9o;
import l.lsi0;
import l.roj0;
import l.wxs;
import l.x6s;
import l.xtr;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0019\u0012\u0010\u0010\u0005\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0002\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ll/ucn;", "Ll/x6s;", "Ll/ho2;", "Ll/pcn;", "Ll/bsm;", "info", "<init>", "(Ll/bsm;)V", "", "W3", "()V", "", "familyId", "X3", "(Ljava/lang/String;)V", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ucn extends x6s<ho2, pcn> {
    public ucn(@Nullable bsm<? extends ho2> bsmVar) {
        super(bsmVar);
    }

    /* JADX INFO: renamed from: S3 */
    public static void m22791S3(ucn ucnVar, roj0 roj0Var) {
        lsi0.w(R.string.nj);
        pcn pcnVar = ((bwr) ucnVar).viewModel;
        pcnVar.getClass();
        pcnVar.p();
    }

    /* JADX INFO: renamed from: T3 */
    public static void m22792T3(Throwable th) {
        xtr.c(th);
    }

    /* JADX INFO: renamed from: U3 */
    public static void m22793U3(Throwable th) {
        xtr.c(th);
    }

    /* JADX INFO: renamed from: V3 */
    public static void m22794V3(ucn ucnVar, BLiveIntlFamilyShareInfo bLiveIntlFamilyShareInfo) {
        if (((bwr) ucnVar).viewModel == null) {
            Act act = ((wxs) ucnVar).e.a;
            act.getClass();
            pcn pcnVar = new pcn(act, ucnVar);
            ((bwr) ucnVar).viewModel = pcnVar;
            ucnVar.C(pcnVar);
        }
        pcn pcnVar2 = ((bwr) ucnVar).viewModel;
        pcnVar2.getClass();
        bLiveIntlFamilyShareInfo.getClass();
        pcnVar2.m20144K(bLiveIntlFamilyShareInfo);
    }

    /* JADX INFO: renamed from: W3 */
    public final void m22795W3() {
        ho2 ho2VarE2 = E2();
        ho2VarE2.getClass();
        String str = ho2VarE2.Z0() ? "voiceLive" : "live";
        ho2 ho2VarE3 = E2();
        ho2VarE3.getClass();
        duringCreated(k9o.h(str, ho2VarE3.k())).subscribe(ffw.e(new e30() { // from class: l.qcn
            public final void call(Object obj) {
                ucn.m22794V3(this.f19139a, (BLiveIntlFamilyShareInfo) obj);
            }
        }, new e30() { // from class: l.rcn
            public final void call(Object obj) {
                ucn.m22793U3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: X3 */
    public final void m22796X3(@NotNull String familyId) {
        familyId.getClass();
        ho2 ho2VarE2 = E2();
        ho2VarE2.getClass();
        String str = ho2VarE2.Z0() ? "voiceLive" : "live";
        ho2 ho2VarE3 = E2();
        ho2VarE3.getClass();
        duringCreated(k9o.m(str, ho2VarE3.o(), familyId)).subscribe(ffw.e(new e30() { // from class: l.scn
            public final void call(Object obj) {
                ucn.m22791S3(this.f20169a, (roj0) obj);
            }
        }, new e30() { // from class: l.tcn
            public final void call(Object obj) {
                ucn.m22792T3((Throwable) obj);
            }
        }));
    }
}
