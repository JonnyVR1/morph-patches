package com.p046p1.mobile.putong.core.p053ui.purchase.showcase;

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
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.MonetizationPromotionsId;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import java.util.List;
import p147v.VText;
import p147v.VText_AutoFit;
import p147v.text.CustomTypefaceSpan;
import p149l.b1c0;
import p149l.cmd0;
import p149l.d3c0;
import p149l.dsa;
import p149l.eqh0;
import p149l.ge5;
import p149l.m6h0;
import p149l.n5c;
import p149l.p2b0;
import p149l.q1e;
import p149l.t100;
import p149l.uc40;
import p149l.vc40;
import p149l.vwb;
import p149l.xdl0;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes9.dex */
public class NewUITotalPricePurchaseSectionView1 extends AnimBorderSectionView {

    /* JADX INFO: renamed from: b */
    public LinearLayout f35208b;

    /* JADX INFO: renamed from: c */
    public VText f35209c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f35210d;

    /* JADX INFO: renamed from: e */
    public VText_AutoFit f35211e;

    /* JADX INFO: renamed from: f */
    public VText_AutoFit f35212f;

    /* JADX INFO: renamed from: g */
    public VText_AutoFit f35213g;

    /* JADX INFO: renamed from: h */
    public VText f35214h;

    /* JADX INFO: renamed from: i */
    public boolean f35215i;

    /* JADX INFO: renamed from: j */
    public boolean f35216j;

    /* JADX INFO: renamed from: k */
    public boolean f35217k;

    /* JADX INFO: renamed from: l */
    public cmd0 f35218l;

    /* JADX INFO: renamed from: m */
    public int f35219m;

    /* JADX INFO: renamed from: n */
    public SpannableStringBuilder f35220n;

    /* JADX INFO: renamed from: o */
    public SpannableStringBuilder f35221o;

    /* JADX INFO: renamed from: p */
    public boolean f35222p;

    public NewUITotalPricePurchaseSectionView1(@NonNull Context context) {
        super(context);
        this.f35215i = false;
        this.f35216j = false;
        this.f35217k = false;
        this.f35218l = new cmd0(0);
        this.f35222p = false;
    }

    /* JADX INFO: renamed from: g */
    private SpannableStringBuilder m54339g(boolean z, int i, String str) {
        int color = z ? this.f35219m : getResources().getColor(b1c0.f72553i);
        Typeface typefaceM117752c = z ? eqh0.m117752c(3) : eqh0.m117752c(2);
        if (this.f35222p) {
            color = z ? getResources().getColor(b1c0.f72549g) : getResources().getColor(b1c0.f72555j);
            typefaceM117752c = eqh0.m117752c(2);
        }
        String strValueOf = String.valueOf(i);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strValueOf + str);
        CustomTypefaceSpan customTypefaceSpan = new CustomTypefaceSpan("sans-serif", typefaceM117752c, color, z ? t100.f167271t : t100.f167270s);
        customTypefaceSpan.m223785b(0);
        spannableStringBuilder.setSpan(customTypefaceSpan, 0, strValueOf.length(), 33);
        spannableStringBuilder.setSpan(new CustomTypefaceSpan("sans-serif", eqh0.m117752c(2), color, t100.m186890d(13.0f)), strValueOf.length(), strValueOf.length() + str.length(), 33);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: n */
    private void m54340n(C8765d.a aVar, boolean z) {
        n5c n5cVarM53585i = aVar.m53585i();
        if (n5cVarM53585i instanceof uc40) {
            uc40 uc40Var = (uc40) n5cVarM53585i;
            this.f35215i = uc40Var.m192991a();
            this.f35216j = uc40Var.m192992b();
            this.f35218l = dsa.m113440m(aVar);
        }
        this.f35217k = z && !TextUtils.isEmpty(aVar.m53600r()) && this.f35216j;
        this.f35219m = m54349k(aVar.m53579f().toString());
        if (this.f35218l.f81523a) {
            this.f35220n = m54346h(true);
            this.f35221o = m54346h(false);
        } else {
            this.f35220n = m54339g(true, aVar.m53605w(), aVar.m53606x());
            this.f35221o = m54339g(false, aVar.m53605w(), aVar.m53606x());
        }
    }

    /* JADX INFO: renamed from: q */
    private void m54341q(C8765d.a aVar, boolean z) {
        this.f35208b.setBackgroundResource(m54350l(aVar, z));
        xdl0.m208344M(this.f35214h, !TextUtils.isEmpty(aVar.m53600r()) || (aVar.m53552H() && !TextUtils.isEmpty(aVar.m53600r())));
        this.f35214h.setBackgroundResource(m54347i(aVar, z));
        this.f35214h.setTextColor(m54348j(aVar, z));
        boolean zM54351m = m54351m(aVar);
        VText vText = this.f35214h;
        if (zM54351m) {
            vText.setText(aVar.m53573c());
        } else {
            vText.setText(aVar.m53600r());
        }
        boolean zM153228n = m6h0.m153228n(aVar.m53601s());
        if (zM153228n) {
            this.f35209c.setText(m54343d(aVar.m53601s(), z));
        } else if (p2b0.m167133h().m167157z() && aVar.m53601s().noneRenewable()) {
            this.f35209c.setText(m54345f(z, aVar.m53601s()));
        } else if (this.f35217k && aVar.m53601s().isBelongPromotion(MonetizationPromotionsId.lowPrice3Month)) {
            this.f35209c.setText(m54344e(z));
        } else {
            this.f35209c.setText(z ? this.f35220n : this.f35221o);
        }
        if (zM153228n) {
            xdl0.m208345M0(this.f35212f, false);
            xdl0.m208345M0(this.f35211e, false);
        } else if (this.f35218l.f81523a || !(this.f35215i || this.f35216j)) {
            xdl0.m208345M0(this.f35212f, false);
            xdl0.m208345M0(this.f35211e, true);
            this.f35211e.setText(aVar.m53546B());
        } else {
            this.f35211e.setText(aVar.m53546B());
            this.f35212f.setText(q1e.INSTANCE.m172392g(aVar.m53601s()));
            VText_AutoFit vText_AutoFit = this.f35212f;
            if (z) {
                xdl0.m208345M0(vText_AutoFit, true);
                xdl0.m208345M0(this.f35211e, false);
            } else {
                xdl0.m208345M0(vText_AutoFit, false);
                xdl0.m208345M0(this.f35211e, true);
                this.f35211e.requestLayout();
            }
        }
        if (m54351m(aVar)) {
            this.f35211e.setText(aVar.m53600r());
        }
        VText_AutoFit vText_AutoFit2 = this.f35213g;
        vText_AutoFit2.setPaintFlags(vText_AutoFit2.getPaintFlags() & (-17));
        if (TEnum.equals(aVar.m53601s().category, "femaleVip") && (aVar.m53601s().noneRenewable() || aVar.m53553I())) {
            boolean zM53553I = aVar.m53553I();
            VText_AutoFit vText_AutoFit3 = this.f35213g;
            if (zM53553I) {
                vText_AutoFit3.setText(String.format("%s%s", aVar.m53583h(), aVar.m53591l()));
            } else {
                vText_AutoFit3.setText(aVar.m53545A());
            }
            this.f35213g.getPaint().setFlags(17);
        } else if (TEnum.equals(aVar.m53601s().category, "youthVip") && aVar.m53601s().noneRenewable()) {
            this.f35213g.setText(aVar.m53545A());
            this.f35213g.getPaint().setFlags(17);
        } else if (m6h0.m153228n(aVar.m53601s())) {
            this.f35213g.setTextColor(this.f35219m);
            this.f35213g.setText("1元秒杀");
        } else {
            boolean z2 = this.f35218l.f81523a;
            VText_AutoFit vText_AutoFit4 = this.f35213g;
            if (z2) {
                vText_AutoFit4.setText(String.format("%s%s", aVar.m53583h(), aVar.m53591l()));
                this.f35213g.getPaint().setFlags(17);
            } else {
                vText_AutoFit4.setText(aVar.m53545A());
            }
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f35209c.getLayoutParams();
        if (!aVar.m53601s().monthly() || !aVar.m53601s().noneRenewable() || TEnum.equals(aVar.m53601s().category, "femaleVip") || TEnum.equals(aVar.m53601s().category, "youthVip")) {
            xdl0.m208344M(this.f35210d, true);
            if (zM153228n) {
                layoutParams.topMargin = t100.m186890d(32.0f);
            } else {
                int i = layoutParams.topMargin;
                int i2 = t100.f167266o;
                if (i != i2) {
                    layoutParams.topMargin = i2;
                }
            }
        } else {
            xdl0.m208344M(this.f35210d, false);
            layoutParams.topMargin = t100.f167273v;
        }
        this.f35209c.setLayoutParams(layoutParams);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.purchase.showcase.AbsPurchaseSectionView
    /* JADX INFO: renamed from: a */
    public void mo54324a(boolean z, boolean z2, C8765d.a aVar) {
        m54340n(aVar, z2);
        m54353p(z, aVar);
        m54341q(aVar, z);
        m54354r(aVar, z);
    }

    /* JADX INFO: renamed from: c */
    public final void m54342c(View view) {
        vc40.m197738a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final CharSequence m54343d(Merchandise merchandise, boolean z) {
        int color;
        if (z) {
            color = TEnum.equals(merchandise.category, ProductCategory.tttVip) ? Color.parseColor("#DE9551") : Color.parseColor("#F27310");
        } else {
            color = Color.parseColor("#66000000");
        }
        if (this.f35222p) {
            color = z ? getResources().getColor(b1c0.f72549g) : getResources().getColor(b1c0.f72555j);
        }
        Typeface typefaceM117752c = eqh0.m117752c(3);
        Typeface typefaceM117752c2 = eqh0.m117752c(2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("7天");
        CustomTypefaceSpan customTypefaceSpan = new CustomTypefaceSpan("sans-serif", typefaceM117752c, color, z ? t100.f167271t : t100.f167270s);
        customTypefaceSpan.m223785b(0);
        spannableStringBuilder.setSpan(customTypefaceSpan, 0, 1, 33);
        spannableStringBuilder.setSpan(new CustomTypefaceSpan("sans-serif", typefaceM117752c2, color, t100.m186890d(13.0f)), 1, 2, 33);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: e */
    public final SpannableStringBuilder m54344e(boolean z) {
        int color = z ? RoundedDrawable.DEFAULT_BORDER_COLOR : getResources().getColor(b1c0.f72553i);
        Typeface typefaceM117752c = z ? eqh0.m117752c(3) : eqh0.m117752c(2);
        if (this.f35222p) {
            color = z ? getResources().getColor(b1c0.f72549g) : getResources().getColor(b1c0.f72555j);
            typefaceM117752c = eqh0.m117752c(2);
        }
        int iM186890d = t100.m186890d(13.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("前3月");
        int length = spannableStringBuilder.length();
        CustomTypefaceSpan customTypefaceSpan = new CustomTypefaceSpan("sans-serif", typefaceM117752c, color, z ? t100.f167271t : t100.f167270s);
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(iM186890d), 0, 1, 33);
        spannableStringBuilder.setSpan(new StyleSpan(0), 0, 1, 33);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(color), 0, 1, 33);
        spannableStringBuilder.setSpan(customTypefaceSpan, 1, 2, 33);
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(iM186890d), 2, length, 33);
        spannableStringBuilder.setSpan(new StyleSpan(0), 2, length, 33);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(color), 2, length, 33);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: f */
    public final SpannableStringBuilder m54345f(boolean z, Merchandise merchandise) {
        int color = z ? this.f35219m : getResources().getColor(b1c0.f72553i);
        if (this.f35222p) {
            color = z ? getResources().getColor(b1c0.f72549g) : getResources().getColor(b1c0.f72555j);
        }
        String str = merchandise.quantityName() + "卡";
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        CustomTypefaceSpan customTypefaceSpan = this.f35222p ? new CustomTypefaceSpan("sans-serif", eqh0.m117752c(2), color, t100.f167268q) : new CustomTypefaceSpan("sans-serif", eqh0.m117752c(3), color, t100.f167268q);
        customTypefaceSpan.m223785b(0);
        spannableStringBuilder.setSpan(customTypefaceSpan, 0, str.length(), 33);
        return spannableStringBuilder;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.purchase.showcase.AnimBorderSectionView
    public List<View> getAnimBackgroundList() {
        return vwb.m200324f0(this.f35208b, this.f35214h);
    }

    /* JADX INFO: renamed from: h */
    public final SpannableStringBuilder m54346h(boolean z) {
        int color = z ? this.f35219m : getResources().getColor(b1c0.f72553i);
        Typeface typefaceM117752c = z ? eqh0.m117752c(3) : eqh0.m117752c(2);
        if (this.f35222p) {
            color = z ? getResources().getColor(b1c0.f72549g) : getResources().getColor(b1c0.f72555j);
            typefaceM117752c = eqh0.m117752c(2);
        }
        String str = this.f35218l.m107611b() ? "首3月" : "首6月";
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        CustomTypefaceSpan customTypefaceSpan = new CustomTypefaceSpan("sans-serif", eqh0.m117752c(2), color, t100.m186890d(13.0f));
        customTypefaceSpan.m223785b(0);
        spannableStringBuilder.setSpan(customTypefaceSpan, 0, str.length(), 33);
        spannableStringBuilder.setSpan(new CustomTypefaceSpan("sans-serif", typefaceM117752c, color, z ? t100.f167271t : t100.f167270s), 1, 2, 33);
        return spannableStringBuilder;
    }

    @DrawableRes
    /* JADX INFO: renamed from: i */
    public int m54347i(C8765d.a aVar, boolean z) {
        String string = aVar.m53579f().toString();
        string.getClass();
        switch (string) {
            case "superLikeMembership":
            case "tttVip":
            case "unlimitedSwipes":
            case "roaming":
            case "undoMembership":
                if (z && aVar.m53552H()) {
                    return this.f35222p ? d3c0.f83905e7 : d3c0.f83687O3;
                }
                return d3c0.f83673N3;
            case "youthVip":
                return (z && aVar.m53552H()) ? d3c0.f83888d4 : d3c0.f83874c4;
            case "svipPicksMembership":
            case "svip":
            case "picksMembership":
                if (z && aVar.m53552H()) {
                    return this.f35222p ? d3c0.f83891d7 : d3c0.f83819Y3;
                }
                return d3c0.f83860b4;
            case "femaleVip":
                return (z && aVar.m53552H()) ? d3c0.f83793W3 : d3c0.f83832Z3;
            case "platinum":
                return (z && aVar.m53552H()) ? d3c0.f83806X3 : d3c0.f83846a4;
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
    public int m54348j(com.p046p1.mobile.putong.core.p053ui.purchase.C8765d.a r1, boolean r2) {
        /*
            r0 = this;
            if (r2 == 0) goto L4
            r0 = -1
            return r0
        L4:
            com.p1.mobile.putong.core.data.ProductCategory r0 = r1.m53579f()
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
        throw new UnsupportedOperationException("Method not decompiled: com.p046p1.mobile.putong.core.p053ui.purchase.showcase.NewUITotalPricePurchaseSectionView1.m54348j(com.p1.mobile.putong.core.ui.purchase.d$a, boolean):int");
    }

    @ColorInt
    /* JADX INFO: renamed from: k */
    public int m54349k(String str) {
        str.getClass();
        switch (str) {
            case "superLikeMembership":
            case "tttVip":
            case "unlimitedSwipes":
            case "roaming":
            case "undoMembership":
                return this.f35222p ? Color.parseColor("#FD8B06") : getResources().getColor(b1c0.f72532V);
            case "youthVip":
                return Color.parseColor("#FF6AA631");
            case "svipPicksMembership":
            case "svip":
            case "picksMembership":
                return getResources().getColor(b1c0.f72531U);
            case "femaleVip":
                return Color.parseColor("#FFE25FB8");
            case "platinum":
                return getResources().getColor(b1c0.f72530T);
            default:
                return getResources().getColor(b1c0.f72514D);
        }
    }

    @DrawableRes
    /* JADX INFO: renamed from: l */
    public int m54350l(C8765d.a aVar, boolean z) {
        String string = aVar.m53579f().toString();
        string.getClass();
        switch (string) {
            case "superLikeMembership":
            case "tttVip":
            case "unlimitedSwipes":
            case "roaming":
            case "undoMembership":
                if (z && aVar.m53552H()) {
                    return this.f35222p ? d3c0.f83975j7 : d3c0.f83780V3;
                }
                return this.f35222p ? d3c0.f83989k7 : d3c0.f83659M3;
            case "youthVip":
                if (z && aVar.m53552H()) {
                    return this.f35222p ? d3c0.f84003l7 : d3c0.f83635K7;
                }
                return this.f35222p ? d3c0.f84017m7 : d3c0.f83649L7;
            case "svipPicksMembership":
            case "svip":
            case "picksMembership":
                if (z && aVar.m53552H()) {
                    return this.f35222p ? d3c0.f83947h7 : d3c0.f83754T3;
                }
                return this.f35222p ? d3c0.f83961i7 : d3c0.f83631K3;
            case "femaleVip":
                if (z && aVar.m53552H()) {
                    return this.f35222p ? d3c0.f83863b7 : d3c0.f83607I7;
                }
                return this.f35222p ? d3c0.f83877c7 : d3c0.f83621J7;
            case "platinum":
                return (z && aVar.m53552H()) ? d3c0.f83728R3 : d3c0.f83603I3;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: m */
    public final boolean m54351m(C8765d.a aVar) {
        return !TEnum.equals(aVar.m53579f(), ProductCategory.get("oDiamond")) && aVar.m53601s().autoRenewable();
    }

    /* JADX INFO: renamed from: o */
    public void m54352o(boolean z) {
        this.f35222p = z;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m54342c(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m54353p(boolean z, C8765d.a aVar) {
        this.f35214h.setTypeface(eqh0.m117752c(2));
        VText vText = this.f35214h;
        if (z) {
            vText.setTextSize(12.0f);
            this.f35214h.setTypeface(eqh0.m117752c(3), 1);
            this.f35211e.setTypeface(eqh0.m117752c(2), 0);
            this.f35212f.setTypeface(eqh0.m117752c(2), 0);
            if (!this.f35218l.f81523a) {
                this.f35213g.setTypeface(eqh0.m117752c(3), 1);
            }
            this.f35213g.setTextColor(this.f35219m);
        } else {
            vText.setTextSize(12.0f);
            this.f35214h.setTypeface(eqh0.m117752c(2));
            this.f35211e.setTypeface(eqh0.m117752c(2));
            this.f35213g.setTypeface(eqh0.m117752c(3));
            this.f35213g.setTextColor(ge5.m125678o(this.f35219m, 112));
        }
        if (!this.f35218l.f81523a && (this.f35215i || this.f35216j)) {
            VText_AutoFit vText_AutoFit = this.f35211e;
            if (z) {
                vText_AutoFit.setTextColor(this.f35219m);
                this.f35212f.setTextColor(this.f35219m);
            } else {
                vText_AutoFit.setTextColor(ge5.m125678o(this.f35219m, 128));
                this.f35212f.setTextColor(ge5.m125678o(this.f35219m, 128));
            }
        } else if (!this.f35222p) {
            VText_AutoFit vText_AutoFit2 = this.f35211e;
            if (z) {
                vText_AutoFit2.setTextColor(this.f35219m);
            } else {
                vText_AutoFit2.setTextColor(getResources().getColor(b1c0.f72553i));
            }
        } else if (z) {
            this.f35211e.setTextColor(this.f35219m);
        } else {
            int color = Color.parseColor("#99DE9551");
            if (TEnum.equals(ProductCategory.get("youthVip"), aVar.m53579f()) || TEnum.equals(ProductCategory.get("femaleVip"), aVar.m53579f())) {
                color = ge5.m125678o(this.f35219m, 128);
            } else if (TEnum.equals(ProductCategory.get("svip"), aVar.m53579f())) {
                color = Color.parseColor("#99F27310");
            }
            this.f35211e.setTextColor(color);
        }
        this.f35212f.setTypeface(eqh0.m117752c(2));
    }

    /* JADX INFO: renamed from: r */
    public final void m54354r(C8765d.a aVar, boolean z) {
        if (!z) {
            this.f35209c.setScaleX(1.0f);
            this.f35209c.setScaleY(1.0f);
            this.f35211e.setScaleX(1.0f);
            this.f35211e.setScaleY(1.0f);
            this.f35212f.setScaleX(1.0f);
            this.f35212f.setScaleY(1.0f);
            this.f35213g.setScaleX(1.0f);
            this.f35213g.setScaleY(1.0f);
            return;
        }
        if (!p2b0.m167133h().m167157z() && aVar.m53601s().noneRenewable()) {
            this.f35209c.setScaleX(1.0714f);
            this.f35209c.setScaleY(1.0714f);
        }
        if (this.f35218l.f81523a || !this.f35215i) {
            this.f35211e.setScaleX(1.0714f);
            this.f35211e.setScaleY(1.0714f);
            this.f35212f.setScaleX(1.0714f);
            this.f35212f.setScaleY(1.0714f);
        } else {
            this.f35211e.setScaleX(1.2143f);
            this.f35211e.setScaleY(1.2143f);
            this.f35212f.setScaleX(1.2143f);
            this.f35212f.setScaleY(1.2143f);
        }
        this.f35213g.setScaleX(1.0625f);
        this.f35213g.setScaleY(1.0625f);
    }

    public NewUITotalPricePurchaseSectionView1(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f35215i = false;
        this.f35216j = false;
        this.f35217k = false;
        this.f35218l = new cmd0(0);
        this.f35222p = false;
    }
}
