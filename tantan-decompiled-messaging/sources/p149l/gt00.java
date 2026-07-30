package p149l;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \t2\u00020\u0001:\u0001\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m87232d2 = {"Ll/gt00;", "", "<init>", "()V", "", "loadScenes", "", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;)V", "Companion", "a", "putong-common_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class gt00 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a */
    @Nullable
    public static volatile gt00 f104237a;

    public /* synthetic */ gt00(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final gt00 m127870c() {
        return INSTANCE.m127872a();
    }

    /* JADX INFO: renamed from: d */
    public final void m127871d(@NotNull String loadScenes) {
        loadScenes.getClass();
    }

    /* JADX INFO: renamed from: l.gt00$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, m87232d2 = {"Ll/gt00$a;", "", "<init>", "()V", "Ll/gt00;", "a", "()Ll/gt00;", "instance", "Ll/gt00;", "putong-common_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final gt00 m127872a() {
            gt00 gt00Var;
            gt00 gt00Var2 = gt00.f104237a;
            if (gt00Var2 != null) {
                return gt00Var2;
            }
            synchronized (this) {
                gt00Var = gt00.f104237a;
                if (gt00Var == null) {
                    gt00Var = new gt00(null);
                    gt00.f104237a = gt00Var;
                }
            }
            return gt00Var;
        }

        public Companion() {
        }
    }

    public gt00() {
    }
}
