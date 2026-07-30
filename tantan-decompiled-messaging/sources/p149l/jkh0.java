package p149l;

import com.p046p1.mobile.putong.data.AdConfiguration;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00072\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, m87232d2 = {"Ll/jkh0;", "", "<init>", "()V", "Lcom/p1/mobile/putong/data/AdConfiguration;", "c", "()Lcom/p1/mobile/putong/data/AdConfiguration;", "Companion", "a", "putong-common_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class jkh0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a */
    @Nullable
    public static volatile jkh0 f118381a;

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: d */
    public static final jkh0 m141875d() {
        return INSTANCE.m141877a();
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final AdConfiguration m141876c() {
        return null;
    }

    /* JADX INFO: renamed from: l.jkh0$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, m87232d2 = {"Ll/jkh0$a;", "", "<init>", "()V", "Ll/jkh0;", "a", "()Ll/jkh0;", "instance", "Ll/jkh0;", "putong-common_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final jkh0 m141877a() {
            jkh0 jkh0Var;
            jkh0 jkh0Var2 = jkh0.f118381a;
            if (jkh0Var2 != null) {
                return jkh0Var2;
            }
            synchronized (this) {
                jkh0Var = jkh0.f118381a;
                if (jkh0Var == null) {
                    jkh0Var = new jkh0();
                    jkh0.f118381a = jkh0Var;
                }
            }
            return jkh0Var;
        }

        public Companion() {
        }
    }
}
