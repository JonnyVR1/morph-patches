package p149l;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.vip.intlPrivilege.content.item.IntlPrivilegeDescListItem;
import p147v.VText;

/* JADX INFO: loaded from: classes9.dex */
public final class pyg0 {

    /* JADX INFO: renamed from: a */
    public final Context f151847a;

    /* JADX INFO: renamed from: b */
    public final tb90 f151848b;

    /* JADX INFO: renamed from: c */
    public TextSwitcher f151849c;

    /* JADX INFO: renamed from: d */
    public String f151850d;

    /* JADX INFO: renamed from: e */
    public PurchaseType f151851e;

    /* JADX INFO: renamed from: l.pyg0$a */
    public static class C19376a {

        /* JADX INFO: renamed from: a */
        public final int f151852a;

        /* JADX INFO: renamed from: b */
        public final float f151853b;

        /* JADX INFO: renamed from: c */
        public final int f151854c;

        /* JADX INFO: renamed from: d */
        public final Typeface f151855d;

        public C19376a(int i, float f, int i2, Typeface typeface) {
            this.f151852a = i;
            this.f151853b = f;
            this.f151854c = i2;
            this.f151855d = typeface;
        }
    }

    public pyg0(Context context, tb90 tb90Var) {
        this.f151847a = context;
        this.f151848b = tb90Var;
    }

    /* JADX INFO: renamed from: b */
    public final FrameLayout.LayoutParams m172118b(ViewGroup.LayoutParams layoutParams) {
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
    public TextSwitcher m172119c(IntlPrivilegeDescListItem intlPrivilegeDescListItem, PurchaseType purchaseType) {
        ViewGroup viewGroup;
        VText vText = intlPrivilegeDescListItem.f37153c;
        if (vText == null || intlPrivilegeDescListItem.f37152b == null || (viewGroup = (ViewGroup) vText.getParent()) == null) {
            return null;
        }
        VText vText2 = intlPrivilegeDescListItem.f37153c;
        int iIndexOfChild = viewGroup.indexOfChild(vText2);
        ViewGroup.LayoutParams layoutParams = vText2.getLayoutParams();
        C19376a c19376aM172121e = m172121e(vText2);
        TextSwitcher textSwitcher = new TextSwitcher(this.f151847a);
        this.f151849c = textSwitcher;
        textSwitcher.setLayoutParams(m172118b(layoutParams));
        this.f151849c.setFactory(m172120d(c19376aM172121e));
        m172124h(intlPrivilegeDescListItem, purchaseType);
        viewGroup.removeViewAt(iIndexOfChild);
        viewGroup.addView(this.f151849c, iIndexOfChild);
        this.f151851e = purchaseType;
        return this.f151849c;
    }

    /* JADX INFO: renamed from: d */
    public final ViewSwitcher.ViewFactory m172120d(final C19376a c19376a) {
        return new ViewSwitcher.ViewFactory() { // from class: l.oyg0
            @Override // android.widget.ViewSwitcher.ViewFactory
            public final View makeView() {
                return this.f146324a.m172125i(c19376a);
            }
        };
    }

    /* JADX INFO: renamed from: e */
    public final C19376a m172121e(TextView textView) {
        return new C19376a(textView.getCurrentTextColor(), textView.getTextSize() / this.f151847a.getResources().getDisplayMetrics().scaledDensity, textView.getGravity(), textView.getTypeface());
    }

    /* JADX INFO: renamed from: f */
    public final String m172122f() {
        TextSwitcher textSwitcher = this.f151849c;
        if (textSwitcher == null) {
            return "";
        }
        View currentView = textSwitcher.getCurrentView();
        return currentView instanceof TextView ? ((TextView) currentView).getText().toString() : "";
    }

    /* JADX INFO: renamed from: g */
    public TextSwitcher m172123g() {
        return this.f151849c;
    }

    /* JADX INFO: renamed from: h */
    public final void m172124h(IntlPrivilegeDescListItem intlPrivilegeDescListItem, PurchaseType purchaseType) {
        String strM187849e = this.f151848b.m187849e(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE);
        String strM187849e2 = this.f151848b.m187849e(PurchaseType.TYPE_ULTRA_PREMIUM);
        if (strM187849e == null || strM187849e2 == null) {
            return;
        }
        String string = this.f151850d;
        if (string == null) {
            string = intlPrivilegeDescListItem.f37153c.getText().toString();
        }
        boolean zEquals = strM187849e.equals(string);
        boolean zEquals2 = strM187849e2.equals(string);
        if (!zEquals && !zEquals2) {
            string = sab0.m182904v(purchaseType) ? strM187849e2 : strM187849e;
        }
        this.f151849c.setCurrentText(string);
        if (zEquals) {
            strM187849e = strM187849e2;
        }
        this.f151849c.setText(strM187849e);
        this.f151849c.setCurrentText(string);
        this.f151850d = string;
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ View m172125i(C19376a c19376a) {
        VText vText = new VText(this.f151847a);
        vText.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        vText.setTextColor(c19376a.f151852a);
        vText.setTextSize(2, c19376a.f151853b);
        Typeface typeface = c19376a.f151855d;
        if (typeface != null) {
            vText.setTypeface(typeface, 1);
        } else {
            vText.setTypeface(null, 1);
        }
        vText.setGravity(c19376a.f151854c);
        vText.setEllipsize(TextUtils.TruncateAt.END);
        vText.setLines(1);
        return vText;
    }

    /* JADX INFO: renamed from: j */
    public void m172126j(PurchaseType purchaseType, PurchaseType purchaseType2) {
        if (this.f151849c == null) {
            return;
        }
        PurchaseType purchaseType3 = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
        boolean z = false;
        boolean z2 = purchaseType == purchaseType3 && sab0.m182904v(purchaseType2);
        if (sab0.m182904v(purchaseType) && purchaseType2 == purchaseType3) {
            z = true;
        }
        if (z2 || z) {
            String strM187849e = this.f151848b.m187849e(purchaseType3);
            String strM187849e2 = this.f151848b.m187849e(PurchaseType.TYPE_ULTRA_PREMIUM);
            if (strM187849e == null || strM187849e2 == null) {
                return;
            }
            if (!z2) {
                strM187849e = strM187849e2;
            }
            if (strM187849e.equals(m172122f())) {
                return;
            }
            this.f151849c.setInAnimation(null);
            this.f151849c.setOutAnimation(null);
            this.f151849c.setCurrentText(strM187849e);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m172127k(String str) {
        this.f151850d = str;
    }

    /* JADX INFO: renamed from: l */
    public final void m172128l(PurchaseType purchaseType, PurchaseType purchaseType2, String str, String str2) {
        boolean zM182904v = sab0.m182904v(purchaseType2);
        PurchaseType purchaseType3 = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
        boolean z = false;
        boolean z2 = purchaseType2 == purchaseType3;
        String strM187849e = this.f151848b.m187849e(purchaseType3);
        String strM187849e2 = this.f151848b.m187849e(PurchaseType.TYPE_ULTRA_PREMIUM);
        boolean z3 = purchaseType == purchaseType3;
        if (purchaseType != null && sab0.m182904v(purchaseType)) {
            z = true;
        }
        if (zM182904v && z3) {
            if (strM187849e.equals(str)) {
                return;
            }
            this.f151849c.setInAnimation(null);
            this.f151849c.setOutAnimation(null);
            this.f151849c.setCurrentText(strM187849e);
            return;
        }
        if (z2 && z && !strM187849e2.equals(str)) {
            this.f151849c.setInAnimation(null);
            this.f151849c.setOutAnimation(null);
            this.f151849c.setCurrentText(strM187849e2);
        }
    }

    /* JADX INFO: renamed from: m */
    public void m172129m(PurchaseType purchaseType, PurchaseType purchaseType2) {
        if (this.f151849c == null || purchaseType2 == null) {
            return;
        }
        this.f151851e = purchaseType2;
        String strM187849e = this.f151848b.m187849e(purchaseType2);
        if (strM187849e == null) {
            return;
        }
        String strM172122f = m172122f();
        if (strM187849e.equals(strM172122f)) {
            return;
        }
        m172128l(purchaseType, purchaseType2, strM172122f, strM187849e);
        this.f151849c.setText(strM187849e);
        this.f151850d = strM187849e;
    }
}
