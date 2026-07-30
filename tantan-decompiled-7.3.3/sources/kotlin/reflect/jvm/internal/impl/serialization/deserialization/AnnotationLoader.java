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
    List<A> mo91036a(@NotNull ProtoContainer protoContainer, @NotNull MessageLite messageLite, @NotNull AnnotatedCallableKind annotatedCallableKind, int i, @NotNull ProtoBuf.ValueParameter valueParameter);

    @NotNull
    /* JADX INFO: renamed from: b */
    List<A> mo91037b(@NotNull ProtoContainer.Class r1);

    @NotNull
    /* JADX INFO: renamed from: c */
    List<A> mo91038c(@NotNull ProtoContainer protoContainer, @NotNull ProtoBuf.EnumEntry enumEntry);

    @NotNull
    /* JADX INFO: renamed from: d */
    List<A> mo91039d(@NotNull ProtoBuf.TypeParameter typeParameter, @NotNull NameResolver nameResolver);

    @NotNull
    /* JADX INFO: renamed from: f */
    List<A> mo91040f(@NotNull ProtoContainer protoContainer, @NotNull ProtoBuf.Property property);

    @NotNull
    /* JADX INFO: renamed from: g */
    List<A> mo91041g(@NotNull ProtoContainer protoContainer, @NotNull MessageLite messageLite, @NotNull AnnotatedCallableKind annotatedCallableKind);

    @NotNull
    /* JADX INFO: renamed from: h */
    List<A> mo91042h(@NotNull ProtoContainer protoContainer, @NotNull MessageLite messageLite, @NotNull AnnotatedCallableKind annotatedCallableKind, int i, @Nullable ProtoBuf.ValueParameter valueParameter);

    @NotNull
    /* JADX INFO: renamed from: i */
    List<A> mo91043i(@NotNull ProtoBuf.Type type, @NotNull NameResolver nameResolver);

    @NotNull
    /* JADX INFO: renamed from: j */
    List<A> mo91044j(@NotNull ProtoContainer protoContainer, @NotNull MessageLite messageLite, @NotNull AnnotatedCallableKind annotatedCallableKind);

    @NotNull
    /* JADX INFO: renamed from: l */
    A mo91045l(@NotNull ProtoBuf.Annotation annotation, @NotNull NameResolver nameResolver);

    @NotNull
    /* JADX INFO: renamed from: m */
    List<A> mo91046m(@NotNull ProtoContainer protoContainer, @NotNull ProtoBuf.Property property);
}
