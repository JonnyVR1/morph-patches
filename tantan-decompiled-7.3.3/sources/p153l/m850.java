package p153l;

import java.util.LinkedList;

/* JADX INFO: loaded from: classes.dex */
public class m850<V> extends pg3<V> {

    /* JADX INFO: renamed from: f */
    public LinkedList<l850<V>> f135151f;

    public m850(int i, int i2, int i3) {
        super(i, i2, i3, false);
        this.f135151f = new LinkedList<>();
    }

    @Override // p153l.pg3
    /* JADX INFO: renamed from: a */
    public void mo157351a(V v2) {
        l850<V> l850VarPoll = this.f135151f.poll();
        if (l850VarPoll == null) {
            l850VarPoll = new l850<>();
        }
        l850VarPoll.m153165c(v2);
        this.f152229c.add(l850VarPoll);
    }

    @Override // p153l.pg3
    /* JADX INFO: renamed from: g */
    public V mo157352g() {
        l850<V> l850Var = (l850) this.f152229c.poll();
        wn80.m207182g(l850Var);
        V vM153164b = l850Var.m153164b();
        l850Var.m153163a();
        this.f135151f.add(l850Var);
        return vM153164b;
    }
}
