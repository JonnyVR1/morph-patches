package p149l;

import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceChatGroup;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\n¨\u0006\f"}, m87232d2 = {"Ll/fxm0;", "Ll/h4t;", "Ll/nnn0;", "Ll/kxm0;", "Ll/qqn0;", BaseSei.INFO, "<init>", "(Ll/qqn0;)V", "", Constants.KEY_T, "()V", "M3", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class fxm0 extends h4t<nnn0, kxm0> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fxm0(@NotNull qqn0 qqn0Var) {
        super(qqn0Var);
        qqn0Var.getClass();
        mo51532C(new kxm0());
    }

    /* JADX INFO: renamed from: J3 */
    public static void m123637J3(Throwable th) {
        hym0 hym0Var = hym0.INSTANCE;
        th.getClass();
        hym0Var.m133616a(th);
    }

    /* JADX INFO: renamed from: K3 */
    public static void m123638K3(fxm0 fxm0Var, Boolean bool) {
        ((kxm0) fxm0Var.viewModel).m147803p();
    }

    /* JADX INFO: renamed from: L3 */
    public static void m123639L3(fxm0 fxm0Var, BLiveVoiceChatGroup bLiveVoiceChatGroup) {
        ((kxm0) fxm0Var.viewModel).m147797i();
        fxm0Var.m206028F2().LiveVoiceChatGroupEvent.dismissCreateGroupSpanEvent().mo172463j(bLiveVoiceChatGroup.chatGroupId);
        lsi0.m151593w(R$string.f46859Ni);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M3 */
    public final void m123640M3() {
        xwm0 xwm0Var = xwm0.INSTANCE;
        String strM149814k = ((nnn0) m206027E2()).m149814k();
        strM149814k.getClass();
        duringCreated(xwm0Var.m211352m(strM149814k)).subscribe(ffw.m121194e(new e30() { // from class: l.dxm0
            @Override // p149l.e30
            public final void call(Object obj) {
                fxm0.m123639L3(this.f88312a, (BLiveVoiceChatGroup) obj);
            }
        }, new e30() { // from class: l.exm0
            @Override // p149l.e30
            public final void call(Object obj) {
                fxm0.m123637J3((Throwable) obj);
            }
        }));
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        m129304h3(m206028F2().LiveVoiceChatGroupEvent.openCreateGroupDialog(), new e30() { // from class: l.cxm0
            @Override // p149l.e30
            public final void call(Object obj) {
                fxm0.m123638K3(this.f82880a, (Boolean) obj);
            }
        });
    }
}
