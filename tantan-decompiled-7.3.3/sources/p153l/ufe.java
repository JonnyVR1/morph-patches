package p153l;

import com.clevertap.android.sdk.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m88121d2 = {"Ll/ufe;", "", "<init>", "()V", "a", "c", "b", "Ll/ufe$a;", "Ll/ufe$b;", "Ll/ufe$c;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public abstract class ufe {

    /* JADX INFO: renamed from: l.ufe$b */
    @Metadata(m88120d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0014B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0018"}, m88121d2 = {"Ll/ufe$b;", "Ll/ufe;", "", "Lorg/json/JSONObject;", "inActionInApps", "<init>", "(Ljava/util/List;)V", "", "b", "()Z", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "Companion", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final /* data */ class C20558b extends ufe {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final List<JSONObject> inActionInApps;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C20558b(@NotNull List<? extends JSONObject> list) {
            super(null);
            list.getClass();
            this.inActionInApps = list;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final List<JSONObject> m195833a() {
            return this.inActionInApps;
        }

        /* JADX INFO: renamed from: b */
        public final boolean m195834b() {
            return !this.inActionInApps.isEmpty();
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof C20558b) && Intrinsics.m88377d(this.inActionInApps, ((C20558b) other).inActionInApps);
        }

        public int hashCode() {
            return this.inActionInApps.hashCode();
        }

        @NotNull
        public String toString() {
            return "InActionOnly(inActionInApps=" + this.inActionInApps + ')';
        }
    }

    public /* synthetic */ ufe(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: l.ufe$a */
    @Metadata(m88120d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u0016B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0016\u0010\u0019¨\u0006\u001b"}, m88121d2 = {"Ll/ufe$a;", "Ll/ufe;", "", "Lorg/json/JSONObject;", "immediateInApps", "delayedInApps", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", Constants.INAPP_DATA_TAG, "()Z", "c", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Companion", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final /* data */ class C20557a extends ufe {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final List<JSONObject> immediateInApps;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final List<JSONObject> delayedInApps;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C20557a(@NotNull List<? extends JSONObject> list, @NotNull List<? extends JSONObject> list2) {
            super(null);
            list.getClass();
            list2.getClass();
            this.immediateInApps = list;
            this.delayedInApps = list2;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final List<JSONObject> m195828a() {
            return this.delayedInApps;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final List<JSONObject> m195829b() {
            return this.immediateInApps;
        }

        /* JADX INFO: renamed from: c */
        public final boolean m195830c() {
            return !this.delayedInApps.isEmpty();
        }

        /* JADX INFO: renamed from: d */
        public final boolean m195831d() {
            return !this.immediateInApps.isEmpty();
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof C20557a)) {
                return false;
            }
            C20557a c20557a = (C20557a) other;
            return Intrinsics.m88377d(this.immediateInApps, c20557a.immediateInApps) && Intrinsics.m88377d(this.delayedInApps, c20557a.delayedInApps);
        }

        public int hashCode() {
            return (this.immediateInApps.hashCode() * 31) + this.delayedInApps.hashCode();
        }

        @NotNull
        public String toString() {
            return "ImmediateAndDelayed(immediateInApps=" + this.immediateInApps + ", delayedInApps=" + this.delayedInApps + ')';
        }

        /* JADX INFO: renamed from: l.ufe$a$a, reason: from kotlin metadata */
        @Metadata(m88120d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"Ll/ufe$a$a;", "", "<init>", "()V", "Ll/ufe$a;", "a", "()Ll/ufe$a;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            /* JADX INFO: renamed from: a */
            public final C20557a m195832a() {
                return new C20557a(CollectionsKt.emptyList(), CollectionsKt.emptyList());
            }

            private Companion() {
            }
        }
    }

    /* JADX INFO: renamed from: l.ufe$c */
    @Metadata(m88120d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u0016B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0016\u0010\u0019¨\u0006\u001b"}, m88121d2 = {"Ll/ufe$c;", "Ll/ufe;", "", "Lorg/json/JSONObject;", "unknownDurationInApps", "inActionInApps", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", Constants.INAPP_DATA_TAG, "()Z", "c", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Companion", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final /* data */ class C20559c extends ufe {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final List<JSONObject> unknownDurationInApps;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final List<JSONObject> inActionInApps;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C20559c(@NotNull List<? extends JSONObject> list, @NotNull List<? extends JSONObject> list2) {
            super(null);
            list.getClass();
            list2.getClass();
            this.unknownDurationInApps = list;
            this.inActionInApps = list2;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final List<JSONObject> m195835a() {
            return this.inActionInApps;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final List<JSONObject> m195836b() {
            return this.unknownDurationInApps;
        }

        /* JADX INFO: renamed from: c */
        public final boolean m195837c() {
            return !this.inActionInApps.isEmpty();
        }

        /* JADX INFO: renamed from: d */
        public final boolean m195838d() {
            return !this.unknownDurationInApps.isEmpty();
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof C20559c)) {
                return false;
            }
            C20559c c20559c = (C20559c) other;
            return Intrinsics.m88377d(this.unknownDurationInApps, c20559c.unknownDurationInApps) && Intrinsics.m88377d(this.inActionInApps, c20559c.inActionInApps);
        }

        public int hashCode() {
            return (this.unknownDurationInApps.hashCode() * 31) + this.inActionInApps.hashCode();
        }

        @NotNull
        public String toString() {
            return "UnknownAndInAction(unknownDurationInApps=" + this.unknownDurationInApps + ", inActionInApps=" + this.inActionInApps + ')';
        }

        /* JADX INFO: renamed from: l.ufe$c$a, reason: from kotlin metadata */
        @Metadata(m88120d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"Ll/ufe$c$a;", "", "<init>", "()V", "Ll/ufe$c;", "a", "()Ll/ufe$c;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            /* JADX INFO: renamed from: a */
            public final C20559c m195839a() {
                return new C20559c(CollectionsKt.emptyList(), CollectionsKt.emptyList());
            }

            private Companion() {
            }
        }
    }

    private ufe() {
    }
}
