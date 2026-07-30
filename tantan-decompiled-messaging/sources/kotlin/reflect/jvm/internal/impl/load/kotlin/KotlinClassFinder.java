package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.KotlinMetadataFinder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface KotlinClassFinder extends KotlinMetadataFinder {

    public static abstract class Result {

        public static final class ClassFileContent extends Result {

            /* JADX INFO: renamed from: a */
            @NotNull
            public final byte[] f65068a;

            @NotNull
            /* JADX INFO: renamed from: b */
            public final byte[] m90364b() {
                return this.f65068a;
            }
        }

        public /* synthetic */ Result(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        /* JADX INFO: renamed from: a */
        public final KotlinJvmBinaryClass m90363a() {
            KotlinClass kotlinClass = this instanceof KotlinClass ? (KotlinClass) this : null;
            if (kotlinClass != null) {
                return kotlinClass.m90365b();
            }
            return null;
        }

        private Result() {
        }

        public static final class KotlinClass extends Result {

            /* JADX INFO: renamed from: a */
            @NotNull
            public final KotlinJvmBinaryClass f65069a;

            /* JADX INFO: renamed from: b */
            @Nullable
            public final byte[] f65070b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public KotlinClass(@NotNull KotlinJvmBinaryClass kotlinJvmBinaryClass, @Nullable byte[] bArr) {
                super(null);
                kotlinJvmBinaryClass.getClass();
                this.f65069a = kotlinJvmBinaryClass;
                this.f65070b = bArr;
            }

            @NotNull
            /* JADX INFO: renamed from: b */
            public final KotlinJvmBinaryClass m90365b() {
                return this.f65069a;
            }

            public /* synthetic */ KotlinClass(KotlinJvmBinaryClass kotlinJvmBinaryClass, byte[] bArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(kotlinJvmBinaryClass, (i & 2) != 0 ? null : bArr);
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    Result mo88951a(@NotNull ClassId classId, @NotNull MetadataVersion metadataVersion);

    @Nullable
    /* JADX INFO: renamed from: c */
    Result mo88953c(@NotNull JavaClass javaClass, @NotNull MetadataVersion metadataVersion);
}
