package p149l;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u0005R\"\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\u000f\u0010\r\"\u0004\b\u0010\u0010\u0005R\"\u0010\u0017\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0013\u001a\u0004\b\n\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, m87232d2 = {"Ll/mxc0;", "", "", "value", "<init>", "(Ljava/lang/String;)V", "", "b", "()Z", "c", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "setValue", "getMessage", "setMessage", "message", "Ll/g3c;", "Ll/g3c;", "()Ll/g3c;", "setOutputData", "(Ll/g3c;)V", "outputData", "Companion", "sharedlibrarymanager_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@SourceDebugExtension
public final class mxc0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public String value;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public String message;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public g3c outputData;

    public mxc0(@NotNull String str) {
        str.getClass();
        this.value = str;
        this.message = "Message";
        this.outputData = new g3c.C16987a().getData();
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final g3c getOutputData() {
        return this.outputData;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m156870b() {
        return Intrinsics.m87488d(this.value, "failure");
    }

    /* JADX INFO: renamed from: c */
    public final boolean m156871c() {
        return Intrinsics.m87488d(this.value, "retry");
    }

    /* JADX INFO: renamed from: l.mxc0$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0010"}, m87232d2 = {"Ll/mxc0$a;", "", "<init>", "()V", "Ll/mxc0;", "b", "()Ll/mxc0;", "Ljava/lang/Exception;", "e", "a", "(Ljava/lang/Exception;)Ll/mxc0;", "", "Failure", "Ljava/lang/String;", "Retry", "Success", "sharedlibrarymanager_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final mxc0 m156872a(@NotNull Exception e) {
            e.getClass();
            mxc0 mxc0Var = new mxc0("failure");
            mxc0Var.getOutputData().m124242c(e);
            return mxc0Var;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final mxc0 m156873b() {
            return new mxc0("success");
        }

        public Companion() {
        }
    }
}
