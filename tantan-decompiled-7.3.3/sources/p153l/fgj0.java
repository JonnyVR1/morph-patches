package p153l;

import android.content.Context;
import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001BS\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0010\u0010\u0016R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0017\u001a\u0004\b\u0014\u0010\u0018R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0019\u0010\u0016R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001a\u0010\u0016¨\u0006\u001b"}, m88121d2 = {"Ll/fgj0;", "", "Landroid/content/Context;", "context", "Ll/zni0;", "taskExecutor", "Ll/j06;", "", "batteryChargingTracker", "Ll/au2;", "batteryNotLowTracker", "Ll/el20;", "networkStateTracker", "storageNotLowTracker", "<init>", "(Landroid/content/Context;Ll/zni0;Ll/j06;Ll/au2;Ll/j06;Ll/j06;)V", "a", "Landroid/content/Context;", "c", "()Landroid/content/Context;", "b", "Ll/j06;", "()Ll/j06;", "Ll/au2;", "()Ll/au2;", Constants.INAPP_DATA_TAG, "e", "work-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class fgj0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final j06<Boolean> batteryChargingTracker;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final au2 batteryNotLowTracker;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final j06<el20> networkStateTracker;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final j06<Boolean> storageNotLowTracker;

    public /* synthetic */ fgj0(Context context, zni0 zni0Var, j06 j06Var, au2 au2Var, j06 j06Var2, j06 j06Var3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 4) != 0) {
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            j06Var = new xt2(applicationContext, zni0Var);
        }
        j06 j06Var4 = j06Var;
        if ((i & 8) != 0) {
            Context applicationContext2 = context.getApplicationContext();
            applicationContext2.getClass();
            au2Var = new au2(applicationContext2, zni0Var);
        }
        au2 au2Var2 = au2Var;
        if ((i & 16) != 0) {
            Context applicationContext3 = context.getApplicationContext();
            applicationContext3.getClass();
            j06Var2 = gl20.m130611a(applicationContext3, zni0Var);
        }
        j06 j06Var5 = j06Var2;
        if ((i & 32) != 0) {
            Context applicationContext4 = context.getApplicationContext();
            applicationContext4.getClass();
            j06Var3 = new x5g0(applicationContext4, zni0Var);
        }
        this(context, zni0Var, j06Var4, au2Var2, j06Var5, j06Var3);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final j06<Boolean> m125500a() {
        return this.batteryChargingTracker;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final au2 getBatteryNotLowTracker() {
        return this.batteryNotLowTracker;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final j06<el20> m125503d() {
        return this.networkStateTracker;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final j06<Boolean> m125504e() {
        return this.storageNotLowTracker;
    }

    @JvmOverloads
    public fgj0(@NotNull Context context, @NotNull zni0 zni0Var, @NotNull j06<Boolean> j06Var, @NotNull au2 au2Var, @NotNull j06<el20> j06Var2, @NotNull j06<Boolean> j06Var3) {
        context.getClass();
        zni0Var.getClass();
        j06Var.getClass();
        au2Var.getClass();
        j06Var2.getClass();
        j06Var3.getClass();
        this.context = context;
        this.batteryChargingTracker = j06Var;
        this.batteryNotLowTracker = au2Var;
        this.networkStateTracker = j06Var2;
        this.storageNotLowTracker = j06Var3;
    }
}
