package p002l;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.pay.R;
import com.p1.mobile.putong.data.tenum.TEnum;
import l.d3c0;
import l.e30;
import l.m6c0;
import l.xdl0;
import l.zjp;
import v.VImage;
import v.VRelative;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class yjp {

    /* JADX INFO: renamed from: a */
    public VRelative f22939a;

    /* JADX INFO: renamed from: b */
    public VImage f22940b;

    /* JADX INFO: renamed from: c */
    public VText f22941c;

    /* JADX INFO: renamed from: d */
    public VText f22942d;

    /* JADX INFO: renamed from: e */
    public Act f22943e;

    /* JADX INFO: renamed from: f */
    public PurchaseType f22944f;

    /* JADX INFO: renamed from: g */
    public boolean f22945g;

    /* JADX INFO: renamed from: l.yjp$a */
    public static /* synthetic */ class C0922a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f22946a;

        static {
            int[] iArr = new int[PurchaseType.values().length];
            f22946a = iArr;
            try {
                iArr[PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22946a[PurchaseType.TYPE_ULTRA_PREMIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public yjp(Act act) {
        this.f22943e = act;
    }

    /* JADX INFO: renamed from: b */
    public final void m26775b(View view) {
        zjp.a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public View m26776c(Act act, ViewGroup viewGroup) {
        View viewInflate = act.inflater().inflate(m6c0.X, viewGroup, false);
        m26775b(viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: d */
    public void m26777d(Act act, PurchaseType purchaseType, boolean z) {
        this.f22943e = act;
        this.f22944f = purchaseType;
        this.f22945g = z;
        m26778e();
    }

    @SuppressLint({"SwitchIntDef"})
    /* JADX INFO: renamed from: e */
    public final void m26778e() {
        int i = this.f22945g ? d3c0.I0 : d3c0.z2;
        ProductCategory productCategoryI3 = CoreModule.c.G2.i3();
        int i2 = C0922a.f22946a[this.f22944f.ordinal()];
        String str = "#4D000000";
        String str2 = "#000000";
        String string = "";
        if (i2 == 1) {
            if (TEnum.equals(productCategoryI3, "tttVipUpgradeToPremium")) {
                string = String.format(this.f22943e.getString(R.string.g6), "VIP");
            } else if (TEnum.equals(productCategoryI3, "tttSeeUpgradeToPremium")) {
                string = String.format(this.f22943e.getString(R.string.g6), this.f22943e.getString(R.string.t7));
            }
            if (this.f22945g) {
                i = d3c0.I0;
            } else {
                i = d3c0.A2;
                str = "#88EDD7A3";
                str2 = "#FDE5AC";
            }
        } else if (i2 != 2) {
            str = "#EDD7A3";
            str2 = "#FDE5AC";
        } else {
            string = this.f22943e.getString(R.string.h6);
            if (this.f22945g) {
                i = d3c0.I0;
            } else {
                i = d3c0.B2;
                str2 = "#F9E7FF";
                str = "#66F9E7FF";
            }
        }
        this.f22941c.setTextColor(Color.parseColor(str2));
        this.f22942d.setTextColor(Color.parseColor(str));
        this.f22942d.setText(string);
        this.f22940b.setImageResource(i);
        this.f22941c.setTypeface(Typeface.defaultFromStyle(1));
    }

    /* JADX INFO: renamed from: f */
    public void m26779f(final e30<Integer> e30Var) {
        xdl0.E0(this.f22940b, new View.OnClickListener() { // from class: l.xjp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e30Var.call(0);
            }
        });
    }
}
