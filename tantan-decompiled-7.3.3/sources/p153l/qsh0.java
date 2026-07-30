package p153l;

import com.p051p1.mobile.putong.data.AdConfiguration;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00072\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, m88121d2 = {"Ll/qsh0;", "", "<init>", "()V", "Lcom/p1/mobile/putong/data/AdConfiguration;", "c", "()Lcom/p1/mobile/putong/data/AdConfiguration;", "Companion", "a", "putong-common_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class qsh0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a */
    @Nullable
    public static volatile qsh0 f159325a;

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: d */
    public static final qsh0 m177808d() {
        return INSTANCE.m177810a();
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final AdConfiguration m177809c() {
        return null;
    }

    /* JADX INFO: renamed from: l.qsh0$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"Ll/qsh0$a;", "", "<init>", "()V", "Ll/qsh0;", "a", "()Ll/qsh0;", "instance", "Ll/qsh0;", "putong-common_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final qsh0 m177810a() {
            qsh0 qsh0Var;
            qsh0 qsh0Var2 = qsh0.f159325a;
            if (qsh0Var2 != null) {
                return qsh0Var2;
            }
            synchronized (this) {
                qsh0Var = qsh0.f159325a;
                if (qsh0Var == null) {
                    qsh0Var = new qsh0();
                    qsh0.f159325a = qsh0Var;
                }
            }
            return qsh0Var;
        }

        public Companion() {
        }
    }
}
