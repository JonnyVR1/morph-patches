package p153l;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.base.data.Priority;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
@Metadata(m88120d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0013\u001a\u00020\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000fR\u001b\u0010\u0018\u001a\u00020\u00148FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\r\u001a\u0004\b\u0016\u0010\u0017R/\u0010\u001e\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00198FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\r\u001a\u0004\b\u001c\u0010\u001dR+\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u001fj\b\u0012\u0004\u0012\u00020\u0006` 8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\r\u001a\u0004\b\"\u0010#R\u001b\u0010'\u001a\u00020\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\r\u001a\u0004\b&\u0010\u000f¨\u0006("}, m88121d2 = {"Ll/f9e;", "", "Ll/f9e$a;", "builder", "<init>", "(Ll/f9e$a;)V", "Ll/w8e;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "g", "(Ll/w8e;)V", "", "a", "Lkotlin/Lazy;", "m", "()Ljava/lang/String;", "resourceUrl", "b", "h", "destFile", "Lcom/p1/mobile/putong/live/base/data/Priority;", "c", BLiveStormDanmakuGiftResourceType.f45292l, "()Lcom/p1/mobile/putong/live/base/data/Priority;", "priority", "Ll/rcj;", "Ljava/io/File;", Constants.INAPP_DATA_TAG, "j", "()Ll/rcj;", "interceptor", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "e", "k", "()Ljava/util/ArrayList;", "listeners", "f", RXScreenCaptureService.KEY_INDEX, "effectId", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class f9e {

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

    /* JADX INFO: renamed from: l.f9e$a */
    @Metadata(m88120d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0010\u001a\u00020\u00002\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001e\u0010\u0018R\u001e\u0010\b\u001a\n \u001f*\u0004\u0018\u00010\u00070\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010 R*\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010!R\u0016\u0010\u0014\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001c¨\u0006\""}, m88121d2 = {"Ll/f9e$a;", "", "", "resourceUrl", "destFile", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/p1/mobile/putong/live/base/data/Priority;", "priority", RXScreenCaptureService.KEY_INDEX, "(Lcom/p1/mobile/putong/live/base/data/Priority;)Ll/f9e$a;", "e", "()Lcom/p1/mobile/putong/live/base/data/Priority;", "Ll/rcj;", "Ljava/io/File;", "interceptor", "h", "(Ll/rcj;)Ll/f9e$a;", Constants.INAPP_DATA_TAG, "()Ll/rcj;", "effectId", "g", "(Ljava/lang/String;)Ll/f9e$a;", "c", "()Ljava/lang/String;", "Ll/f9e;", "a", "()Ll/f9e;", "Ljava/lang/String;", "f", "b", "kotlin.jvm.PlatformType", "Lcom/p1/mobile/putong/live/base/data/Priority;", "Ll/rcj;", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C16927a {

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
        public rcj<String, File, File> interceptor;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        public String effectId;

        public C16927a(@NotNull String str, @NotNull String str2) {
            str.getClass();
            str2.getClass();
            this.resourceUrl = str;
            this.destFile = str2;
            this.priority = Priority.get("LOW");
            this.effectId = "";
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final f9e m124647a() {
            return new f9e(this, null);
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
        public final rcj<String, File, File> m124650d() {
            return this.interceptor;
        }

        @NotNull
        /* JADX INFO: renamed from: e */
        public final Priority m124651e() {
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
        public final C16927a m124653g(@NotNull String effectId) {
            effectId.getClass();
            this.effectId = effectId;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: h */
        public final C16927a m124654h(@NotNull rcj<String, File, File> interceptor) {
            interceptor.getClass();
            this.interceptor = interceptor;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: i */
        public final C16927a m124655i(@NotNull Priority priority) {
            priority.getClass();
            this.priority = priority;
            return this;
        }
    }

    public f9e(final C16927a c16927a) {
        this.resourceUrl = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.z8e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return f9e.m124637d(c16927a);
            }
        });
        this.destFile = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.a9e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return f9e.m124635b(c16927a);
            }
        });
        this.priority = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.b9e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return f9e.m124634a(c16927a);
            }
        });
        this.interceptor = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.c9e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return f9e.m124639f(c16927a);
            }
        });
        this.listeners = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.d9e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return f9e.m124638e();
            }
        });
        this.effectId = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.e9e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return f9e.m124636c(c16927a);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static Priority m124634a(C16927a c16927a) {
        return c16927a.m124651e();
    }

    /* JADX INFO: renamed from: b */
    public static String m124635b(C16927a c16927a) {
        return c16927a.getDestFile();
    }

    /* JADX INFO: renamed from: c */
    public static String m124636c(C16927a c16927a) {
        return c16927a.getEffectId();
    }

    /* JADX INFO: renamed from: d */
    public static String m124637d(C16927a c16927a) {
        return c16927a.getResourceUrl();
    }

    /* JADX INFO: renamed from: e */
    public static ArrayList m124638e() {
        return new ArrayList();
    }

    /* JADX INFO: renamed from: f */
    public static rcj m124639f(C16927a c16927a) {
        return c16927a.m124650d();
    }

    /* JADX INFO: renamed from: g */
    public final void m124640g(@NotNull w8e listener) {
        listener.getClass();
        m124644k().add(listener);
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final String m124641h() {
        return (String) this.destFile.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final String m124642i() {
        return (String) this.effectId.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public final rcj<String, File, File> m124643j() {
        return (rcj) this.interceptor.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final ArrayList<w8e> m124644k() {
        return (ArrayList) this.listeners.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final Priority m124645l() {
        return (Priority) this.priority.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final String m124646m() {
        return (String) this.resourceUrl.getValue();
    }

    public /* synthetic */ f9e(C16927a c16927a, DefaultConstructorMarker defaultConstructorMarker) {
        this(c16927a);
    }
}
