package p149l;

import com.p046p1.mobile.putong.live.livingroom.other.longlinkbase.call.AbstractC12886a;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class nec0 implements vq4 {

    /* JADX INFO: renamed from: a */
    public int f138601a;

    /* JADX INFO: renamed from: b */
    public List<bxm> f138602b;

    /* JADX INFO: renamed from: c */
    public s460 f138603c;

    /* JADX INFO: renamed from: d */
    public rx3 f138604d;

    /* JADX INFO: renamed from: e */
    public lec0 f138605e;

    @Override // p149l.vq4
    /* JADX INFO: renamed from: a */
    public vq4 mo159105a(s460 s460Var) throws Exception {
        int i;
        rx3 rx3Var = this.f138604d;
        if (!(rx3Var instanceof mee0)) {
            if (!(rx3Var instanceof mfc0) || (i = this.f138601a) < 0) {
                return this;
            }
            bxm bxmVar = this.f138602b.get(i);
            m159108d(this.f138605e, this.f138602b, this.f138601a - 1, s460Var, this.f138604d);
            bxmVar.mo75480a(this);
            return this;
        }
        if (this.f138601a >= this.f138602b.size()) {
            return this;
        }
        bxm bxmVar2 = this.f138602b.get(this.f138601a);
        m159108d(this.f138605e, this.f138602b, this.f138601a + 1, s460Var, this.f138604d);
        if (this.f138604d instanceof AbstractC12886a) {
            this.f138605e.m149499m().mo216485a(bxmVar2.getClass().getSimpleName().concat(":interceptSend"));
        }
        bxmVar2.mo75481b(this);
        return this;
    }

    @Override // p149l.vq4
    /* JADX INFO: renamed from: b */
    public lec0 mo159106b() {
        return this.f138605e;
    }

    @Override // p149l.vq4
    /* JADX INFO: renamed from: c */
    public s460 mo159107c() {
        return this.f138603c;
    }

    @Override // p149l.vq4
    public rx3 call() {
        return this.f138604d;
    }

    /* JADX INFO: renamed from: d */
    public nec0 m159108d(lec0 lec0Var, List<bxm> list, int i, s460 s460Var, rx3 rx3Var) {
        this.f138602b = list;
        this.f138601a = i;
        this.f138603c = s460Var;
        this.f138604d = rx3Var;
        this.f138605e = lec0Var;
        return this;
    }
}
