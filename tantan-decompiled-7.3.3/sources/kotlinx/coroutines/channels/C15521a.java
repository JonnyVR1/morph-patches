package kotlinx.coroutines.channels;

import com.clevertap.android.sdk.Constants;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.p7f;

/* JADX INFO: renamed from: kotlinx.coroutines.channels.a */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087@\u0018\u0000 \u001d*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0003\u0014\u001e\u0004B\u0013\b\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0006\u0010\u0005J\u000f\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u0016\u0010\u0017R\u0011\u0010\u001a\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001c\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019\u0088\u0001\u0003\u0092\u0001\u0004\u0018\u00010\u0002¨\u0006\u001f"}, m88121d2 = {"Lkotlinx/coroutines/channels/a;", p7f.GPS_DIRECTION_TRUE, "", "holder", "c", "(Ljava/lang/Object;)Ljava/lang/Object;", "f", "", "e", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "", "j", "(Ljava/lang/Object;)Ljava/lang/String;", "", "g", "(Ljava/lang/Object;)I", "other", "", Constants.INAPP_DATA_TAG, "(Ljava/lang/Object;Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "getHolder$annotations", "()V", RXScreenCaptureService.KEY_INDEX, "(Ljava/lang/Object;)Z", "isSuccess", "h", "isClosed", "Companion", "b", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
@JvmInline
public final class C15521a<T> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final c f67425b = new c();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final Object holder;

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.a$a */
    @Metadata(m88120d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m88121d2 = {"Lkotlinx/coroutines/channels/a$a;", "Lkotlinx/coroutines/channels/a$c;", "", "cause", "<init>", "(Ljava/lang/Throwable;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/Throwable;", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
    public static final class a extends c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @JvmField
        @Nullable
        public final Throwable cause;

        public a(@Nullable Throwable th) {
            this.cause = th;
        }

        public boolean equals(@Nullable Object other) {
            return (other instanceof a) && Intrinsics.m88377d(this.cause, ((a) other).cause);
        }

        public int hashCode() {
            Throwable th = this.cause;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        @Override // kotlinx.coroutines.channels.C15521a.c
        @NotNull
        public String toString() {
            return "Closed(" + this.cause + ')';
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.a$b, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0001\u0010\u00042\u0006\u0010\u0005\u001a\u00028\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0001\u0010\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ+\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0001\u0010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, m88121d2 = {"Lkotlinx/coroutines/channels/a$b;", "", "<init>", "()V", "E", "value", "Lkotlinx/coroutines/channels/a;", "c", "(Ljava/lang/Object;)Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "", "cause", "a", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/a$c;", "failed", "Lkotlinx/coroutines/channels/a$c;", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final <E> Object m94893a(@Nullable Throwable cause) {
            return C15521a.m94884c(new a(cause));
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final <E> Object m94894b() {
            return C15521a.m94884c(C15521a.f67425b);
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final <E> Object m94895c(E value) {
            return C15521a.m94884c(value);
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.a$c */
    @Metadata(m88120d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"Lkotlinx/coroutines/channels/a$c;", "", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
    public static class c {
        @NotNull
        public String toString() {
            return "Failed";
        }
    }

    @PublishedApi
    public /* synthetic */ C15521a(Object obj) {
        this.holder = obj;
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ C15521a m94883b(Object obj) {
        return new C15521a(obj);
    }

    @PublishedApi
    @NotNull
    /* JADX INFO: renamed from: c */
    public static <T> Object m94884c(@Nullable Object obj) {
        return obj;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m94885d(Object obj, Object obj2) {
        return (obj2 instanceof C15521a) && Intrinsics.m88377d(obj, ((C15521a) obj2).getHolder());
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static final Throwable m94886e(Object obj) {
        a aVar = obj instanceof a ? (a) obj : null;
        if (aVar != null) {
            return aVar.cause;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* JADX INFO: renamed from: f */
    public static final T m94887f(Object obj) {
        if (obj instanceof c) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: g */
    public static int m94888g(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m94889h(Object obj) {
        return obj instanceof a;
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m94890i(Object obj) {
        return !(obj instanceof c);
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public static String m94891j(Object obj) {
        if (obj instanceof a) {
            return ((a) obj).toString();
        }
        return "Value(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m94885d(this.holder, obj);
    }

    public int hashCode() {
        return m94888g(this.holder);
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final /* synthetic */ Object getHolder() {
        return this.holder;
    }

    @NotNull
    public String toString() {
        return m94891j(this.holder);
    }
}
