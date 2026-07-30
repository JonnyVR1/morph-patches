package p149l;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.data.Ref;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\b\u0010\u0003J\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\n\u0010\u000bR(\u0010\u000f\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00040\fj\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004`\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000eR\u0014\u0010\t\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0006¨\u0006\u0011"}, m87232d2 = {"Ll/toi0;", "", "<init>", "()V", "Ll/s3f;", "a", "()Ll/s3f;", "", "c", "eventLoop", Constants.INAPP_DATA_TAG, "(Ll/s3f;)V", "Ljava/lang/ThreadLocal;", "Lkotlinx/coroutines/internal/CommonThreadLocal;", "Ljava/lang/ThreadLocal;", Ref.TYPE, "b", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
@SourceDebugExtension
public final class toi0 {

    @NotNull
    public static final toi0 INSTANCE = new toi0();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final ThreadLocal<s3f> ref = voi0.m199165a(new yfh0("ThreadLocalEventLoop"));

    @Nullable
    /* JADX INFO: renamed from: a */
    public final s3f m189885a() {
        return ref.get();
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final s3f m189886b() {
        ThreadLocal<s3f> threadLocal = ref;
        s3f s3fVar = threadLocal.get();
        if (s3fVar != null) {
            return s3fVar;
        }
        s3f s3fVarM187113a = t3f.m187113a();
        threadLocal.set(s3fVarM187113a);
        return s3fVarM187113a;
    }

    /* JADX INFO: renamed from: c */
    public final void m189887c() {
        ref.set(null);
    }

    /* JADX INFO: renamed from: d */
    public final void m189888d(@NotNull s3f eventLoop) {
        ref.set(eventLoop);
    }
}
