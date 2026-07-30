package p007l;

import com.p000p1.mobile.putong.data.Links;
import java.util.List;
import l.j760;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class o6e0<T> {

    /* JADX INFO: renamed from: a */
    public int f11353a;

    /* JADX INFO: renamed from: b */
    public j760<Links, List<T>> f11354b;

    /* JADX INFO: renamed from: c */
    public String f11355c;

    public o6e0(String str, int i, j760<Links, List<T>> j760Var) {
        this.f11355c = str;
        this.f11353a = i;
        this.f11354b = j760Var;
    }

    /* JADX INFO: renamed from: a */
    public boolean m12446a() {
        j760<Links, List<T>> j760Var = this.f11354b;
        return (j760Var == null || j760Var.b == null) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public void m12447b(int i) {
        this.f11353a = i;
    }
}
