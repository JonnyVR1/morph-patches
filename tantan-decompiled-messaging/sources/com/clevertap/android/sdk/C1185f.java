package com.clevertap.android.sdk;

import android.content.Context;
import com.clevertap.android.sdk.C1185f;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.mxf0;
import p149l.st3;

/* JADX INFO: renamed from: com.clevertap.android.sdk.f */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00112\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, m87232d2 = {"Lcom/clevertap/android/sdk/f;", "", "<init>", "()V", "", "e", "()Z", "fTR", "", "f", "(Z)V", "Landroid/content/Context;", "context", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", Constants.KEY_CONFIG, "g", "(Landroid/content/Context;Lcom/clevertap/android/sdk/CleverTapInstanceConfig;)V", "Companion", "a", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class C1185f {

    @Nullable
    private static volatile C1185f INSTANCE;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a */
    private static boolean f4891a = true;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.f$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\nR\u0018\u0010\f\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m87232d2 = {"Lcom/clevertap/android/sdk/f$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", Constants.KEY_CONFIG, "Lcom/clevertap/android/sdk/f;", "b", "(Landroid/content/Context;Lcom/clevertap/android/sdk/CleverTapInstanceConfig;)Lcom/clevertap/android/sdk/f;", "c", "INSTANCE", "Lcom/clevertap/android/sdk/f;", "", "firstTimeRequest", "Z", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public static Unit m6017a(Context context) {
            context.getClass();
            Companion companion = C1185f.INSTANCE;
            C1185f.f4891a = mxf0.INSTANCE.m156901a(context, "firstTimeRequest", true);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: b */
        private final C1185f m6018b(final Context context, CleverTapInstanceConfig config) {
            st3.m185849c(config).m190589a().m6946g("buildCache", new Callable() { // from class: l.sv3
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return C1185f.Companion.m6017a(context);
                }
            });
            return new C1185f();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: c */
        public final C1185f m6019c(@NotNull Context context, @NotNull CleverTapInstanceConfig config) {
            C1185f c1185fM6018b;
            context.getClass();
            config.getClass();
            C1185f c1185f = C1185f.INSTANCE;
            if (c1185f != null) {
                return c1185f;
            }
            synchronized (this) {
                c1185fM6018b = C1185f.INSTANCE;
                if (c1185fM6018b == null) {
                    c1185fM6018b = C1185f.INSTANCE.m6018b(context, config);
                    C1185f.INSTANCE = c1185fM6018b;
                }
            }
            return c1185fM6018b;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: a */
    public static Void m6010a(Context context) {
        context.getClass();
        mxf0.INSTANCE.m156906p(context, "firstTimeRequest", f4891a);
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m6014e() {
        return f4891a;
    }

    /* JADX INFO: renamed from: f */
    public final void m6015f(boolean fTR) {
        f4891a = fTR;
    }

    /* JADX INFO: renamed from: g */
    public final void m6016g(@NotNull final Context context, @NotNull CleverTapInstanceConfig config) {
        context.getClass();
        config.getClass();
        st3.m185849c(config).m190589a().m6946g("updateCacheToDisk", new Callable() { // from class: l.rv3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C1185f.m6010a(context);
            }
        });
    }
}
