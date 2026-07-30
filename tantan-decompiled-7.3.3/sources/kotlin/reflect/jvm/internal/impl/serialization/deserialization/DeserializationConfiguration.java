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
        public boolean mo93062a() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration
        /* JADX INFO: renamed from: b */
        public boolean mo93063b() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration
        /* JADX INFO: renamed from: c */
        public boolean mo93064c() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration
        /* JADX INFO: renamed from: d */
        public boolean mo93065d() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration
        /* JADX INFO: renamed from: e */
        public boolean mo93066e() {
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration
        @NotNull
        /* JADX INFO: renamed from: f */
        public MetadataVersion mo93067f() {
            return MetadataVersion.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration
        /* JADX INFO: renamed from: g */
        public boolean mo93068g() {
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    boolean mo93062a();

    /* JADX INFO: renamed from: b */
    boolean mo93063b();

    /* JADX INFO: renamed from: c */
    boolean mo93064c();

    /* JADX INFO: renamed from: d */
    boolean mo93065d();

    /* JADX INFO: renamed from: e */
    boolean mo93066e();

    @NotNull
    /* JADX INFO: renamed from: f */
    MetadataVersion mo93067f();

    /* JADX INFO: renamed from: g */
    boolean mo93068g();
}
