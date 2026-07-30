package p149l;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.RestrictTo;
import androidx.core.app.NotificationCompat;
import androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.momo.mcamera.mask.BigEyeFilter;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m87232d2 = {"Ll/kt2;", "Landroidx/work/impl/constraints/trackers/BroadcastReceiverConstraintTracker;", "", "Landroid/content/Context;", "context", "Ll/zei0;", "taskExecutor", "<init>", "(Landroid/content/Context;Ll/zei0;)V", "k", "()Ljava/lang/Boolean;", "Landroid/content/Intent;", "intent", "", "j", "(Landroid/content/Intent;)V", "Landroid/content/IntentFilter;", RXScreenCaptureService.KEY_INDEX, "()Landroid/content/IntentFilter;", "intentFilter", "work-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class kt2 extends BroadcastReceiverConstraintTracker<Boolean> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kt2(@NotNull Context context, @NotNull zei0 zei0Var) {
        super(context, zei0Var);
        context.getClass();
        zei0Var.getClass();
    }

    @Override // androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker
    @NotNull
    /* JADX INFO: renamed from: i */
    public IntentFilter mo4591i() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker
    /* JADX INFO: renamed from: j */
    public void mo4592j(@NotNull Intent intent) {
        intent.getClass();
        if (intent.getAction() == null) {
            return;
        }
        txv.m190976e().mo190979a(lt2.f129923a, "Received " + intent.getAction());
        String action = intent.getAction();
        if (action != null) {
            int iHashCode = action.hashCode();
            if (iHashCode == -1980154005) {
                if (action.equals("android.intent.action.BATTERY_OKAY")) {
                    m118845f(Boolean.TRUE);
                }
            } else if (iHashCode == 490310653 && action.equals("android.intent.action.BATTERY_LOW")) {
                m118845f(Boolean.FALSE);
            }
        }
    }

    @Override // p149l.ez5
    @NotNull
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Boolean mo118843d() {
        Intent intentM136342l = ii5.m136342l(getAppContext(), null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentM136342l == null) {
            txv.m190976e().mo190981c(lt2.f129923a, "getInitialState - null intent received");
            return Boolean.FALSE;
        }
        int intExtra = intentM136342l.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1);
        float intExtra2 = intentM136342l.getIntExtra(FirebaseAnalytics.Param.LEVEL, -1) / intentM136342l.getIntExtra(BigEyeFilter.UNIFORM_SCALE, -1);
        boolean z = true;
        if (intExtra != 1 && intExtra2 <= 0.15f) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
