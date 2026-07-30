package com.p051p1.mobile.putong.core.p058ui.purchase.showcase;

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
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.MonetizationPromotionsId;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import java.util.List;
import p151v.VText;
import p151v.VText_AutoFit;
import p151v.text.CustomTypefaceSpan;
import p153l.bnl0;
import p153l.e3e;
import p153l.eud0;
import p153l.gf5;
import p153l.h9c0;
import p153l.il40;
import p153l.jbc0;
import p153l.jl40;
import p153l.jyb;
import p153l.lyh0;
import p153l.pta;
import p153l.qa00;
import p153l.t6c;
import p153l.tab0;
import p153l.ueh0;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes12.dex */
public class NewUITotalPricePurchaseSectionView1 extends AnimBorderSectionView {

    /* JADX INFO: renamed from: b */
    public LinearLayout f36056b;

    /* JADX INFO: renamed from: c */
    public VText f36057c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f36058d;

    /* JADX INFO: renamed from: e */
    public VText_AutoFit f36059e;

    /* JADX INFO: renamed from: f */
    public VText_AutoFit f36060f;

    /* JADX INFO: renamed from: g */
    public VText_AutoFit f36061g;

    /* JADX INFO: renamed from: h */
    public VText f36062h;

    /* JADX INFO: renamed from: i */
    public boolean f36063i;

    /* JADX INFO: renamed from: j */
    public boolean f36064j;

    /* JADX INFO: renamed from: k */
    public boolean f36065k;

    /* JADX INFO: renamed from: l */
    public eud0 f36066l;

    /* JADX INFO: renamed from: m */
    public int f36067m;

    /* JADX INFO: renamed from: n */
    public SpannableStringBuilder f36068n;

    /* JADX INFO: renamed from: o */
    public SpannableStringBuilder f36069o;

    /* JADX INFO: renamed from: p */
    public boolean f36070p;

    public NewUITotalPricePurchaseSectionView1(@NonNull Context context) {
        super(context);
        this.f36063i = false;
        this.f36064j = false;
        this.f36065k = false;
        this.f36066l = new eud0(0);
        this.f36070p = false;
    }

    /* JADX INFO: renamed from: g */
    private SpannableStringBuilder m55522g(boolean z, int i, String str) {
        int color = z ? this.f36067m : getResources().getColor(h9c0.f108373i);
        Typeface typefaceM156283c = z ? lyh0.m156283c(3) : lyh0.m156283c(2);
        if (this.f36070p) {
            color = z ? getResources().getColor(h9c0.f108369g) : getResources().getColor(h9c0.f108375j);
            typefaceM156283c = lyh0.m156283c(2);
        }
        String strValueOf = String.valueOf(i);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strValueOf + str);
        CustomTypefaceSpan customTypefaceSpan = new CustomTypefaceSpan("sans-serif", typefaceM156283c, color, z ? qa00.f156333t : qa00.f156332s);
        customTypefaceSpan.m225031b(0);
        spannableStringBuilder.setSpan(customTypefaceSpan, 0, strValueOf.length(), 33);
        spannableStringBuilder.setSpan(new CustomTypefaceSpan("sans-serif", lyh0.m156283c(2), color, qa00.m175859d(13.0f)), strValueOf.length(), strValueOf.length() + str.length(), 33);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: n */
    private void m55523n(C8928d.a aVar, boolean z) {
        t6c t6cVarM54768i = aVar.m54768i();
        if (t6cVarM54768i instanceof il40) {
            il40 il40Var = (il40) t6cVarM54768i;
            this.f36063i = il40Var.m140575a();
            this.f36064j = il40Var.m140576b();
            this.f36066l = pta.m173720m(aVar);
        }
        this.f36065k = z && !TextUtils.isEmpty(aVar.m54783r()) && this.f36064j;
        this.f36067m = m55532k(aVar.m54762f().toString());
        if (this.f36066l.f95856a) {
            this.f36068n = m55529h(true);
            this.f36069o = m55529h(false);
        } else {
            this.f36068n = m55522g(true, aVar.m54788w(), aVar.m54789x());
            this.f36069o = m55522g(false, aVar.m54788w(), aVar.m54789x());
        }
    }

    /* JADX INFO: renamed from: q */
    private void m55524q(C8928d.a aVar, boolean z) {
        this.f36056b.setBackgroundResource(m55533l(aVar, z));
        bnl0.m105524M(this.f36062h, !TextUtils.isEmpty(aVar.m54783r()) || (aVar.m54735H() && !TextUtils.isEmpty(aVar.m54783r())));
        this.f36062h.setBackgroundResource(m55530i(aVar, z));
        this.f36062h.setTextColor(m55531j(aVar, z));
        boolean zM55534m = m55534m(aVar);
        VText vText = this.f36062h;
        if (zM55534m) {
            vText.setText(aVar.m54756c());
        } else {
            vText.setText(aVar.m54783r());
        }
        boolean zM195760n = ueh0.m195760n(aVar.m54784s());
        if (zM195760n) {
            this.f36057c.setText(m55526d(aVar.m54784s(), z));
        } else if (tab0.m189811h().m189835z() && aVar.m54784s().noneRenewable()) {
            this.f36057c.setText(m55528f(z, aVar.m54784s()));
        } else if (this.f36065k && aVar.m54784s().isBelongPromotion(MonetizationPromotionsId.lowPrice3Month)) {
            this.f36057c.setText(m55527e(z));
        } else {
            this.f36057c.setText(z ? this.f36068n : this.f36069o);
        }
        if (zM195760n) {
            bnl0.m105525M0(this.f36060f, false);
            bnl0.m105525M0(this.f36059e, false);
        } else if (this.f36066l.f95856a || !(this.f36063i || this.f36064j)) {
            bnl0.m105525M0(this.f36060f, false);
            bnl0.m105525M0(this.f36059e, true);
            this.f36059e.setText(aVar.m54729B());
        } else {
            this.f36059e.setText(aVar.m54729B());
            this.f36060f.setText(e3e.INSTANCE.m119282g(aVar.m54784s()));
            VText_AutoFit vText_AutoFit = this.f36060f;
            if (z) {
                bnl0.m105525M0(vText_AutoFit, true);
                bnl0.m105525M0(this.f36059e, false);
            } else {
                bnl0.m105525M0(vText_AutoFit, false);
                bnl0.m105525M0(this.f36059e, true);
                this.f36059e.requestLayout();
            }
        }
        if (m55534m(aVar)) {
            this.f36059e.setText(aVar.m54783r());
        }
        VText_AutoFit vText_AutoFit2 = this.f36061g;
        vText_AutoFit2.setPaintFlags(vText_AutoFit2.getPaintFlags() & (-17));
        if (TEnum.equals(aVar.m54784s().category, "femaleVip") && (aVar.m54784s().noneRenewable() || aVar.m54736I())) {
            boolean zM54736I = aVar.m54736I();
            VText_AutoFit vText_AutoFit3 = this.f36061g;
            if (zM54736I) {
                vText_AutoFit3.setText(String.format("%s%s", aVar.m54766h(), aVar.m54774l()));
            } else {
                vText_AutoFit3.setText(aVar.m54728A());
            }
            this.f36061g.getPaint().setFlags(17);
        } else if (TEnum.equals(aVar.m54784s().category, "youthVip") && aVar.m54784s().noneRenewable()) {
            this.f36061g.setText(aVar.m54728A());
            this.f36061g.getPaint().setFlags(17);
        } else if (ueh0.m195760n(aVar.m54784s())) {
            this.f36061g.setTextColor(this.f36067m);
            this.f36061g.setText("1元秒杀");
        } else {
            boolean z2 = this.f36066l.f95856a;
            VText_AutoFit vText_AutoFit4 = this.f36061g;
            if (z2) {
                vText_AutoFit4.setText(String.format("%s%s", aVar.m54766h(), aVar.m54774l()));
                this.f36061g.getPaint().setFlags(17);
            } else {
                vText_AutoFit4.setText(aVar.m54728A());
            }
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f36057c.getLayoutParams();
        if (!aVar.m54784s().monthly() || !aVar.m54784s().noneRenewable() || TEnum.equals(aVar.m54784s().category, "femaleVip") || TEnum.equals(aVar.m54784s().category, "youthVip")) {
            bnl0.m105524M(this.f36058d, true);
            if (zM195760n) {
                layoutParams.topMargin = qa00.m175859d(32.0f);
            } else {
                int i = layoutParams.topMargin;
                int i2 = qa00.f156328o;
                if (i != i2) {
                    layoutParams.topMargin = i2;
                }
            }
        } else {
            bnl0.m105524M(this.f36058d, false);
            layoutParams.topMargin = qa00.f156335v;
        }
        this.f36057c.setLayoutParams(layoutParams);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.purchase.showcase.AbsPurchaseSectionView
    /* JADX INFO: renamed from: a */
    public void mo55507a(boolean z, boolean z2, C8928d.a aVar) {
        m55523n(aVar, z2);
        m55536p(z, aVar);
        m55524q(aVar, z);
        m55537r(aVar, z);
    }

    /* JADX INFO: renamed from: c */
    public final void m55525c(View view) {
        jl40.m145939a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final CharSequence m55526d(Merchandise merchandise, boolean z) {
        int color;
        if (z) {
            color = TEnum.equals(merchandise.category, ProductCategory.tttVip) ? Color.parseColor("#DE9551") : Color.parseColor("#F27310");
        } else {
            color = Color.parseColor("#66000000");
        }
        if (this.f36070p) {
            color = z ? getResources().getColor(h9c0.f108369g) : getResources().getColor(h9c0.f108375j);
        }
        Typeface typefaceM156283c = lyh0.m156283c(3);
        Typeface typefaceM156283c2 = lyh0.m156283c(2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("7天");
        CustomTypefaceSpan customTypefaceSpan = new CustomTypefaceSpan("sans-serif", typefaceM156283c, color, z ? qa00.f156333t : qa00.f156332s);
        customTypefaceSpan.m225031b(0);
        spannableStringBuilder.setSpan(customTypefaceSpan, 0, 1, 33);
        spannableStringBuilder.setSpan(new CustomTypefaceSpan("sans-serif", typefaceM156283c2, color, qa00.m175859d(13.0f)), 1, 2, 33);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: e */
    public final SpannableStringBuilder m55527e(boolean z) {
        int color = z ? RoundedDrawable.DEFAULT_BORDER_COLOR : getResources().getColor(h9c0.f108373i);
        Typeface typefaceM156283c = z ? lyh0.m156283c(3) : lyh0.m156283c(2);
        if (this.f36070p) {
            color = z ? getResources().getColor(h9c0.f108369g) : getResources().getColor(h9c0.f108375j);
            typefaceM156283c = lyh0.m156283c(2);
        }
        int iM175859d = qa00.m175859d(13.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("前3月");
        int length = spannableStringBuilder.length();
        CustomTypefaceSpan customTypefaceSpan = new CustomTypefaceSpan("sans-serif", typefaceM156283c, color, z ? qa00.f156333t : qa00.f156332s);
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(iM175859d), 0, 1, 33);
        spannableStringBuilder.setSpan(new StyleSpan(0), 0, 1, 33);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(color), 0, 1, 33);
        spannableStringBuilder.setSpan(customTypefaceSpan, 1, 2, 33);
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(iM175859d), 2, length, 33);
        spannableStringBuilder.setSpan(new StyleSpan(0), 2, length, 33);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(color), 2, length, 33);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: f */
    public final SpannableStringBuilder m55528f(boolean z, Merchandise merchandise) {
        int color = z ? this.f36067m : getResources().getColor(h9c0.f108373i);
        if (this.f36070p) {
            color = z ? getResources().getColor(h9c0.f108369g) : getResources().getColor(h9c0.f108375j);
        }
        String str = merchandise.quantityName() + "卡";
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        CustomTypefaceSpan customTypefaceSpan = this.f36070p ? new CustomTypefaceSpan("sans-serif", lyh0.m156283c(2), color, qa00.f156330q) : new CustomTypefaceSpan("sans-serif", lyh0.m156283c(3), color, qa00.f156330q);
        customTypefaceSpan.m225031b(0);
        spannableStringBuilder.setSpan(customTypefaceSpan, 0, str.length(), 33);
        return spannableStringBuilder;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.purchase.showcase.AnimBorderSectionView
    public List<View> getAnimBackgroundList() {
        return jyb.m147507f0(this.f36056b, this.f36062h);
    }

    /* JADX INFO: renamed from: h */
    public final SpannableStringBuilder m55529h(boolean z) {
        int color = z ? this.f36067m : getResources().getColor(h9c0.f108373i);
        Typeface typefaceM156283c = z ? lyh0.m156283c(3) : lyh0.m156283c(2);
        if (this.f36070p) {
            color = z ? getResources().getColor(h9c0.f108369g) : getResources().getColor(h9c0.f108375j);
            typefaceM156283c = lyh0.m156283c(2);
        }
        String str = this.f36066l.m122560b() ? "首3月" : "首6月";
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        CustomTypefaceSpan customTypefaceSpan = new CustomTypefaceSpan("sans-serif", lyh0.m156283c(2), color, qa00.m175859d(13.0f));
        customTypefaceSpan.m225031b(0);
        spannableStringBuilder.setSpan(customTypefaceSpan, 0, str.length(), 33);
        spannableStringBuilder.setSpan(new CustomTypefaceSpan("sans-serif", typefaceM156283c, color, z ? qa00.f156333t : qa00.f156332s), 1, 2, 33);
        return spannableStringBuilder;
    }

    @DrawableRes
    /* JADX INFO: renamed from: i */
    public int m55530i(C8928d.a aVar, boolean z) {
        String string = aVar.m54762f().toString();
        string.getClass();
        switch (string) {
            case "superLikeMembership":
            case "tttVip":
            case "unlimitedSwipes":
            case "roaming":
            case "undoMembership":
                if (z && aVar.m54735H()) {
                    return this.f36070p ? jbc0.f119560e7 : jbc0.f119342O3;
                }
                return jbc0.f119328N3;
            case "youthVip":
                return (z && aVar.m54735H()) ? jbc0.f119543d4 : jbc0.f119529c4;
            case "svipPicksMembership":
            case "svip":
            case "picksMembership":
                if (z && aVar.m54735H()) {
                    return this.f36070p ? jbc0.f119546d7 : jbc0.f119474Y3;
                }
                return jbc0.f119515b4;
            case "femaleVip":
                return (z && aVar.m54735H()) ? jbc0.f119448W3 : jbc0.f119487Z3;
            case "platinum":
                return (z && aVar.m54735H()) ? jbc0.f119461X3 : jbc0.f119501a4;
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
    @ColorInt
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int m55531j(C8928d.a aVar, boolean z) {
        String str;
        if (z) {
            return -1;
        }
        String string = aVar.m54762f().toString();
        switch (string.hashCode()) {
            case -2067215576:
                str = "superLikeMembership";
                string.equals(str);
                return Color.parseColor("#66DE9551");
            case -863315575:
                str = ProductCategory.tttVip;
                string.equals(str);
                return Color.parseColor("#66DE9551");
            case -679730102:
                if (string.equals("youthVip")) {
                    return Color.parseColor("#80AFDA86");
                }
                return Color.parseColor("#66DE9551");
            case -429915974:
                str = "unlimitedSwipes";
                string.equals(str);
                return Color.parseColor("#66DE9551");
            case -94011970:
                break;
            case 3542730:
                break;
            case 1086939441:
                if (string.equals("femaleVip")) {
                    return Color.parseColor("#CCF6B7DD");
                }
                return Color.parseColor("#66DE9551");
            case 1366973465:
                str = "roaming";
                string.equals(str);
                return Color.parseColor("#66DE9551");
            case 1848078298:
                str = "undoMembership";
                string.equals(str);
                return Color.parseColor("#66DE9551");
            case 1874772524:
                if (string.equals("platinum")) {
                    return Color.parseColor("#66656F7B");
                }
                return Color.parseColor("#66DE9551");
            case 1905099240:
                break;
            default:
                return Color.parseColor("#66DE9551");
        }
    }

    @ColorInt
    /* JADX INFO: renamed from: k */
    public int m55532k(String str) {
        str.getClass();
        switch (str) {
            case "superLikeMembership":
            case "tttVip":
            case "unlimitedSwipes":
            case "roaming":
            case "undoMembership":
                return this.f36070p ? Color.parseColor("#FD8B06") : getResources().getColor(h9c0.f108352V);
            case "youthVip":
                return Color.parseColor("#FF6AA631");
            case "svipPicksMembership":
            case "svip":
            case "picksMembership":
                return getResources().getColor(h9c0.f108351U);
            case "femaleVip":
                return Color.parseColor("#FFE25FB8");
            case "platinum":
                return getResources().getColor(h9c0.f108350T);
            default:
                return getResources().getColor(h9c0.f108334D);
        }
    }

    @DrawableRes
    /* JADX INFO: renamed from: l */
    public int m55533l(C8928d.a aVar, boolean z) {
        String string = aVar.m54762f().toString();
        string.getClass();
        switch (string) {
            case "superLikeMembership":
            case "tttVip":
            case "unlimitedSwipes":
            case "roaming":
            case "undoMembership":
                if (z && aVar.m54735H()) {
                    return this.f36070p ? jbc0.f119630j7 : jbc0.f119435V3;
                }
                return this.f36070p ? jbc0.f119644k7 : jbc0.f119314M3;
            case "youthVip":
                if (z && aVar.m54735H()) {
                    return this.f36070p ? jbc0.f119658l7 : jbc0.f119290K7;
                }
                return this.f36070p ? jbc0.f119672m7 : jbc0.f119304L7;
            case "svipPicksMembership":
            case "svip":
            case "picksMembership":
                if (z && aVar.m54735H()) {
                    return this.f36070p ? jbc0.f119602h7 : jbc0.f119409T3;
                }
                return this.f36070p ? jbc0.f119616i7 : jbc0.f119286K3;
            case "femaleVip":
                if (z && aVar.m54735H()) {
                    return this.f36070p ? jbc0.f119518b7 : jbc0.f119262I7;
                }
                return this.f36070p ? jbc0.f119532c7 : jbc0.f119276J7;
            case "platinum":
                return (z && aVar.m54735H()) ? jbc0.f119383R3 : jbc0.f119258I3;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: m */
    public final boolean m55534m(C8928d.a aVar) {
        return !TEnum.equals(aVar.m54762f(), ProductCategory.get("oDiamond")) && aVar.m54784s().autoRenewable();
    }

    /* JADX INFO: renamed from: o */
    public void m55535o(boolean z) {
        this.f36070p = z;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m55525c(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m55536p(boolean z, C8928d.a aVar) {
        this.f36062h.setTypeface(lyh0.m156283c(2));
        VText vText = this.f36062h;
        if (z) {
            vText.setTextSize(12.0f);
            this.f36062h.setTypeface(lyh0.m156283c(3), 1);
            this.f36059e.setTypeface(lyh0.m156283c(2), 0);
            this.f36060f.setTypeface(lyh0.m156283c(2), 0);
            if (!this.f36066l.f95856a) {
                this.f36061g.setTypeface(lyh0.m156283c(3), 1);
            }
            this.f36061g.setTextColor(this.f36067m);
        } else {
            vText.setTextSize(12.0f);
            this.f36062h.setTypeface(lyh0.m156283c(2));
            this.f36059e.setTypeface(lyh0.m156283c(2));
            this.f36061g.setTypeface(lyh0.m156283c(3));
            this.f36061g.setTextColor(gf5.m130052o(this.f36067m, 112));
        }
        if (!this.f36066l.f95856a && (this.f36063i || this.f36064j)) {
            VText_AutoFit vText_AutoFit = this.f36059e;
            if (z) {
                vText_AutoFit.setTextColor(this.f36067m);
                this.f36060f.setTextColor(this.f36067m);
            } else {
                vText_AutoFit.setTextColor(gf5.m130052o(this.f36067m, 128));
                this.f36060f.setTextColor(gf5.m130052o(this.f36067m, 128));
            }
        } else if (!this.f36070p) {
            VText_AutoFit vText_AutoFit2 = this.f36059e;
            if (z) {
                vText_AutoFit2.setTextColor(this.f36067m);
            } else {
                vText_AutoFit2.setTextColor(getResources().getColor(h9c0.f108373i));
            }
        } else if (z) {
            this.f36059e.setTextColor(this.f36067m);
        } else {
            int color = Color.parseColor("#99DE9551");
            if (TEnum.equals(ProductCategory.get("youthVip"), aVar.m54762f()) || TEnum.equals(ProductCategory.get("femaleVip"), aVar.m54762f())) {
                color = gf5.m130052o(this.f36067m, 128);
            } else if (TEnum.equals(ProductCategory.get("svip"), aVar.m54762f())) {
                color = Color.parseColor("#99F27310");
            }
            this.f36059e.setTextColor(color);
        }
        this.f36060f.setTypeface(lyh0.m156283c(2));
    }

    /* JADX INFO: renamed from: r */
    public final void m55537r(C8928d.a aVar, boolean z) {
        if (!z) {
            this.f36057c.setScaleX(1.0f);
            this.f36057c.setScaleY(1.0f);
            this.f36059e.setScaleX(1.0f);
            this.f36059e.setScaleY(1.0f);
            this.f36060f.setScaleX(1.0f);
            this.f36060f.setScaleY(1.0f);
            this.f36061g.setScaleX(1.0f);
            this.f36061g.setScaleY(1.0f);
            return;
        }
        if (!tab0.m189811h().m189835z() && aVar.m54784s().noneRenewable()) {
            this.f36057c.setScaleX(1.0714f);
            this.f36057c.setScaleY(1.0714f);
        }
        if (this.f36066l.f95856a || !this.f36063i) {
            this.f36059e.setScaleX(1.0714f);
            this.f36059e.setScaleY(1.0714f);
            this.f36060f.setScaleX(1.0714f);
            this.f36060f.setScaleY(1.0714f);
        } else {
            this.f36059e.setScaleX(1.2143f);
            this.f36059e.setScaleY(1.2143f);
            this.f36060f.setScaleX(1.2143f);
            this.f36060f.setScaleY(1.2143f);
        }
        this.f36061g.setScaleX(1.0625f);
        this.f36061g.setScaleY(1.0625f);
    }

    public NewUITotalPricePurchaseSectionView1(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36063i = false;
        this.f36064j = false;
        this.f36065k = false;
        this.f36066l = new eud0(0);
        this.f36070p = false;
    }
}
