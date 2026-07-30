package p153l;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import p151v.VImage;
import p151v.VRelative;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class ylp {

    /* JADX INFO: renamed from: a */
    public VRelative f200570a;

    /* JADX INFO: renamed from: b */
    public VImage f200571b;

    /* JADX INFO: renamed from: c */
    public VText f200572c;

    /* JADX INFO: renamed from: d */
    public VText f200573d;

    /* JADX INFO: renamed from: e */
    public Act f200574e;

    /* JADX INFO: renamed from: f */
    public PurchaseType f200575f;

    /* JADX INFO: renamed from: g */
    public boolean f200576g;

    /* JADX INFO: renamed from: l.ylp$a */
    public static /* synthetic */ class C21627a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f200577a;

        static {
            int[] iArr = new int[PurchaseType.values().length];
            f200577a = iArr;
            try {
                iArr[PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f200577a[PurchaseType.TYPE_ULTRA_PREMIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public ylp(Act act) {
        this.f200574e = act;
    }

    /* JADX INFO: renamed from: b */
    public final void m216614b(View view) {
        zlp.m220294a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public View m216615c(Act act, ViewGroup viewGroup) {
        View viewInflate = act.inflater().inflate(rec0.f162509X, viewGroup, false);
        m216614b(viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: d */
    public void m216616d(Act act, PurchaseType purchaseType, boolean z) {
        this.f200574e = act;
        this.f200575f = purchaseType;
        this.f200576g = z;
        m216617e();
    }

    @SuppressLint({"SwitchIntDef"})
    /* JADX INFO: renamed from: e */
    public final void m216617e() {
        int i = this.f200576g ? jbc0.f119255I0 : jbc0.f119849z2;
        ProductCategory productCategoryM153651i3 = CoreModule.f18264c.f20311G2.m153651i3();
        int i2 = C21627a.f200577a[this.f200575f.ordinal()];
        String str = "#4D000000";
        String str2 = Constants.BLACK;
        String string = "";
        if (i2 == 1) {
            if (TEnum.equals(productCategoryM153651i3, ProductCategory.tttVipUpgradeToPremium)) {
                string = String.format(this.f200574e.getString(R$string.f28303g6), "VIP");
            } else if (TEnum.equals(productCategoryM153651i3, ProductCategory.tttSeeUpgradeToPremium)) {
                string = String.format(this.f200574e.getString(R$string.f28303g6), this.f200574e.getString(R$string.f28457t7));
            }
            if (this.f200576g) {
                i = jbc0.f119255I0;
            } else {
                i = jbc0.f119145A2;
                str = "#88EDD7A3";
                str2 = "#FDE5AC";
            }
        } else if (i2 != 2) {
            str = "#EDD7A3";
            str2 = "#FDE5AC";
        } else {
            string = this.f200574e.getString(R$string.f28315h6);
            if (this.f200576g) {
                i = jbc0.f119255I0;
            } else {
                i = jbc0.f119159B2;
                str2 = "#F9E7FF";
                str = "#66F9E7FF";
            }
        }
        this.f200572c.setTextColor(Color.parseColor(str2));
        this.f200573d.setTextColor(Color.parseColor(str));
        this.f200573d.setText(string);
        this.f200571b.setImageResource(i);
        this.f200572c.setTypeface(Typeface.defaultFromStyle(1));
    }

    /* JADX INFO: renamed from: f */
    public void m216618f(final y20<Integer> y20Var) {
        bnl0.m105509E0(this.f200571b, new View.OnClickListener() { // from class: l.xlp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y20Var.call(0);
            }
        });
    }
}
