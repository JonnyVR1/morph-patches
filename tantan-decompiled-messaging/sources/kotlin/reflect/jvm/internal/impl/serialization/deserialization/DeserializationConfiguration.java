package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface DeserializationConfiguration {

    public static final class Default implements DeserializationConfiguration {

        @NotNull
        public static final Default INSTANCE = new Default();

        private Default() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration
        /* JADX INFO: renamed from: a */
        public boolean mo92171a() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration
        /* JADX INFO: renamed from: b */
        public boolean mo92172b() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration
        /* JADX INFO: renamed from: c */
        public boolean mo92173c() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration
        /* JADX INFO: renamed from: d */
        public boolean mo92174d() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration
        /* JADX INFO: renamed from: e */
        public boolean mo92175e() {
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration
        @NotNull
        /* JADX INFO: renamed from: f */
        public MetadataVersion mo92176f() {
            return MetadataVersion.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration
        /* JADX INFO: renamed from: g */
        public boolean mo92177g() {
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    boolean mo92171a();

    /* JADX INFO: renamed from: b */
    boolean mo92172b();

    /* JADX INFO: renamed from: c */
    boolean mo92173c();

    /* JADX INFO: renamed from: d */
    boolean mo92174d();

    /* JADX INFO: renamed from: e */
    boolean mo92175e();

    @NotNull
    /* JADX INFO: renamed from: f */
    MetadataVersion mo92176f();

    /* JADX INFO: renamed from: g */
    boolean mo92177g();
}
