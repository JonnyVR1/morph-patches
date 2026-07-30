package com.p000p1.mobile.putong.core.p004ui.purchase.showcase;

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
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.ui.purchase.d;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.b1c0;
import l.d3c0;
import l.eqh0;
import l.iv40;
import l.p2b0;
import l.t100;
import l.vwb;
import l.xdl0;
import p006l.g6a;
import p006l.n5c;
import p006l.uc40;
import v.VText;
import v.VText_AutoFit;
import v.text.CustomTypefaceSpan;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class ODiamondAllPriceSectionView extends AnimBorderSectionView {

    /* JADX INFO: renamed from: b */
    public LinearLayout f5027b;

    /* JADX INFO: renamed from: c */
    public VText f5028c;

    /* JADX INFO: renamed from: d */
    public VText_AutoFit f5029d;

    /* JADX INFO: renamed from: e */
    public VText_AutoFit f5030e;

    /* JADX INFO: renamed from: f */
    public VText f5031f;

    /* JADX INFO: renamed from: g */
    public boolean f5032g;

    /* JADX INFO: renamed from: h */
    public boolean f5033h;

    /* JADX INFO: renamed from: i */
    public boolean f5034i;

    /* JADX INFO: renamed from: j */
    public int f5035j;

    /* JADX INFO: renamed from: k */
    public SpannableStringBuilder f5036k;

    /* JADX INFO: renamed from: l */
    public SpannableStringBuilder f5037l;

    /* JADX INFO: renamed from: m */
    public boolean f5038m;

    /* JADX INFO: renamed from: n */
    public boolean f5039n;

    public ODiamondAllPriceSectionView(@NonNull Context context) {
        super(context);
        this.f5032g = false;
        this.f5033h = false;
        this.f5034i = false;
        this.f5038m = false;
        this.f5039n = false;
    }

    /* JADX INFO: renamed from: f */
    private SpannableStringBuilder m7706f(boolean z, Merchandise merchandise) {
        int color;
        if (this.f5038m && TEnum.equals(merchandise.category, "oDiamond") && g6a.m15592o()) {
            color = getResources().getColor(b1c0.L);
        } else {
            color = this.f5038m ? Color.parseColor("#88000000") : m7716l(merchandise);
        }
        if (z) {
            color = this.f5035j;
        }
        String str = merchandise.quantityName() + "卡";
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        CustomTypefaceSpan customTypefaceSpan = new CustomTypefaceSpan("sans-serif", eqh0.c(3), color, t100.q);
        customTypefaceSpan.b(0);
        spannableStringBuilder.setSpan(customTypefaceSpan, 0, str.length(), 33);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: p */
    private void m7707p(d.a aVar, boolean z) {
        if (aVar == null) {
            return;
        }
        VText vText = this.f5028c;
        boolean z2 = false;
        if (z) {
            vText.setScaleX(1.0714f);
            this.f5028c.setScaleY(1.0714f);
            this.f5029d.setTypeface(eqh0.c(3));
            this.f5030e.setTypeface(eqh0.c(3));
            boolean z3 = this.f5032g;
            VText_AutoFit vText_AutoFit = this.f5029d;
            if (z3) {
                vText_AutoFit.setScaleX(1.2143f);
                this.f5029d.setScaleY(1.2143f);
            } else {
                vText_AutoFit.setScaleX(1.0714f);
                this.f5029d.setScaleY(1.0714f);
            }
            if (this.f5038m && TEnum.equals(aVar.s().category, "oDiamond") && g6a.m15592o()) {
                this.f5029d.setTextColor(getResources().getColor(b1c0.N));
                this.f5030e.setTextColor(getResources().getColor(b1c0.N));
            } else {
                this.f5029d.setTextColor(this.f5035j);
                this.f5030e.setTextColor(this.f5035j);
            }
            this.f5030e.setScaleX(1.0625f);
            this.f5030e.setScaleY(1.0625f);
        } else {
            vText.setScaleX(1.0f);
            this.f5028c.setScaleY(1.0f);
            this.f5029d.setTypeface(eqh0.c(3), 0);
            if (this.f5032g || this.f5034i) {
                this.f5029d.setTextColor(this.f5035j);
            } else {
                this.f5029d.setTextColor(m7716l(aVar.s()));
            }
            this.f5029d.setScaleX(1.0f);
            this.f5029d.setScaleY(1.0f);
            this.f5030e.setTextColor(m7716l(aVar.s()));
            this.f5030e.setScaleX(1.0f);
            this.f5030e.setScaleY(1.0f);
            this.f5030e.setTypeface(eqh0.c(2), 0);
        }
        this.f5027b.setBackgroundResource(m7715k(z, aVar.s()));
        if (this.f5032g || this.f5034i || ((z && !TextUtils.isEmpty(aVar.r())) || (aVar.H() && !TextUtils.isEmpty(aVar.r())))) {
            z2 = true;
        }
        xdl0.M(this.f5031f, z2);
        this.f5031f.setBackgroundResource(m7712h(aVar, z));
        this.f5031f.setTextColor(m7713i(aVar, z));
        this.f5031f.setText(aVar.r());
        if (this.f5034i && aVar.s().isBelongPromotion("lowPrice3Month")) {
            this.f5028c.setText(m7709d(z, this.f5035j));
        } else if (p2b0.h().z() && aVar.s().noneRenewable()) {
            this.f5028c.setText(m7706f(z, aVar.s()));
        } else {
            this.f5028c.setText(z ? this.f5036k : this.f5037l);
        }
        this.f5029d.setText(aVar.z());
        boolean z4 = this.f5034i;
        VText_AutoFit vText_AutoFit2 = this.f5030e;
        if (z4) {
            vText_AutoFit2.setText(m7710e(aVar.g()));
        } else {
            vText_AutoFit2.setText(aVar.g());
        }
        if (!this.f5032g || this.f5033h) {
            this.f5030e.getPaint().setFlags(1);
        } else {
            this.f5030e.getPaint().setFlags(17);
        }
    }

    @Override // com.p000p1.mobile.putong.core.p004ui.purchase.showcase.AbsPurchaseSectionView
    /* JADX INFO: renamed from: a */
    public void mo7659a(boolean z, boolean z2, d.a aVar) {
        m7717m(aVar, z2);
        m7719o(aVar);
        m7707p(aVar, z);
    }

    /* JADX INFO: renamed from: c */
    public final void m7708c(View view) {
        iv40.a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final SpannableStringBuilder m7709d(boolean z, int i) {
        if (!z) {
            i = getResources().getColor(b1c0.i);
        }
        int iD = t100.d(13.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("前3月");
        int length = spannableStringBuilder.length();
        CustomTypefaceSpan customTypefaceSpan = new CustomTypefaceSpan("sans-serif", z ? eqh0.c(3) : eqh0.c(2), i, t100.s);
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(iD), 0, 1, 33);
        spannableStringBuilder.setSpan(new StyleSpan(z ? 1 : 0), 0, 1, 33);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(i), 0, 1, 33);
        spannableStringBuilder.setSpan(customTypefaceSpan, 1, 2, 33);
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(iD), 2, length, 33);
        spannableStringBuilder.setSpan(new StyleSpan(z ? 1 : 0), 2, length, 33);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(i), 2, length, 33);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: e */
    public final CharSequence m7710e(String str) {
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
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(t100.f(16)), 0, i, 33);
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(t100.f(10)), i, length, 33);
        spannableStringBuilder.setSpan(new StrikethroughSpan(), length, length2, 33);
        spannableStringBuilder.setSpan(new CustomTypefaceSpan("sans-serif", eqh0.c(2), getResources().getColor(b1c0.k), t100.f(12)), length, length2, 33);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: g */
    public final SpannableStringBuilder m7711g(boolean z, int i, String str, int i2, Merchandise merchandise) {
        int iM7716l;
        if (this.f5038m && TEnum.equals(merchandise.category, "oDiamond") && g6a.m15592o()) {
            iM7716l = getResources().getColor(b1c0.L);
        } else if (this.f5038m) {
            iM7716l = p2b0.h().z() ? Color.parseColor("#88000000") : getResources().getColor(b1c0.W);
        } else {
            iM7716l = m7716l(merchandise);
        }
        if (!z) {
            i2 = iM7716l;
        }
        String strValueOf = String.valueOf(i);
        Typeface typefaceC = z ? eqh0.c(3) : eqh0.c(2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strValueOf + str);
        CustomTypefaceSpan customTypefaceSpan = new CustomTypefaceSpan("sans-serif", typefaceC, i2, t100.s);
        customTypefaceSpan.b(0);
        spannableStringBuilder.setSpan(customTypefaceSpan, 0, strValueOf.length(), 33);
        spannableStringBuilder.setSpan(new CustomTypefaceSpan("sans-serif", eqh0.c(2), i2, t100.d(13.0f)), strValueOf.length(), strValueOf.length() + str.length(), 33);
        return spannableStringBuilder;
    }

    @Override // com.p000p1.mobile.putong.core.p004ui.purchase.showcase.AnimBorderSectionView
    public List<View> getAnimBackgroundList() {
        return vwb.f0(new View[]{this.f5027b, this.f5031f});
    }

    @DrawableRes
    /* JADX INFO: renamed from: h */
    public int m7712h(d.a aVar, boolean z) {
        if (!aVar.H() || z) {
            if (this.f5038m) {
                return (g6a.m15592o() && TEnum.equals(aVar.s().category, "oDiamond")) ? d3c0.H5 : d3c0.h5;
            }
            return d3c0.W4;
        }
        if (this.f5038m) {
            return (g6a.m15592o() && TEnum.equals(aVar.s().category, "oDiamond")) ? d3c0.I5 : d3c0.i5;
        }
        return d3c0.X4;
    }

    @ColorInt
    /* JADX INFO: renamed from: i */
    public int m7713i(d.a aVar, boolean z) {
        if (aVar.H() && !z) {
            if (this.f5038m) {
                return (g6a.m15592o() && TEnum.equals(aVar.s().category, "oDiamond")) ? getResources().getColor(b1c0.M) : Color.parseColor("#808C5B1A");
            }
            return Color.parseColor("#CC000000");
        }
        if (!this.f5038m) {
            return getResources().getColor(b1c0.b0);
        }
        if (g6a.m15592o() && TEnum.equals(aVar.s().category, "oDiamond")) {
            return Color.parseColor("#261406");
        }
        return -1;
    }

    @ColorInt
    /* JADX INFO: renamed from: j */
    public int m7714j(Merchandise merchandise) {
        if (this.f5038m) {
            return (g6a.m15592o() && TEnum.equals(merchandise.category, "oDiamond")) ? getResources().getColor(b1c0.P) : Color.parseColor("#8C5B1A");
        }
        return Color.parseColor("#ffffdea2");
    }

    @DrawableRes
    /* JADX INFO: renamed from: k */
    public int m7715k(boolean z, Merchandise merchandise) {
        if (this.f5039n) {
            return z ? d3c0.f7 : d3c0.g7;
        }
        if (!this.f5038m) {
            return z ? d3c0.U4 : d3c0.V4;
        }
        if (TEnum.equals(merchandise.category, "oDiamond") && g6a.m15592o()) {
            return z ? d3c0.F5 : d3c0.G5;
        }
        return z ? d3c0.f5 : d3c0.g5;
    }

    @ColorInt
    /* JADX INFO: renamed from: l */
    public int m7716l(Merchandise merchandise) {
        if (this.f5038m) {
            return (g6a.m15592o() && TEnum.equals(merchandise.category, "oDiamond")) ? getResources().getColor(b1c0.K) : Color.parseColor("#66000000");
        }
        return Color.parseColor("#66ffdea2");
    }

    /* JADX INFO: renamed from: m */
    public final void m7717m(d.a aVar, boolean z) {
        if (NullChecker.a(aVar)) {
            n5c n5cVarI = aVar.i();
            if (n5cVarI instanceof uc40) {
                uc40 uc40Var = (uc40) n5cVarI;
                this.f5032g = uc40Var.m25173a();
                this.f5033h = uc40Var.m25174b();
            }
            this.f5034i = z && !TextUtils.isEmpty(aVar.r()) && this.f5033h;
            this.f5035j = m7714j(aVar.s());
            this.f5036k = m7711g(true, aVar.w(), aVar.x(), this.f5035j, aVar.s());
            this.f5037l = m7711g(false, aVar.w(), aVar.x(), this.f5035j, aVar.s());
        }
    }

    /* JADX INFO: renamed from: n */
    public void m7718n(boolean z) {
        this.f5039n = z;
    }

    /* JADX INFO: renamed from: o */
    public final void m7719o(d.a aVar) {
        if (NullChecker.a(aVar)) {
            if (aVar.C() || !aVar.E()) {
                this.f5029d.setText(aVar.z());
            } else {
                this.f5029d.setText(aVar.u());
            }
            boolean z = this.f5034i;
            VText_AutoFit vText_AutoFit = this.f5030e;
            if (z) {
                vText_AutoFit.setText(m7710e(aVar.g()));
            } else {
                vText_AutoFit.setText(aVar.g());
            }
            if (!this.f5032g || this.f5033h) {
                this.f5030e.getPaint().setFlags(1);
            } else {
                this.f5030e.getPaint().setFlags(17);
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7708c(this);
    }

    public void setInVipFrag(boolean z) {
        this.f5038m = z;
    }

    public ODiamondAllPriceSectionView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5032g = false;
        this.f5033h = false;
        this.f5034i = false;
        this.f5038m = false;
        this.f5039n = false;
    }
}
