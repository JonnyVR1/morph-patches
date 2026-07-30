package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.fragment.app.AbstractC0427k;
import androidx.fragment.app.FragmentManager;
import com.p046p1.mobile.putong.feed.newui.photoalbum.momentdetail.MomentDetailAct;
import com.p046p1.mobile.putong.feed.newui.photoalbum.momentdetail.MomentDetailFrag;

/* JADX INFO: loaded from: classes12.dex */
public class ze00 implements s7m<pe00> {

    /* JADX INFO: renamed from: a */
    public FrameLayout f202757a;

    /* JADX INFO: renamed from: b */
    public String f202758b = "MomentDetailAct";

    /* JADX INFO: renamed from: c */
    public MomentDetailAct f202759c;

    /* JADX INFO: renamed from: d */
    public MomentDetailFrag f202760d;

    /* JADX INFO: renamed from: e */
    public pe00 f202761e;

    public ze00(MomentDetailAct momentDetailAct) {
        this.f202759c = momentDetailAct;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f202759c;
    }

    /* JADX INFO: renamed from: a */
    public View m218257a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return cf00.m106475b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(pe00 pe00Var) {
        this.f202761e = pe00Var;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m218257a(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m218259r() {
        this.f202759c.addSwipeBackListener(new C21681a());
        FragmentManager supportFragmentManager = this.f202759c.getSupportFragmentManager();
        MomentDetailFrag momentDetailFrag = (MomentDetailFrag) supportFragmentManager.m2557i0(this.f202758b);
        this.f202760d = momentDetailFrag;
        if (momentDetailFrag == null) {
            pe00 pe00Var = this.f202761e;
            this.f202760d = MomentDetailFrag.m64856N4(pe00Var.f148383b, pe00Var.f148384c, pe00Var.f148385d, true, pe00Var.f148387f, pe00Var.f148386e, pe00Var.f148388g, pe00Var.f148389h, pe00Var.f148394m, pe00Var.f148390i, pe00Var.f148391j, pe00Var.f148392k, pe00Var.f148393l, pe00Var.f148395n);
            AbstractC0427k abstractC0427kM2567m = supportFragmentManager.m2567m();
            abstractC0427kM2567m.m2812t(b5c0.f73511Q, this.f202760d, this.f202758b);
            abstractC0427kM2567m.mo2708j();
            supportFragmentManager.m2545e0();
        }
        this.f202760d.m64861R4();
    }

    /* JADX INFO: renamed from: l.ze00$a */
    public class C21681a implements mbh0 {
        public C21681a() {
        }

        @Override // p149l.mbh0
        /* JADX INFO: renamed from: O */
        public void mo43536O() {
            ze00.this.f202759c.hideInput();
        }

        @Override // p149l.mbh0
        /* JADX INFO: renamed from: E0 */
        public void mo43535E0() {
        }

        @Override // p149l.mbh0
        /* JADX INFO: renamed from: Z */
        public void mo43538Z() {
        }

        @Override // p149l.mbh0
        /* JADX INFO: renamed from: D0 */
        public void mo43534D0(boolean z, float f, int i) {
        }
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
