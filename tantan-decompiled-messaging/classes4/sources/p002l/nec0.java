package p002l;

import com.p000p1.mobile.putong.live.livingroom.other.longlinkbase.call.AbstractC0475a;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class nec0 implements vq4 {

    /* JADX INFO: renamed from: a */
    public int f15968a;

    /* JADX INFO: renamed from: b */
    public List<bxm> f15969b;

    /* JADX INFO: renamed from: c */
    public s460 f15970c;

    /* JADX INFO: renamed from: d */
    public rx3 f15971d;

    /* JADX INFO: renamed from: e */
    public lec0 f15972e;

    @Override // p002l.vq4
    /* JADX INFO: renamed from: a */
    public vq4 mo18693a(s460 s460Var) throws Exception {
        int i;
        rx3 rx3Var = this.f15971d;
        if (!(rx3Var instanceof mee0)) {
            if (!(rx3Var instanceof mfc0) || (i = this.f15968a) < 0) {
                return this;
            }
            bxm bxmVar = this.f15969b.get(i);
            m18696d(this.f15972e, this.f15969b, this.f15968a - 1, s460Var, this.f15971d);
            bxmVar.mo9115a(this);
            return this;
        }
        if (this.f15968a >= this.f15969b.size()) {
            return this;
        }
        bxm bxmVar2 = this.f15969b.get(this.f15968a);
        m18696d(this.f15972e, this.f15969b, this.f15968a + 1, s460Var, this.f15971d);
        if (this.f15971d instanceof AbstractC0475a) {
            this.f15972e.m17157m().mo26978a(bxmVar2.getClass().getSimpleName().concat(":interceptSend"));
        }
        bxmVar2.mo9116b(this);
        return this;
    }

    @Override // p002l.vq4
    /* JADX INFO: renamed from: b */
    public lec0 mo18694b() {
        return this.f15972e;
    }

    @Override // p002l.vq4
    /* JADX INFO: renamed from: c */
    public s460 mo18695c() {
        return this.f15970c;
    }

    @Override // p002l.vq4
    public rx3 call() {
        return this.f15971d;
    }

    /* JADX INFO: renamed from: d */
    public nec0 m18696d(lec0 lec0Var, List<bxm> list, int i, s460 s460Var, rx3 rx3Var) {
        this.f15969b = list;
        this.f15968a = i;
        this.f15970c = s460Var;
        this.f15971d = rx3Var;
        this.f15972e = lec0Var;
        return this;
    }
}
