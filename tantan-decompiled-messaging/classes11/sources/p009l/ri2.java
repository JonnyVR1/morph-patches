package p009l;

import kotlin.Metadata;
import l.jq2;
import l.mcr;
import l.qq3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\f\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0014\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0018\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013¨\u0006\u0019"}, d2 = {"Ll/ri2;", "Ll/jq2;", "Ll/e0h0;", "Ll/mcr;", "lifecycleProvider", "<init>", "(Ll/mcr;)V", "", "k0", "()V", "", "jumpH5Act", "e0", "(Ljava/lang/Boolean;)V", "a", "Z", "g0", "()Z", "i0", "(Z)V", "hasSetting", "b", "h0", "j0", "isUpdateSuccess", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ri2 extends jq2<e0h0> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public boolean hasSetting;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean isUpdateSuccess;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ri2(@NotNull mcr mcrVar) {
        super(mcrVar);
        mcrVar.getClass();
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m21661f0(ri2 ri2Var, Boolean bool, int i, Object obj) {
        if (obj != null) {
            qq3.a("Super calls with default arguments not supported in this target, function: finishAct");
            return;
        }
        if ((i & 1) != 0) {
            bool = Boolean.FALSE;
        }
        ri2Var.mo21662e0(bool);
    }

    /* JADX INFO: renamed from: e0 */
    public abstract void mo21662e0(@Nullable Boolean jumpH5Act);

    /* JADX INFO: renamed from: g0, reason: from getter */
    public final boolean getHasSetting() {
        return this.hasSetting;
    }

    /* JADX INFO: renamed from: h0, reason: from getter */
    public final boolean getIsUpdateSuccess() {
        return this.isUpdateSuccess;
    }

    /* JADX INFO: renamed from: i0 */
    public final void m21665i0(boolean z) {
        this.hasSetting = z;
    }

    /* JADX INFO: renamed from: j0 */
    public final void m21666j0(boolean z) {
        this.isUpdateSuccess = z;
    }

    /* JADX INFO: renamed from: k0 */
    public abstract void mo21667k0();
}
