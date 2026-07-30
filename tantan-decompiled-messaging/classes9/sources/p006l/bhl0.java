package p006l;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Build;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.p000p1.mobile.putong.app.PutongAct;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.vipfrag.behavior.TabLayoutScrollBehavior;
import com.p1.mobile.putong.core.data.PurchaseType;
import l.sab0;
import l.t100;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class bhl0 {

    /* JADX INFO: renamed from: b */
    public static final int f8907b = t100.R;

    /* JADX INFO: renamed from: a */
    public final ihl0 f8908a;

    public bhl0(ihl0 ihl0Var) {
        this.f8908a = ihl0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m12679a(boolean z) {
        int systemUiVisibility = this.f8908a.act().getWindow().getDecorView().getSystemUiVisibility();
        if (z) {
            PutongAct.setLightStatusBar(this.f8908a.act().getWindow(), 16);
            return;
        }
        if ((systemUiVisibility & 8192) > 0) {
            systemUiVisibility &= -8193;
        }
        if (Build.VERSION.SDK_INT >= 26 && (systemUiVisibility & 16) > 0) {
            systemUiVisibility &= -17;
        }
        this.f8908a.act().getWindow().getDecorView().setSystemUiVisibility(systemUiVisibility);
    }

    /* JADX INFO: renamed from: b */
    public final Drawable m12680b(PurchaseType purchaseType) {
        if (!sab0.i(purchaseType) || !g6a.m15592o()) {
            return new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Color.parseColor("#0E3311"), Color.parseColor("#041B07"), Color.parseColor("#031708"), Color.parseColor("#011206")});
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.getPaint().setColor(Color.parseColor("#150701"));
        return shapeDrawable;
    }

    /* JADX INFO: renamed from: c */
    public void m12681c() {
        if (this.f8908a.f14461i.getLayoutParams() instanceof CoordinatorLayout.f) {
            CoordinatorLayout.f layoutParams = this.f8908a.f14461i.getLayoutParams();
            if (layoutParams.f() instanceof TabLayoutScrollBehavior) {
                ((TabLayoutScrollBehavior) layoutParams.f()).m10923b(this.f8908a.f14456d);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m12682d(PurchaseType purchaseType) {
        ihl0 ihl0Var;
        ihl0 ihl0Var2;
        ihl0 ihl0Var3;
        if (sab0.i(purchaseType) && g6a.m15592o()) {
            xdl0.M(this.f8908a.f14455c, true);
            m12685g(purchaseType);
            xdl0.M(this.f8908a.f14454b, false);
            this.f8908a.f14461i.setBackgroundResource(x2c0.f26933ni);
            ihl0 ihl0Var4 = this.f8908a;
            ihl0Var4.f14461i.setTabTextColors(ihl0Var4.act().color(w0c0.f24693h1), this.f8908a.act().color(w0c0.f24696i1));
            int tabCount = this.f8908a.f14461i.getTabCount();
            int i = 0;
            while (true) {
                ihl0Var3 = this.f8908a;
                if (i >= tabCount) {
                    break;
                }
                ihl0Var3.f14461i.getTabAt(i).view.setBackgroundResource(x2c0.f26901mi);
                i++;
            }
            ihl0Var3.f14472t.setImageResource(x2c0.f26302Th);
            this.f8908a.f14457e.setLeftIconResource(x2c0.f26333Uh);
            if (this.f8908a.f14457e.getTitleContainer().getChildAt(0) instanceof TextView) {
                ((TextView) this.f8908a.f14457e.getTitleContainer().getChildAt(0)).setTextColor(this.f8908a.act().color(w0c0.f24684e1));
            }
            m12679a(false);
            return;
        }
        PurchaseType purchaseType2 = PurchaseType.TYPE_SUPREME_PARTNER;
        ihl0 ihl0Var5 = this.f8908a;
        if (purchaseType != purchaseType2) {
            xdl0.M(ihl0Var5.f14455c, false);
            xdl0.M(this.f8908a.f14454b, true);
            this.f8908a.f14461i.setBackgroundResource(w0c0.f24674b2);
            ihl0 ihl0Var6 = this.f8908a;
            ihl0Var6.f14461i.setTabTextColors(ihl0Var6.act().color(w0c0.f24712o), this.f8908a.act().color(w0c0.f24613I));
            int tabCount2 = this.f8908a.f14461i.getTabCount();
            int i2 = 0;
            while (true) {
                ihl0Var = this.f8908a;
                if (i2 >= tabCount2) {
                    break;
                }
                ihl0Var.f14461i.getTabAt(i2).view.setBackgroundResource(x2c0.f26808jl);
                i2++;
            }
            ihl0Var.f14472t.setImageResource(x2c0.f26398Wk);
            this.f8908a.f14457e.setLeftIconResource(x2c0.f26129O);
            if (this.f8908a.f14457e.getTitleContainer().getChildAt(0) instanceof TextView) {
                ((TextView) this.f8908a.f14457e.getTitleContainer().getChildAt(0)).setTextColor(this.f8908a.act().color(w0c0.f24715p));
            }
            xdl0.M(this.f8908a.f14471s, true);
            m12679a(true);
            return;
        }
        xdl0.M(ihl0Var5.f14455c, true);
        m12685g(purchaseType);
        xdl0.M(this.f8908a.f14454b, false);
        this.f8908a.f14461i.setBackgroundResource(x2c0.f26587cl);
        ihl0 ihl0Var7 = this.f8908a;
        ihl0Var7.f14461i.setTabTextColors(ihl0Var7.act().color(w0c0.f24668a0), this.f8908a.act().color(w0c0.f24611H0));
        int tabCount3 = this.f8908a.f14461i.getTabCount();
        int i3 = 0;
        while (true) {
            ihl0Var2 = this.f8908a;
            if (i3 >= tabCount3) {
                break;
            }
            ihl0Var2.f14461i.getTabAt(i3).view.setBackgroundResource(x2c0.f26840kl);
            i3++;
        }
        ihl0Var2.f14472t.setImageResource(x2c0.f26491Zk);
        this.f8908a.f14457e.setLeftIconResource(x2c0.f26555bl);
        if (this.f8908a.f14457e.getTitleContainer().getChildAt(0) instanceof TextView) {
            ((TextView) this.f8908a.f14457e.getTitleContainer().getChildAt(0)).setTextColor(this.f8908a.act().color(w0c0.f24674b2));
        }
        xdl0.M(this.f8908a.f14471s, false);
        m12679a(false);
    }

    /* JADX INFO: renamed from: e */
    public void m12683e(PurchaseType purchaseType, float f, int i) {
        if (purchaseType == PurchaseType.TYPE_SUPREME_PARTNER || (sab0.i(purchaseType) && g6a.m15592o())) {
            this.f8908a.f14455c.setAlpha(1.0f - f);
        } else {
            this.f8908a.f14455c.setAlpha(f);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m12684f(PurchaseType purchaseType) {
        if (purchaseType != PurchaseType.TYPE_SUPREME_PARTNER && (!sab0.i(purchaseType) || !g6a.m15592o())) {
            xdl0.M(this.f8908a.f14454b, true);
            return;
        }
        this.f8908a.f14455c.setAlpha(0.0f);
        xdl0.M(this.f8908a.f14455c, true);
        m12685g(purchaseType);
    }

    /* JADX INFO: renamed from: g */
    public void m12685g(PurchaseType purchaseType) {
        this.f8908a.f14455c.setBackground(m12680b(purchaseType));
        m12686h(purchaseType);
    }

    /* JADX INFO: renamed from: h */
    public final void m12686h(PurchaseType purchaseType) {
        if (sab0.i(purchaseType) && g6a.m15592o()) {
            ViewGroup.LayoutParams layoutParams = this.f8908a.f14456d.getLayoutParams();
            int iY0 = (xdl0.y0() * 228) / 375;
            if (layoutParams.height != iY0) {
                layoutParams.height = iY0;
                this.f8908a.f14456d.setLayoutParams(layoutParams);
            }
            qib0.f19782G.m12738I0(this.f8908a.f14456d, "https://auto.tancdn.com/v1/images/eyJpZCI6IkhBM0NSVVlTWVNTNUg0WDNXQ0RHUVVXTEVYWjVZTzE0IiwidyI6MTEyNSwiaCI6Njg0LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NjQ2NzcxNTQ1NzV9.png", t100.d(375.0f), t100.d(228.0f));
            return;
        }
        if (purchaseType == PurchaseType.TYPE_SUPREME_PARTNER) {
            ViewGroup.LayoutParams layoutParams2 = this.f8908a.f14456d.getLayoutParams();
            int iY1 = (xdl0.y0() * 264) / 375;
            if (layoutParams2.height != iY1) {
                layoutParams2.height = iY1;
                this.f8908a.f14456d.setLayoutParams(layoutParams2);
            }
            qib0.f19782G.m12738I0(this.f8908a.f14456d, "https://fe-static.tancdn.com/v1/images/eyJpZCI6IlBWUDJWMzVPUlZCQ0tRNFNXUTdRUVQ2UlBLSkNMSzE0IiwidyI6MTEyNSwiaCI6NzkyLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NDQ4MTAzNjExMX0.png", t100.d(375.0f), t100.d(264.0f));
        }
    }
}
