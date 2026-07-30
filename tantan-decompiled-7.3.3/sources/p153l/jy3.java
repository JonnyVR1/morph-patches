package p153l;

/* JADX INFO: loaded from: classes.dex */
public final class jy3<K, V> extends l01<K, V> {

    /* JADX INFO: renamed from: i */
    private int f123109i;

    @Override // p153l.oof0, java.util.Map
    public void clear() {
        this.f123109i = 0;
        super.clear();
    }

    @Override // p153l.oof0, java.util.Map
    public int hashCode() {
        if (this.f123109i == 0) {
            this.f123109i = super.hashCode();
        }
        return this.f123109i;
    }

    @Override // p153l.oof0
    /* JADX INFO: renamed from: j */
    public void mo147462j(oof0<? extends K, ? extends V> oof0Var) {
        this.f123109i = 0;
        super.mo147462j(oof0Var);
    }

    @Override // p153l.oof0
    /* JADX INFO: renamed from: k */
    public V mo147463k(int i) {
        this.f123109i = 0;
        return (V) super.mo147463k(i);
    }

    @Override // p153l.oof0
    /* JADX INFO: renamed from: l */
    public V mo147464l(int i, V v2) {
        this.f123109i = 0;
        return (V) super.mo147464l(i, v2);
    }

    @Override // p153l.oof0, java.util.Map
    public V put(K k, V v2) {
        this.f123109i = 0;
        return (V) super.put(k, v2);
    }
}
