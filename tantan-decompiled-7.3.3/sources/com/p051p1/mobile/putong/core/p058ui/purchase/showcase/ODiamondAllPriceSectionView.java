package com.p051p1.mobile.putong.core.p058ui.purchase.showcase;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.MonetizationPromotionsId;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VText;
import p151v.VText_AutoFit;
import p151v.text.CustomTypefaceSpan;
import p153l.bnl0;
import p153l.h9c0;
import p153l.il40;
import p153l.jbc0;
import p153l.jyb;
import p153l.lyh0;
import p153l.qa00;
import p153l.s7a;
import p153l.t6c;
import p153l.tab0;
import p153l.x350;

/* JADX INFO: loaded from: classes12.dex */
public class ODiamondAllPriceSectionView extends AnimBorderSectionView {

    /* JADX INFO: renamed from: b */
    public LinearLayout f36094b;

    /* JADX INFO: renamed from: c */
    public VText f36095c;

    /* JADX INFO: renamed from: d */
    public VText_AutoFit f36096d;

    /* JADX INFO: renamed from: e */
    public VText_AutoFit f36097e;

    /* JADX INFO: renamed from: f */
    public VText f36098f;

    /* JADX INFO: renamed from: g */
    public boolean f36099g;

    /* JADX INFO: renamed from: h */
    public boolean f36100h;

    /* JADX INFO: renamed from: i */
    public boolean f36101i;

    /* JADX INFO: renamed from: j */
    public int f36102j;

    /* JADX INFO: renamed from: k */
    public SpannableStringBuilder f36103k;

    /* JADX INFO: renamed from: l */
    public SpannableStringBuilder f36104l;

    /* JADX INFO: renamed from: m */
    public boolean f36105m;

    /* JADX INFO: renamed from: n */
    public boolean f36106n;

    public ODiamondAllPriceSectionView(@NonNull Context context) {
        super(context);
        this.f36099g = false;
        this.f36100h = false;
        this.f36101i = false;
        this.f36105m = false;
        this.f36106n = false;
    }

    /* JADX INFO: renamed from: f */
    private SpannableStringBuilder m55554f(boolean z, Merchandise merchandise) {
        int color;
        if (this.f36105m && TEnum.equals(merchandise.category, "oDiamond") && s7a.m184986o()) {
            color = getResources().getColor(h9c0.f108342L);
        } else {
            color = this.f36105m ? Color.parseColor("#88000000") : m55564l(merchandise);
        }
        if (z) {
            color = this.f36102j;
        }
        String str = merchandise.quantityName() + "卡";
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        CustomTypefaceSpan customTypefaceSpan = new CustomTypefaceSpan("sans-serif", lyh0.m156283c(3), color, qa00.f156330q);
        customTypefaceSpan.m225031b(0);
        spannableStringBuilder.setSpan(customTypefaceSpan, 0, str.length(), 33);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: p */
    private void m55555p(C8928d.a aVar, boolean z) {
        if (aVar == null) {
            return;
        }
        VText vText = this.f36095c;
        boolean z2 = false;
        if (z) {
            vText.setScaleX(1.0714f);
            this.f36095c.setScaleY(1.0714f);
            this.f36096d.setTypeface(lyh0.m156283c(3));
            this.f36097e.setTypeface(lyh0.m156283c(3));
            boolean z3 = this.f36099g;
            VText_AutoFit vText_AutoFit = this.f36096d;
            if (z3) {
                vText_AutoFit.setScaleX(1.2143f);
                this.f36096d.setScaleY(1.2143f);
            } else {
                vText_AutoFit.setScaleX(1.0714f);
                this.f36096d.setScaleY(1.0714f);
            }
            if (this.f36105m && TEnum.equals(aVar.m54784s().category, "oDiamond") && s7a.m184986o()) {
                this.f36096d.setTextColor(getResources().getColor(h9c0.f108344N));
                this.f36097e.setTextColor(getResources().getColor(h9c0.f108344N));
            } else {
                this.f36096d.setTextColor(this.f36102j);
                this.f36097e.setTextColor(this.f36102j);
            }
            this.f36097e.setScaleX(1.0625f);
            this.f36097e.setScaleY(1.0625f);
        } else {
            vText.setScaleX(1.0f);
            this.f36095c.setScaleY(1.0f);
            this.f36096d.setTypeface(lyh0.m156283c(3), 0);
            if (this.f36099g || this.f36101i) {
                this.f36096d.setTextColor(this.f36102j);
            } else {
                this.f36096d.setTextColor(m55564l(aVar.m54784s()));
            }
            this.f36096d.setScaleX(1.0f);
            this.f36096d.setScaleY(1.0f);
            this.f36097e.setTextColor(m55564l(aVar.m54784s()));
            this.f36097e.setScaleX(1.0f);
            this.f36097e.setScaleY(1.0f);
            this.f36097e.setTypeface(lyh0.m156283c(2), 0);
        }
        this.f36094b.setBackgroundResource(m55563k(z, aVar.m54784s()));
        if (this.f36099g || this.f36101i || ((z && !TextUtils.isEmpty(aVar.m54783r())) || (aVar.m54735H() && !TextUtils.isEmpty(aVar.m54783r())))) {
            z2 = true;
        }
        bnl0.m105524M(this.f36098f, z2);
        this.f36098f.setBackgroundResource(m55560h(aVar, z));
        this.f36098f.setTextColor(m55561i(aVar, z));
        this.f36098f.setText(aVar.m54783r());
        if (this.f36101i && aVar.m54784s().isBelongPromotion(MonetizationPromotionsId.lowPrice3Month)) {
            this.f36095c.setText(m55557d(z, this.f36102j));
        } else if (tab0.m189811h().m189835z() && aVar.m54784s().noneRenewable()) {
            this.f36095c.setText(m55554f(z, aVar.m54784s()));
        } else {
            this.f36095c.setText(z ? this.f36103k : this.f36104l);
        }
        this.f36096d.setText(aVar.m54791z());
        boolean z4 = this.f36101i;
        VText_AutoFit vText_AutoFit2 = this.f36097e;
        if (z4) {
            vText_AutoFit2.setText(m55558e(aVar.m54764g()));
        } else {
            vText_AutoFit2.setText(aVar.m54764g());
        }
        if (!this.f36099g || this.f36100h) {
            this.f36097e.getPaint().setFlags(1);
        } else {
            this.f36097e.getPaint().setFlags(17);
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.purchase.showcase.AbsPurchaseSectionView
    /* JADX INFO: renamed from: a */
    public void mo55507a(boolean z, boolean z2, C8928d.a aVar) {
        m55565m(aVar, z2);
        m55567o(aVar);
        m55555p(aVar, z);
    }

    /* JADX INFO: renamed from: c */
    public final void m55556c(View view) {
        x350.m209193a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final SpannableStringBuilder m55557d(boolean z, int i) {
        if (!z) {
            i = getResources().getColor(h9c0.f108373i);
        }
        int iM175859d = qa00.m175859d(13.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("前3月");
        int length = spannableStringBuilder.length();
        CustomTypefaceSpan customTypefaceSpan = new CustomTypefaceSpan("sans-serif", z ? lyh0.m156283c(3) : lyh0.m156283c(2), i, qa00.f156332s);
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(iM175859d), 0, 1, 33);
        spannableStringBuilder.setSpan(new StyleSpan(z ? 1 : 0), 0, 1, 33);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(i), 0, 1, 33);
        spannableStringBuilder.setSpan(customTypefaceSpan, 1, 2, 33);
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(iM175859d), 2, length, 33);
        spannableStringBuilder.setSpan(new StyleSpan(z ? 1 : 0), 2, length, 33);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(i), 2, length, 33);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: e */
    public final CharSequence m55558e(String str) {
        if (!str.contains("/")) {
            return str;
        }
        String[] strArrSplit = str.split("/");
        if (strArrSplit.length != 2) {
            return str.replaceAll("/", "");
        }
        String str2 = strArrSplit[0];
        String str3 = strArrSplit[1];
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2 + str3);
        int length = str2.length();
        int length2 = str3.length() + length;
        int i = length + (-1);
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(qa00.m175861f(16)), 0, i, 33);
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(qa00.m175861f(10)), i, length, 33);
        spannableStringBuilder.setSpan(new StrikethroughSpan(), length, length2, 33);
        spannableStringBuilder.setSpan(new CustomTypefaceSpan("sans-serif", lyh0.m156283c(2), getResources().getColor(h9c0.f108377k), qa00.m175861f(12)), length, length2, 33);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: g */
    public final SpannableStringBuilder m55559g(boolean z, int i, String str, int i2, Merchandise merchandise) {
        int iM55564l;
        if (this.f36105m && TEnum.equals(merchandise.category, "oDiamond") && s7a.m184986o()) {
            iM55564l = getResources().getColor(h9c0.f108342L);
        } else if (this.f36105m) {
            iM55564l = tab0.m189811h().m189835z() ? Color.parseColor("#88000000") : getResources().getColor(h9c0.f108353W);
        } else {
            iM55564l = m55564l(merchandise);
        }
        if (!z) {
            i2 = iM55564l;
        }
        String strValueOf = String.valueOf(i);
        Typeface typefaceM156283c = z ? lyh0.m156283c(3) : lyh0.m156283c(2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strValueOf + str);
        CustomTypefaceSpan customTypefaceSpan = new CustomTypefaceSpan("sans-serif", typefaceM156283c, i2, qa00.f156332s);
        customTypefaceSpan.m225031b(0);
        spannableStringBuilder.setSpan(customTypefaceSpan, 0, strValueOf.length(), 33);
        spannableStringBuilder.setSpan(new CustomTypefaceSpan("sans-serif", lyh0.m156283c(2), i2, qa00.m175859d(13.0f)), strValueOf.length(), strValueOf.length() + str.length(), 33);
        return spannableStringBuilder;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.purchase.showcase.AnimBorderSectionView
    public List<View> getAnimBackgroundList() {
        return jyb.m147507f0(this.f36094b, this.f36098f);
    }

    @DrawableRes
    /* JADX INFO: renamed from: h */
    public int m55560h(C8928d.a aVar, boolean z) {
        if (!aVar.m54735H() || z) {
            if (this.f36105m) {
                return (s7a.m184986o() && TEnum.equals(aVar.m54784s().category, "oDiamond")) ? jbc0.f119246H5 : jbc0.f119600h5;
            }
            return jbc0.f119449W4;
        }
        if (this.f36105m) {
            return (s7a.m184986o() && TEnum.equals(aVar.m54784s().category, "oDiamond")) ? jbc0.f119260I5 : jbc0.f119614i5;
        }
        return jbc0.f119462X4;
    }

    @ColorInt
    /* JADX INFO: renamed from: i */
    public int m55561i(C8928d.a aVar, boolean z) {
        if (aVar.m54735H() && !z) {
            if (this.f36105m) {
                return (s7a.m184986o() && TEnum.equals(aVar.m54784s().category, "oDiamond")) ? getResources().getColor(h9c0.f108343M) : Color.parseColor("#808C5B1A");
            }
            return Color.parseColor("#CC000000");
        }
        if (!this.f36105m) {
            return getResources().getColor(h9c0.f108360b0);
        }
        if (s7a.m184986o() && TEnum.equals(aVar.m54784s().category, "oDiamond")) {
            return Color.parseColor("#261406");
        }
        return -1;
    }

    @ColorInt
    /* JADX INFO: renamed from: j */
    public int m55562j(Merchandise merchandise) {
        if (this.f36105m) {
            return (s7a.m184986o() && TEnum.equals(merchandise.category, "oDiamond")) ? getResources().getColor(h9c0.f108346P) : Color.parseColor("#8C5B1A");
        }
        return Color.parseColor("#ffffdea2");
    }

    @DrawableRes
    /* JADX INFO: renamed from: k */
    public int m55563k(boolean z, Merchandise merchandise) {
        if (this.f36106n) {
            return z ? jbc0.f119574f7 : jbc0.f119588g7;
        }
        if (!this.f36105m) {
            return z ? jbc0.f119423U4 : jbc0.f119436V4;
        }
        if (TEnum.equals(merchandise.category, "oDiamond") && s7a.m184986o()) {
            return z ? jbc0.f119218F5 : jbc0.f119232G5;
        }
        return z ? jbc0.f119572f5 : jbc0.f119586g5;
    }

    @ColorInt
    /* JADX INFO: renamed from: l */
    public int m55564l(Merchandise merchandise) {
        if (this.f36105m) {
            return (s7a.m184986o() && TEnum.equals(merchandise.category, "oDiamond")) ? getResources().getColor(h9c0.f108341K) : Color.parseColor("#66000000");
        }
        return Color.parseColor("#66ffdea2");
    }

    /* JADX INFO: renamed from: m */
    public final void m55565m(C8928d.a aVar, boolean z) {
        if (NullChecker.m82486a(aVar)) {
            t6c t6cVarM54768i = aVar.m54768i();
            if (t6cVarM54768i instanceof il40) {
                il40 il40Var = (il40) t6cVarM54768i;
                this.f36099g = il40Var.m140575a();
                this.f36100h = il40Var.m140576b();
            }
            this.f36101i = z && !TextUtils.isEmpty(aVar.m54783r()) && this.f36100h;
            this.f36102j = m55562j(aVar.m54784s());
            this.f36103k = m55559g(true, aVar.m54788w(), aVar.m54789x(), this.f36102j, aVar.m54784s());
            this.f36104l = m55559g(false, aVar.m54788w(), aVar.m54789x(), this.f36102j, aVar.m54784s());
        }
    }

    /* JADX INFO: renamed from: n */
    public void m55566n(boolean z) {
        this.f36106n = z;
    }

    /* JADX INFO: renamed from: o */
    public final void m55567o(C8928d.a aVar) {
        if (NullChecker.m82486a(aVar)) {
            if (aVar.m54730C() || !aVar.m54732E()) {
                this.f36096d.setText(aVar.m54791z());
            } else {
                this.f36096d.setText(aVar.m54786u());
            }
            boolean z = this.f36101i;
            VText_AutoFit vText_AutoFit = this.f36097e;
            if (z) {
                vText_AutoFit.setText(m55558e(aVar.m54764g()));
            } else {
                vText_AutoFit.setText(aVar.m54764g());
            }
            if (!this.f36099g || this.f36100h) {
                this.f36097e.getPaint().setFlags(1);
            } else {
                this.f36097e.getPaint().setFlags(17);
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m55556c(this);
    }

    public void setInVipFrag(boolean z) {
        this.f36105m = z;
    }

    public ODiamondAllPriceSectionView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36099g = false;
        this.f36100h = false;
        this.f36101i = false;
        this.f36105m = false;
        this.f36106n = false;
    }
}
