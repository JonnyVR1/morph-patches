package p153l;

import com.clevertap.android.sdk.Constants;
import com.tantanapp.sharedlibrary.loader.internal.NoReportException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 \u0013*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u000b\tB\u0013\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\nR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0011\u0010\u0010\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0012\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0014"}, m88121d2 = {"Ll/q5d0;", p7f.GPS_DIRECTION_TRUE, "", "value", "<init>", "(Ljava/lang/Object;)V", "c", "()Ljava/lang/Object;", "", "b", "()Ljava/lang/Throwable;", "a", "Ljava/lang/Object;", "", "e", "()Z", "isSuccess", Constants.INAPP_DATA_TAG, "isFailure", "Companion", "loader_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class q5d0<T> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final Object value;

    /* JADX INFO: renamed from: l.q5d0$b */
    @Metadata(m88120d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, m88121d2 = {"Ll/q5d0$b;", "", "", "exception", "<init>", "(Ljava/lang/Throwable;)V", "a", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "loader_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class C19526b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Throwable exception;

        public C19526b(@NotNull Throwable th) {
            th.getClass();
            this.exception = th;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Throwable getException() {
            return this.exception;
        }
    }

    public q5d0(Object obj) {
        this.value = obj;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final Throwable m175349a() {
        if (!m175352d()) {
            wtq0.m207906a("");
            return null;
        }
        Object obj = this.value;
        obj.getClass();
        return ((C19526b) obj).getException();
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final Throwable m175350b() {
        if (!m175352d()) {
            return null;
        }
        Object obj = this.value;
        obj.getClass();
        return ((C19526b) obj).getException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public final T m175351c() throws Throwable {
        boolean zM175353e = m175353e();
        T t = (T) this.value;
        if (zM175353e) {
            return t;
        }
        t.getClass();
        throw ((C19526b) t).getException();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m175352d() {
        return !m175353e();
    }

    /* JADX INFO: renamed from: e */
    public final boolean m175353e() {
        return !(this.value instanceof C19526b);
    }

    /* JADX INFO: renamed from: l.q5d0$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0001\u0010\b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0001\u0010\b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0001\u0010\b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, m88121d2 = {"Ll/q5d0$a;", "", "<init>", "()V", "Ll/q5d0;", "", Constants.INAPP_DATA_TAG, "()Ll/q5d0;", p7f.GPS_DIRECTION_TRUE, "", "exception", "b", "(Ljava/lang/Throwable;)Ll/q5d0;", "", "message", "a", "(Ljava/lang/String;)Ll/q5d0;", "c", "loader_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final <T> q5d0<T> m175354a(@NotNull String message) {
            message.getClass();
            return m175355b(new RuntimeException(message));
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final <T> q5d0<T> m175355b(@NotNull Throwable exception) {
            exception.getClass();
            return new q5d0<>(new C19526b(exception), null);
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final <T> q5d0<T> m175356c(@NotNull String message) {
            message.getClass();
            return m175355b(new NoReportException(message));
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final q5d0<Unit> m175357d() {
            return new q5d0<>(Unit.INSTANCE, null);
        }

        public Companion() {
        }
    }

    public /* synthetic */ q5d0(Object obj, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj);
    }
}
