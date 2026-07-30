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
import p153l.mpq;
import p153l.wtq0;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public abstract class AbstractAnnotationLoader<A> implements AnnotationLoader<A> {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final SerializerExtensionProtocol f66630a;

    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f66631a;

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
            f66631a = iArr;
        }
    }

    public AbstractAnnotationLoader(@NotNull SerializerExtensionProtocol serializerExtensionProtocol) {
        serializerExtensionProtocol.getClass();
        this.f66630a = serializerExtensionProtocol;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    @NotNull
    /* JADX INFO: renamed from: a */
    public List<A> mo91036a(@NotNull ProtoContainer protoContainer, @NotNull MessageLite messageLite, @NotNull AnnotatedCallableKind annotatedCallableKind, int i, @NotNull ProtoBuf.ValueParameter valueParameter) {
        protoContainer.getClass();
        messageLite.getClass();
        annotatedCallableKind.getClass();
        valueParameter.getClass();
        List listEmptyList = (List) valueParameter.getExtension(this.f66630a.m92998h());
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        List list = listEmptyList;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mo91045l((ProtoBuf.Annotation) it.next(), protoContainer.m93127b()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    @NotNull
    /* JADX INFO: renamed from: b */
    public List<A> mo91037b(@NotNull ProtoContainer.Class r5) {
        r5.getClass();
        List listEmptyList = (List) r5.m93131f().getExtension(this.f66630a.m92991a());
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        List list = listEmptyList;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mo91045l((ProtoBuf.Annotation) it.next(), r5.m93127b()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    @NotNull
    /* JADX INFO: renamed from: c */
    public List<A> mo91038c(@NotNull ProtoContainer protoContainer, @NotNull ProtoBuf.EnumEntry enumEntry) {
        protoContainer.getClass();
        enumEntry.getClass();
        List listEmptyList = (List) enumEntry.getExtension(this.f66630a.m92994d());
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        List list = listEmptyList;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mo91045l((ProtoBuf.Annotation) it.next(), protoContainer.m93127b()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    @NotNull
    /* JADX INFO: renamed from: d */
    public List<A> mo91039d(@NotNull ProtoBuf.TypeParameter typeParameter, @NotNull NameResolver nameResolver) {
        typeParameter.getClass();
        nameResolver.getClass();
        List listEmptyList = (List) typeParameter.getExtension(this.f66630a.m93006p());
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        List list = listEmptyList;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mo91045l((ProtoBuf.Annotation) it.next(), nameResolver));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    @NotNull
    /* JADX INFO: renamed from: f */
    public List<A> mo91040f(@NotNull ProtoContainer protoContainer, @NotNull ProtoBuf.Property property) {
        protoContainer.getClass();
        property.getClass();
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> generatedExtensionM93000j = this.f66630a.m93000j();
        List listEmptyList = generatedExtensionM93000j != null ? (List) property.getExtension(generatedExtensionM93000j) : null;
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        List list = listEmptyList;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mo91045l((ProtoBuf.Annotation) it.next(), protoContainer.m93127b()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    @NotNull
    /* JADX INFO: renamed from: g */
    public List<A> mo91041g(@NotNull ProtoContainer protoContainer, @NotNull MessageLite messageLite, @NotNull AnnotatedCallableKind annotatedCallableKind) {
        protoContainer.getClass();
        messageLite.getClass();
        annotatedCallableKind.getClass();
        List listEmptyList = null;
        if (messageLite instanceof ProtoBuf.Function) {
            GeneratedMessageLite.GeneratedExtension<ProtoBuf.Function, List<ProtoBuf.Annotation>> generatedExtensionM92997g = this.f66630a.m92997g();
            if (generatedExtensionM92997g != null) {
                listEmptyList = (List) ((ProtoBuf.Function) messageLite).getExtension(generatedExtensionM92997g);
            }
        } else {
            if (!(messageLite instanceof ProtoBuf.Property)) {
                mpq.m159379a("Unknown message: ", messageLite);
                return null;
            }
            int i = WhenMappings.f66631a[annotatedCallableKind.ordinal()];
            if (i != 1 && i != 2 && i != 3) {
                mpq.m159379a("Unsupported callable kind with property proto for receiver annotations: ", annotatedCallableKind);
                return null;
            }
            GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> generatedExtensionM93002l = this.f66630a.m93002l();
            if (generatedExtensionM93002l != null) {
                listEmptyList = (List) ((ProtoBuf.Property) messageLite).getExtension(generatedExtensionM93002l);
            }
        }
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        List list = listEmptyList;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mo91045l((ProtoBuf.Annotation) it.next(), protoContainer.m93127b()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    @NotNull
    /* JADX INFO: renamed from: h */
    public List<A> mo91042h(@NotNull ProtoContainer protoContainer, @NotNull MessageLite messageLite, @NotNull AnnotatedCallableKind annotatedCallableKind, int i, @Nullable ProtoBuf.ValueParameter valueParameter) {
        protoContainer.getClass();
        messageLite.getClass();
        annotatedCallableKind.getClass();
        List<A> listMo91036a = valueParameter != null ? mo91036a(protoContainer, messageLite, annotatedCallableKind, i, valueParameter) : null;
        return listMo91036a == null ? CollectionsKt.emptyList() : listMo91036a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    @NotNull
    /* JADX INFO: renamed from: i */
    public List<A> mo91043i(@NotNull ProtoBuf.Type type, @NotNull NameResolver nameResolver) {
        type.getClass();
        nameResolver.getClass();
        List listEmptyList = (List) type.getExtension(this.f66630a.m93005o());
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        List list = listEmptyList;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mo91045l((ProtoBuf.Annotation) it.next(), nameResolver));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    @NotNull
    /* JADX INFO: renamed from: j */
    public List<A> mo91044j(@NotNull ProtoContainer protoContainer, @NotNull MessageLite messageLite, @NotNull AnnotatedCallableKind annotatedCallableKind) {
        List listEmptyList;
        protoContainer.getClass();
        messageLite.getClass();
        annotatedCallableKind.getClass();
        if (messageLite instanceof ProtoBuf.Constructor) {
            listEmptyList = (List) ((ProtoBuf.Constructor) messageLite).getExtension(this.f66630a.m92993c());
        } else if (messageLite instanceof ProtoBuf.Function) {
            listEmptyList = (List) ((ProtoBuf.Function) messageLite).getExtension(this.f66630a.m92996f());
        } else {
            if (!(messageLite instanceof ProtoBuf.Property)) {
                mpq.m159379a("Unknown message: ", messageLite);
                return null;
            }
            int i = WhenMappings.f66631a[annotatedCallableKind.ordinal()];
            if (i == 1) {
                listEmptyList = (List) ((ProtoBuf.Property) messageLite).getExtension(this.f66630a.m92999i());
            } else if (i == 2) {
                listEmptyList = (List) ((ProtoBuf.Property) messageLite).getExtension(this.f66630a.m93003m());
            } else {
                if (i != 3) {
                    wtq0.m207906a("Unsupported callable kind with property proto");
                    return null;
                }
                listEmptyList = (List) ((ProtoBuf.Property) messageLite).getExtension(this.f66630a.m93004n());
            }
        }
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        List list = listEmptyList;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mo91045l((ProtoBuf.Annotation) it.next(), protoContainer.m93127b()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    @NotNull
    /* JADX INFO: renamed from: m */
    public List<A> mo91046m(@NotNull ProtoContainer protoContainer, @NotNull ProtoBuf.Property property) {
        protoContainer.getClass();
        property.getClass();
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> generatedExtensionM93001k = this.f66630a.m93001k();
        List listEmptyList = generatedExtensionM93001k != null ? (List) property.getExtension(generatedExtensionM93001k) : null;
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        List list = listEmptyList;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mo91045l((ProtoBuf.Annotation) it.next(), protoContainer.m93127b()));
        }
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final SerializerExtensionProtocol m93007n() {
        return this.f66630a;
    }
}
