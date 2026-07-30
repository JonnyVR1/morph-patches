package p153l;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m88121d2 = {"Ll/ohi;", "", "<init>", "()V", "a", "b", "c", "Ll/ohi$a;", "Ll/ohi$c;", "Ll/ohi$b;", "FEP_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public abstract class ohi {

    /* JADX INFO: renamed from: l.ohi$a */
    @Metadata(m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, m88121d2 = {"Ll/ohi$a;", "Ll/ohi;", "", "fileName", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getFileName", "FEP_release"}, m88122k = 1, m88123mv = {1, 4, 0})
    public static final /* data */ class C19134a extends ohi {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final String fileName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19134a(@NotNull String str) {
            super(null);
            str.getClass();
            this.fileName = str;
        }

        public boolean equals(@Nullable Object other) {
            if (this != other) {
                return (other instanceof C19134a) && Intrinsics.m88377d(this.fileName, ((C19134a) other).fileName);
            }
            return true;
        }

        public int hashCode() {
            String str = this.fileName;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        @NotNull
        public String toString() {
            return "Duplicate(fileName=" + this.fileName + ")";
        }
    }

    /* JADX INFO: renamed from: l.ohi$b */
    @Metadata(m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0015\u0010\b¨\u0006\u0016"}, m88121d2 = {"Ll/ohi$b;", "Ll/ohi;", "", "fileName", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getFileName", "b", "getMessage", "FEP_release"}, m88122k = 1, m88123mv = {1, 4, 0})
    public static final /* data */ class C19135b extends ohi {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final String fileName;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19135b(@NotNull String str, @Nullable String str2) {
            super(null);
            str.getClass();
            this.fileName = str;
            this.message = str2;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof C19135b)) {
                return false;
            }
            C19135b c19135b = (C19135b) other;
            return Intrinsics.m88377d(this.fileName, c19135b.fileName) && Intrinsics.m88377d(this.message, c19135b.message);
        }

        public int hashCode() {
            String str = this.fileName;
            int iHashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.message;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "InstallFail(fileName=" + this.fileName + ", message=" + this.message + ")";
        }
    }

    /* JADX INFO: renamed from: l.ohi$c */
    @Metadata(m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, m88121d2 = {"Ll/ohi$c;", "Ll/ohi;", "", "fileName", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getFileName", "FEP_release"}, m88122k = 1, m88123mv = {1, 4, 0})
    public static final /* data */ class C19136c extends ohi {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final String fileName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19136c(@NotNull String str) {
            super(null);
            str.getClass();
            this.fileName = str;
        }

        public boolean equals(@Nullable Object other) {
            if (this != other) {
                return (other instanceof C19136c) && Intrinsics.m88377d(this.fileName, ((C19136c) other).fileName);
            }
            return true;
        }

        public int hashCode() {
            String str = this.fileName;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        @NotNull
        public String toString() {
            return "InvalidName(fileName=" + this.fileName + ")";
        }
    }

    private ohi() {
    }

    public /* synthetic */ ohi(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
