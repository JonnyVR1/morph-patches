package p153l;

import com.clevertap.android.sdk.validation.DropReason;
import com.p051p1.mobile.putong.core.data.Reason;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0007\b\u0004R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, m88121d2 = {"Ll/j0l0;", "", "", "Ll/s0l0;", "a", "()Ljava/util/List;", "errors", "b", "c", "Ll/j0l0$a;", "Ll/j0l0$b;", "Ll/j0l0$c;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public interface j0l0 {

    /* JADX INFO: renamed from: l.j0l0$a */
    @Metadata(m88120d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, m88121d2 = {"Ll/j0l0$a;", "Ll/j0l0;", "", "Ll/s0l0;", "errors", "Lcom/clevertap/android/sdk/validation/DropReason;", Reason.TYPE, "<init>", "(Ljava/util/List;Lcom/clevertap/android/sdk/validation/DropReason;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Lcom/clevertap/android/sdk/validation/DropReason;", "()Lcom/clevertap/android/sdk/validation/DropReason;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final /* data */ class C17839a implements j0l0 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final List<s0l0> errors;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final DropReason reason;

        public C17839a(@NotNull List<s0l0> list, @NotNull DropReason dropReason) {
            list.getClass();
            dropReason.getClass();
            this.errors = list;
            this.reason = dropReason;
        }

        @Override // p153l.j0l0
        @NotNull
        /* JADX INFO: renamed from: a */
        public List<s0l0> mo142980a() {
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
            if (!(other instanceof C17839a)) {
                return false;
            }
            C17839a c17839a = (C17839a) other;
            return Intrinsics.m88377d(this.errors, c17839a.errors) && this.reason == c17839a.reason;
        }

        public int hashCode() {
            return (this.errors.hashCode() * 31) + this.reason.hashCode();
        }

        @NotNull
        public String toString() {
            return "Drop(errors=" + this.errors + ", reason=" + this.reason + ')';
        }
    }

    /* JADX INFO: renamed from: l.j0l0$c */
    @Metadata(m88120d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, m88121d2 = {"Ll/j0l0$c;", "Ll/j0l0;", "", "Ll/s0l0;", "errors", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final /* data */ class C17841c implements j0l0 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final List<s0l0> errors;

        public C17841c(@NotNull List<s0l0> list) {
            list.getClass();
            this.errors = list;
        }

        @Override // p153l.j0l0
        @NotNull
        /* JADX INFO: renamed from: a */
        public List<s0l0> mo142980a() {
            return this.errors;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof C17841c) && Intrinsics.m88377d(this.errors, ((C17841c) other).errors);
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
    List<s0l0> mo142980a();

    /* JADX INFO: renamed from: l.j0l0$b */
    @Metadata(m88120d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, m88121d2 = {"Ll/j0l0$b;", "Ll/j0l0;", "", "Ll/s0l0;", "errors", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final /* data */ class C17840b implements j0l0 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final List<s0l0> errors;

        public /* synthetic */ C17840b(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? CollectionsKt.emptyList() : list);
        }

        @Override // p153l.j0l0
        @NotNull
        /* JADX INFO: renamed from: a */
        public List<s0l0> mo142980a() {
            return this.errors;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof C17840b) && Intrinsics.m88377d(this.errors, ((C17840b) other).errors);
        }

        public int hashCode() {
            return this.errors.hashCode();
        }

        @NotNull
        public String toString() {
            return "Success(errors=" + this.errors + ')';
        }

        public C17840b(@NotNull List<s0l0> list) {
            list.getClass();
            this.errors = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C17840b() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }
}
