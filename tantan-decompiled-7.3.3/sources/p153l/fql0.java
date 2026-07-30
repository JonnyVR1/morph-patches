package p153l;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Build;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.vipfrag.behavior.TabLayoutScrollBehavior;

/* JADX INFO: loaded from: classes12.dex */
public class fql0 {

    /* JADX INFO: renamed from: b */
    public static final int f100310b = qa00.f156305R;

    /* JADX INFO: renamed from: a */
    public final mql0 f100311a;

    public fql0(mql0 mql0Var) {
        this.f100311a = mql0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m126774a(boolean z) {
        int systemUiVisibility = this.f100311a.getAct().getWindow().getDecorView().getSystemUiVisibility();
        if (z) {
            PutongAct.setLightStatusBar(this.f100311a.getAct().getWindow(), 16);
            return;
        }
        if ((systemUiVisibility & 8192) > 0) {
            systemUiVisibility &= -8193;
        }
        if (Build.VERSION.SDK_INT >= 26 && (systemUiVisibility & 16) > 0) {
            systemUiVisibility &= -17;
        }
        this.f100311a.getAct().getWindow().getDecorView().setSystemUiVisibility(systemUiVisibility);
    }

    /* JADX INFO: renamed from: b */
    public final Drawable m126775b(PurchaseType purchaseType) {
        if (!wib0.m206565i(purchaseType) || !s7a.m184986o()) {
            return new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Color.parseColor("#0E3311"), Color.parseColor("#041B07"), Color.parseColor("#031708"), Color.parseColor("#011206")});
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.getPaint().setColor(Color.parseColor("#150701"));
        return shapeDrawable;
    }

    /* JADX INFO: renamed from: c */
    public void m126776c() {
        if (this.f100311a.f138088i.getLayoutParams() instanceof CoordinatorLayout.C0230f) {
            CoordinatorLayout.C0230f c0230f = (CoordinatorLayout.C0230f) this.f100311a.f138088i.getLayoutParams();
            if (c0230f.m1182f() instanceof TabLayoutScrollBehavior) {
                ((TabLayoutScrollBehavior) c0230f.m1182f()).m58619b(this.f100311a.f138083d);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m126777d(PurchaseType purchaseType) {
        mql0 mql0Var;
        mql0 mql0Var2;
        mql0 mql0Var3;
        if (wib0.m206565i(purchaseType) && s7a.m184986o()) {
            bnl0.m105524M(this.f100311a.f138082c, true);
            m126780g(purchaseType);
            bnl0.m105524M(this.f100311a.f138081b, false);
            this.f100311a.f138088i.setBackgroundResource(dbc0.f86861bj);
            mql0 mql0Var4 = this.f100311a;
            mql0Var4.f138088i.setTabTextColors(mql0Var4.getAct().color(c9c0.f80426i1), this.f100311a.getAct().color(c9c0.f80429j1));
            int tabCount = this.f100311a.f138088i.getTabCount();
            int i = 0;
            while (true) {
                mql0Var3 = this.f100311a;
                if (i >= tabCount) {
                    break;
                }
                mql0Var3.f138088i.getTabAt(i).view.setBackgroundResource(dbc0.f86828aj);
                i++;
            }
            mql0Var3.f138099t.setImageResource(dbc0.f86219Hi);
            this.f100311a.f138084e.setLeftIconResource(dbc0.f86251Ii);
            if (this.f100311a.f138084e.getTitleContainer().getChildAt(0) instanceof TextView) {
                ((TextView) this.f100311a.f138084e.getTitleContainer().getChildAt(0)).setTextColor(this.f100311a.getAct().color(c9c0.f80417f1));
            }
            m126774a(false);
            return;
        }
        PurchaseType purchaseType2 = PurchaseType.TYPE_SUPREME_PARTNER;
        mql0 mql0Var5 = this.f100311a;
        if (purchaseType != purchaseType2) {
            bnl0.m105524M(mql0Var5.f138082c, false);
            bnl0.m105524M(this.f100311a.f138081b, true);
            this.f100311a.f138088i.setBackgroundResource(c9c0.f80407c2);
            mql0 mql0Var6 = this.f100311a;
            mql0Var6.f138088i.setTabTextColors(mql0Var6.getAct().color(c9c0.f80442o), this.f100311a.getAct().color(c9c0.f80342I));
            int tabCount2 = this.f100311a.f138088i.getTabCount();
            int i2 = 0;
            while (true) {
                mql0Var = this.f100311a;
                if (i2 >= tabCount2) {
                    break;
                }
                mql0Var.f138088i.getTabAt(i2).view.setBackgroundResource(dbc0.f86734Xl);
                i2++;
            }
            mql0Var.f138099t.setImageResource(dbc0.f86318Kl);
            this.f100311a.f138084e.setLeftIconResource(dbc0.f86456P);
            if (this.f100311a.f138084e.getTitleContainer().getChildAt(0) instanceof TextView) {
                ((TextView) this.f100311a.f138084e.getTitleContainer().getChildAt(0)).setTextColor(this.f100311a.getAct().color(c9c0.f80445p));
            }
            bnl0.m105524M(this.f100311a.f138098s, true);
            m126774a(true);
            return;
        }
        bnl0.m105524M(mql0Var5.f138082c, true);
        m126780g(purchaseType);
        bnl0.m105524M(this.f100311a.f138081b, false);
        this.f100311a.f138088i.setBackgroundResource(dbc0.f86510Ql);
        mql0 mql0Var7 = this.f100311a;
        mql0Var7.f138088i.setTabTextColors(mql0Var7.getAct().color(c9c0.f80401b0), this.f100311a.getAct().color(c9c0.f80343I0));
        int tabCount3 = this.f100311a.f138088i.getTabCount();
        int i3 = 0;
        while (true) {
            mql0Var2 = this.f100311a;
            if (i3 >= tabCount3) {
                break;
            }
            mql0Var2.f138088i.getTabAt(i3).view.setBackgroundResource(dbc0.f86766Yl);
            i3++;
        }
        mql0Var2.f138099t.setImageResource(dbc0.f86414Nl);
        this.f100311a.f138084e.setLeftIconResource(dbc0.f86478Pl);
        if (this.f100311a.f138084e.getTitleContainer().getChildAt(0) instanceof TextView) {
            ((TextView) this.f100311a.f138084e.getTitleContainer().getChildAt(0)).setTextColor(this.f100311a.getAct().color(c9c0.f80407c2));
        }
        bnl0.m105524M(this.f100311a.f138098s, false);
        m126774a(false);
    }

    /* JADX INFO: renamed from: e */
    public void m126778e(PurchaseType purchaseType, float f, int i) {
        if (purchaseType == PurchaseType.TYPE_SUPREME_PARTNER || (wib0.m206565i(purchaseType) && s7a.m184986o())) {
            this.f100311a.f138082c.setAlpha(1.0f - f);
        } else {
            this.f100311a.f138082c.setAlpha(f);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m126779f(PurchaseType purchaseType) {
        if (purchaseType != PurchaseType.TYPE_SUPREME_PARTNER && (!wib0.m206565i(purchaseType) || !s7a.m184986o())) {
            bnl0.m105524M(this.f100311a.f138081b, true);
            return;
        }
        this.f100311a.f138082c.setAlpha(0.0f);
        bnl0.m105524M(this.f100311a.f138082c, true);
        m126780g(purchaseType);
    }

    /* JADX INFO: renamed from: g */
    public void m126780g(PurchaseType purchaseType) {
        this.f100311a.f138082c.setBackground(m126775b(purchaseType));
        m126781h(purchaseType);
    }

    /* JADX INFO: renamed from: h */
    public final void m126781h(PurchaseType purchaseType) {
        if (wib0.m206565i(purchaseType) && s7a.m184986o()) {
            ViewGroup.LayoutParams layoutParams = this.f100311a.f138083d.getLayoutParams();
            int iM105592y0 = (bnl0.m105592y0() * 228) / 375;
            if (layoutParams.height != iM105592y0) {
                layoutParams.height = iM105592y0;
                this.f100311a.f138083d.setLayoutParams(layoutParams);
            }
            uqb0.f180374G.m127109I0(this.f100311a.f138083d, "https://auto.tancdn.com/v1/images/eyJpZCI6IkhBM0NSVVlTWVNTNUg0WDNXQ0RHUVVXTEVYWjVZTzE0IiwidyI6MTEyNSwiaCI6Njg0LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NjQ2NzcxNTQ1NzV9.png", qa00.m175859d(375.0f), qa00.m175859d(228.0f));
            return;
        }
        if (purchaseType == PurchaseType.TYPE_SUPREME_PARTNER) {
            ViewGroup.LayoutParams layoutParams2 = this.f100311a.f138083d.getLayoutParams();
            int iM105592y1 = (bnl0.m105592y0() * 264) / 375;
            if (layoutParams2.height != iM105592y1) {
                layoutParams2.height = iM105592y1;
                this.f100311a.f138083d.setLayoutParams(layoutParams2);
            }
            uqb0.f180374G.m127109I0(this.f100311a.f138083d, "https://fe-static.tancdn.com/v1/images/eyJpZCI6IlBWUDJWMzVPUlZCQ0tRNFNXUTdRUVQ2UlBLSkNMSzE0IiwidyI6MTEyNSwiaCI6NzkyLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NDQ4MTAzNjExMX0.png", qa00.m175859d(375.0f), qa00.m175859d(264.0f));
        }
    }
}
