package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface AnnotationLoader<A> {
    @NotNull
    /* JADX INFO: renamed from: a */
    List<A> mo90145a(@NotNull ProtoContainer protoContainer, @NotNull MessageLite messageLite, @NotNull AnnotatedCallableKind annotatedCallableKind, int i, @NotNull ProtoBuf.ValueParameter valueParameter);

    @NotNull
    /* JADX INFO: renamed from: b */
    List<A> mo90146b(@NotNull ProtoContainer.Class r1);

    @NotNull
    /* JADX INFO: renamed from: c */
    List<A> mo90147c(@NotNull ProtoContainer protoContainer, @NotNull ProtoBuf.EnumEntry enumEntry);

    @NotNull
    /* JADX INFO: renamed from: d */
    List<A> mo90148d(@NotNull ProtoBuf.TypeParameter typeParameter, @NotNull NameResolver nameResolver);

    @NotNull
    /* JADX INFO: renamed from: f */
    List<A> mo90149f(@NotNull ProtoContainer protoContainer, @NotNull ProtoBuf.Property property);

    @NotNull
    /* JADX INFO: renamed from: g */
    List<A> mo90150g(@NotNull ProtoContainer protoContainer, @NotNull MessageLite messageLite, @NotNull AnnotatedCallableKind annotatedCallableKind);

    @NotNull
    /* JADX INFO: renamed from: h */
    List<A> mo90151h(@NotNull ProtoContainer protoContainer, @NotNull MessageLite messageLite, @NotNull AnnotatedCallableKind annotatedCallableKind, int i, @Nullable ProtoBuf.ValueParameter valueParameter);

    @NotNull
    /* JADX INFO: renamed from: i */
    List<A> mo90152i(@NotNull ProtoBuf.Type type, @NotNull NameResolver nameResolver);

    @NotNull
    /* JADX INFO: renamed from: j */
    List<A> mo90153j(@NotNull ProtoContainer protoContainer, @NotNull MessageLite messageLite, @NotNull AnnotatedCallableKind annotatedCallableKind);

    @NotNull
    /* JADX INFO: renamed from: l */
    A mo90154l(@NotNull ProtoBuf.Annotation annotation, @NotNull NameResolver nameResolver);

    @NotNull
    /* JADX INFO: renamed from: m */
    List<A> mo90155m(@NotNull ProtoContainer protoContainer, @NotNull ProtoBuf.Property property);
}
