package p149l;

/* JADX INFO: loaded from: classes.dex */
public final class kx3<K, V> extends e01<K, V> {

    /* JADX INFO: renamed from: i */
    private int f125055i;

    @Override // p149l.hgf0, java.util.Map
    public void clear() {
        this.f125055i = 0;
        super.clear();
    }

    @Override // p149l.hgf0, java.util.Map
    public int hashCode() {
        if (this.f125055i == 0) {
            this.f125055i = super.hashCode();
        }
        return this.f125055i;
    }

    @Override // p149l.hgf0
    /* JADX INFO: renamed from: j */
    public void mo130824j(hgf0<? extends K, ? extends V> hgf0Var) {
        this.f125055i = 0;
        super.mo130824j(hgf0Var);
    }

    @Override // p149l.hgf0
    /* JADX INFO: renamed from: k */
    public V mo130825k(int i) {
        this.f125055i = 0;
        return (V) super.mo130825k(i);
    }

    @Override // p149l.hgf0
    /* JADX INFO: renamed from: l */
    public V mo130826l(int i, V v2) {
        this.f125055i = 0;
        return (V) super.mo130826l(i, v2);
    }

    @Override // p149l.hgf0, java.util.Map
    public V put(K k, V v2) {
        this.f125055i = 0;
        return (V) super.put(k, v2);
    }
}
