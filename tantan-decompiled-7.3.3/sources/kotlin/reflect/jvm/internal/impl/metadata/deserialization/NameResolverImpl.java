package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import java.util.LinkedList;
import java.util.List;
import kotlin.Triple;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import org.jetbrains.annotations.NotNull;
import p153l.nbr;

/* JADX INFO: loaded from: classes2.dex */
public final class NameResolverImpl implements NameResolver {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final ProtoBuf.StringTable f66065a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final ProtoBuf.QualifiedNameTable f66066b;

    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f66067a;

        static {
            int[] iArr = new int[ProtoBuf.QualifiedNameTable.QualifiedName.Kind.values().length];
            try {
                iArr[ProtoBuf.QualifiedNameTable.QualifiedName.Kind.CLASS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProtoBuf.QualifiedNameTable.QualifiedName.Kind.PACKAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProtoBuf.QualifiedNameTable.QualifiedName.Kind.LOCAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f66067a = iArr;
        }
    }

    public NameResolverImpl(@NotNull ProtoBuf.StringTable stringTable, @NotNull ProtoBuf.QualifiedNameTable qualifiedNameTable) {
        stringTable.getClass();
        qualifiedNameTable.getClass();
        this.f66065a = stringTable;
        this.f66066b = qualifiedNameTable;
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    @NotNull
    /* JADX INFO: renamed from: a */
    public String mo91783a(int i) {
        Triple<List<String>, List<String>, Boolean> tripleM91785c = m91785c(i);
        List<String> listComponent1 = tripleM91785c.component1();
        String strJoinToString$default = CollectionsKt.joinToString$default(tripleM91785c.component2(), ".", null, null, 0, null, null, 62, null);
        if (listComponent1.isEmpty()) {
            return strJoinToString$default;
        }
        return CollectionsKt.joinToString$default(listComponent1, "/", null, null, 0, null, null, 62, null) + '/' + strJoinToString$default;
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    /* JADX INFO: renamed from: b */
    public boolean mo91784b(int i) {
        return m91785c(i).getThird().booleanValue();
    }

    /* JADX INFO: renamed from: c */
    public final Triple<List<String>, List<String>, Boolean> m91785c(int i) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z = false;
        while (i != -1) {
            ProtoBuf.QualifiedNameTable.QualifiedName qualifiedName = this.f66066b.getQualifiedName(i);
            String string = this.f66065a.getString(qualifiedName.getShortName());
            ProtoBuf.QualifiedNameTable.QualifiedName.Kind kind = qualifiedName.getKind();
            kind.getClass();
            int i2 = WhenMappings.f66067a[kind.ordinal()];
            if (i2 == 1) {
                linkedList2.addFirst(string);
            } else if (i2 == 2) {
                linkedList.addFirst(string);
            } else {
                if (i2 != 3) {
                    nbr.m162172a();
                    return null;
                }
                linkedList2.addFirst(string);
                z = true;
            }
            i = qualifiedName.getParentQualifiedName();
        }
        return new Triple<>(linkedList, linkedList2, Boolean.valueOf(z));
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    @NotNull
    public String getString(int i) {
        String string = this.f66065a.getString(i);
        string.getClass();
        return string;
    }
}
