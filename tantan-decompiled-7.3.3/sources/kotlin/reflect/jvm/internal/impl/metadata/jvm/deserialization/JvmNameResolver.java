package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class JvmNameResolver extends JvmNameResolverBase {

    /* JADX INFO: renamed from: g */
    @NotNull
    public final JvmProtoBuf.StringTableTypes f66127g;

    /* JADX WARN: Illegal instructions before constructor call */
    public JvmNameResolver(@NotNull JvmProtoBuf.StringTableTypes stringTableTypes, @NotNull String[] strArr) {
        stringTableTypes.getClass();
        strArr.getClass();
        List<Integer> localNameList = stringTableTypes.getLocalNameList();
        Set setEmptySet = localNameList.isEmpty() ? SetsKt.emptySet() : CollectionsKt.toSet(localNameList);
        List<JvmProtoBuf.StringTableTypes.Record> recordList = stringTableTypes.getRecordList();
        recordList.getClass();
        super(strArr, setEmptySet, JvmNameResolverKt.m91908a(recordList));
        this.f66127g = stringTableTypes;
    }
}
