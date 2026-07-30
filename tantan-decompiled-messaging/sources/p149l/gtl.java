package p149l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000e\u0010\fJ\u0015\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, m87232d2 = {"Ll/gtl;", "", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", Constants.KEY_CONFIG, "<init>", "(Lcom/clevertap/android/sdk/CleverTapInstanceConfig;)V", "Landroid/content/Context;", "context", "", RXScreenCaptureService.KEY_INDEX, "", Constants.INAPP_DATA_TAG, "(Landroid/content/Context;J)V", "j", "e", "b", "(Landroid/content/Context;)J", "c", "a", "(Landroid/content/Context;)V", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@SourceDebugExtension
public final class gtl {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final CleverTapInstanceConfig config;

    public gtl(@NotNull CleverTapInstanceConfig cleverTapInstanceConfig) {
        cleverTapInstanceConfig.getClass();
        this.config = cleverTapInstanceConfig;
    }

    /* JADX INFO: renamed from: a */
    public final void m127988a(@NotNull Context context) {
        context.getClass();
        SharedPreferences.Editor editorEdit = mxf0.m156888h(context, "IJ").edit();
        editorEdit.clear();
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: b */
    public final long m127989b(@NotNull Context context) {
        context.getClass();
        mxf0 mxf0Var = mxf0.INSTANCE;
        String accountId = this.config.getAccountId();
        accountId.getClass();
        return mxf0Var.m156903f(context, accountId, "comms_i", 0L, "IJ");
    }

    /* JADX INFO: renamed from: c */
    public final long m127990c(@NotNull Context context) {
        context.getClass();
        mxf0 mxf0Var = mxf0.INSTANCE;
        String accountId = this.config.getAccountId();
        accountId.getClass();
        return mxf0Var.m156903f(context, accountId, "comms_j", 0L, "IJ");
    }

    @SuppressLint({"CommitPrefEdits"})
    /* JADX INFO: renamed from: d */
    public final void m127991d(@NotNull Context context, long i) {
        context.getClass();
        mxf0.INSTANCE.m156909u(context, "IJ", "comms_i:" + this.config.getAccountId(), i);
    }

    @SuppressLint({"CommitPrefEdits"})
    /* JADX INFO: renamed from: e */
    public final void m127992e(@NotNull Context context, long j) {
        context.getClass();
        mxf0.INSTANCE.m156909u(context, "IJ", "comms_j:" + this.config.getAccountId(), j);
    }
}
