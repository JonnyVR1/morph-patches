package p149l;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.base.data.Priority;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.io.File;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0013\u001a\u00020\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000fR\u001b\u0010\u0018\u001a\u00020\u00148FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\r\u001a\u0004\b\u0016\u0010\u0017R/\u0010\u001e\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00198FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\r\u001a\u0004\b\u001c\u0010\u001dR+\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u001fj\b\u0012\u0004\u0012\u00020\u0006` 8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\r\u001a\u0004\b\"\u0010#R\u001b\u0010'\u001a\u00020\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\r\u001a\u0004\b&\u0010\u000f¨\u0006("}, m87232d2 = {"Ll/q7e;", "", "Ll/q7e$a;", "builder", "<init>", "(Ll/q7e$a;)V", "Ll/h7e;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "g", "(Ll/h7e;)V", "", "a", "Lkotlin/Lazy;", "m", "()Ljava/lang/String;", "resourceUrl", "b", "h", "destFile", "Lcom/p1/mobile/putong/live/base/data/Priority;", "c", BLiveStormDanmakuGiftResourceType.f44444l, "()Lcom/p1/mobile/putong/live/base/data/Priority;", "priority", "Ll/x9j;", "Ljava/io/File;", Constants.INAPP_DATA_TAG, "j", "()Ll/x9j;", "interceptor", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "e", "k", "()Ljava/util/ArrayList;", "listeners", "f", RXScreenCaptureService.KEY_INDEX, "effectId", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class q7e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Lazy resourceUrl;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Lazy destFile;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Lazy priority;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Lazy interceptor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final Lazy listeners;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final Lazy effectId;

    /* JADX INFO: renamed from: l.q7e$a */
    @Metadata(m87231d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0010\u001a\u00020\u00002\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001e\u0010\u0018R\u001e\u0010\b\u001a\n \u001f*\u0004\u0018\u00010\u00070\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010 R*\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010!R\u0016\u0010\u0014\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001c¨\u0006\""}, m87232d2 = {"Ll/q7e$a;", "", "", "resourceUrl", "destFile", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/p1/mobile/putong/live/base/data/Priority;", "priority", RXScreenCaptureService.KEY_INDEX, "(Lcom/p1/mobile/putong/live/base/data/Priority;)Ll/q7e$a;", "e", "()Lcom/p1/mobile/putong/live/base/data/Priority;", "Ll/x9j;", "Ljava/io/File;", "interceptor", "h", "(Ll/x9j;)Ll/q7e$a;", Constants.INAPP_DATA_TAG, "()Ll/x9j;", "effectId", "g", "(Ljava/lang/String;)Ll/q7e$a;", "c", "()Ljava/lang/String;", "Ll/q7e;", "a", "()Ll/q7e;", "Ljava/lang/String;", "f", "b", "kotlin.jvm.PlatformType", "Lcom/p1/mobile/putong/live/base/data/Priority;", "Ll/x9j;", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C19441a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final String resourceUrl;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final String destFile;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public Priority priority;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @Nullable
        public x9j<String, File, File> interceptor;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        public String effectId;

        public C19441a(@NotNull String str, @NotNull String str2) {
            str.getClass();
            str2.getClass();
            this.resourceUrl = str;
            this.destFile = str2;
            this.priority = Priority.get("LOW");
            this.effectId = "";
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final q7e m173248a() {
            return new q7e(this, null);
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getDestFile() {
            return this.destFile;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getEffectId() {
            return this.effectId;
        }

        @Nullable
        /* JADX INFO: renamed from: d */
        public final x9j<String, File, File> m173251d() {
            return this.interceptor;
        }

        @NotNull
        /* JADX INFO: renamed from: e */
        public final Priority m173252e() {
            Priority priority = this.priority;
            priority.getClass();
            return priority;
        }

        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getResourceUrl() {
            return this.resourceUrl;
        }

        @NotNull
        /* JADX INFO: renamed from: g */
        public final C19441a m173254g(@NotNull String effectId) {
            effectId.getClass();
            this.effectId = effectId;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: h */
        public final C19441a m173255h(@NotNull x9j<String, File, File> interceptor) {
            interceptor.getClass();
            this.interceptor = interceptor;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: i */
        public final C19441a m173256i(@NotNull Priority priority) {
            priority.getClass();
            this.priority = priority;
            return this;
        }
    }

    public q7e(final C19441a c19441a) {
        this.resourceUrl = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.k7e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q7e.m173238d(c19441a);
            }
        });
        this.destFile = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.l7e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q7e.m173236b(c19441a);
            }
        });
        this.priority = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.m7e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q7e.m173235a(c19441a);
            }
        });
        this.interceptor = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.n7e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q7e.m173240f(c19441a);
            }
        });
        this.listeners = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.o7e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q7e.m173239e();
            }
        });
        this.effectId = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.p7e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q7e.m173237c(c19441a);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static Priority m173235a(C19441a c19441a) {
        return c19441a.m173252e();
    }

    /* JADX INFO: renamed from: b */
    public static String m173236b(C19441a c19441a) {
        return c19441a.getDestFile();
    }

    /* JADX INFO: renamed from: c */
    public static String m173237c(C19441a c19441a) {
        return c19441a.getEffectId();
    }

    /* JADX INFO: renamed from: d */
    public static String m173238d(C19441a c19441a) {
        return c19441a.getResourceUrl();
    }

    /* JADX INFO: renamed from: e */
    public static ArrayList m173239e() {
        return new ArrayList();
    }

    /* JADX INFO: renamed from: f */
    public static x9j m173240f(C19441a c19441a) {
        return c19441a.m173251d();
    }

    /* JADX INFO: renamed from: g */
    public final void m173241g(@NotNull h7e listener) {
        listener.getClass();
        m173245k().add(listener);
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final String m173242h() {
        return (String) this.destFile.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final String m173243i() {
        return (String) this.effectId.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public final x9j<String, File, File> m173244j() {
        return (x9j) this.interceptor.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final ArrayList<h7e> m173245k() {
        return (ArrayList) this.listeners.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final Priority m173246l() {
        return (Priority) this.priority.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final String m173247m() {
        return (String) this.resourceUrl.getValue();
    }

    public /* synthetic */ q7e(C19441a c19441a, DefaultConstructorMarker defaultConstructorMarker) {
        this(c19441a);
    }
}
