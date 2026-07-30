package p149l;

import androidx.annotation.Nullable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class dau0 implements hqt0 {

    /* JADX INFO: renamed from: a */
    public final Map f85265a;

    /* JADX INFO: renamed from: b */
    public final Map f85266b;

    /* JADX INFO: renamed from: c */
    public final Map f85267c;

    /* JADX INFO: renamed from: d */
    public final ehx0 f85268d;

    /* JADX INFO: renamed from: e */
    public final zcu0 f85269e;

    public dau0(Map map, Map map2, Map map3, ehx0 ehx0Var, zcu0 zcu0Var) {
        this.f85265a = map;
        this.f85266b = map2;
        this.f85267c = map3;
        this.f85268d = ehx0Var;
        this.f85269e = zcu0Var;
    }

    @Override // p149l.hqt0
    @Nullable
    /* JADX INFO: renamed from: d */
    public final j3v0 mo110632d(int i, String str) {
        j3v0 j3v0VarMo110632d;
        j3v0 j3v0Var = (j3v0) this.f85265a.get(str);
        if (j3v0Var != null) {
            return j3v0Var;
        }
        if (i != 1) {
            if (i != 4) {
                return null;
            }
            n6v0 n6v0Var = (n6v0) this.f85267c.get(str);
            if (n6v0Var != null) {
                return new k3v0(n6v0Var, new yew0() { // from class: l.jqt0
                    @Override // p149l.yew0
                    public final Object apply(Object obj) {
                        return new mqt0((List) obj);
                    }
                });
            }
            j3v0VarMo110632d = (j3v0) this.f85266b.get(str);
            if (j3v0VarMo110632d == null) {
                return null;
            }
        } else if (this.f85269e.m218106e() == null || (j3v0VarMo110632d = ((hqt0) this.f85268d.zzb()).mo110632d(i, str)) == null) {
            return null;
        }
        return new k3v0(j3v0VarMo110632d, new yew0() { // from class: l.kqt0
            @Override // p149l.yew0
            public final Object apply(Object obj) {
                return new mqt0((eqt0) obj);
            }
        });
    }
}
