package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Arrays;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface JavaClassFinder {
    @Nullable
    /* JADX INFO: renamed from: a */
    Set<String> mo89832a(@NotNull FqName fqName);

    @Nullable
    /* JADX INFO: renamed from: b */
    JavaClass mo89833b(@NotNull Request request);

    @Nullable
    /* JADX INFO: renamed from: c */
    JavaPackage mo89834c(@NotNull FqName fqName, boolean z);

    public static final class Request {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final ClassId f65326a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public final byte[] f65327b;

        /* JADX INFO: renamed from: c */
        @Nullable
        public final JavaClass f65328c;

        public /* synthetic */ Request(ClassId classId, byte[] bArr, JavaClass javaClass, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(classId, (i & 2) != 0 ? null : bArr, (i & 4) != 0 ? null : javaClass);
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final ClassId m90273a() {
            return this.f65326a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Request)) {
                return false;
            }
            Request request = (Request) obj;
            return Intrinsics.m88377d(this.f65326a, request.f65326a) && Intrinsics.m88377d(this.f65327b, request.f65327b) && Intrinsics.m88377d(this.f65328c, request.f65328c);
        }

        public int hashCode() {
            int iHashCode = this.f65326a.hashCode() * 31;
            byte[] bArr = this.f65327b;
            int iHashCode2 = (iHashCode + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
            JavaClass javaClass = this.f65328c;
            return iHashCode2 + (javaClass != null ? javaClass.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Request(classId=" + this.f65326a + ", previouslyFoundClassFileContent=" + Arrays.toString(this.f65327b) + ", outerClass=" + this.f65328c + ')';
        }

        public Request(@NotNull ClassId classId, @Nullable byte[] bArr, @Nullable JavaClass javaClass) {
            classId.getClass();
            this.f65326a = classId;
            this.f65327b = bArr;
            this.f65328c = javaClass;
        }
    }
}
