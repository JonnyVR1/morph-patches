package p153l;

import android.view.View;
import com.p051p1.mobile.putong.core.newui.home.opt.BifrostLayout;
import com.p051p1.mobile.putong.core.newui.home.opt.CardOperation;
import com.p051p1.mobile.putong.core.newui.home.opt.VirtualState;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public abstract class qn2 {

    /* JADX INFO: renamed from: a */
    public ox2 f158456a;

    /* JADX INFO: renamed from: b */
    public int f158457b = -1;

    /* JADX INFO: renamed from: c */
    public int f158458c = -1;

    /* JADX INFO: renamed from: l.qn2$a */
    public static /* synthetic */ class C19605a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f158459a;

        static {
            int[] iArr = new int[CardOperation.values().length];
            f158459a = iArr;
            try {
                iArr[CardOperation.SWIPE_UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f158459a[CardOperation.SWIPE_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f158459a[CardOperation.SWIPE_RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m177167n(View view) {
        view.setTranslationY(0.0f);
        view.setTranslationX(0.0f);
        view.setRotation(0.0f);
        view.setScaleX(0.0f);
        view.setScaleY(0.0f);
        view.setAlpha(1.0f);
    }

    /* JADX INFO: renamed from: a */
    public final void m177168a(List<txl0> list) {
        if (list == null) {
            return;
        }
        for (txl0 txl0Var : list) {
            if (txl0Var.f176577j == VirtualState.RENDING && txl0Var.f176572e > 0) {
                m177176o(txl0Var);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean mo141295b() {
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m177169c() {
        List<txl0> listM169665q = this.f158456a.m169665q();
        if (listM169665q == null || listM169665q.size() <= 0) {
            return;
        }
        for (txl0 txl0Var : listM169665q) {
            if (txl0Var.f176577j == VirtualState.INIT) {
                if (BifrostLayout.f24063d) {
                    txl0Var.f176568a.getMeasuredWidth();
                }
                txl0Var.f176577j = VirtualState.RENDING;
                m177176o(txl0Var);
                txl0Var.f176573f = 0;
                if (txl0Var.f176576i != null) {
                    View view = txl0Var.f176568a;
                    view.setPivotX(view.getMeasuredWidth() / 2);
                    View view2 = txl0Var.f176568a;
                    view2.setPivotY(view2.getMeasuredHeight() / 2);
                    if (C19605a.f158459a[txl0Var.f176576i.ordinal()] == 1) {
                        txl0Var.f176568a.setTranslationY(this.f158456a.m169620B().getMeasuredHeight() * (-1.0f));
                    }
                    txl0Var.f176576i = null;
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public int mo98955d() {
        return this.f158456a.m169659n(6.0f);
    }

    /* JADX INFO: renamed from: e */
    public float mo98956e() {
        return 0.0155f;
    }

    /* JADX INFO: renamed from: f */
    public void m177170f() {
        int i;
        int i2 = this.f158457b;
        if (i2 == -1 || (i = this.f158458c) == -1) {
            return;
        }
        m177174k(i2, i);
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo177171g(int i, int i2, View view, int i3, txl0 txl0Var);

    /* JADX INFO: renamed from: h */
    public void m177172h(View view, int i, txl0 txl0Var) {
        if (this.f158458c <= 0 || this.f158457b <= 0) {
            return;
        }
        System.currentTimeMillis();
        mo177171g(this.f158457b, this.f158458c, view, i, txl0Var);
        if (BifrostLayout.f24063d) {
            System.currentTimeMillis();
        }
    }

    /* JADX INFO: renamed from: i */
    public boolean mo98957i() {
        return true;
    }

    /* JADX INFO: renamed from: j */
    public void m177173j(boolean z, int i, int i2, int i3, int i4) {
        for (txl0 txl0Var : this.f158456a.m169665q()) {
            mo177175l(txl0Var.f176568a, txl0Var.f176572e, i, i2, i3, i4, z, txl0Var);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m177174k(int i, int i2) {
        this.f158458c = i2;
        this.f158457b = i;
        if (BifrostLayout.f24063d) {
            View.MeasureSpec.getSize(i);
            View.MeasureSpec.getSize(i2);
        }
        System.currentTimeMillis();
        List<txl0> listM169665q = this.f158456a.m169665q();
        for (txl0 txl0Var : listM169665q) {
            mo177171g(i, i2, txl0Var.f176568a, 0, txl0Var);
        }
        m177169c();
        m177168a(listM169665q);
        if (BifrostLayout.f24063d) {
            System.currentTimeMillis();
        }
    }

    /* JADX INFO: renamed from: l */
    public abstract void mo177175l(View view, int i, int i2, int i3, int i4, int i5, boolean z, txl0 txl0Var);

    /* JADX INFO: renamed from: m */
    public abstract int mo98958m();

    /* JADX INFO: renamed from: o */
    public void m177176o(txl0 txl0Var) {
        float fMo98956e = this.f158456a.m169619A().mo98956e();
        int iMo98955d = this.f158456a.m169619A().mo98955d();
        boolean zMo98957i = this.f158456a.m169619A().mo98957i();
        View view = txl0Var.f176568a;
        view.setPivotX(view.getMeasuredWidth() / 2);
        View view2 = txl0Var.f176568a;
        view2.setPivotY(view2.getMeasuredHeight() / 2);
        float fMin = Math.min(txl0Var.f176572e + txl0Var.f176573f, 2);
        float f = 1.0f - (fMo98956e * fMin);
        float f2 = f * f * f;
        float fSqrt = (float) Math.sqrt(Math.sqrt(fMin));
        float fSqrt2 = ((float) (((double) (fSqrt * fSqrt * fSqrt)) * Math.sqrt(fSqrt))) * iMo98955d;
        if (zMo98957i) {
            fSqrt2 += (txl0Var.f176568a.getMeasuredHeight() * (1.0f - f2)) / 2.0f;
        }
        txl0Var.f176568a.setScaleY(f2);
        txl0Var.f176568a.setScaleX(f2);
        txl0Var.f176568a.setTranslationY((mo141296q() ? -1.0f : 1.0f) * fSqrt2);
        String str = BifrostLayout.f24062c;
    }

    /* JADX INFO: renamed from: p */
    public void m177177p(ox2 ox2Var) {
        this.f158456a = ox2Var;
    }

    /* JADX INFO: renamed from: q */
    public boolean mo141296q() {
        return true;
    }
}
