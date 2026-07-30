package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class TypeTable {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final List<ProtoBuf.Type> f65394a;

    public TypeTable(@NotNull ProtoBuf.TypeTable typeTable) {
        typeTable.getClass();
        List<ProtoBuf.Type> typeList = typeTable.getTypeList();
        if (typeTable.hasFirstNullable()) {
            int firstNullable = typeTable.getFirstNullable();
            List<ProtoBuf.Type> typeList2 = typeTable.getTypeList();
            typeList2.getClass();
            List<ProtoBuf.Type> list = typeList2;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                ProtoBuf.Type typeBuild = (ProtoBuf.Type) obj;
                if (i >= firstNullable) {
                    typeBuild = typeBuild.toBuilder().m90758K(true).build();
                }
                arrayList.add(typeBuild);
                i = i2;
            }
            typeList = arrayList;
        }
        typeList.getClass();
        this.f65394a = typeList;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final ProtoBuf.Type m90918a(int i) {
        return this.f65394a.get(i);
    }
}
