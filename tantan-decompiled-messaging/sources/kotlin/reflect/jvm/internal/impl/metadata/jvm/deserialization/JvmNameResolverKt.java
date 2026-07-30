package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class JvmNameResolverKt {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final List<JvmProtoBuf.StringTableTypes.Record> m91017a(@NotNull List<JvmProtoBuf.StringTableTypes.Record> list) {
        list.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(list.size());
        for (JvmProtoBuf.StringTableTypes.Record record : list) {
            int range = record.getRange();
            for (int i = 0; i < range; i++) {
                arrayList.add(record);
            }
        }
        arrayList.trimToSize();
        return arrayList;
    }
}
