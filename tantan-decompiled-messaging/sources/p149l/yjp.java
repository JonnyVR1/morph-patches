package p149l;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import p147v.VImage;
import p147v.VRelative;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class yjp {

    /* JADX INFO: renamed from: a */
    public VRelative f198648a;

    /* JADX INFO: renamed from: b */
    public VImage f198649b;

    /* JADX INFO: renamed from: c */
    public VText f198650c;

    /* JADX INFO: renamed from: d */
    public VText f198651d;

    /* JADX INFO: renamed from: e */
    public Act f198652e;

    /* JADX INFO: renamed from: f */
    public PurchaseType f198653f;

    /* JADX INFO: renamed from: g */
    public boolean f198654g;

    /* JADX INFO: renamed from: l.yjp$a */
    public static /* synthetic */ class C21420a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f198655a;

        static {
            int[] iArr = new int[PurchaseType.values().length];
            f198655a = iArr;
            try {
                iArr[PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f198655a[PurchaseType.TYPE_ULTRA_PREMIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public yjp(Act act) {
        this.f198652e = act;
    }

    /* JADX INFO: renamed from: b */
    public final void m215072b(View view) {
        zjp.m219127a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public View m215073c(Act act, ViewGroup viewGroup) {
        View viewInflate = act.inflater().inflate(m6c0.f131549X, viewGroup, false);
        m215072b(viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: d */
    public void m215074d(Act act, PurchaseType purchaseType, boolean z) {
        this.f198652e = act;
        this.f198653f = purchaseType;
        this.f198654g = z;
        m215075e();
    }

    @SuppressLint({"SwitchIntDef"})
    /* JADX INFO: renamed from: e */
    public final void m215075e() {
        int i = this.f198654g ? d3c0.f83600I0 : d3c0.f84194z2;
        ProductCategory productCategoryM105981i3 = CoreModule.f17545c.f19569G2.m105981i3();
        int i2 = C21420a.f198655a[this.f198653f.ordinal()];
        String str = "#4D000000";
        String str2 = Constants.BLACK;
        String string = "";
        if (i2 == 1) {
            if (TEnum.equals(productCategoryM105981i3, ProductCategory.tttVipUpgradeToPremium)) {
                string = String.format(this.f198652e.getString(R$string.f27455g6), "VIP");
            } else if (TEnum.equals(productCategoryM105981i3, ProductCategory.tttSeeUpgradeToPremium)) {
                string = String.format(this.f198652e.getString(R$string.f27455g6), this.f198652e.getString(R$string.f27609t7));
            }
            if (this.f198654g) {
                i = d3c0.f83600I0;
            } else {
                i = d3c0.f83490A2;
                str = "#88EDD7A3";
                str2 = "#FDE5AC";
            }
        } else if (i2 != 2) {
            str = "#EDD7A3";
            str2 = "#FDE5AC";
        } else {
            string = this.f198652e.getString(R$string.f27467h6);
            if (this.f198654g) {
                i = d3c0.f83600I0;
            } else {
                i = d3c0.f83504B2;
                str2 = "#F9E7FF";
                str = "#66F9E7FF";
            }
        }
        this.f198650c.setTextColor(Color.parseColor(str2));
        this.f198651d.setTextColor(Color.parseColor(str));
        this.f198651d.setText(string);
        this.f198649b.setImageResource(i);
        this.f198650c.setTypeface(Typeface.defaultFromStyle(1));
    }

    /* JADX INFO: renamed from: f */
    public void m215076f(final e30<Integer> e30Var) {
        xdl0.m208329E0(this.f198649b, new View.OnClickListener() { // from class: l.xjp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e30Var.call(0);
            }
        });
    }
}
