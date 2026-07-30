package com.p046p1.mobile.putong.core.p053ui.purchase.showcase;

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
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.MonetizationPromotionsId;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VText;
import p147v.VText_AutoFit;
import p147v.text.CustomTypefaceSpan;
import p149l.b1c0;
import p149l.d3c0;
import p149l.eqh0;
import p149l.g6a;
import p149l.iv40;
import p149l.n5c;
import p149l.p2b0;
import p149l.t100;
import p149l.uc40;
import p149l.vwb;
import p149l.xdl0;

/* JADX INFO: loaded from: classes9.dex */
public class ODiamondAllPriceSectionView extends AnimBorderSectionView {

    /* JADX INFO: renamed from: b */
    public LinearLayout f35246b;

    /* JADX INFO: renamed from: c */
    public VText f35247c;

    /* JADX INFO: renamed from: d */
    public VText_AutoFit f35248d;

    /* JADX INFO: renamed from: e */
    public VText_AutoFit f35249e;

    /* JADX INFO: renamed from: f */
    public VText f35250f;

    /* JADX INFO: renamed from: g */
    public boolean f35251g;

    /* JADX INFO: renamed from: h */
    public boolean f35252h;

    /* JADX INFO: renamed from: i */
    public boolean f35253i;

    /* JADX INFO: renamed from: j */
    public int f35254j;

    /* JADX INFO: renamed from: k */
    public SpannableStringBuilder f35255k;

    /* JADX INFO: renamed from: l */
    public SpannableStringBuilder f35256l;

    /* JADX INFO: renamed from: m */
    public boolean f35257m;

    /* JADX INFO: renamed from: n */
    public boolean f35258n;

    public ODiamondAllPriceSectionView(@NonNull Context context) {
        super(context);
        this.f35251g = false;
        this.f35252h = false;
        this.f35253i = false;
        this.f35257m = false;
        this.f35258n = false;
    }

    /* JADX INFO: renamed from: f */
    private SpannableStringBuilder m54371f(boolean z, Merchandise merchandise) {
        int color;
        if (this.f35257m && TEnum.equals(merchandise.category, "oDiamond") && g6a.m124566o()) {
            color = getResources().getColor(b1c0.f72522L);
        } else {
            color = this.f35257m ? Color.parseColor("#88000000") : m54381l(merchandise);
        }
        if (z) {
            color = this.f35254j;
        }
        String str = merchandise.quantityName() + "卡";
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        CustomTypefaceSpan customTypefaceSpan = new CustomTypefaceSpan("sans-serif", eqh0.m117752c(3), color, t100.f167268q);
        customTypefaceSpan.m223785b(0);
        spannableStringBuilder.setSpan(customTypefaceSpan, 0, str.length(), 33);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: p */
    private void m54372p(C8765d.a aVar, boolean z) {
        if (aVar == null) {
            return;
        }
        VText vText = this.f35247c;
        boolean z2 = false;
        if (z) {
            vText.setScaleX(1.0714f);
            this.f35247c.setScaleY(1.0714f);
            this.f35248d.setTypeface(eqh0.m117752c(3));
            this.f35249e.setTypeface(eqh0.m117752c(3));
            boolean z3 = this.f35251g;
            VText_AutoFit vText_AutoFit = this.f35248d;
            if (z3) {
                vText_AutoFit.setScaleX(1.2143f);
                this.f35248d.setScaleY(1.2143f);
            } else {
                vText_AutoFit.setScaleX(1.0714f);
                this.f35248d.setScaleY(1.0714f);
            }
            if (this.f35257m && TEnum.equals(aVar.m53601s().category, "oDiamond") && g6a.m124566o()) {
                this.f35248d.setTextColor(getResources().getColor(b1c0.f72524N));
                this.f35249e.setTextColor(getResources().getColor(b1c0.f72524N));
            } else {
                this.f35248d.setTextColor(this.f35254j);
                this.f35249e.setTextColor(this.f35254j);
            }
            this.f35249e.setScaleX(1.0625f);
            this.f35249e.setScaleY(1.0625f);
        } else {
            vText.setScaleX(1.0f);
            this.f35247c.setScaleY(1.0f);
            this.f35248d.setTypeface(eqh0.m117752c(3), 0);
            if (this.f35251g || this.f35253i) {
                this.f35248d.setTextColor(this.f35254j);
            } else {
                this.f35248d.setTextColor(m54381l(aVar.m53601s()));
            }
            this.f35248d.setScaleX(1.0f);
            this.f35248d.setScaleY(1.0f);
            this.f35249e.setTextColor(m54381l(aVar.m53601s()));
            this.f35249e.setScaleX(1.0f);
            this.f35249e.setScaleY(1.0f);
            this.f35249e.setTypeface(eqh0.m117752c(2), 0);
        }
        this.f35246b.setBackgroundResource(m54380k(z, aVar.m53601s()));
        if (this.f35251g || this.f35253i || ((z && !TextUtils.isEmpty(aVar.m53600r())) || (aVar.m53552H() && !TextUtils.isEmpty(aVar.m53600r())))) {
            z2 = true;
        }
        xdl0.m208344M(this.f35250f, z2);
        this.f35250f.setBackgroundResource(m54377h(aVar, z));
        this.f35250f.setTextColor(m54378i(aVar, z));
        this.f35250f.setText(aVar.m53600r());
        if (this.f35253i && aVar.m53601s().isBelongPromotion(MonetizationPromotionsId.lowPrice3Month)) {
            this.f35247c.setText(m54374d(z, this.f35254j));
        } else if (p2b0.m167133h().m167157z() && aVar.m53601s().noneRenewable()) {
            this.f35247c.setText(m54371f(z, aVar.m53601s()));
        } else {
            this.f35247c.setText(z ? this.f35255k : this.f35256l);
        }
        this.f35248d.setText(aVar.m53608z());
        boolean z4 = this.f35253i;
        VText_AutoFit vText_AutoFit2 = this.f35249e;
        if (z4) {
            vText_AutoFit2.setText(m54375e(aVar.m53581g()));
        } else {
            vText_AutoFit2.setText(aVar.m53581g());
        }
        if (!this.f35251g || this.f35252h) {
            this.f35249e.getPaint().setFlags(1);
        } else {
            this.f35249e.getPaint().setFlags(17);
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.purchase.showcase.AbsPurchaseSectionView
    /* JADX INFO: renamed from: a */
    public void mo54324a(boolean z, boolean z2, C8765d.a aVar) {
        m54382m(aVar, z2);
        m54384o(aVar);
        m54372p(aVar, z);
    }

    /* JADX INFO: renamed from: c */
    public final void m54373c(View view) {
        iv40.m138508a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final SpannableStringBuilder m54374d(boolean z, int i) {
        if (!z) {
            i = getResources().getColor(b1c0.f72553i);
        }
        int iM186890d = t100.m186890d(13.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("前3月");
        int length = spannableStringBuilder.length();
        CustomTypefaceSpan customTypefaceSpan = new CustomTypefaceSpan("sans-serif", z ? eqh0.m117752c(3) : eqh0.m117752c(2), i, t100.f167270s);
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(iM186890d), 0, 1, 33);
        spannableStringBuilder.setSpan(new StyleSpan(z ? 1 : 0), 0, 1, 33);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(i), 0, 1, 33);
        spannableStringBuilder.setSpan(customTypefaceSpan, 1, 2, 33);
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(iM186890d), 2, length, 33);
        spannableStringBuilder.setSpan(new StyleSpan(z ? 1 : 0), 2, length, 33);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(i), 2, length, 33);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: e */
    public final CharSequence m54375e(String str) {
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
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(t100.m186892f(16)), 0, i, 33);
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(t100.m186892f(10)), i, length, 33);
        spannableStringBuilder.setSpan(new StrikethroughSpan(), length, length2, 33);
        spannableStringBuilder.setSpan(new CustomTypefaceSpan("sans-serif", eqh0.m117752c(2), getResources().getColor(b1c0.f72557k), t100.m186892f(12)), length, length2, 33);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: g */
    public final SpannableStringBuilder m54376g(boolean z, int i, String str, int i2, Merchandise merchandise) {
        int iM54381l;
        if (this.f35257m && TEnum.equals(merchandise.category, "oDiamond") && g6a.m124566o()) {
            iM54381l = getResources().getColor(b1c0.f72522L);
        } else if (this.f35257m) {
            iM54381l = p2b0.m167133h().m167157z() ? Color.parseColor("#88000000") : getResources().getColor(b1c0.f72533W);
        } else {
            iM54381l = m54381l(merchandise);
        }
        if (!z) {
            i2 = iM54381l;
        }
        String strValueOf = String.valueOf(i);
        Typeface typefaceM117752c = z ? eqh0.m117752c(3) : eqh0.m117752c(2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strValueOf + str);
        CustomTypefaceSpan customTypefaceSpan = new CustomTypefaceSpan("sans-serif", typefaceM117752c, i2, t100.f167270s);
        customTypefaceSpan.m223785b(0);
        spannableStringBuilder.setSpan(customTypefaceSpan, 0, strValueOf.length(), 33);
        spannableStringBuilder.setSpan(new CustomTypefaceSpan("sans-serif", eqh0.m117752c(2), i2, t100.m186890d(13.0f)), strValueOf.length(), strValueOf.length() + str.length(), 33);
        return spannableStringBuilder;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.purchase.showcase.AnimBorderSectionView
    public List<View> getAnimBackgroundList() {
        return vwb.m200324f0(this.f35246b, this.f35250f);
    }

    @DrawableRes
    /* JADX INFO: renamed from: h */
    public int m54377h(C8765d.a aVar, boolean z) {
        if (!aVar.m53552H() || z) {
            if (this.f35257m) {
                return (g6a.m124566o() && TEnum.equals(aVar.m53601s().category, "oDiamond")) ? d3c0.f83591H5 : d3c0.f83945h5;
            }
            return d3c0.f83794W4;
        }
        if (this.f35257m) {
            return (g6a.m124566o() && TEnum.equals(aVar.m53601s().category, "oDiamond")) ? d3c0.f83605I5 : d3c0.f83959i5;
        }
        return d3c0.f83807X4;
    }

    @ColorInt
    /* JADX INFO: renamed from: i */
    public int m54378i(C8765d.a aVar, boolean z) {
        if (aVar.m53552H() && !z) {
            if (this.f35257m) {
                return (g6a.m124566o() && TEnum.equals(aVar.m53601s().category, "oDiamond")) ? getResources().getColor(b1c0.f72523M) : Color.parseColor("#808C5B1A");
            }
            return Color.parseColor("#CC000000");
        }
        if (!this.f35257m) {
            return getResources().getColor(b1c0.f72540b0);
        }
        if (g6a.m124566o() && TEnum.equals(aVar.m53601s().category, "oDiamond")) {
            return Color.parseColor("#261406");
        }
        return -1;
    }

    @ColorInt
    /* JADX INFO: renamed from: j */
    public int m54379j(Merchandise merchandise) {
        if (this.f35257m) {
            return (g6a.m124566o() && TEnum.equals(merchandise.category, "oDiamond")) ? getResources().getColor(b1c0.f72526P) : Color.parseColor("#8C5B1A");
        }
        return Color.parseColor("#ffffdea2");
    }

    @DrawableRes
    /* JADX INFO: renamed from: k */
    public int m54380k(boolean z, Merchandise merchandise) {
        if (this.f35258n) {
            return z ? d3c0.f83919f7 : d3c0.f83933g7;
        }
        if (!this.f35257m) {
            return z ? d3c0.f83768U4 : d3c0.f83781V4;
        }
        if (TEnum.equals(merchandise.category, "oDiamond") && g6a.m124566o()) {
            return z ? d3c0.f83563F5 : d3c0.f83577G5;
        }
        return z ? d3c0.f83917f5 : d3c0.f83931g5;
    }

    @ColorInt
    /* JADX INFO: renamed from: l */
    public int m54381l(Merchandise merchandise) {
        if (this.f35257m) {
            return (g6a.m124566o() && TEnum.equals(merchandise.category, "oDiamond")) ? getResources().getColor(b1c0.f72521K) : Color.parseColor("#66000000");
        }
        return Color.parseColor("#66ffdea2");
    }

    /* JADX INFO: renamed from: m */
    public final void m54382m(C8765d.a aVar, boolean z) {
        if (NullChecker.m81303a(aVar)) {
            n5c n5cVarM53585i = aVar.m53585i();
            if (n5cVarM53585i instanceof uc40) {
                uc40 uc40Var = (uc40) n5cVarM53585i;
                this.f35251g = uc40Var.m192991a();
                this.f35252h = uc40Var.m192992b();
            }
            this.f35253i = z && !TextUtils.isEmpty(aVar.m53600r()) && this.f35252h;
            this.f35254j = m54379j(aVar.m53601s());
            this.f35255k = m54376g(true, aVar.m53605w(), aVar.m53606x(), this.f35254j, aVar.m53601s());
            this.f35256l = m54376g(false, aVar.m53605w(), aVar.m53606x(), this.f35254j, aVar.m53601s());
        }
    }

    /* JADX INFO: renamed from: n */
    public void m54383n(boolean z) {
        this.f35258n = z;
    }

    /* JADX INFO: renamed from: o */
    public final void m54384o(C8765d.a aVar) {
        if (NullChecker.m81303a(aVar)) {
            if (aVar.m53547C() || !aVar.m53549E()) {
                this.f35248d.setText(aVar.m53608z());
            } else {
                this.f35248d.setText(aVar.m53603u());
            }
            boolean z = this.f35253i;
            VText_AutoFit vText_AutoFit = this.f35249e;
            if (z) {
                vText_AutoFit.setText(m54375e(aVar.m53581g()));
            } else {
                vText_AutoFit.setText(aVar.m53581g());
            }
            if (!this.f35251g || this.f35252h) {
                this.f35249e.getPaint().setFlags(1);
            } else {
                this.f35249e.getPaint().setFlags(17);
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m54373c(this);
    }

    public void setInVipFrag(boolean z) {
        this.f35257m = z;
    }

    public ODiamondAllPriceSectionView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f35251g = false;
        this.f35252h = false;
        this.f35253i = false;
        this.f35257m = false;
        this.f35258n = false;
    }
}
