package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class TypeEnhancementInfo {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Map<Integer, JavaTypeQualifiers> f65662a;

    public TypeEnhancementInfo(@NotNull Map<Integer, JavaTypeQualifiers> map) {
        map.getClass();
        this.f65662a = map;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final TypeEnhancementInfo m90994a() {
        Map<Integer, JavaTypeQualifiers> map = this.f65662a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), JavaTypeQualifiers.m90849c((JavaTypeQualifiers) entry.getValue(), null, null, false, true, 7, null));
        }
        return new TypeEnhancementInfo(linkedHashMap);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final Map<Integer, JavaTypeQualifiers> m90995b() {
        return this.f65662a;
    }
}
