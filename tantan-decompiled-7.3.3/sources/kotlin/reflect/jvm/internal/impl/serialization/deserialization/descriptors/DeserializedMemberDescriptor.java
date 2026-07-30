package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.reflect.jvm.internal.impl.descriptors.DeserializedDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface DeserializedMemberDescriptor extends DeserializedDescriptor, DescriptorWithContainerSource {
    @NotNull
    /* JADX INFO: renamed from: G */
    MessageLite mo93177G();

    @NotNull
    /* JADX INFO: renamed from: W */
    NameResolver mo93178W();

    @Nullable
    /* JADX INFO: renamed from: X */
    DeserializedContainerSource mo93179X();

    @NotNull
    /* JADX INFO: renamed from: w */
    TypeTable mo93183w();
}
