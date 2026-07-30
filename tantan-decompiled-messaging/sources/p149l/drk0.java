package p149l;

import com.clevertap.android.sdk.validation.DropReason;
import com.p046p1.mobile.putong.core.data.Reason;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0007\b\u0004R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, m87232d2 = {"Ll/drk0;", "", "", "Ll/mrk0;", "a", "()Ljava/util/List;", "errors", "b", "c", "Ll/drk0$a;", "Ll/drk0$b;", "Ll/drk0$c;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public interface drk0 {

    /* JADX INFO: renamed from: l.drk0$a */
    @Metadata(m87231d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, m87232d2 = {"Ll/drk0$a;", "Ll/drk0;", "", "Ll/mrk0;", "errors", "Lcom/clevertap/android/sdk/validation/DropReason;", Reason.TYPE, "<init>", "(Ljava/util/List;Lcom/clevertap/android/sdk/validation/DropReason;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Lcom/clevertap/android/sdk/validation/DropReason;", "()Lcom/clevertap/android/sdk/validation/DropReason;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final /* data */ class C16456a implements drk0 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final List<mrk0> errors;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final DropReason reason;

        public C16456a(@NotNull List<mrk0> list, @NotNull DropReason dropReason) {
            list.getClass();
            dropReason.getClass();
            this.errors = list;
            this.reason = dropReason;
        }

        @Override // p149l.drk0
        @NotNull
        /* JADX INFO: renamed from: a */
        public List<mrk0> mo113310a() {
            return this.errors;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final DropReason getReason() {
            return this.reason;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof C16456a)) {
                return false;
            }
            C16456a c16456a = (C16456a) other;
            return Intrinsics.m87488d(this.errors, c16456a.errors) && this.reason == c16456a.reason;
        }

        public int hashCode() {
            return (this.errors.hashCode() * 31) + this.reason.hashCode();
        }

        @NotNull
        public String toString() {
            return "Drop(errors=" + this.errors + ", reason=" + this.reason + ')';
        }
    }

    /* JADX INFO: renamed from: l.drk0$c */
    @Metadata(m87231d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, m87232d2 = {"Ll/drk0$c;", "Ll/drk0;", "", "Ll/mrk0;", "errors", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final /* data */ class C16458c implements drk0 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final List<mrk0> errors;

        public C16458c(@NotNull List<mrk0> list) {
            list.getClass();
            this.errors = list;
        }

        @Override // p149l.drk0
        @NotNull
        /* JADX INFO: renamed from: a */
        public List<mrk0> mo113310a() {
            return this.errors;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof C16458c) && Intrinsics.m87488d(this.errors, ((C16458c) other).errors);
        }

        public int hashCode() {
            return this.errors.hashCode();
        }

        @NotNull
        public String toString() {
            return "Warning(errors=" + this.errors + ')';
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    List<mrk0> mo113310a();

    /* JADX INFO: renamed from: l.drk0$b */
    @Metadata(m87231d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, m87232d2 = {"Ll/drk0$b;", "Ll/drk0;", "", "Ll/mrk0;", "errors", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final /* data */ class C16457b implements drk0 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final List<mrk0> errors;

        public /* synthetic */ C16457b(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? CollectionsKt.emptyList() : list);
        }

        @Override // p149l.drk0
        @NotNull
        /* JADX INFO: renamed from: a */
        public List<mrk0> mo113310a() {
            return this.errors;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof C16457b) && Intrinsics.m87488d(this.errors, ((C16457b) other).errors);
        }

        public int hashCode() {
            return this.errors.hashCode();
        }

        @NotNull
        public String toString() {
            return "Success(errors=" + this.errors + ')';
        }

        public C16457b(@NotNull List<mrk0> list) {
            list.getClass();
            this.errors = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C16457b() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }
}
