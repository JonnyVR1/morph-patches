package p153l;

import android.content.Context;
import com.p051p1.mobile.putong.live.base.data.BLiveCallVolume;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public class u310 extends s310 {

    /* JADX INFO: renamed from: q */
    public List<cf80> f177276q;

    /* JADX INFO: renamed from: r */
    public pwl f177277r;

    public u310(Context context) {
        super(context);
        this.f177276q = new CopyOnWriteArrayList();
    }

    @Override // p153l.s310, p153l.qwl
    /* JADX INFO: renamed from: c */
    public void mo178523c(final pwl pwlVar) {
        super.mo178523c(pwlVar);
        jyb.m147537z(this.f177276q, new y20() { // from class: l.t310
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f171886a.m194325k0(pwlVar, (cf80) obj);
            }
        });
        this.f177276q.clear();
    }

    @Override // p153l.s310, p153l.qwl
    /* JADX INFO: renamed from: j */
    public void mo178530j(@NotNull String str, @NotNull String str2, @NotNull String str3, String str4, String str5) {
        super.mo178530j(str, str2, str3, str4, str5);
    }

    /* JADX INFO: renamed from: j0 */
    public u310 m194324j0() {
        C20476a c20476a = new C20476a();
        this.f177277r = c20476a;
        super.mo178523c(c20476a);
        return this;
    }

    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public final void m194325k0(cf80 cf80Var, pwl pwlVar) {
        switch (cf80Var.f81484a) {
            case 1:
                pwlVar.mo120249u1();
                break;
            case 2:
                pwlVar.mo120246O();
                break;
            case 3:
                pwlVar.mo120248f2();
                break;
            case 4:
                pwlVar.mo123267l0(cf80Var.f81485b);
                break;
            case 5:
                pwlVar.mo120245D0();
                break;
            case 6:
                pwlVar.mo139901q0();
                break;
            case 7:
                pwlVar.mo139876F1();
                break;
            case 8:
                pwlVar.mo139894c0(cf80Var.f81488e);
                break;
            case 9:
                pwlVar.mo120247R1(cf80Var.f81486c);
                break;
        }
    }

    @Override // p153l.s310, p153l.qwl
    public void reset() {
        this.f177276q.clear();
        super.reset();
        pwl pwlVar = this.f177277r;
        if (pwlVar != null) {
            super.mo178523c(pwlVar);
        }
    }

    /* JADX INFO: renamed from: l.u310$a */
    public class C20476a implements pwl {
        public C20476a() {
        }

        @Override // p153l.pwl
        /* JADX INFO: renamed from: D0 */
        public void mo120245D0() {
            nsh0.m164608j("[live]quickPlay", "proxy real onReceiveFirstIFrame");
            u310.this.f177276q.add(new cf80(5));
        }

        @Override // p153l.pwl
        /* JADX INFO: renamed from: F1 */
        public void mo139876F1() {
            u310.this.f177276q.add(new cf80(7));
        }

        @Override // p153l.pwl
        /* JADX INFO: renamed from: O */
        public void mo120246O() {
            u310.this.f177276q.add(new cf80(2));
        }

        @Override // p153l.pwl
        /* JADX INFO: renamed from: R1 */
        public void mo120247R1(float f) {
            u310.this.f177276q.add(new cf80(9).m109525b(f));
        }

        @Override // p153l.pwl
        /* JADX INFO: renamed from: c0 */
        public void mo139894c0(fyb fybVar) {
            u310.this.f177276q.add(new cf80(8).m109524a(fybVar));
        }

        @Override // p153l.pwl
        /* JADX INFO: renamed from: f2 */
        public void mo120248f2() {
            u310.this.f177276q.add(new cf80(3));
        }

        @Override // p153l.pwl
        /* JADX INFO: renamed from: l0 */
        public void mo123267l0(int i) {
            u310.this.f177276q.add(new cf80(4).m109526c(i));
        }

        @Override // p153l.pwl
        /* JADX INFO: renamed from: p1 */
        public void mo139899p1(int i) {
            u310.this.f177276q.add(new cf80(11).m109526c(i));
        }

        @Override // p153l.pwl
        /* JADX INFO: renamed from: q0 */
        public void mo139901q0() {
            u310.this.f177276q.add(new cf80(6));
        }

        @Override // p153l.pwl
        /* JADX INFO: renamed from: s1 */
        public void mo139904s1(ArrayList<String> arrayList) {
            u310.this.f177276q.add(new cf80(10).m109527d(arrayList));
        }

        @Override // p153l.pwl
        /* JADX INFO: renamed from: u1 */
        public void mo120249u1() {
            u310.this.f177276q.add(new cf80(1));
        }

        @Override // p153l.pwl
        /* JADX INFO: renamed from: O0 */
        public void mo139885O0(BLiveCallVolume bLiveCallVolume) {
        }
    }
}
