package p153l;

import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.data.Action;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013¨\u0006\u0015"}, m88121d2 = {"Ll/g3g0;", "Ll/f3g0;", "<init>", "()V", "Ll/piq0;", "id", "Ll/e3g0;", "a", "(Ll/piq0;)Ll/e3g0;", "e", "", "workSpecId", "", Action.remove, "(Ljava/lang/String;)Ljava/util/List;", "", Constants.INAPP_DATA_TAG, "(Ll/piq0;)Z", "", "Ljava/util/Map;", "runs", "work-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
@SourceDebugExtension
public final class g3g0 implements f3g0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Map<piq0, e3g0> runs = new LinkedHashMap();

    @Override // p153l.f3g0
    @NotNull
    /* JADX INFO: renamed from: a */
    public e3g0 mo123733a(@NotNull piq0 id) {
        id.getClass();
        Map<piq0, e3g0> map = this.runs;
        e3g0 e3g0Var = map.get(id);
        if (e3g0Var == null) {
            e3g0Var = new e3g0(id);
            map.put(id, e3g0Var);
        }
        return e3g0Var;
    }

    @Override // p153l.f3g0
    /* JADX INFO: renamed from: d */
    public boolean mo123735d(@NotNull piq0 id) {
        id.getClass();
        return this.runs.containsKey(id);
    }

    @Override // p153l.f3g0
    @Nullable
    /* JADX INFO: renamed from: e */
    public e3g0 mo123736e(@NotNull piq0 id) {
        id.getClass();
        return this.runs.remove(id);
    }

    @Override // p153l.f3g0
    @NotNull
    public List<e3g0> remove(@NotNull String workSpecId) {
        workSpecId.getClass();
        Map<piq0, e3g0> map = this.runs;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<piq0, e3g0> entry : map.entrySet()) {
            if (Intrinsics.m88377d(entry.getKey().getWorkSpecId(), workSpecId)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            this.runs.remove((piq0) it.next());
        }
        return CollectionsKt.toList(linkedHashMap.values());
    }
}
