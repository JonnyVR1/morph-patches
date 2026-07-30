package p149l;

import androidx.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class kgx0 extends bhw0 {

    /* JADX INFO: renamed from: a */
    public final Map f123107a;

    public kgx0(Map map) {
        this.f123107a = map;
    }

    @Override // p149l.chw0
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object mo107024a() {
        return this.f123107a;
    }

    @Override // p149l.bhw0
    /* JADX INFO: renamed from: b */
    public final Map mo101945b() {
        return this.f123107a;
    }

    @Override // p149l.bhw0, java.util.Map
    public final boolean containsKey(@Nullable Object obj) {
        return obj != null && super.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(@Nullable Object obj) {
        return super.m101947g(obj);
    }

    @Override // p149l.bhw0, java.util.Map
    public final Set entrySet() {
        return vjw0.m198703c(this.f123107a.entrySet(), new ofw0() { // from class: l.oex0
            @Override // p149l.ofw0
            public final boolean zza(Object obj) {
                return ((Map.Entry) obj).getKey() != null;
            }
        });
    }

    @Override // java.util.Map
    public final boolean equals(@Nullable Object obj) {
        return obj != null && super.m101948i(obj);
    }

    @Override // java.util.Map
    @Nullable
    public final /* synthetic */ Object get(@Nullable Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.f123107a.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return super.m101946f();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        if (this.f123107a.isEmpty()) {
            return true;
        }
        return super.size() == 1 && super.containsKey(null);
    }

    @Override // java.util.Map
    public final Set keySet() {
        return vjw0.m198703c(this.f123107a.keySet(), new ofw0() { // from class: l.kfx0
            @Override // p149l.ofw0
            public final boolean zza(Object obj) {
                return ((String) obj) != null;
            }
        });
    }

    @Override // p149l.bhw0, java.util.Map
    public final int size() {
        return super.size() - (super.containsKey(null) ? 1 : 0);
    }
}
