package p153l;

import com.p051p1.mobile.putong.data.Links;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class tee0<T> {

    /* JADX INFO: renamed from: a */
    public int f173805a;

    /* JADX INFO: renamed from: b */
    public pf60<Links, List<T>> f173806b;

    /* JADX INFO: renamed from: c */
    public String f173807c;

    public tee0(String str, int i, pf60<Links, List<T>> pf60Var) {
        this.f173807c = str;
        this.f173805a = i;
        this.f173806b = pf60Var;
    }

    /* JADX INFO: renamed from: a */
    public boolean m190692a() {
        pf60<Links, List<T>> pf60Var = this.f173806b;
        return (pf60Var == null || pf60Var.f152157b == null) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public void m190693b(int i) {
        this.f173805a = i;
    }
}
