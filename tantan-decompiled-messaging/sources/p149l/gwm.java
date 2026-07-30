package p149l;

/* JADX INFO: loaded from: classes.dex */
public class gwm<K, V> implements pgy<K, V> {

    /* JADX INFO: renamed from: a */
    public final pgy<K, V> f104745a;

    /* JADX INFO: renamed from: b */
    public final rgy f104746b;

    public gwm(pgy<K, V> pgyVar, rgy rgyVar) {
        this.f104745a = pgyVar;
        this.f104746b = rgyVar;
    }

    @Override // p149l.pgy
    /* JADX INFO: renamed from: a */
    public void mo101591a(K k) {
        this.f104745a.mo101591a(k);
    }

    @Override // p149l.pgy
    /* JADX INFO: renamed from: b */
    public fa5<V> mo101592b(K k, fa5<V> fa5Var) {
        this.f104746b.mo133255c(k);
        return this.f104745a.mo101592b(k, fa5Var);
    }

    @Override // p149l.pgy
    /* JADX INFO: renamed from: c */
    public boolean mo101593c(ph80<K> ph80Var) {
        return this.f104745a.mo101593c(ph80Var);
    }

    @Override // p149l.pgy
    /* JADX INFO: renamed from: d */
    public int mo101594d(ph80<K> ph80Var) {
        return this.f104745a.mo101594d(ph80Var);
    }

    @Override // p149l.pgy
    public fa5<V> get(K k) {
        fa5<V> fa5Var = this.f104745a.get(k);
        rgy rgyVar = this.f104746b;
        if (fa5Var == null) {
            rgyVar.mo133254b(k);
            return fa5Var;
        }
        rgyVar.mo133253a(k);
        return fa5Var;
    }
}
