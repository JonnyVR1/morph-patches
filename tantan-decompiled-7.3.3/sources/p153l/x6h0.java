package p153l;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.vip.intlPrivilege.content.item.IntlPrivilegeDescListItem;
import p151v.VText;

/* JADX INFO: loaded from: classes12.dex */
public final class x6h0 {

    /* JADX INFO: renamed from: a */
    public final Context f192587a;

    /* JADX INFO: renamed from: b */
    public final xj90 f192588b;

    /* JADX INFO: renamed from: c */
    public TextSwitcher f192589c;

    /* JADX INFO: renamed from: d */
    public String f192590d;

    /* JADX INFO: renamed from: e */
    public PurchaseType f192591e;

    /* JADX INFO: renamed from: l.x6h0$a */
    public static class C21258a {

        /* JADX INFO: renamed from: a */
        public final int f192592a;

        /* JADX INFO: renamed from: b */
        public final float f192593b;

        /* JADX INFO: renamed from: c */
        public final int f192594c;

        /* JADX INFO: renamed from: d */
        public final Typeface f192595d;

        public C21258a(int i, float f, int i2, Typeface typeface) {
            this.f192592a = i;
            this.f192593b = f;
            this.f192594c = i2;
            this.f192595d = typeface;
        }
    }

    public x6h0(Context context, xj90 xj90Var) {
        this.f192587a = context;
        this.f192588b = xj90Var;
    }

    /* JADX INFO: renamed from: b */
    public final FrameLayout.LayoutParams m209491b(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return new FrameLayout.LayoutParams(-1, -2);
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams.width, layoutParams.height);
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            layoutParams2.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
        return layoutParams2;
    }

    /* JADX INFO: renamed from: c */
    public TextSwitcher m209492c(IntlPrivilegeDescListItem intlPrivilegeDescListItem, PurchaseType purchaseType) {
        ViewGroup viewGroup;
        VText vText = intlPrivilegeDescListItem.f38001c;
        if (vText == null || intlPrivilegeDescListItem.f38000b == null || (viewGroup = (ViewGroup) vText.getParent()) == null) {
            return null;
        }
        VText vText2 = intlPrivilegeDescListItem.f38001c;
        int iIndexOfChild = viewGroup.indexOfChild(vText2);
        ViewGroup.LayoutParams layoutParams = vText2.getLayoutParams();
        C21258a c21258aM209494e = m209494e(vText2);
        TextSwitcher textSwitcher = new TextSwitcher(this.f192587a);
        this.f192589c = textSwitcher;
        textSwitcher.setLayoutParams(m209491b(layoutParams));
        this.f192589c.setFactory(m209493d(c21258aM209494e));
        m209497h(intlPrivilegeDescListItem, purchaseType);
        viewGroup.removeViewAt(iIndexOfChild);
        viewGroup.addView(this.f192589c, iIndexOfChild);
        this.f192591e = purchaseType;
        return this.f192589c;
    }

    /* JADX INFO: renamed from: d */
    public final ViewSwitcher.ViewFactory m209493d(final C21258a c21258a) {
        return new ViewSwitcher.ViewFactory() { // from class: l.w6h0
            @Override // android.widget.ViewSwitcher.ViewFactory
            public final View makeView() {
                return this.f187620a.m209498i(c21258a);
            }
        };
    }

    /* JADX INFO: renamed from: e */
    public final C21258a m209494e(TextView textView) {
        return new C21258a(textView.getCurrentTextColor(), textView.getTextSize() / this.f192587a.getResources().getDisplayMetrics().scaledDensity, textView.getGravity(), textView.getTypeface());
    }

    /* JADX INFO: renamed from: f */
    public final String m209495f() {
        TextSwitcher textSwitcher = this.f192589c;
        if (textSwitcher == null) {
            return "";
        }
        View currentView = textSwitcher.getCurrentView();
        return currentView instanceof TextView ? ((TextView) currentView).getText().toString() : "";
    }

    /* JADX INFO: renamed from: g */
    public TextSwitcher m209496g() {
        return this.f192589c;
    }

    /* JADX INFO: renamed from: h */
    public final void m209497h(IntlPrivilegeDescListItem intlPrivilegeDescListItem, PurchaseType purchaseType) {
        String strM211201e = this.f192588b.m211201e(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE);
        String strM211201e2 = this.f192588b.m211201e(PurchaseType.TYPE_ULTRA_PREMIUM);
        if (strM211201e == null || strM211201e2 == null) {
            return;
        }
        String string = this.f192590d;
        if (string == null) {
            string = intlPrivilegeDescListItem.f38001c.getText().toString();
        }
        boolean zEquals = strM211201e.equals(string);
        boolean zEquals2 = strM211201e2.equals(string);
        if (!zEquals && !zEquals2) {
            string = wib0.m206578v(purchaseType) ? strM211201e2 : strM211201e;
        }
        this.f192589c.setCurrentText(string);
        if (zEquals) {
            strM211201e = strM211201e2;
        }
        this.f192589c.setText(strM211201e);
        this.f192589c.setCurrentText(string);
        this.f192590d = string;
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ View m209498i(C21258a c21258a) {
        VText vText = new VText(this.f192587a);
        vText.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        vText.setTextColor(c21258a.f192592a);
        vText.setTextSize(2, c21258a.f192593b);
        Typeface typeface = c21258a.f192595d;
        if (typeface != null) {
            vText.setTypeface(typeface, 1);
        } else {
            vText.setTypeface(null, 1);
        }
        vText.setGravity(c21258a.f192594c);
        vText.setEllipsize(TextUtils.TruncateAt.END);
        vText.setLines(1);
        return vText;
    }

    /* JADX INFO: renamed from: j */
    public void m209499j(PurchaseType purchaseType, PurchaseType purchaseType2) {
        if (this.f192589c == null) {
            return;
        }
        PurchaseType purchaseType3 = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
        boolean z = false;
        boolean z2 = purchaseType == purchaseType3 && wib0.m206578v(purchaseType2);
        if (wib0.m206578v(purchaseType) && purchaseType2 == purchaseType3) {
            z = true;
        }
        if (z2 || z) {
            String strM211201e = this.f192588b.m211201e(purchaseType3);
            String strM211201e2 = this.f192588b.m211201e(PurchaseType.TYPE_ULTRA_PREMIUM);
            if (strM211201e == null || strM211201e2 == null) {
                return;
            }
            if (!z2) {
                strM211201e = strM211201e2;
            }
            if (strM211201e.equals(m209495f())) {
                return;
            }
            this.f192589c.setInAnimation(null);
            this.f192589c.setOutAnimation(null);
            this.f192589c.setCurrentText(strM211201e);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m209500k(String str) {
        this.f192590d = str;
    }

    /* JADX INFO: renamed from: l */
    public final void m209501l(PurchaseType purchaseType, PurchaseType purchaseType2, String str, String str2) {
        boolean zM206578v = wib0.m206578v(purchaseType2);
        PurchaseType purchaseType3 = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
        boolean z = false;
        boolean z2 = purchaseType2 == purchaseType3;
        String strM211201e = this.f192588b.m211201e(purchaseType3);
        String strM211201e2 = this.f192588b.m211201e(PurchaseType.TYPE_ULTRA_PREMIUM);
        boolean z3 = purchaseType == purchaseType3;
        if (purchaseType != null && wib0.m206578v(purchaseType)) {
            z = true;
        }
        if (zM206578v && z3) {
            if (strM211201e.equals(str)) {
                return;
            }
            this.f192589c.setInAnimation(null);
            this.f192589c.setOutAnimation(null);
            this.f192589c.setCurrentText(strM211201e);
            return;
        }
        if (z2 && z && !strM211201e2.equals(str)) {
            this.f192589c.setInAnimation(null);
            this.f192589c.setOutAnimation(null);
            this.f192589c.setCurrentText(strM211201e2);
        }
    }

    /* JADX INFO: renamed from: m */
    public void m209502m(PurchaseType purchaseType, PurchaseType purchaseType2) {
        if (this.f192589c == null || purchaseType2 == null) {
            return;
        }
        this.f192591e = purchaseType2;
        String strM211201e = this.f192588b.m211201e(purchaseType2);
        if (strM211201e == null) {
            return;
        }
        String strM209495f = m209495f();
        if (strM211201e.equals(strM209495f)) {
            return;
        }
        m209501l(purchaseType, purchaseType2, strM209495f, strM211201e);
        this.f192589c.setText(strM211201e);
        this.f192590d = strM211201e;
    }
}
