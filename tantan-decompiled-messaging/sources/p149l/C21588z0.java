package p149l;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: l.z0 */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\tJ\u001d\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\tJ%\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0012\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u001c\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m87232d2 = {"Ll/z0;", "", "<init>", "()V", "", "tag", "msg", "", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;Ljava/lang/String;)V", "a", "b", "", "tr", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "", "Z", "isDebug", "()Z", "e", "(Z)V", "Ll/yll;", "Ll/yll;", "getLog", "()Ll/yll;", "f", "(Ll/yll;)V", "log", "base_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class C21588z0 {

    @NotNull
    public static final C21588z0 INSTANCE = new C21588z0();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static boolean isDebug;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public static yll log;

    /* JADX INFO: renamed from: a */
    public final void m216706a(@NotNull String tag, @NotNull String msg) {
        yll yllVar;
        tag.getClass();
        msg.getClass();
        if (!isDebug || (yllVar = log) == null) {
            return;
        }
        yllVar.mo74255d(tag, msg);
    }

    /* JADX INFO: renamed from: b */
    public final void m216707b(@NotNull String tag, @NotNull String msg) {
        tag.getClass();
        msg.getClass();
        yll yllVar = log;
        if (yllVar != null) {
            yllVar.mo74256e(tag, msg);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m216708c(@NotNull String tag, @NotNull String msg, @NotNull Throwable tr) {
        tag.getClass();
        msg.getClass();
        tr.getClass();
        yll yllVar = log;
        if (yllVar != null) {
            yllVar.mo74254a(tag, msg, tr);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m216709d(@NotNull String tag, @NotNull String msg) {
        tag.getClass();
        msg.getClass();
        yll yllVar = log;
        if (yllVar != null) {
            yllVar.mo74257i(tag, msg);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m216710e(boolean z) {
        isDebug = z;
    }

    /* JADX INFO: renamed from: f */
    public final void m216711f(@Nullable yll yllVar) {
        log = yllVar;
    }
}
