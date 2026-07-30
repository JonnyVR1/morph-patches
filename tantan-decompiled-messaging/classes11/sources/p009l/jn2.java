package p009l;

import android.view.View;
import com.p000p1.mobile.putong.core.newui.home.opt.BifrostLayout;
import com.p000p1.mobile.putong.core.newui.home.opt.CardOperation;
import com.p000p1.mobile.putong.core.newui.home.opt.VirtualState;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public abstract class jn2 {

    /* JADX INFO: renamed from: a */
    public zw2 f15230a;

    /* JADX INFO: renamed from: b */
    public int f15231b = -1;

    /* JADX INFO: renamed from: c */
    public int f15232c = -1;

    /* JADX INFO: renamed from: l.jn2$a */
    public static /* synthetic */ class C0977a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f15233a;

        static {
            int[] iArr = new int[CardOperation.values().length];
            f15233a = iArr;
            try {
                iArr[CardOperation.SWIPE_UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15233a[CardOperation.SWIPE_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15233a[CardOperation.SWIPE_RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m17164n(View view) {
        view.setTranslationY(0.0f);
        view.setTranslationX(0.0f);
        view.setRotation(0.0f);
        view.setScaleX(0.0f);
        view.setScaleY(0.0f);
        view.setAlpha(1.0f);
    }

    /* JADX INFO: renamed from: a */
    public final void m17165a(List<pol0> list) {
        if (list == null) {
            return;
        }
        for (pol0 pol0Var : list) {
            if (pol0Var.f18809j == VirtualState.RENDING && pol0Var.f18804e > 0) {
                m17173o(pol0Var);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean mo12721b() {
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m17166c() {
        List<pol0> listM26033q = this.f15230a.m26033q();
        if (listM26033q == null || listM26033q.size() <= 0) {
            return;
        }
        for (pol0 pol0Var : listM26033q) {
            if (pol0Var.f18809j == VirtualState.INIT) {
                if (BifrostLayout.f2099d) {
                    pol0Var.f18800a.getMeasuredWidth();
                }
                pol0Var.f18809j = VirtualState.RENDING;
                m17173o(pol0Var);
                pol0Var.f18805f = 0;
                if (pol0Var.f18808i != null) {
                    View view = pol0Var.f18800a;
                    view.setPivotX(view.getMeasuredWidth() / 2);
                    View view2 = pol0Var.f18800a;
                    view2.setPivotY(view2.getMeasuredHeight() / 2);
                    if (C0977a.f15233a[pol0Var.f18808i.ordinal()] == 1) {
                        pol0Var.f18800a.setTranslationY(this.f15230a.m25989B().getMeasuredHeight() * (-1.0f));
                    }
                    pol0Var.f18808i = null;
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public int mo12722d() {
        return this.f15230a.m26027n(6.0f);
    }

    /* JADX INFO: renamed from: e */
    public float mo12723e() {
        return 0.0155f;
    }

    /* JADX INFO: renamed from: f */
    public void m17167f() {
        int i;
        int i2 = this.f15231b;
        if (i2 == -1 || (i = this.f15232c) == -1) {
            return;
        }
        m17171k(i2, i);
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo17168g(int i, int i2, View view, int i3, pol0 pol0Var);

    /* JADX INFO: renamed from: h */
    public void m17169h(View view, int i, pol0 pol0Var) {
        if (this.f15232c <= 0 || this.f15231b <= 0) {
            return;
        }
        System.currentTimeMillis();
        mo17168g(this.f15231b, this.f15232c, view, i, pol0Var);
        if (BifrostLayout.f2099d) {
            System.currentTimeMillis();
        }
    }

    /* JADX INFO: renamed from: i */
    public boolean mo12724i() {
        return true;
    }

    /* JADX INFO: renamed from: j */
    public void m17170j(boolean z, int i, int i2, int i3, int i4) {
        for (pol0 pol0Var : this.f15230a.m26033q()) {
            mo17172l(pol0Var.f18800a, pol0Var.f18804e, i, i2, i3, i4, z, pol0Var);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m17171k(int i, int i2) {
        this.f15232c = i2;
        this.f15231b = i;
        if (BifrostLayout.f2099d) {
            View.MeasureSpec.getSize(i);
            View.MeasureSpec.getSize(i2);
        }
        System.currentTimeMillis();
        List<pol0> listM26033q = this.f15230a.m26033q();
        for (pol0 pol0Var : listM26033q) {
            mo17168g(i, i2, pol0Var.f18800a, 0, pol0Var);
        }
        m17166c();
        m17165a(listM26033q);
        if (BifrostLayout.f2099d) {
            System.currentTimeMillis();
        }
    }

    /* JADX INFO: renamed from: l */
    public abstract void mo17172l(View view, int i, int i2, int i3, int i4, int i5, boolean z, pol0 pol0Var);

    /* JADX INFO: renamed from: m */
    public abstract int mo12725m();

    /* JADX INFO: renamed from: o */
    public void m17173o(pol0 pol0Var) {
        float fMo12723e = this.f15230a.m25988A().mo12723e();
        int iMo12722d = this.f15230a.m25988A().mo12722d();
        boolean zMo12724i = this.f15230a.m25988A().mo12724i();
        View view = pol0Var.f18800a;
        view.setPivotX(view.getMeasuredWidth() / 2);
        View view2 = pol0Var.f18800a;
        view2.setPivotY(view2.getMeasuredHeight() / 2);
        float fMin = Math.min(pol0Var.f18804e + pol0Var.f18805f, 2);
        float f = 1.0f - (fMo12723e * fMin);
        float f2 = f * f * f;
        float fSqrt = (float) Math.sqrt(Math.sqrt(fMin));
        float fSqrt2 = ((float) (((double) (fSqrt * fSqrt * fSqrt)) * Math.sqrt(fSqrt))) * iMo12722d;
        if (zMo12724i) {
            fSqrt2 += (pol0Var.f18800a.getMeasuredHeight() * (1.0f - f2)) / 2.0f;
        }
        pol0Var.f18800a.setScaleY(f2);
        pol0Var.f18800a.setScaleX(f2);
        pol0Var.f18800a.setTranslationY((mo12726q() ? -1.0f : 1.0f) * fSqrt2);
        String str = BifrostLayout.f2098c;
    }

    /* JADX INFO: renamed from: p */
    public void m17174p(zw2 zw2Var) {
        this.f15230a = zw2Var;
    }

    /* JADX INFO: renamed from: q */
    public boolean mo12726q() {
        return true;
    }
}
