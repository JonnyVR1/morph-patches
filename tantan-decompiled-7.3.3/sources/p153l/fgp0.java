package p153l;

import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m88121d2 = {"Ll/fgp0;", "Ll/y8s;", "Ll/oo2;", "Ll/dgp0;", "Ll/dum;", BaseSei.INFO, "<init>", "(Ll/dum;)V", "", Constants.KEY_T, "()V", "Ll/moo0;", "editInfo", "T3", "(Ll/moo0;)V", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class fgp0 extends y8s<oo2, dgp0> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fgp0(@NotNull dum<? extends oo2> dumVar) {
        super(dumVar);
        dumVar.getClass();
    }

    /* JADX INFO: renamed from: S3 */
    public static void m125511S3(fgp0 fgp0Var, moo0 moo0Var) {
        moo0Var.getClass();
        fgp0Var.m125512T3(moo0Var);
    }

    /* JADX INFO: renamed from: T3 */
    public final void m125512T3(@NotNull moo0 editInfo) {
        editInfo.getClass();
        if (this.viewModel == 0) {
            Act act = this.f196919f;
            act.getClass();
            dgp0 dgp0Var = new dgp0(act, this);
            this.viewModel = dgp0Var;
            dgp0Var.mo22064i1(this);
        }
        ((dgp0) this.viewModel).m73017E();
        ((dgp0) this.viewModel).m115671O(editInfo);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213811F2().VirtualRoomInfoEvent.showVirtualNoticePreviewDialog().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.egp0
            @Override // p153l.y20
            public final void call(Object obj) {
                fgp0.m125511S3(this.f93958a, (moo0) obj);
            }
        }));
    }
}
