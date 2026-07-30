package p149l;

import android.content.Context;
import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001BS\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0010\u0010\u0016R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0017\u001a\u0004\b\u0014\u0010\u0018R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0019\u0010\u0016R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001a\u0010\u0016¨\u0006\u001b"}, m87232d2 = {"Ll/b7j0;", "", "Landroid/content/Context;", "context", "Ll/zei0;", "taskExecutor", "Ll/ez5;", "", "batteryChargingTracker", "Ll/kt2;", "batteryNotLowTracker", "Ll/uc20;", "networkStateTracker", "storageNotLowTracker", "<init>", "(Landroid/content/Context;Ll/zei0;Ll/ez5;Ll/kt2;Ll/ez5;Ll/ez5;)V", "a", "Landroid/content/Context;", "c", "()Landroid/content/Context;", "b", "Ll/ez5;", "()Ll/ez5;", "Ll/kt2;", "()Ll/kt2;", Constants.INAPP_DATA_TAG, "e", "work-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class b7j0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final ez5<Boolean> batteryChargingTracker;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final kt2 batteryNotLowTracker;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final ez5<uc20> networkStateTracker;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final ez5<Boolean> storageNotLowTracker;

    public /* synthetic */ b7j0(Context context, zei0 zei0Var, ez5 ez5Var, kt2 kt2Var, ez5 ez5Var2, ez5 ez5Var3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 4) != 0) {
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            ez5Var = new ht2(applicationContext, zei0Var);
        }
        ez5 ez5Var4 = ez5Var;
        if ((i & 8) != 0) {
            Context applicationContext2 = context.getApplicationContext();
            applicationContext2.getClass();
            kt2Var = new kt2(applicationContext2, zei0Var);
        }
        kt2 kt2Var2 = kt2Var;
        if ((i & 16) != 0) {
            Context applicationContext3 = context.getApplicationContext();
            applicationContext3.getClass();
            ez5Var2 = wc20.m202597a(applicationContext3, zei0Var);
        }
        ez5 ez5Var5 = ez5Var2;
        if ((i & 32) != 0) {
            Context applicationContext4 = context.getApplicationContext();
            applicationContext4.getClass();
            ez5Var3 = new pxf0(applicationContext4, zei0Var);
        }
        this(context, zei0Var, ez5Var4, kt2Var2, ez5Var5, ez5Var3);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final ez5<Boolean> m100681a() {
        return this.batteryChargingTracker;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final kt2 getBatteryNotLowTracker() {
        return this.batteryNotLowTracker;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final ez5<uc20> m100684d() {
        return this.networkStateTracker;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final ez5<Boolean> m100685e() {
        return this.storageNotLowTracker;
    }

    @JvmOverloads
    public b7j0(@NotNull Context context, @NotNull zei0 zei0Var, @NotNull ez5<Boolean> ez5Var, @NotNull kt2 kt2Var, @NotNull ez5<uc20> ez5Var2, @NotNull ez5<Boolean> ez5Var3) {
        context.getClass();
        zei0Var.getClass();
        ez5Var.getClass();
        kt2Var.getClass();
        ez5Var2.getClass();
        ez5Var3.getClass();
        this.context = context;
        this.batteryChargingTracker = ez5Var;
        this.batteryNotLowTracker = kt2Var;
        this.networkStateTracker = ez5Var2;
        this.storageNotLowTracker = ez5Var3;
    }
}
