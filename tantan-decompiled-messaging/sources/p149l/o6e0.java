package p149l;

import com.p046p1.mobile.putong.data.Links;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class o6e0<T> {

    /* JADX INFO: renamed from: a */
    public int f142340a;

    /* JADX INFO: renamed from: b */
    public j760<Links, List<T>> f142341b;

    /* JADX INFO: renamed from: c */
    public String f142342c;

    public o6e0(String str, int i, j760<Links, List<T>> j760Var) {
        this.f142342c = str;
        this.f142340a = i;
        this.f142341b = j760Var;
    }

    /* JADX INFO: renamed from: a */
    public boolean m162847a() {
        j760<Links, List<T>> j760Var = this.f142341b;
        return (j760Var == null || j760Var.f116565b == null) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public void m162848b(int i) {
        this.f142340a = i;
    }
}
