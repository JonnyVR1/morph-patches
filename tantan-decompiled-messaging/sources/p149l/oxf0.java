package p149l;

import androidx.work.impl.constraints.controllers.BaseConstraintController;
import com.p046p1.mobile.putong.core.data.Reason;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0013\u001a\u00020\u000e8\u0014X\u0094D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m87232d2 = {"Ll/oxf0;", "Landroidx/work/impl/constraints/controllers/BaseConstraintController;", "", "Ll/ez5;", "tracker", "<init>", "(Ll/ez5;)V", "Ll/haq0;", "workSpec", "c", "(Ll/haq0;)Z", "value", "g", "(Z)Z", "", "b", "I", "e", "()I", Reason.TYPE, "work-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class oxf0 extends BaseConstraintController<Boolean> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int reason;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oxf0(@NotNull ez5<Boolean> ez5Var) {
        super(ez5Var);
        ez5Var.getClass();
        this.reason = 9;
    }

    @Override // p149l.bz5
    /* JADX INFO: renamed from: c */
    public boolean mo4574c(@NotNull haq0 workSpec) {
        workSpec.getClass();
        return workSpec.constraints.getRequiresStorageNotLow();
    }

    @Override // androidx.work.impl.constraints.controllers.BaseConstraintController
    /* JADX INFO: renamed from: e, reason: from getter */
    public int getReason() {
        return this.reason;
    }

    @Override // androidx.work.impl.constraints.controllers.BaseConstraintController
    /* JADX INFO: renamed from: f */
    public /* bridge */ /* synthetic */ boolean mo4587f(Boolean bool) {
        return m166546g(bool.booleanValue());
    }

    /* JADX INFO: renamed from: g */
    public boolean m166546g(boolean value) {
        return !value;
    }
}
