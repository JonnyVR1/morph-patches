package p149l;

import android.view.View;
import com.p046p1.mobile.putong.core.newui.home.opt.BifrostLayout;
import com.p046p1.mobile.putong.core.newui.home.opt.CardOperation;
import com.p046p1.mobile.putong.core.newui.home.opt.VirtualState;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public abstract class jn2 {

    /* JADX INFO: renamed from: a */
    public zw2 f118755a;

    /* JADX INFO: renamed from: b */
    public int f118756b = -1;

    /* JADX INFO: renamed from: c */
    public int f118757c = -1;

    /* JADX INFO: renamed from: l.jn2$a */
    public static /* synthetic */ class C17820a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f118758a;

        static {
            int[] iArr = new int[CardOperation.values().length];
            f118758a = iArr;
            try {
                iArr[CardOperation.SWIPE_UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f118758a[CardOperation.SWIPE_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f118758a[CardOperation.SWIPE_RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m142261n(View view) {
        view.setTranslationY(0.0f);
        view.setTranslationX(0.0f);
        view.setRotation(0.0f);
        view.setScaleX(0.0f);
        view.setScaleY(0.0f);
        view.setAlpha(1.0f);
    }

    /* JADX INFO: renamed from: a */
    public final void m142262a(List<pol0> list) {
        if (list == null) {
            return;
        }
        for (pol0 pol0Var : list) {
            if (pol0Var.f150539j == VirtualState.RENDING && pol0Var.f150534e > 0) {
                m142270o(pol0Var);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean mo107793b() {
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m142263c() {
        List<pol0> listM220551q = this.f118755a.m220551q();
        if (listM220551q == null || listM220551q.size() <= 0) {
            return;
        }
        for (pol0 pol0Var : listM220551q) {
            if (pol0Var.f150539j == VirtualState.INIT) {
                if (BifrostLayout.f23321d) {
                    pol0Var.f150530a.getMeasuredWidth();
                }
                pol0Var.f150539j = VirtualState.RENDING;
                m142270o(pol0Var);
                pol0Var.f150535f = 0;
                if (pol0Var.f150538i != null) {
                    View view = pol0Var.f150530a;
                    view.setPivotX(view.getMeasuredWidth() / 2);
                    View view2 = pol0Var.f150530a;
                    view2.setPivotY(view2.getMeasuredHeight() / 2);
                    if (C17820a.f118758a[pol0Var.f150538i.ordinal()] == 1) {
                        pol0Var.f150530a.setTranslationY(this.f118755a.m220507B().getMeasuredHeight() * (-1.0f));
                    }
                    pol0Var.f150538i = null;
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public int mo107794d() {
        return this.f118755a.m220545n(6.0f);
    }

    /* JADX INFO: renamed from: e */
    public float mo107795e() {
        return 0.0155f;
    }

    /* JADX INFO: renamed from: f */
    public void m142264f() {
        int i;
        int i2 = this.f118756b;
        if (i2 == -1 || (i = this.f118757c) == -1) {
            return;
        }
        m142268k(i2, i);
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo142265g(int i, int i2, View view, int i3, pol0 pol0Var);

    /* JADX INFO: renamed from: h */
    public void m142266h(View view, int i, pol0 pol0Var) {
        if (this.f118757c <= 0 || this.f118756b <= 0) {
            return;
        }
        System.currentTimeMillis();
        mo142265g(this.f118756b, this.f118757c, view, i, pol0Var);
        if (BifrostLayout.f23321d) {
            System.currentTimeMillis();
        }
    }

    /* JADX INFO: renamed from: i */
    public boolean mo107796i() {
        return true;
    }

    /* JADX INFO: renamed from: j */
    public void m142267j(boolean z, int i, int i2, int i3, int i4) {
        for (pol0 pol0Var : this.f118755a.m220551q()) {
            mo142269l(pol0Var.f150530a, pol0Var.f150534e, i, i2, i3, i4, z, pol0Var);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m142268k(int i, int i2) {
        this.f118757c = i2;
        this.f118756b = i;
        if (BifrostLayout.f23321d) {
            View.MeasureSpec.getSize(i);
            View.MeasureSpec.getSize(i2);
        }
        System.currentTimeMillis();
        List<pol0> listM220551q = this.f118755a.m220551q();
        for (pol0 pol0Var : listM220551q) {
            mo142265g(i, i2, pol0Var.f150530a, 0, pol0Var);
        }
        m142263c();
        m142262a(listM220551q);
        if (BifrostLayout.f23321d) {
            System.currentTimeMillis();
        }
    }

    /* JADX INFO: renamed from: l */
    public abstract void mo142269l(View view, int i, int i2, int i3, int i4, int i5, boolean z, pol0 pol0Var);

    /* JADX INFO: renamed from: m */
    public abstract int mo107797m();

    /* JADX INFO: renamed from: o */
    public void m142270o(pol0 pol0Var) {
        float fMo107795e = this.f118755a.m220506A().mo107795e();
        int iMo107794d = this.f118755a.m220506A().mo107794d();
        boolean zMo107796i = this.f118755a.m220506A().mo107796i();
        View view = pol0Var.f150530a;
        view.setPivotX(view.getMeasuredWidth() / 2);
        View view2 = pol0Var.f150530a;
        view2.setPivotY(view2.getMeasuredHeight() / 2);
        float fMin = Math.min(pol0Var.f150534e + pol0Var.f150535f, 2);
        float f = 1.0f - (fMo107795e * fMin);
        float f2 = f * f * f;
        float fSqrt = (float) Math.sqrt(Math.sqrt(fMin));
        float fSqrt2 = ((float) (((double) (fSqrt * fSqrt * fSqrt)) * Math.sqrt(fSqrt))) * iMo107794d;
        if (zMo107796i) {
            fSqrt2 += (pol0Var.f150530a.getMeasuredHeight() * (1.0f - f2)) / 2.0f;
        }
        pol0Var.f150530a.setScaleY(f2);
        pol0Var.f150530a.setScaleX(f2);
        pol0Var.f150530a.setTranslationY((mo107798q() ? -1.0f : 1.0f) * fSqrt2);
        String str = BifrostLayout.f23320c;
    }

    /* JADX INFO: renamed from: p */
    public void m142271p(zw2 zw2Var) {
        this.f118755a = zw2Var;
    }

    /* JADX INFO: renamed from: q */
    public boolean mo107798q() {
        return true;
    }
}
