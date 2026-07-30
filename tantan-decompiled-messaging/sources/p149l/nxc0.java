package p149l;

import com.clevertap.android.sdk.Constants;
import com.tantanapp.sharedlibrary.loader.internal.NoReportException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 \u0013*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u000b\tB\u0013\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\nR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0011\u0010\u0010\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0012\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0014"}, m87232d2 = {"Ll/nxc0;", j6f.GPS_DIRECTION_TRUE, "", "value", "<init>", "(Ljava/lang/Object;)V", "c", "()Ljava/lang/Object;", "", "b", "()Ljava/lang/Throwable;", "a", "Ljava/lang/Object;", "", "e", "()Z", "isSuccess", Constants.INAPP_DATA_TAG, "isFailure", "Companion", "loader_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class nxc0<T> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final Object value;

    /* JADX INFO: renamed from: l.nxc0$b */
    @Metadata(m87231d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, m87232d2 = {"Ll/nxc0$b;", "", "", "exception", "<init>", "(Ljava/lang/Throwable;)V", "a", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "loader_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class C18797b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Throwable exception;

        public C18797b(@NotNull Throwable th) {
            th.getClass();
            this.exception = th;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Throwable getException() {
            return this.exception;
        }
    }

    public nxc0(Object obj) {
        this.value = obj;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final Throwable m161933a() {
        if (!m161936d()) {
            qkq0.m175383a("");
            return null;
        }
        Object obj = this.value;
        obj.getClass();
        return ((C18797b) obj).getException();
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final Throwable m161934b() {
        if (!m161936d()) {
            return null;
        }
        Object obj = this.value;
        obj.getClass();
        return ((C18797b) obj).getException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public final T m161935c() throws Throwable {
        boolean zM161937e = m161937e();
        T t = (T) this.value;
        if (zM161937e) {
            return t;
        }
        t.getClass();
        throw ((C18797b) t).getException();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m161936d() {
        return !m161937e();
    }

    /* JADX INFO: renamed from: e */
    public final boolean m161937e() {
        return !(this.value instanceof C18797b);
    }

    /* JADX INFO: renamed from: l.nxc0$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0001\u0010\b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0001\u0010\b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0001\u0010\b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, m87232d2 = {"Ll/nxc0$a;", "", "<init>", "()V", "Ll/nxc0;", "", Constants.INAPP_DATA_TAG, "()Ll/nxc0;", j6f.GPS_DIRECTION_TRUE, "", "exception", "b", "(Ljava/lang/Throwable;)Ll/nxc0;", "", "message", "a", "(Ljava/lang/String;)Ll/nxc0;", "c", "loader_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final <T> nxc0<T> m161938a(@NotNull String message) {
            message.getClass();
            return m161939b(new RuntimeException(message));
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final <T> nxc0<T> m161939b(@NotNull Throwable exception) {
            exception.getClass();
            return new nxc0<>(new C18797b(exception), null);
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final <T> nxc0<T> m161940c(@NotNull String message) {
            message.getClass();
            return m161939b(new NoReportException(message));
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final nxc0<Unit> m161941d() {
            return new nxc0<>(Unit.INSTANCE, null);
        }

        public Companion() {
        }
    }

    public /* synthetic */ nxc0(Object obj, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj);
    }
}
