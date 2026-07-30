package p149l;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Build;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.vipfrag.behavior.TabLayoutScrollBehavior;

/* JADX INFO: loaded from: classes9.dex */
public class bhl0 {

    /* JADX INFO: renamed from: b */
    public static final int f75637b = t100.f167243R;

    /* JADX INFO: renamed from: a */
    public final ihl0 f75638a;

    public bhl0(ihl0 ihl0Var) {
        this.f75638a = ihl0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m101898a(boolean z) {
        int systemUiVisibility = this.f75638a.getAct().getWindow().getDecorView().getSystemUiVisibility();
        if (z) {
            PutongAct.setLightStatusBar(this.f75638a.getAct().getWindow(), 16);
            return;
        }
        if ((systemUiVisibility & 8192) > 0) {
            systemUiVisibility &= -8193;
        }
        if (Build.VERSION.SDK_INT >= 26 && (systemUiVisibility & 16) > 0) {
            systemUiVisibility &= -17;
        }
        this.f75638a.getAct().getWindow().getDecorView().setSystemUiVisibility(systemUiVisibility);
    }

    /* JADX INFO: renamed from: b */
    public final Drawable m101899b(PurchaseType purchaseType) {
        if (!sab0.m182891i(purchaseType) || !g6a.m124566o()) {
            return new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Color.parseColor("#0E3311"), Color.parseColor("#041B07"), Color.parseColor("#031708"), Color.parseColor("#011206")});
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.getPaint().setColor(Color.parseColor("#150701"));
        return shapeDrawable;
    }

    /* JADX INFO: renamed from: c */
    public void m101900c() {
        if (this.f75638a.f113275i.getLayoutParams() instanceof CoordinatorLayout.C0229f) {
            CoordinatorLayout.C0229f c0229f = (CoordinatorLayout.C0229f) this.f75638a.f113275i.getLayoutParams();
            if (c0229f.m1181f() instanceof TabLayoutScrollBehavior) {
                ((TabLayoutScrollBehavior) c0229f.m1181f()).m57436b(this.f75638a.f113270d);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m101901d(PurchaseType purchaseType) {
        ihl0 ihl0Var;
        ihl0 ihl0Var2;
        ihl0 ihl0Var3;
        if (sab0.m182891i(purchaseType) && g6a.m124566o()) {
            xdl0.m208344M(this.f75638a.f113269c, true);
            m101904g(purchaseType);
            xdl0.m208344M(this.f75638a.f113268b, false);
            this.f75638a.f113275i.setBackgroundResource(x2c0.f190397ni);
            ihl0 ihl0Var4 = this.f75638a;
            ihl0Var4.f113275i.setTabTextColors(ihl0Var4.getAct().color(w0c0.f183853h1), this.f75638a.getAct().color(w0c0.f183856i1));
            int tabCount = this.f75638a.f113275i.getTabCount();
            int i = 0;
            while (true) {
                ihl0Var3 = this.f75638a;
                if (i >= tabCount) {
                    break;
                }
                ihl0Var3.f113275i.getTabAt(i).view.setBackgroundResource(x2c0.f190365mi);
                i++;
            }
            ihl0Var3.f113286t.setImageResource(x2c0.f189766Th);
            this.f75638a.f113271e.setLeftIconResource(x2c0.f189797Uh);
            if (this.f75638a.f113271e.getTitleContainer().getChildAt(0) instanceof TextView) {
                ((TextView) this.f75638a.f113271e.getTitleContainer().getChildAt(0)).setTextColor(this.f75638a.getAct().color(w0c0.f183844e1));
            }
            m101898a(false);
            return;
        }
        PurchaseType purchaseType2 = PurchaseType.TYPE_SUPREME_PARTNER;
        ihl0 ihl0Var5 = this.f75638a;
        if (purchaseType != purchaseType2) {
            xdl0.m208344M(ihl0Var5.f113269c, false);
            xdl0.m208344M(this.f75638a.f113268b, true);
            this.f75638a.f113275i.setBackgroundResource(w0c0.f183834b2);
            ihl0 ihl0Var6 = this.f75638a;
            ihl0Var6.f113275i.setTabTextColors(ihl0Var6.getAct().color(w0c0.f183872o), this.f75638a.getAct().color(w0c0.f183773I));
            int tabCount2 = this.f75638a.f113275i.getTabCount();
            int i2 = 0;
            while (true) {
                ihl0Var = this.f75638a;
                if (i2 >= tabCount2) {
                    break;
                }
                ihl0Var.f113275i.getTabAt(i2).view.setBackgroundResource(x2c0.f190272jl);
                i2++;
            }
            ihl0Var.f113286t.setImageResource(x2c0.f189862Wk);
            this.f75638a.f113271e.setLeftIconResource(x2c0.f189593O);
            if (this.f75638a.f113271e.getTitleContainer().getChildAt(0) instanceof TextView) {
                ((TextView) this.f75638a.f113271e.getTitleContainer().getChildAt(0)).setTextColor(this.f75638a.getAct().color(w0c0.f183875p));
            }
            xdl0.m208344M(this.f75638a.f113285s, true);
            m101898a(true);
            return;
        }
        xdl0.m208344M(ihl0Var5.f113269c, true);
        m101904g(purchaseType);
        xdl0.m208344M(this.f75638a.f113268b, false);
        this.f75638a.f113275i.setBackgroundResource(x2c0.f190051cl);
        ihl0 ihl0Var7 = this.f75638a;
        ihl0Var7.f113275i.setTabTextColors(ihl0Var7.getAct().color(w0c0.f183828a0), this.f75638a.getAct().color(w0c0.f183771H0));
        int tabCount3 = this.f75638a.f113275i.getTabCount();
        int i3 = 0;
        while (true) {
            ihl0Var2 = this.f75638a;
            if (i3 >= tabCount3) {
                break;
            }
            ihl0Var2.f113275i.getTabAt(i3).view.setBackgroundResource(x2c0.f190304kl);
            i3++;
        }
        ihl0Var2.f113286t.setImageResource(x2c0.f189955Zk);
        this.f75638a.f113271e.setLeftIconResource(x2c0.f190019bl);
        if (this.f75638a.f113271e.getTitleContainer().getChildAt(0) instanceof TextView) {
            ((TextView) this.f75638a.f113271e.getTitleContainer().getChildAt(0)).setTextColor(this.f75638a.getAct().color(w0c0.f183834b2));
        }
        xdl0.m208344M(this.f75638a.f113285s, false);
        m101898a(false);
    }

    /* JADX INFO: renamed from: e */
    public void m101902e(PurchaseType purchaseType, float f, int i) {
        if (purchaseType == PurchaseType.TYPE_SUPREME_PARTNER || (sab0.m182891i(purchaseType) && g6a.m124566o())) {
            this.f75638a.f113269c.setAlpha(1.0f - f);
        } else {
            this.f75638a.f113269c.setAlpha(f);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m101903f(PurchaseType purchaseType) {
        if (purchaseType != PurchaseType.TYPE_SUPREME_PARTNER && (!sab0.m182891i(purchaseType) || !g6a.m124566o())) {
            xdl0.m208344M(this.f75638a.f113268b, true);
            return;
        }
        this.f75638a.f113269c.setAlpha(0.0f);
        xdl0.m208344M(this.f75638a.f113269c, true);
        m101904g(purchaseType);
    }

    /* JADX INFO: renamed from: g */
    public void m101904g(PurchaseType purchaseType) {
        this.f75638a.f113269c.setBackground(m101899b(purchaseType));
        m101905h(purchaseType);
    }

    /* JADX INFO: renamed from: h */
    public final void m101905h(PurchaseType purchaseType) {
        if (sab0.m182891i(purchaseType) && g6a.m124566o()) {
            ViewGroup.LayoutParams layoutParams = this.f75638a.f113270d.getLayoutParams();
            int iM208412y0 = (xdl0.m208412y0() * 228) / 375;
            if (layoutParams.height != iM208412y0) {
                layoutParams.height = iM208412y0;
                this.f75638a.f113270d.setLayoutParams(layoutParams);
            }
            qib0.f154691G.m102325I0(this.f75638a.f113270d, "https://auto.tancdn.com/v1/images/eyJpZCI6IkhBM0NSVVlTWVNTNUg0WDNXQ0RHUVVXTEVYWjVZTzE0IiwidyI6MTEyNSwiaCI6Njg0LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NjQ2NzcxNTQ1NzV9.png", t100.m186890d(375.0f), t100.m186890d(228.0f));
            return;
        }
        if (purchaseType == PurchaseType.TYPE_SUPREME_PARTNER) {
            ViewGroup.LayoutParams layoutParams2 = this.f75638a.f113270d.getLayoutParams();
            int iM208412y1 = (xdl0.m208412y0() * 264) / 375;
            if (layoutParams2.height != iM208412y1) {
                layoutParams2.height = iM208412y1;
                this.f75638a.f113270d.setLayoutParams(layoutParams2);
            }
            qib0.f154691G.m102325I0(this.f75638a.f113270d, "https://fe-static.tancdn.com/v1/images/eyJpZCI6IlBWUDJWMzVPUlZCQ0tRNFNXUTdRUVQ2UlBLSkNMSzE0IiwidyI6MTEyNSwiaCI6NzkyLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NDQ4MTAzNjExMX0.png", t100.m186890d(375.0f), t100.m186890d(264.0f));
        }
    }
}
