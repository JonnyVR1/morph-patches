package p006l;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.p000p1.mobile.putong.core.p004ui.vip.intlPrivilege.content.item.IntlPrivilegeDescListItem;
import com.p1.mobile.putong.core.data.PurchaseType;
import l.sab0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public final class pyg0 {

    /* JADX INFO: renamed from: a */
    public final Context f19446a;

    /* JADX INFO: renamed from: b */
    public final tb90 f19447b;

    /* JADX INFO: renamed from: c */
    public TextSwitcher f19448c;

    /* JADX INFO: renamed from: d */
    public String f19449d;

    /* JADX INFO: renamed from: e */
    public PurchaseType f19450e;

    /* JADX INFO: renamed from: l.pyg0$a */
    public static class C1155a {

        /* JADX INFO: renamed from: a */
        public final int f19451a;

        /* JADX INFO: renamed from: b */
        public final float f19452b;

        /* JADX INFO: renamed from: c */
        public final int f19453c;

        /* JADX INFO: renamed from: d */
        public final Typeface f19454d;

        public C1155a(int i, float f, int i2, Typeface typeface) {
            this.f19451a = i;
            this.f19452b = f;
            this.f19453c = i2;
            this.f19454d = typeface;
        }
    }

    public pyg0(Context context, tb90 tb90Var) {
        this.f19446a = context;
        this.f19447b = tb90Var;
    }

    /* JADX INFO: renamed from: b */
    public final FrameLayout.LayoutParams m21835b(ViewGroup.LayoutParams layoutParams) {
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
    public TextSwitcher m21836c(IntlPrivilegeDescListItem intlPrivilegeDescListItem, PurchaseType purchaseType) {
        ViewGroup viewGroup;
        VText vText = intlPrivilegeDescListItem.f6934c;
        if (vText == null || intlPrivilegeDescListItem.f6933b == null || (viewGroup = (ViewGroup) vText.getParent()) == null) {
            return null;
        }
        VText vText2 = intlPrivilegeDescListItem.f6934c;
        int iIndexOfChild = viewGroup.indexOfChild(vText2);
        ViewGroup.LayoutParams layoutParams = vText2.getLayoutParams();
        C1155a c1155aM21838e = m21838e(vText2);
        TextSwitcher textSwitcher = new TextSwitcher(this.f19446a);
        this.f19448c = textSwitcher;
        textSwitcher.setLayoutParams(m21835b(layoutParams));
        this.f19448c.setFactory(m21837d(c1155aM21838e));
        m21841h(intlPrivilegeDescListItem, purchaseType);
        viewGroup.removeViewAt(iIndexOfChild);
        viewGroup.addView(this.f19448c, iIndexOfChild);
        this.f19450e = purchaseType;
        return this.f19448c;
    }

    /* JADX INFO: renamed from: d */
    public final ViewSwitcher.ViewFactory m21837d(final C1155a c1155a) {
        return new ViewSwitcher.ViewFactory() { // from class: l.oyg0
            @Override // android.widget.ViewSwitcher.ViewFactory
            public final View makeView() {
                return this.f18496a.m21842i(c1155a);
            }
        };
    }

    /* JADX INFO: renamed from: e */
    public final C1155a m21838e(TextView textView) {
        return new C1155a(textView.getCurrentTextColor(), textView.getTextSize() / this.f19446a.getResources().getDisplayMetrics().scaledDensity, textView.getGravity(), textView.getTypeface());
    }

    /* JADX INFO: renamed from: f */
    public final String m21839f() {
        TextSwitcher textSwitcher = this.f19448c;
        if (textSwitcher == null) {
            return "";
        }
        View currentView = textSwitcher.getCurrentView();
        return currentView instanceof TextView ? ((TextView) currentView).getText().toString() : "";
    }

    /* JADX INFO: renamed from: g */
    public TextSwitcher m21840g() {
        return this.f19448c;
    }

    /* JADX INFO: renamed from: h */
    public final void m21841h(IntlPrivilegeDescListItem intlPrivilegeDescListItem, PurchaseType purchaseType) {
        String strM24603e = this.f19447b.m24603e(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE);
        String strM24603e2 = this.f19447b.m24603e(PurchaseType.TYPE_ULTRA_PREMIUM);
        if (strM24603e == null || strM24603e2 == null) {
            return;
        }
        String string = this.f19449d;
        if (string == null) {
            string = intlPrivilegeDescListItem.f6934c.getText().toString();
        }
        boolean zEquals = strM24603e.equals(string);
        boolean zEquals2 = strM24603e2.equals(string);
        if (!zEquals && !zEquals2) {
            string = sab0.v(purchaseType) ? strM24603e2 : strM24603e;
        }
        this.f19448c.setCurrentText(string);
        if (zEquals) {
            strM24603e = strM24603e2;
        }
        this.f19448c.setText(strM24603e);
        this.f19448c.setCurrentText(string);
        this.f19449d = string;
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ View m21842i(C1155a c1155a) {
        VText vText = new VText(this.f19446a);
        vText.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        vText.setTextColor(c1155a.f19451a);
        vText.setTextSize(2, c1155a.f19452b);
        Typeface typeface = c1155a.f19454d;
        if (typeface != null) {
            vText.setTypeface(typeface, 1);
        } else {
            vText.setTypeface((Typeface) null, 1);
        }
        vText.setGravity(c1155a.f19453c);
        vText.setEllipsize(TextUtils.TruncateAt.END);
        vText.setLines(1);
        return vText;
    }

    /* JADX INFO: renamed from: j */
    public void m21843j(PurchaseType purchaseType, PurchaseType purchaseType2) {
        if (this.f19448c == null) {
            return;
        }
        PurchaseType purchaseType3 = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
        boolean z = false;
        boolean z2 = purchaseType == purchaseType3 && sab0.v(purchaseType2);
        if (sab0.v(purchaseType) && purchaseType2 == purchaseType3) {
            z = true;
        }
        if (z2 || z) {
            String strM24603e = this.f19447b.m24603e(purchaseType3);
            String strM24603e2 = this.f19447b.m24603e(PurchaseType.TYPE_ULTRA_PREMIUM);
            if (strM24603e == null || strM24603e2 == null) {
                return;
            }
            if (!z2) {
                strM24603e = strM24603e2;
            }
            if (strM24603e.equals(m21839f())) {
                return;
            }
            this.f19448c.setInAnimation(null);
            this.f19448c.setOutAnimation(null);
            this.f19448c.setCurrentText(strM24603e);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m21844k(String str) {
        this.f19449d = str;
    }

    /* JADX INFO: renamed from: l */
    public final void m21845l(PurchaseType purchaseType, PurchaseType purchaseType2, String str, String str2) {
        boolean zV = sab0.v(purchaseType2);
        PurchaseType purchaseType3 = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
        boolean z = false;
        boolean z2 = purchaseType2 == purchaseType3;
        String strM24603e = this.f19447b.m24603e(purchaseType3);
        String strM24603e2 = this.f19447b.m24603e(PurchaseType.TYPE_ULTRA_PREMIUM);
        boolean z3 = purchaseType == purchaseType3;
        if (purchaseType != null && sab0.v(purchaseType)) {
            z = true;
        }
        if (zV && z3) {
            if (strM24603e.equals(str)) {
                return;
            }
            this.f19448c.setInAnimation(null);
            this.f19448c.setOutAnimation(null);
            this.f19448c.setCurrentText(strM24603e);
            return;
        }
        if (z2 && z && !strM24603e2.equals(str)) {
            this.f19448c.setInAnimation(null);
            this.f19448c.setOutAnimation(null);
            this.f19448c.setCurrentText(strM24603e2);
        }
    }

    /* JADX INFO: renamed from: m */
    public void m21846m(PurchaseType purchaseType, PurchaseType purchaseType2) {
        if (this.f19448c == null || purchaseType2 == null) {
            return;
        }
        this.f19450e = purchaseType2;
        String strM24603e = this.f19447b.m24603e(purchaseType2);
        if (strM24603e == null) {
            return;
        }
        String strM21839f = m21839f();
        if (strM24603e.equals(strM21839f)) {
            return;
        }
        m21845l(purchaseType, purchaseType2, strM21839f, strM24603e);
        this.f19448c.setText(strM24603e);
        this.f19449d = strM24603e;
    }
}
