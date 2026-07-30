package p153l;

import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceChatGroup;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\n¨\u0006\f"}, m88121d2 = {"Ll/j6n0;", "Ll/i6t;", "Ll/rwn0;", "Ll/o6n0;", "Ll/uzn0;", BaseSei.INFO, "<init>", "(Ll/uzn0;)V", "", Constants.KEY_T, "()V", "M3", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class j6n0 extends i6t<rwn0, o6n0> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6n0(@NotNull uzn0 uzn0Var) {
        super(uzn0Var);
        uzn0Var.getClass();
        mo52715C(new o6n0());
    }

    /* JADX INFO: renamed from: J3 */
    public static void m143673J3(Throwable th) {
        l7n0 l7n0Var = l7n0.INSTANCE;
        th.getClass();
        l7n0Var.m153146a(th);
    }

    /* JADX INFO: renamed from: K3 */
    public static void m143674K3(j6n0 j6n0Var, Boolean bool) {
        ((o6n0) j6n0Var.viewModel).m166278p();
    }

    /* JADX INFO: renamed from: L3 */
    public static void m143675L3(j6n0 j6n0Var, BLiveVoiceChatGroup bLiveVoiceChatGroup) {
        ((o6n0) j6n0Var.viewModel).m166272i();
        j6n0Var.m213811F2().LiveVoiceChatGroupEvent.dismissCreateGroupSpanEvent().mo199273j(bLiveVoiceChatGroup.chatGroupId);
        o1j0.m165649w(R$string.f47707Ni);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M3 */
    public final void m143676M3() {
        b6n0 b6n0Var = b6n0.INSTANCE;
        String strM202191k = ((rwn0) m213810E2()).m202191k();
        strM202191k.getClass();
        duringCreated(b6n0Var.m102785m(strM202191k)).subscribe(dhw.m115826e(new y20() { // from class: l.h6n0
            @Override // p153l.y20
            public final void call(Object obj) {
                j6n0.m143675L3(this.f108040a, (BLiveVoiceChatGroup) obj);
            }
        }, new y20() { // from class: l.i6n0
            @Override // p153l.y20
            public final void call(Object obj) {
                j6n0.m143673J3((Throwable) obj);
            }
        }));
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        m138863h3(m213811F2().LiveVoiceChatGroupEvent.openCreateGroupDialog(), new y20() { // from class: l.g6n0
            @Override // p153l.y20
            public final void call(Object obj) {
                j6n0.m143674K3(this.f102469a, (Boolean) obj);
            }
        });
    }
}
