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
    Set<String> mo88941a(@NotNull FqName fqName);

    @Nullable
    /* JADX INFO: renamed from: b */
    JavaClass mo88942b(@NotNull Request request);

    @Nullable
    /* JADX INFO: renamed from: c */
    JavaPackage mo88943c(@NotNull FqName fqName, boolean z);

    public static final class Request {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final ClassId f64652a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public final byte[] f64653b;

        /* JADX INFO: renamed from: c */
        @Nullable
        public final JavaClass f64654c;

        public /* synthetic */ Request(ClassId classId, byte[] bArr, JavaClass javaClass, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(classId, (i & 2) != 0 ? null : bArr, (i & 4) != 0 ? null : javaClass);
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final ClassId m89382a() {
            return this.f64652a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Request)) {
                return false;
            }
            Request request = (Request) obj;
            return Intrinsics.m87488d(this.f64652a, request.f64652a) && Intrinsics.m87488d(this.f64653b, request.f64653b) && Intrinsics.m87488d(this.f64654c, request.f64654c);
        }

        public int hashCode() {
            int iHashCode = this.f64652a.hashCode() * 31;
            byte[] bArr = this.f64653b;
            int iHashCode2 = (iHashCode + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
            JavaClass javaClass = this.f64654c;
            return iHashCode2 + (javaClass != null ? javaClass.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Request(classId=" + this.f64652a + ", previouslyFoundClassFileContent=" + Arrays.toString(this.f64653b) + ", outerClass=" + this.f64654c + ')';
        }

        public Request(@NotNull ClassId classId, @Nullable byte[] bArr, @Nullable JavaClass javaClass) {
            classId.getClass();
            this.f64652a = classId;
            this.f64653b = bArr;
            this.f64654c = javaClass;
        }
    }
}
