package p149l;

import androidx.annotation.RestrictTo;
import androidx.work.impl.C0773a;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.data.Reason;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m87232d2 = {"Ll/hxf0;", "Ljava/lang/Runnable;", "Landroidx/work/impl/a;", "processor", "Ll/vuf0;", "token", "", "stopInForeground", "", Reason.TYPE, "<init>", "(Landroidx/work/impl/a;Ll/vuf0;ZI)V", "", "run", "()V", "a", "Landroidx/work/impl/a;", "b", "Ll/vuf0;", "c", "Z", Constants.INAPP_DATA_TAG, "I", "work-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class hxf0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final C0773a processor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final vuf0 token;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final boolean stopInForeground;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final int reason;

    public hxf0(@NotNull C0773a c0773a, @NotNull vuf0 vuf0Var, boolean z, int i) {
        c0773a.getClass();
        vuf0Var.getClass();
        this.processor = c0773a;
        this.token = vuf0Var;
        this.stopInForeground = z;
        this.reason = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z = this.stopInForeground;
        C0773a c0773a = this.processor;
        boolean zM4525s = z ? c0773a.m4525s(this.token, this.reason) : c0773a.m4526t(this.token, this.reason);
        txv.m190976e().mo190979a(txv.m190978i("StopWorkRunnable"), "StopWorkRunnable for " + this.token.getId().getWorkSpecId() + "; Processor.stopWork = " + zM4525s);
    }
}
