package p007l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.k;
import com.p000p1.mobile.putong.feed.newui.photoalbum.momentdetail.MomentDetailAct;
import com.p000p1.mobile.putong.feed.newui.photoalbum.momentdetail.MomentDetailFrag;
import l.mbh0;
import l.s7m;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class ze00 implements s7m<pe00> {

    /* JADX INFO: renamed from: a */
    public FrameLayout f15697a;

    /* JADX INFO: renamed from: b */
    public String f15698b = "MomentDetailAct";

    /* JADX INFO: renamed from: c */
    public MomentDetailAct f15699c;

    /* JADX INFO: renamed from: d */
    public MomentDetailFrag f15700d;

    /* JADX INFO: renamed from: e */
    public pe00 f15701e;

    public ze00(MomentDetailAct momentDetailAct) {
        this.f15699c = momentDetailAct;
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m17305C0() {
        return this.f15699c;
    }

    /* JADX INFO: renamed from: a */
    public View m17306a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return cf00.m9129b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void m17308i1(pe00 pe00Var) {
        this.f15701e = pe00Var;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m17306a(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m17309r() {
        this.f15699c.addSwipeBackListener(new C2546a());
        FragmentManager supportFragmentManager = this.f15699c.getSupportFragmentManager();
        MomentDetailFrag momentDetailFragI0 = supportFragmentManager.i0(this.f15698b);
        this.f15700d = momentDetailFragI0;
        if (momentDetailFragI0 == null) {
            pe00 pe00Var = this.f15701e;
            this.f15700d = MomentDetailFrag.m5953N4(pe00Var.f11803b, pe00Var.f11804c, pe00Var.f11805d, true, pe00Var.f11807f, pe00Var.f11806e, pe00Var.f11808g, pe00Var.f11809h, pe00Var.f11814m, pe00Var.f11810i, pe00Var.f11811j, pe00Var.f11812k, pe00Var.f11813l, pe00Var.f11815n);
            k kVarM = supportFragmentManager.m();
            kVarM.t(b5c0.f5992Q, this.f15700d, this.f15698b);
            kVarM.j();
            supportFragmentManager.e0();
        }
        this.f15700d.m5958R4();
    }

    /* JADX INFO: renamed from: l.ze00$a */
    public class C2546a implements mbh0 {
        public C2546a() {
        }

        /* JADX INFO: renamed from: O */
        public void m17312O() {
            ze00.this.f15699c.hideInput();
        }

        /* JADX INFO: renamed from: E0 */
        public void m17311E0() {
        }

        /* JADX INFO: renamed from: Z */
        public void m17313Z() {
        }

        /* JADX INFO: renamed from: D0 */
        public void m17310D0(boolean z, float f, int i) {
        }
    }

    public void destroy() {
    }
}
