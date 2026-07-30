package p153l;

import com.p051p1.mobile.putong.live.livingroom.other.longlinkbase.call.AbstractC13049a;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class umc0 implements ur4 {

    /* JADX INFO: renamed from: a */
    public int f179614a;

    /* JADX INFO: renamed from: b */
    public List<bzm> f179615b;

    /* JADX INFO: renamed from: c */
    public yc60 f179616c;

    /* JADX INFO: renamed from: d */
    public qy3 f179617d;

    /* JADX INFO: renamed from: e */
    public smc0 f179618e;

    @Override // p153l.ur4
    /* JADX INFO: renamed from: a */
    public ur4 mo196642a(yc60 yc60Var) throws Exception {
        int i;
        qy3 qy3Var = this.f179617d;
        if (!(qy3Var instanceof rme0)) {
            if (!(qy3Var instanceof tnc0) || (i = this.f179614a) < 0) {
                return this;
            }
            bzm bzmVar = this.f179615b.get(i);
            m196645d(this.f179618e, this.f179615b, this.f179614a - 1, yc60Var, this.f179617d);
            bzmVar.mo76663a(this);
            return this;
        }
        if (this.f179614a >= this.f179615b.size()) {
            return this;
        }
        bzm bzmVar2 = this.f179615b.get(this.f179614a);
        m196645d(this.f179618e, this.f179615b, this.f179614a + 1, yc60Var, this.f179617d);
        if (this.f179617d instanceof AbstractC13049a) {
            this.f179618e.m186795m().mo204126a(bzmVar2.getClass().getSimpleName().concat(":interceptSend"));
        }
        bzmVar2.mo76664b(this);
        return this;
    }

    @Override // p153l.ur4
    /* JADX INFO: renamed from: b */
    public smc0 mo196643b() {
        return this.f179618e;
    }

    @Override // p153l.ur4
    /* JADX INFO: renamed from: c */
    public yc60 mo196644c() {
        return this.f179616c;
    }

    @Override // p153l.ur4
    public qy3 call() {
        return this.f179617d;
    }

    /* JADX INFO: renamed from: d */
    public umc0 m196645d(smc0 smc0Var, List<bzm> list, int i, yc60 yc60Var, qy3 qy3Var) {
        this.f179615b = list;
        this.f179614a = i;
        this.f179616c = yc60Var;
        this.f179617d = qy3Var;
        this.f179618e = smc0Var;
        return this;
    }
}
