package p149l;

import java.util.LinkedList;

/* JADX INFO: loaded from: classes.dex */
public class xz40<V> extends bg3<V> {

    /* JADX INFO: renamed from: f */
    public LinkedList<wz40<V>> f195153f;

    public xz40(int i, int i2, int i3) {
        super(i, i2, i3, false);
        this.f195153f = new LinkedList<>();
    }

    @Override // p149l.bg3
    /* JADX INFO: renamed from: a */
    public void mo101622a(V v2) {
        wz40<V> wz40VarPoll = this.f195153f.poll();
        if (wz40VarPoll == null) {
            wz40VarPoll = new wz40<>();
        }
        wz40VarPoll.m206247c(v2);
        this.f75398c.add(wz40VarPoll);
    }

    @Override // p149l.bg3
    /* JADX INFO: renamed from: g */
    public V mo101628g() {
        wz40<V> wz40Var = (wz40) this.f75398c.poll();
        rf80.m179116g(wz40Var);
        V vM206246b = wz40Var.m206246b();
        wz40Var.m206245a();
        this.f195153f.add(wz40Var);
        return vM206246b;
    }
}
