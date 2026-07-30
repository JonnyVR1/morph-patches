package p153l;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.RestrictTo;
import androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m88121d2 = {"Ll/x5g0;", "Landroidx/work/impl/constraints/trackers/BroadcastReceiverConstraintTracker;", "", "Landroid/content/Context;", "context", "Ll/zni0;", "taskExecutor", "<init>", "(Landroid/content/Context;Ll/zni0;)V", "k", "()Ljava/lang/Boolean;", "Landroid/content/Intent;", "intent", "", "j", "(Landroid/content/Intent;)V", "Landroid/content/IntentFilter;", RXScreenCaptureService.KEY_INDEX, "()Landroid/content/IntentFilter;", "intentFilter", "work-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class x5g0 extends BroadcastReceiverConstraintTracker<Boolean> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5g0(@NotNull Context context, @NotNull zni0 zni0Var) {
        super(context, zni0Var);
        context.getClass();
        zni0Var.getClass();
    }

    @Override // androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker
    @NotNull
    /* JADX INFO: renamed from: i */
    public IntentFilter mo4593i() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    @Override // androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker
    /* JADX INFO: renamed from: j */
    public void mo4594j(@NotNull Intent intent) {
        intent.getClass();
        if (intent.getAction() == null) {
            return;
        }
        qzv.m178829e().mo178832a(y5g0.f197557a, "Received " + intent.getAction());
        String action = intent.getAction();
        if (action != null) {
            int iHashCode = action.hashCode();
            if (iHashCode == -1181163412) {
                if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                    m142910f(Boolean.FALSE);
                }
            } else if (iHashCode == -730838620 && action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                m142910f(Boolean.TRUE);
            }
        }
    }

    @Override // p153l.j06
    @NotNull
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Boolean mo100316d() {
        Intent intentM145018l = jj5.m145018l(getAppContext(), null, mo4593i());
        boolean z = true;
        if (intentM145018l != null && intentM145018l.getAction() != null) {
            String action = intentM145018l.getAction();
            if (action == null) {
                z = false;
            } else {
                int iHashCode = action.hashCode();
                if (iHashCode == -1181163412) {
                    action.equals("android.intent.action.DEVICE_STORAGE_LOW");
                } else if (iHashCode != -730838620 || !action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                }
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }
}
