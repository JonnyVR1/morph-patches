package p149l;

import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m87232d2 = {"Ll/b7p0;", "Ll/x6s;", "Ll/ho2;", "Ll/z6p0;", "Ll/bsm;", BaseSei.INFO, "<init>", "(Ll/bsm;)V", "", Constants.KEY_T, "()V", "Ll/ifo0;", "editInfo", "T3", "(Ll/ifo0;)V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class b7p0 extends x6s<ho2, z6p0> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b7p0(@NotNull bsm<? extends ho2> bsmVar) {
        super(bsmVar);
        bsmVar.getClass();
    }

    /* JADX INFO: renamed from: S3 */
    public static void m100694S3(b7p0 b7p0Var, ifo0 ifo0Var) {
        ifo0Var.getClass();
        b7p0Var.m100695T3(ifo0Var);
    }

    /* JADX INFO: renamed from: T3 */
    public final void m100695T3(@NotNull ifo0 editInfo) {
        editInfo.getClass();
        if (this.viewModel == 0) {
            Act act = this.f188513f;
            act.getClass();
            z6p0 z6p0Var = new z6p0(act, this);
            this.viewModel = z6p0Var;
            z6p0Var.mo21065i1(this);
        }
        ((z6p0) this.viewModel).m71834E();
        ((z6p0) this.viewModel).m217413O(editInfo);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206028F2().VirtualRoomInfoEvent.showVirtualNoticePreviewDialog().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.a7p0
            @Override // p149l.e30
            public final void call(Object obj) {
                b7p0.m100694S3(this.f67944a, (ifo0) obj);
            }
        }));
    }
}
