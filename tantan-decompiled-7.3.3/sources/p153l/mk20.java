package p153l;

import android.os.Build;
import androidx.work.NetworkType;
import androidx.work.impl.constraints.controllers.BaseConstraintController;
import com.p051p1.mobile.putong.core.data.Reason;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u000f8\u0014X\u0094D¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, m88121d2 = {"Ll/mk20;", "Landroidx/work/impl/constraints/controllers/BaseConstraintController;", "Ll/el20;", "Ll/j06;", "tracker", "<init>", "(Ll/j06;)V", "Ll/mjq0;", "workSpec", "", "c", "(Ll/mjq0;)Z", "value", "g", "(Ll/el20;)Z", "", "b", "I", "e", "()I", Reason.TYPE, "Companion", "a", "work-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class mk20 extends BaseConstraintController<el20> {

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final String f137194c;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int reason;

    static {
        String strM178831i = qzv.m178831i("NetworkMeteredCtrlr");
        strM178831i.getClass();
        f137194c = strM178831i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mk20(@NotNull j06<el20> j06Var) {
        super(j06Var);
        j06Var.getClass();
        this.reason = 7;
    }

    @Override // p153l.g06
    /* JADX INFO: renamed from: c */
    public boolean mo4576c(@NotNull mjq0 workSpec) {
        workSpec.getClass();
        return workSpec.constraints.getRequiredNetworkType() == NetworkType.METERED;
    }

    @Override // androidx.work.impl.constraints.controllers.BaseConstraintController
    /* JADX INFO: renamed from: e, reason: from getter */
    public int getReason() {
        return this.reason;
    }

    @Override // androidx.work.impl.constraints.controllers.BaseConstraintController
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public boolean mo4589f(@NotNull el20 value) {
        value.getClass();
        if (Build.VERSION.SDK_INT >= 26) {
            return (value.getIsConnected() && value.getIsMetered()) ? false : true;
        }
        qzv.m178829e().mo178832a(f137194c, "Metered network constraint is not supported before API 26, only checking for connected state.");
        return !value.getIsConnected();
    }
}
