package p149l;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u000eB\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\"\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012¨\u0006\u0014"}, m87232d2 = {"Ll/g3c;", "", "<init>", "()V", "", "e", "", "c", "(Ljava/lang/Throwable;)V", "b", "()Ljava/lang/Throwable;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/Throwable;", "exception", "", "Ljava/util/Map;", "realData", "sharedlibrarymanager_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class g3c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public Throwable exception = new Exception("empty-error-message");

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Map<String, Object> realData = new LinkedHashMap();

    /* JADX INFO: renamed from: l.g3c$a */
    @Metadata(m87231d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\r"}, m87232d2 = {"Ll/g3c$a;", "", "<init>", "()V", "", "e", "b", "(Ljava/lang/Throwable;)Ll/g3c$a;", "Ll/g3c;", "a", "()Ll/g3c;", "Ll/g3c;", "data", "sharedlibrarymanager_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class C16987a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final g3c data = new g3c();

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final g3c getData() {
            return this.data;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final C16987a m124244b(@Nullable Throwable e) {
            this.data.exception = e;
            return this;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Throwable getException() {
        return this.exception;
    }

    /* JADX INFO: renamed from: c */
    public final void m124242c(@Nullable Throwable e) {
        this.exception = e;
    }

    @NotNull
    public String toString() {
        return "Data(realData=" + this.realData + ')';
    }
}
