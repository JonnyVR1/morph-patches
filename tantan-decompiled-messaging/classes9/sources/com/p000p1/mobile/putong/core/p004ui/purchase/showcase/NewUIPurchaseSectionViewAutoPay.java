package com.p000p1.mobile.putong.core.p004ui.purchase.showcase;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.core.ui.purchase.d;
import java.util.List;
import l.b1c0;
import l.d3c0;
import l.eqh0;
import l.t100;
import l.tc40;
import l.vwb;
import v.VText;
import v.VText_AutoFit;
import v.text.CustomTypefaceSpan;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class NewUIPurchaseSectionViewAutoPay extends AnimBorderSectionView {

    /* JADX INFO: renamed from: b */
    public LinearLayout f4983b;

    /* JADX INFO: renamed from: c */
    public VText f4984c;

    /* JADX INFO: renamed from: d */
    public VText_AutoFit f4985d;

    /* JADX INFO: renamed from: e */
    public VText_AutoFit f4986e;

    /* JADX INFO: renamed from: f */
    public SpannableStringBuilder f4987f;

    /* JADX INFO: renamed from: g */
    public SpannableStringBuilder f4988g;

    public NewUIPurchaseSectionViewAutoPay(@NonNull Context context) {
        super(context);
    }

    @Override // com.p000p1.mobile.putong.core.p004ui.purchase.showcase.AbsPurchaseSectionView
    /* JADX INFO: renamed from: a */
    public void mo7659a(boolean z, boolean z2, d.a aVar) {
        int iM7672f = m7672f(aVar.f().toString(), z);
        VText vText = this.f4984c;
        if (z) {
            vText.setScaleX(1.0714f);
            this.f4984c.setScaleY(1.0714f);
            this.f4985d.setTextColor(iM7672f);
            this.f4985d.setScaleX(1.0714f);
            this.f4985d.setScaleY(1.0714f);
            this.f4986e.setTextColor(iM7672f);
            this.f4986e.setScaleX(1.0625f);
            this.f4986e.setScaleY(1.0625f);
            this.f4985d.setTypeface(eqh0.c(2), 0);
            this.f4986e.setTypeface(eqh0.c(3), 1);
        } else {
            vText.setScaleX(1.0f);
            this.f4984c.setScaleY(1.0f);
            this.f4985d.setTextColor(getResources().getColor(b1c0.S));
            this.f4985d.setScaleX(1.0f);
            this.f4985d.setScaleY(1.0f);
            this.f4985d.setTypeface(eqh0.c(2));
            this.f4986e.setTextColor(iM7672f);
            this.f4986e.setScaleX(1.0f);
            this.f4986e.setScaleY(1.0f);
            this.f4986e.setTypeface(eqh0.c(2));
        }
        this.f4983b.setBackgroundResource(m7673g(aVar, z));
        this.f4984c.setText(m7671e(z, String.valueOf(aVar.w()), aVar.x(), iM7672f));
        this.f4985d.setText(aVar.z());
        this.f4986e.setText(aVar.g());
    }

    /* JADX INFO: renamed from: c */
    public final void m7669c(View view) {
        tc40.a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final SpannableStringBuilder m7670d(boolean z, String str, String str2, int i) {
        if (!z) {
            i = getResources().getColor(b1c0.p);
        }
        Typeface typefaceC = z ? eqh0.c(3) : eqh0.c(2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str + str2);
        CustomTypefaceSpan customTypefaceSpan = new CustomTypefaceSpan("sans-serif", typefaceC, i, t100.s);
        customTypefaceSpan.b(0);
        spannableStringBuilder.setSpan(customTypefaceSpan, 0, str.length(), 33);
        spannableStringBuilder.setSpan(new CustomTypefaceSpan("sans-serif", eqh0.c(2), i, t100.d(13.0f)), str.length(), str.length() + str2.length(), 33);
        return spannableStringBuilder;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0045  */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX INFO: renamed from: e */
    public final SpannableStringBuilder m7671e(boolean z, String str, String str2, int i) {
        if (z) {
            SpannableStringBuilder spannableStringBuilder = this.f4987f;
            if (spannableStringBuilder != null) {
                if (!spannableStringBuilder.toString().equals(str + str2)) {
                    this.f4987f = m7670d(z, str, str2, i);
                }
            } else {
                this.f4987f = m7670d(z, str, str2, i);
            }
            return this.f4987f;
        }
        SpannableStringBuilder spannableStringBuilder2 = this.f4988g;
        if (spannableStringBuilder2 != null) {
            if (!spannableStringBuilder2.toString().equals(str + str2)) {
                this.f4988g = m7670d(z, str, str2, i);
            }
        } else {
            this.f4988g = m7670d(z, str, str2, i);
        }
        return this.f4988g;
    }

    @ColorInt
    /* JADX INFO: renamed from: f */
    public int m7672f(String str, boolean z) {
        str.getClass();
        switch (str) {
            case "superLikeMembership":
            case "tttVip":
            case "unlimitedSwipes":
            case "roaming":
            case "undoMembership":
                return getResources().getColor(b1c0.V);
            case "svipPicksMembership":
            case "svip":
            case "picksMembership":
                return getResources().getColor(b1c0.U);
            default:
                return getResources().getColor(b1c0.D);
        }
    }

    @DrawableRes
    /* JADX INFO: renamed from: g */
    public int m7673g(d.a aVar, boolean z) {
        String string = aVar.f().toString();
        string.getClass();
        switch (string) {
            case "superLikeMembership":
            case "tttVip":
            case "unlimitedSwipes":
            case "roaming":
            case "undoMembership":
                if (z && aVar.H()) {
                    return d3c0.U3;
                }
                return aVar.H() ? d3c0.P3 : d3c0.L3;
            case "svipPicksMembership":
            case "svip":
            case "picksMembership":
                if (z && aVar.H()) {
                    return d3c0.S3;
                }
                return aVar.H() ? d3c0.P3 : d3c0.J3;
            default:
                return 0;
        }
    }

    @Override // com.p000p1.mobile.putong.core.p004ui.purchase.showcase.AnimBorderSectionView
    public List<View> getAnimBackgroundList() {
        return vwb.f0(new View[]{this.f4983b});
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7669c(this);
    }

    public NewUIPurchaseSectionViewAutoPay(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
