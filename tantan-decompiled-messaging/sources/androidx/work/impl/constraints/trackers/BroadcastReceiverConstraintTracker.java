package androidx.work.impl.constraints.trackers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.RestrictTo;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p149l.ef3;
import p149l.ez5;
import p149l.ii5;
import p149l.j6f;
import p149l.txv;
import p149l.zei0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m87232d2 = {"Landroidx/work/impl/constraints/trackers/BroadcastReceiverConstraintTracker;", j6f.GPS_DIRECTION_TRUE, "Ll/ez5;", "Landroid/content/Context;", "context", "Ll/zei0;", "taskExecutor", "<init>", "(Landroid/content/Context;Ll/zei0;)V", "Landroid/content/Intent;", "intent", "", "j", "(Landroid/content/Intent;)V", "g", "()V", "h", "Landroid/content/BroadcastReceiver;", "f", "Landroid/content/BroadcastReceiver;", "broadcastReceiver", "Landroid/content/IntentFilter;", RXScreenCaptureService.KEY_INDEX, "()Landroid/content/IntentFilter;", "intentFilter", "work-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class BroadcastReceiverConstraintTracker<T> extends ez5<T> {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final BroadcastReceiver broadcastReceiver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BroadcastReceiverConstraintTracker(@NotNull Context context, @NotNull zei0 zei0Var) {
        super(context, zei0Var);
        context.getClass();
        zei0Var.getClass();
        this.broadcastReceiver = new BroadcastReceiver(this) { // from class: androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker$broadcastReceiver$1
            final /* synthetic */ BroadcastReceiverConstraintTracker<T> this$0;

            {
                this.this$0 = this;
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                context2.getClass();
                intent.getClass();
                this.this$0.mo4592j(intent);
            }
        };
    }

    @Override // p149l.ez5
    /* JADX INFO: renamed from: g */
    public void mo4589g() {
        txv.m190976e().mo190979a(ef3.f90798a, getClass().getSimpleName().concat(": registering receiver"));
        ii5.m136342l(getAppContext(), this.broadcastReceiver, mo4591i());
    }

    @Override // p149l.ez5
    /* JADX INFO: renamed from: h */
    public void mo4590h() {
        txv.m190976e().mo190979a(ef3.f90798a, getClass().getSimpleName().concat(": unregistering receiver"));
        getAppContext().unregisterReceiver(this.broadcastReceiver);
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public abstract IntentFilter mo4591i();

    /* JADX INFO: renamed from: j */
    public abstract void mo4592j(@NotNull Intent intent);
}
