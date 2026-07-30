package com.p000p1.mobile.putong.core.p004ui.purchase.showcase;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.ui.purchase.d;
import com.p1.mobile.putong.data.tenum.TEnum;
import java.util.List;
import l.b1c0;
import l.d3c0;
import l.eqh0;
import l.ge5;
import l.m6h0;
import l.p2b0;
import l.q1e;
import l.t100;
import l.vc40;
import l.vwb;
import l.xdl0;
import p006l.cmd0;
import p006l.dsa;
import p006l.n5c;
import p006l.uc40;
import v.VText;
import v.VText_AutoFit;
import v.text.CustomTypefaceSpan;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class NewUITotalPricePurchaseSectionView1 extends AnimBorderSectionView {

    /* JADX INFO: renamed from: b */
    public LinearLayout f4989b;

    /* JADX INFO: renamed from: c */
    public VText f4990c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f4991d;

    /* JADX INFO: renamed from: e */
    public VText_AutoFit f4992e;

    /* JADX INFO: renamed from: f */
    public VText_AutoFit f4993f;

    /* JADX INFO: renamed from: g */
    public VText_AutoFit f4994g;

    /* JADX INFO: renamed from: h */
    public VText f4995h;

    /* JADX INFO: renamed from: i */
    public boolean f4996i;

    /* JADX INFO: renamed from: j */
    public boolean f4997j;

    /* JADX INFO: renamed from: k */
    public boolean f4998k;

    /* JADX INFO: renamed from: l */
    public cmd0 f4999l;

    /* JADX INFO: renamed from: m */
    public int f5000m;

    /* JADX INFO: renamed from: n */
    public SpannableStringBuilder f5001n;

    /* JADX INFO: renamed from: o */
    public SpannableStringBuilder f5002o;

    /* JADX INFO: renamed from: p */
    public boolean f5003p;

    public NewUITotalPricePurchaseSectionView1(@NonNull Context context) {
        super(context);
        this.f4996i = false;
        this.f4997j = false;
        this.f4998k = false;
        this.f4999l = new cmd0(0);
        this.f5003p = false;
    }

    /* JADX INFO: renamed from: g */
    private SpannableStringBuilder m7674g(boolean z, int i, String str) {
        int color = z ? this.f5000m : getResources().getColor(b1c0.i);
        Typeface typefaceC = z ? eqh0.c(3) : eqh0.c(2);
        if (this.f5003p) {
            color = z ? getResources().getColor(b1c0.g) : getResources().getColor(b1c0.j);
            typefaceC = eqh0.c(2);
        }
        String strValueOf = String.valueOf(i);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strValueOf + str);
        CustomTypefaceSpan customTypefaceSpan = new CustomTypefaceSpan("sans-serif", typefaceC, color, z ? t100.t : t100.s);
        customTypefaceSpan.b(0);
        spannableStringBuilder.setSpan(customTypefaceSpan, 0, strValueOf.length(), 33);
        spannableStringBuilder.setSpan(new CustomTypefaceSpan("sans-serif", eqh0.c(2), color, t100.d(13.0f)), strValueOf.length(), strValueOf.length() + str.length(), 33);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: n */
    private void m7675n(d.a aVar, boolean z) {
        n5c n5cVarI = aVar.i();
        if (n5cVarI instanceof uc40) {
            uc40 uc40Var = (uc40) n5cVarI;
            this.f4996i = uc40Var.m25173a();
            this.f4997j = uc40Var.m25174b();
            this.f4999l = dsa.m14205m(aVar);
        }
        this.f4998k = z && !TextUtils.isEmpty(aVar.r()) && this.f4997j;
        this.f5000m = m7684k(aVar.f().toString());
        if (this.f4999l.f9731a) {
            this.f5001n = m7681h(true);
            this.f5002o = m7681h(false);
        } else {
            this.f5001n = m7674g(true, aVar.w(), aVar.x());
            this.f5002o = m7674g(false, aVar.w(), aVar.x());
        }
    }

    /* JADX INFO: renamed from: q */
    private void m7676q(d.a aVar, boolean z) {
        this.f4989b.setBackgroundResource(m7685l(aVar, z));
        xdl0.M(this.f4995h, !TextUtils.isEmpty(aVar.r()) || (aVar.H() && !TextUtils.isEmpty(aVar.r())));
        this.f4995h.setBackgroundResource(m7682i(aVar, z));
        this.f4995h.setTextColor(m7683j(aVar, z));
        boolean zM7686m = m7686m(aVar);
        VText vText = this.f4995h;
        if (zM7686m) {
            vText.setText(aVar.c());
        } else {
            vText.setText(aVar.r());
        }
        boolean zN = m6h0.n(aVar.s());
        if (zN) {
            this.f4990c.setText(m7678d(aVar.s(), z));
        } else if (p2b0.h().z() && aVar.s().noneRenewable()) {
            this.f4990c.setText(m7680f(z, aVar.s()));
        } else if (this.f4998k && aVar.s().isBelongPromotion("lowPrice3Month")) {
            this.f4990c.setText(m7679e(z));
        } else {
            this.f4990c.setText(z ? this.f5001n : this.f5002o);
        }
        if (zN) {
            xdl0.M0(this.f4993f, false);
            xdl0.M0(this.f4992e, false);
        } else if (this.f4999l.f9731a || !(this.f4996i || this.f4997j)) {
            xdl0.M0(this.f4993f, false);
            xdl0.M0(this.f4992e, true);
            this.f4992e.setText(aVar.B());
        } else {
            this.f4992e.setText(aVar.B());
            this.f4993f.setText(q1e.INSTANCE.g(aVar.s()));
            VText_AutoFit vText_AutoFit = this.f4993f;
            if (z) {
                xdl0.M0(vText_AutoFit, true);
                xdl0.M0(this.f4992e, false);
            } else {
                xdl0.M0(vText_AutoFit, false);
                xdl0.M0(this.f4992e, true);
                this.f4992e.requestLayout();
            }
        }
        if (m7686m(aVar)) {
            this.f4992e.setText(aVar.r());
        }
        VText_AutoFit vText_AutoFit2 = this.f4994g;
        vText_AutoFit2.setPaintFlags(vText_AutoFit2.getPaintFlags() & (-17));
        if (TEnum.equals(aVar.s().category, "femaleVip") && (aVar.s().noneRenewable() || aVar.I())) {
            boolean zI = aVar.I();
            VText_AutoFit vText_AutoFit3 = this.f4994g;
            if (zI) {
                vText_AutoFit3.setText(String.format("%s%s", aVar.h(), aVar.l()));
            } else {
                vText_AutoFit3.setText(aVar.A());
            }
            this.f4994g.getPaint().setFlags(17);
        } else if (TEnum.equals(aVar.s().category, "youthVip") && aVar.s().noneRenewable()) {
            this.f4994g.setText(aVar.A());
            this.f4994g.getPaint().setFlags(17);
        } else if (m6h0.n(aVar.s())) {
            this.f4994g.setTextColor(this.f5000m);
            this.f4994g.setText("1元秒杀");
        } else {
            boolean z2 = this.f4999l.f9731a;
            VText_AutoFit vText_AutoFit4 = this.f4994g;
            if (z2) {
                vText_AutoFit4.setText(String.format("%s%s", aVar.h(), aVar.l()));
                this.f4994g.getPaint().setFlags(17);
            } else {
                vText_AutoFit4.setText(aVar.A());
            }
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f4990c.getLayoutParams();
        if (!aVar.s().monthly() || !aVar.s().noneRenewable() || TEnum.equals(aVar.s().category, "femaleVip") || TEnum.equals(aVar.s().category, "youthVip")) {
            xdl0.M(this.f4991d, true);
            if (zN) {
                layoutParams.topMargin = t100.d(32.0f);
            } else {
                int i = layoutParams.topMargin;
                int i2 = t100.o;
                if (i != i2) {
                    layoutParams.topMargin = i2;
                }
            }
        } else {
            xdl0.M(this.f4991d, false);
            layoutParams.topMargin = t100.v;
        }
        this.f4990c.setLayoutParams(layoutParams);
    }

    @Override // com.p000p1.mobile.putong.core.p004ui.purchase.showcase.AbsPurchaseSectionView
    /* JADX INFO: renamed from: a */
    public void mo7659a(boolean z, boolean z2, d.a aVar) {
        m7675n(aVar, z2);
        m7688p(z, aVar);
        m7676q(aVar, z);
        m7689r(aVar, z);
    }

    /* JADX INFO: renamed from: c */
    public final void m7677c(View view) {
        vc40.a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final CharSequence m7678d(Merchandise merchandise, boolean z) {
        int color;
        if (z) {
            color = TEnum.equals(merchandise.category, "tttVip") ? Color.parseColor("#DE9551") : Color.parseColor("#F27310");
        } else {
            color = Color.parseColor("#66000000");
        }
        if (this.f5003p) {
            color = z ? getResources().getColor(b1c0.g) : getResources().getColor(b1c0.j);
        }
        Typeface typefaceC = eqh0.c(3);
        Typeface typefaceC2 = eqh0.c(2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("7天");
        CustomTypefaceSpan customTypefaceSpan = new CustomTypefaceSpan("sans-serif", typefaceC, color, z ? t100.t : t100.s);
        customTypefaceSpan.b(0);
        spannableStringBuilder.setSpan(customTypefaceSpan, 0, 1, 33);
        spannableStringBuilder.setSpan(new CustomTypefaceSpan("sans-serif", typefaceC2, color, t100.d(13.0f)), 1, 2, 33);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: e */
    public final SpannableStringBuilder m7679e(boolean z) {
        int color = z ? -16777216 : getResources().getColor(b1c0.i);
        Typeface typefaceC = z ? eqh0.c(3) : eqh0.c(2);
        if (this.f5003p) {
            color = z ? getResources().getColor(b1c0.g) : getResources().getColor(b1c0.j);
            typefaceC = eqh0.c(2);
        }
        int iD = t100.d(13.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("前3月");
        int length = spannableStringBuilder.length();
        CustomTypefaceSpan customTypefaceSpan = new CustomTypefaceSpan("sans-serif", typefaceC, color, z ? t100.t : t100.s);
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(iD), 0, 1, 33);
        spannableStringBuilder.setSpan(new StyleSpan(0), 0, 1, 33);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(color), 0, 1, 33);
        spannableStringBuilder.setSpan(customTypefaceSpan, 1, 2, 33);
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(iD), 2, length, 33);
        spannableStringBuilder.setSpan(new StyleSpan(0), 2, length, 33);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(color), 2, length, 33);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: f */
    public final SpannableStringBuilder m7680f(boolean z, Merchandise merchandise) {
        int color = z ? this.f5000m : getResources().getColor(b1c0.i);
        if (this.f5003p) {
            color = z ? getResources().getColor(b1c0.g) : getResources().getColor(b1c0.j);
        }
        String str = merchandise.quantityName() + "卡";
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        CustomTypefaceSpan customTypefaceSpan = this.f5003p ? new CustomTypefaceSpan("sans-serif", eqh0.c(2), color, t100.q) : new CustomTypefaceSpan("sans-serif", eqh0.c(3), color, t100.q);
        customTypefaceSpan.b(0);
        spannableStringBuilder.setSpan(customTypefaceSpan, 0, str.length(), 33);
        return spannableStringBuilder;
    }

    @Override // com.p000p1.mobile.putong.core.p004ui.purchase.showcase.AnimBorderSectionView
    public List<View> getAnimBackgroundList() {
        return vwb.f0(new View[]{this.f4989b, this.f4995h});
    }

    /* JADX INFO: renamed from: h */
    public final SpannableStringBuilder m7681h(boolean z) {
        int color = z ? this.f5000m : getResources().getColor(b1c0.i);
        Typeface typefaceC = z ? eqh0.c(3) : eqh0.c(2);
        if (this.f5003p) {
            color = z ? getResources().getColor(b1c0.g) : getResources().getColor(b1c0.j);
            typefaceC = eqh0.c(2);
        }
        String str = this.f4999l.m13530b() ? "首3月" : "首6月";
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        CustomTypefaceSpan customTypefaceSpan = new CustomTypefaceSpan("sans-serif", eqh0.c(2), color, t100.d(13.0f));
        customTypefaceSpan.b(0);
        spannableStringBuilder.setSpan(customTypefaceSpan, 0, str.length(), 33);
        spannableStringBuilder.setSpan(new CustomTypefaceSpan("sans-serif", typefaceC, color, z ? t100.t : t100.s), 1, 2, 33);
        return spannableStringBuilder;
    }

    @DrawableRes
    /* JADX INFO: renamed from: i */
    public int m7682i(d.a aVar, boolean z) {
        String string = aVar.f().toString();
        string.getClass();
        switch (string) {
            case "superLikeMembership":
            case "tttVip":
            case "unlimitedSwipes":
            case "roaming":
            case "undoMembership":
                if (z && aVar.H()) {
                    return this.f5003p ? d3c0.e7 : d3c0.O3;
                }
                return d3c0.N3;
            case "youthVip":
                return (z && aVar.H()) ? d3c0.d4 : d3c0.c4;
            case "svipPicksMembership":
            case "svip":
            case "picksMembership":
                if (z && aVar.H()) {
                    return this.f5003p ? d3c0.d7 : d3c0.Y3;
                }
                return d3c0.b4;
            case "femaleVip":
                return (z && aVar.H()) ? d3c0.W3 : d3c0.Z3;
            case "platinum":
                return (z && aVar.H()) ? d3c0.X3 : d3c0.a4;
            default:
                return 0;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
    
        if (r0.equals("svip") != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0054, code lost:
    
        if (r0.equals("svipPicksMembership") != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
    
        return android.graphics.Color.parseColor("#66F27310");
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
    
        if (r0.equals("picksMembership") != false) goto L27;
     */
    @androidx.annotation.ColorInt
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int m7683j(com.p1.mobile.putong.core.ui.purchase.d.a r1, boolean r2) {
        /*
            r0 = this;
            if (r2 == 0) goto L4
            r0 = -1
            return r0
        L4:
            com.p1.mobile.putong.core.data.ProductCategory r0 = r1.f()
            java.lang.String r0 = r0.toString()
            int r1 = r0.hashCode()
            switch(r1) {
                case -2067215576: goto L72;
                case -863315575: goto L6f;
                case -679730102: goto L60;
                case -429915974: goto L5d;
                case -94011970: goto L4e;
                case 3542730: goto L45;
                case 1086939441: goto L36;
                case 1366973465: goto L33;
                case 1848078298: goto L2c;
                case 1874772524: goto L1d;
                case 1905099240: goto L14;
                default: goto L13;
            }
        L13:
            goto L75
        L14:
            java.lang.String r1 = "picksMembership"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L75
            goto L56
        L1d:
            java.lang.String r1 = "platinum"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L75
            java.lang.String r0 = "#66656F7B"
            int r0 = android.graphics.Color.parseColor(r0)
            return r0
        L2c:
            java.lang.String r1 = "undoMembership"
        L2e:
            boolean r0 = r0.equals(r1)
            goto L75
        L33:
            java.lang.String r1 = "roaming"
            goto L2e
        L36:
            java.lang.String r1 = "femaleVip"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L75
            java.lang.String r0 = "#CCF6B7DD"
            int r0 = android.graphics.Color.parseColor(r0)
            return r0
        L45:
            java.lang.String r1 = "svip"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L75
            goto L56
        L4e:
            java.lang.String r1 = "svipPicksMembership"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L75
        L56:
            java.lang.String r0 = "#66F27310"
            int r0 = android.graphics.Color.parseColor(r0)
            return r0
        L5d:
            java.lang.String r1 = "unlimitedSwipes"
            goto L2e
        L60:
            java.lang.String r1 = "youthVip"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L75
            java.lang.String r0 = "#80AFDA86"
            int r0 = android.graphics.Color.parseColor(r0)
            return r0
        L6f:
            java.lang.String r1 = "tttVip"
            goto L2e
        L72:
            java.lang.String r1 = "superLikeMembership"
            goto L2e
        L75:
            java.lang.String r0 = "#66DE9551"
            int r0 = android.graphics.Color.parseColor(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p000p1.mobile.putong.core.p004ui.purchase.showcase.NewUITotalPricePurchaseSectionView1.m7683j(com.p1.mobile.putong.core.ui.purchase.d$a, boolean):int");
    }

    @ColorInt
    /* JADX INFO: renamed from: k */
    public int m7684k(String str) {
        str.getClass();
        switch (str) {
            case "superLikeMembership":
            case "tttVip":
            case "unlimitedSwipes":
            case "roaming":
            case "undoMembership":
                return this.f5003p ? Color.parseColor("#FD8B06") : getResources().getColor(b1c0.V);
            case "youthVip":
                return Color.parseColor("#FF6AA631");
            case "svipPicksMembership":
            case "svip":
            case "picksMembership":
                return getResources().getColor(b1c0.U);
            case "femaleVip":
                return Color.parseColor("#FFE25FB8");
            case "platinum":
                return getResources().getColor(b1c0.T);
            default:
                return getResources().getColor(b1c0.D);
        }
    }

    @DrawableRes
    /* JADX INFO: renamed from: l */
    public int m7685l(d.a aVar, boolean z) {
        String string = aVar.f().toString();
        string.getClass();
        switch (string) {
            case "superLikeMembership":
            case "tttVip":
            case "unlimitedSwipes":
            case "roaming":
            case "undoMembership":
                if (z && aVar.H()) {
                    return this.f5003p ? d3c0.j7 : d3c0.V3;
                }
                return this.f5003p ? d3c0.k7 : d3c0.M3;
            case "youthVip":
                if (z && aVar.H()) {
                    return this.f5003p ? d3c0.l7 : d3c0.K7;
                }
                return this.f5003p ? d3c0.m7 : d3c0.L7;
            case "svipPicksMembership":
            case "svip":
            case "picksMembership":
                if (z && aVar.H()) {
                    return this.f5003p ? d3c0.h7 : d3c0.T3;
                }
                return this.f5003p ? d3c0.i7 : d3c0.K3;
            case "femaleVip":
                if (z && aVar.H()) {
                    return this.f5003p ? d3c0.b7 : d3c0.I7;
                }
                return this.f5003p ? d3c0.c7 : d3c0.J7;
            case "platinum":
                return (z && aVar.H()) ? d3c0.R3 : d3c0.I3;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: m */
    public final boolean m7686m(d.a aVar) {
        return !TEnum.equals(aVar.f(), ProductCategory.get("oDiamond")) && aVar.s().autoRenewable();
    }

    /* JADX INFO: renamed from: o */
    public void m7687o(boolean z) {
        this.f5003p = z;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7677c(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m7688p(boolean z, d.a aVar) {
        this.f4995h.setTypeface(eqh0.c(2));
        VText vText = this.f4995h;
        if (z) {
            vText.setTextSize(12.0f);
            this.f4995h.setTypeface(eqh0.c(3), 1);
            this.f4992e.setTypeface(eqh0.c(2), 0);
            this.f4993f.setTypeface(eqh0.c(2), 0);
            if (!this.f4999l.f9731a) {
                this.f4994g.setTypeface(eqh0.c(3), 1);
            }
            this.f4994g.setTextColor(this.f5000m);
        } else {
            vText.setTextSize(12.0f);
            this.f4995h.setTypeface(eqh0.c(2));
            this.f4992e.setTypeface(eqh0.c(2));
            this.f4994g.setTypeface(eqh0.c(3));
            this.f4994g.setTextColor(ge5.o(this.f5000m, 112));
        }
        if (!this.f4999l.f9731a && (this.f4996i || this.f4997j)) {
            VText_AutoFit vText_AutoFit = this.f4992e;
            if (z) {
                vText_AutoFit.setTextColor(this.f5000m);
                this.f4993f.setTextColor(this.f5000m);
            } else {
                vText_AutoFit.setTextColor(ge5.o(this.f5000m, 128));
                this.f4993f.setTextColor(ge5.o(this.f5000m, 128));
            }
        } else if (!this.f5003p) {
            VText_AutoFit vText_AutoFit2 = this.f4992e;
            if (z) {
                vText_AutoFit2.setTextColor(this.f5000m);
            } else {
                vText_AutoFit2.setTextColor(getResources().getColor(b1c0.i));
            }
        } else if (z) {
            this.f4992e.setTextColor(this.f5000m);
        } else {
            int color = Color.parseColor("#99DE9551");
            if (TEnum.equals(ProductCategory.get("youthVip"), aVar.f()) || TEnum.equals(ProductCategory.get("femaleVip"), aVar.f())) {
                color = ge5.o(this.f5000m, 128);
            } else if (TEnum.equals(ProductCategory.get("svip"), aVar.f())) {
                color = Color.parseColor("#99F27310");
            }
            this.f4992e.setTextColor(color);
        }
        this.f4993f.setTypeface(eqh0.c(2));
    }

    /* JADX INFO: renamed from: r */
    public final void m7689r(d.a aVar, boolean z) {
        if (!z) {
            this.f4990c.setScaleX(1.0f);
            this.f4990c.setScaleY(1.0f);
            this.f4992e.setScaleX(1.0f);
            this.f4992e.setScaleY(1.0f);
            this.f4993f.setScaleX(1.0f);
            this.f4993f.setScaleY(1.0f);
            this.f4994g.setScaleX(1.0f);
            this.f4994g.setScaleY(1.0f);
            return;
        }
        if (!p2b0.h().z() && aVar.s().noneRenewable()) {
            this.f4990c.setScaleX(1.0714f);
            this.f4990c.setScaleY(1.0714f);
        }
        if (this.f4999l.f9731a || !this.f4996i) {
            this.f4992e.setScaleX(1.0714f);
            this.f4992e.setScaleY(1.0714f);
            this.f4993f.setScaleX(1.0714f);
            this.f4993f.setScaleY(1.0714f);
        } else {
            this.f4992e.setScaleX(1.2143f);
            this.f4992e.setScaleY(1.2143f);
            this.f4993f.setScaleX(1.2143f);
            this.f4993f.setScaleY(1.2143f);
        }
        this.f4994g.setScaleX(1.0625f);
        this.f4994g.setScaleY(1.0625f);
    }

    public NewUITotalPricePurchaseSectionView1(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4996i = false;
        this.f4997j = false;
        this.f4998k = false;
        this.f4999l = new cmd0(0);
        this.f5003p = false;
    }
}
