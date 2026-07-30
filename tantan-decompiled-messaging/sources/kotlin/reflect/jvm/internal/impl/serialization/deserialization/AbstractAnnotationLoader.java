package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.serialization.SerializerExtensionProtocol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.nnq;
import p149l.qkq0;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public abstract class AbstractAnnotationLoader<A> implements AnnotationLoader<A> {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final SerializerExtensionProtocol f65956a;

    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f65957a;

        static {
            int[] iArr = new int[AnnotatedCallableKind.values().length];
            try {
                iArr[AnnotatedCallableKind.PROPERTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AnnotatedCallableKind.PROPERTY_GETTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AnnotatedCallableKind.PROPERTY_SETTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f65957a = iArr;
        }
    }

    public AbstractAnnotationLoader(@NotNull SerializerExtensionProtocol serializerExtensionProtocol) {
        serializerExtensionProtocol.getClass();
        this.f65956a = serializerExtensionProtocol;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    @NotNull
    /* JADX INFO: renamed from: a */
    public List<A> mo90145a(@NotNull ProtoContainer protoContainer, @NotNull MessageLite messageLite, @NotNull AnnotatedCallableKind annotatedCallableKind, int i, @NotNull ProtoBuf.ValueParameter valueParameter) {
        protoContainer.getClass();
        messageLite.getClass();
        annotatedCallableKind.getClass();
        valueParameter.getClass();
        List listEmptyList = (List) valueParameter.getExtension(this.f65956a.m92107h());
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        List list = listEmptyList;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mo90154l((ProtoBuf.Annotation) it.next(), protoContainer.m92236b()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    @NotNull
    /* JADX INFO: renamed from: b */
    public List<A> mo90146b(@NotNull ProtoContainer.Class r5) {
        r5.getClass();
        List listEmptyList = (List) r5.m92240f().getExtension(this.f65956a.m92100a());
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        List list = listEmptyList;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mo90154l((ProtoBuf.Annotation) it.next(), r5.m92236b()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    @NotNull
    /* JADX INFO: renamed from: c */
    public List<A> mo90147c(@NotNull ProtoContainer protoContainer, @NotNull ProtoBuf.EnumEntry enumEntry) {
        protoContainer.getClass();
        enumEntry.getClass();
        List listEmptyList = (List) enumEntry.getExtension(this.f65956a.m92103d());
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        List list = listEmptyList;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mo90154l((ProtoBuf.Annotation) it.next(), protoContainer.m92236b()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    @NotNull
    /* JADX INFO: renamed from: d */
    public List<A> mo90148d(@NotNull ProtoBuf.TypeParameter typeParameter, @NotNull NameResolver nameResolver) {
        typeParameter.getClass();
        nameResolver.getClass();
        List listEmptyList = (List) typeParameter.getExtension(this.f65956a.m92115p());
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        List list = listEmptyList;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mo90154l((ProtoBuf.Annotation) it.next(), nameResolver));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    @NotNull
    /* JADX INFO: renamed from: f */
    public List<A> mo90149f(@NotNull ProtoContainer protoContainer, @NotNull ProtoBuf.Property property) {
        protoContainer.getClass();
        property.getClass();
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> generatedExtensionM92109j = this.f65956a.m92109j();
        List listEmptyList = generatedExtensionM92109j != null ? (List) property.getExtension(generatedExtensionM92109j) : null;
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        List list = listEmptyList;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mo90154l((ProtoBuf.Annotation) it.next(), protoContainer.m92236b()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    @NotNull
    /* JADX INFO: renamed from: g */
    public List<A> mo90150g(@NotNull ProtoContainer protoContainer, @NotNull MessageLite messageLite, @NotNull AnnotatedCallableKind annotatedCallableKind) {
        protoContainer.getClass();
        messageLite.getClass();
        annotatedCallableKind.getClass();
        List listEmptyList = null;
        if (messageLite instanceof ProtoBuf.Function) {
            GeneratedMessageLite.GeneratedExtension<ProtoBuf.Function, List<ProtoBuf.Annotation>> generatedExtensionM92106g = this.f65956a.m92106g();
            if (generatedExtensionM92106g != null) {
                listEmptyList = (List) ((ProtoBuf.Function) messageLite).getExtension(generatedExtensionM92106g);
            }
        } else {
            if (!(messageLite instanceof ProtoBuf.Property)) {
                nnq.m160357a("Unknown message: ", messageLite);
                return null;
            }
            int i = WhenMappings.f65957a[annotatedCallableKind.ordinal()];
            if (i != 1 && i != 2 && i != 3) {
                nnq.m160357a("Unsupported callable kind with property proto for receiver annotations: ", annotatedCallableKind);
                return null;
            }
            GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> generatedExtensionM92111l = this.f65956a.m92111l();
            if (generatedExtensionM92111l != null) {
                listEmptyList = (List) ((ProtoBuf.Property) messageLite).getExtension(generatedExtensionM92111l);
            }
        }
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        List list = listEmptyList;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mo90154l((ProtoBuf.Annotation) it.next(), protoContainer.m92236b()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    @NotNull
    /* JADX INFO: renamed from: h */
    public List<A> mo90151h(@NotNull ProtoContainer protoContainer, @NotNull MessageLite messageLite, @NotNull AnnotatedCallableKind annotatedCallableKind, int i, @Nullable ProtoBuf.ValueParameter valueParameter) {
        protoContainer.getClass();
        messageLite.getClass();
        annotatedCallableKind.getClass();
        List<A> listMo90145a = valueParameter != null ? mo90145a(protoContainer, messageLite, annotatedCallableKind, i, valueParameter) : null;
        return listMo90145a == null ? CollectionsKt.emptyList() : listMo90145a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    @NotNull
    /* JADX INFO: renamed from: i */
    public List<A> mo90152i(@NotNull ProtoBuf.Type type, @NotNull NameResolver nameResolver) {
        type.getClass();
        nameResolver.getClass();
        List listEmptyList = (List) type.getExtension(this.f65956a.m92114o());
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        List list = listEmptyList;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mo90154l((ProtoBuf.Annotation) it.next(), nameResolver));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    @NotNull
    /* JADX INFO: renamed from: j */
    public List<A> mo90153j(@NotNull ProtoContainer protoContainer, @NotNull MessageLite messageLite, @NotNull AnnotatedCallableKind annotatedCallableKind) {
        List listEmptyList;
        protoContainer.getClass();
        messageLite.getClass();
        annotatedCallableKind.getClass();
        if (messageLite instanceof ProtoBuf.Constructor) {
            listEmptyList = (List) ((ProtoBuf.Constructor) messageLite).getExtension(this.f65956a.m92102c());
        } else if (messageLite instanceof ProtoBuf.Function) {
            listEmptyList = (List) ((ProtoBuf.Function) messageLite).getExtension(this.f65956a.m92105f());
        } else {
            if (!(messageLite instanceof ProtoBuf.Property)) {
                nnq.m160357a("Unknown message: ", messageLite);
                return null;
            }
            int i = WhenMappings.f65957a[annotatedCallableKind.ordinal()];
            if (i == 1) {
                listEmptyList = (List) ((ProtoBuf.Property) messageLite).getExtension(this.f65956a.m92108i());
            } else if (i == 2) {
                listEmptyList = (List) ((ProtoBuf.Property) messageLite).getExtension(this.f65956a.m92112m());
            } else {
                if (i != 3) {
                    qkq0.m175383a("Unsupported callable kind with property proto");
                    return null;
                }
                listEmptyList = (List) ((ProtoBuf.Property) messageLite).getExtension(this.f65956a.m92113n());
            }
        }
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        List list = listEmptyList;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mo90154l((ProtoBuf.Annotation) it.next(), protoContainer.m92236b()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    @NotNull
    /* JADX INFO: renamed from: m */
    public List<A> mo90155m(@NotNull ProtoContainer protoContainer, @NotNull ProtoBuf.Property property) {
        protoContainer.getClass();
        property.getClass();
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> generatedExtensionM92110k = this.f65956a.m92110k();
        List listEmptyList = generatedExtensionM92110k != null ? (List) property.getExtension(generatedExtensionM92110k) : null;
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        List list = listEmptyList;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mo90154l((ProtoBuf.Annotation) it.next(), protoContainer.m92236b()));
        }
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final SerializerExtensionProtocol m92116n() {
        return this.f65956a;
    }
}
