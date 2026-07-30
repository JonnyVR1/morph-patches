package p153l;

/* JADX INFO: loaded from: classes.dex */
public class hym<K, V> implements mpy<K, V> {

    /* JADX INFO: renamed from: a */
    public final mpy<K, V> f112141a;

    /* JADX INFO: renamed from: b */
    public final opy f112142b;

    public hym(mpy<K, V> mpyVar, opy opyVar) {
        this.f112141a = mpyVar;
        this.f112142b = opyVar;
    }

    @Override // p153l.mpy
    /* JADX INFO: renamed from: a */
    public void mo137755a(K k) {
        this.f112141a.mo137755a(k);
    }

    @Override // p153l.mpy
    /* JADX INFO: renamed from: b */
    public fb5<V> mo137756b(K k, fb5<V> fb5Var) {
        this.f112142b.mo142710c(k);
        return this.f112141a.mo137756b(k, fb5Var);
    }

    @Override // p153l.mpy
    /* JADX INFO: renamed from: c */
    public boolean mo137757c(up80<K> up80Var) {
        return this.f112141a.mo137757c(up80Var);
    }

    @Override // p153l.mpy
    /* JADX INFO: renamed from: d */
    public int mo137758d(up80<K> up80Var) {
        return this.f112141a.mo137758d(up80Var);
    }

    @Override // p153l.mpy
    public fb5<V> get(K k) {
        fb5<V> fb5Var = this.f112141a.get(k);
        opy opyVar = this.f112142b;
        if (fb5Var == null) {
            opyVar.mo142709b(k);
            return fb5Var;
        }
        opyVar.mo142708a(k);
        return fb5Var;
    }
}
