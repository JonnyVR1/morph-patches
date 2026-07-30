package p153l;

import androidx.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class qpx0 extends hqw0 {

    /* JADX INFO: renamed from: a */
    public final Map f158936a;

    public qpx0(Map map) {
        this.f158936a = map;
    }

    @Override // p153l.iqw0
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object mo141730a() {
        return this.f158936a;
    }

    @Override // p153l.hqw0
    /* JADX INFO: renamed from: b */
    public final Map mo136708b() {
        return this.f158936a;
    }

    @Override // p153l.hqw0, java.util.Map
    public final boolean containsKey(@Nullable Object obj) {
        return obj != null && super.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(@Nullable Object obj) {
        return super.m136710g(obj);
    }

    @Override // p153l.hqw0, java.util.Map
    public final Set entrySet() {
        return btw0.m106405c(this.f158936a.entrySet(), new uow0() { // from class: l.unx0
            @Override // p153l.uow0
            public final boolean zza(Object obj) {
                return ((Map.Entry) obj).getKey() != null;
            }
        });
    }

    @Override // java.util.Map
    public final boolean equals(@Nullable Object obj) {
        return obj != null && super.m136711i(obj);
    }

    @Override // java.util.Map
    @Nullable
    public final /* synthetic */ Object get(@Nullable Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.f158936a.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return super.m136709f();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        if (this.f158936a.isEmpty()) {
            return true;
        }
        return super.size() == 1 && super.containsKey(null);
    }

    @Override // java.util.Map
    public final Set keySet() {
        return btw0.m106405c(this.f158936a.keySet(), new uow0() { // from class: l.qox0
            @Override // p153l.uow0
            public final boolean zza(Object obj) {
                return ((String) obj) != null;
            }
        });
    }

    @Override // p153l.hqw0, java.util.Map
    public final int size() {
        return super.size() - (super.containsKey(null) ? 1 : 0);
    }
}
