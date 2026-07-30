package p149l;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.RestrictTo;
import androidx.core.app.NotificationCompat;
import androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m87232d2 = {"Ll/ht2;", "Landroidx/work/impl/constraints/trackers/BroadcastReceiverConstraintTracker;", "", "Landroid/content/Context;", "context", "Ll/zei0;", "taskExecutor", "<init>", "(Landroid/content/Context;Ll/zei0;)V", BLiveStormDanmakuGiftResourceType.f44444l, "()Ljava/lang/Boolean;", "Landroid/content/Intent;", "intent", "", "j", "(Landroid/content/Intent;)V", "k", "(Landroid/content/Intent;)Z", "Landroid/content/IntentFilter;", RXScreenCaptureService.KEY_INDEX, "()Landroid/content/IntentFilter;", "intentFilter", "work-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class ht2 extends BroadcastReceiverConstraintTracker<Boolean> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ht2(@NotNull Context context, @NotNull zei0 zei0Var) {
        super(context, zei0Var);
        context.getClass();
        zei0Var.getClass();
    }

    @Override // androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker
    @NotNull
    /* JADX INFO: renamed from: i */
    public IntentFilter mo4591i() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.CHARGING");
        intentFilter.addAction("android.os.action.DISCHARGING");
        return intentFilter;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker
    /* JADX INFO: renamed from: j */
    public void mo4592j(@NotNull Intent intent) {
        intent.getClass();
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        txv.m190976e().mo190979a(it2.f114817a, "Received ".concat(action));
        switch (action.hashCode()) {
            case -1886648615:
                if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                    m118845f(Boolean.FALSE);
                    break;
                }
                break;
            case -54942926:
                if (action.equals("android.os.action.DISCHARGING")) {
                    m118845f(Boolean.FALSE);
                    break;
                }
                break;
            case 948344062:
                if (action.equals("android.os.action.CHARGING")) {
                    m118845f(Boolean.TRUE);
                    break;
                }
                break;
            case 1019184907:
                if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                    m118845f(Boolean.TRUE);
                    break;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m132812k(Intent intent) {
        int intExtra = intent.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1);
        return intExtra == 2 || intExtra == 5;
    }

    @Override // p149l.ez5
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public Boolean mo118843d() {
        Intent intentM136342l = ii5.m136342l(getAppContext(), null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentM136342l != null) {
            return Boolean.valueOf(m132812k(intentM136342l));
        }
        txv.m190976e().mo190981c(it2.f114817a, "getInitialState - null intent received");
        return Boolean.FALSE;
    }
}
