package com.p051p1.mobile.putong.core.p058ui.purchase.showcase;

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
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import java.util.List;
import p151v.VText;
import p151v.VText_AutoFit;
import p151v.text.CustomTypefaceSpan;
import p153l.h9c0;
import p153l.hl40;
import p153l.jbc0;
import p153l.jyb;
import p153l.lyh0;
import p153l.qa00;

/* JADX INFO: loaded from: classes12.dex */
public class NewUIPurchaseSectionViewAutoPay extends AnimBorderSectionView {

    /* JADX INFO: renamed from: b */
    public LinearLayout f36050b;

    /* JADX INFO: renamed from: c */
    public VText f36051c;

    /* JADX INFO: renamed from: d */
    public VText_AutoFit f36052d;

    /* JADX INFO: renamed from: e */
    public VText_AutoFit f36053e;

    /* JADX INFO: renamed from: f */
    public SpannableStringBuilder f36054f;

    /* JADX INFO: renamed from: g */
    public SpannableStringBuilder f36055g;

    public NewUIPurchaseSectionViewAutoPay(@NonNull Context context) {
        super(context);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.purchase.showcase.AbsPurchaseSectionView
    /* JADX INFO: renamed from: a */
    public void mo55507a(boolean z, boolean z2, C8928d.a aVar) {
        int iM55520f = m55520f(aVar.m54762f().toString(), z);
        VText vText = this.f36051c;
        if (z) {
            vText.setScaleX(1.0714f);
            this.f36051c.setScaleY(1.0714f);
            this.f36052d.setTextColor(iM55520f);
            this.f36052d.setScaleX(1.0714f);
            this.f36052d.setScaleY(1.0714f);
            this.f36053e.setTextColor(iM55520f);
            this.f36053e.setScaleX(1.0625f);
            this.f36053e.setScaleY(1.0625f);
            this.f36052d.setTypeface(lyh0.m156283c(2), 0);
            this.f36053e.setTypeface(lyh0.m156283c(3), 1);
        } else {
            vText.setScaleX(1.0f);
            this.f36051c.setScaleY(1.0f);
            this.f36052d.setTextColor(getResources().getColor(h9c0.f108349S));
            this.f36052d.setScaleX(1.0f);
            this.f36052d.setScaleY(1.0f);
            this.f36052d.setTypeface(lyh0.m156283c(2));
            this.f36053e.setTextColor(iM55520f);
            this.f36053e.setScaleX(1.0f);
            this.f36053e.setScaleY(1.0f);
            this.f36053e.setTypeface(lyh0.m156283c(2));
        }
        this.f36050b.setBackgroundResource(m55521g(aVar, z));
        this.f36051c.setText(m55519e(z, String.valueOf(aVar.m54788w()), aVar.m54789x(), iM55520f));
        this.f36052d.setText(aVar.m54791z());
        this.f36053e.setText(aVar.m54764g());
    }

    /* JADX INFO: renamed from: c */
    public final void m55517c(View view) {
        hl40.m135693a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final SpannableStringBuilder m55518d(boolean z, String str, String str2, int i) {
        if (!z) {
            i = getResources().getColor(h9c0.f108387p);
        }
        Typeface typefaceM156283c = z ? lyh0.m156283c(3) : lyh0.m156283c(2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str + str2);
        CustomTypefaceSpan customTypefaceSpan = new CustomTypefaceSpan("sans-serif", typefaceM156283c, i, qa00.f156332s);
        customTypefaceSpan.m225031b(0);
        spannableStringBuilder.setSpan(customTypefaceSpan, 0, str.length(), 33);
        spannableStringBuilder.setSpan(new CustomTypefaceSpan("sans-serif", lyh0.m156283c(2), i, qa00.m175859d(13.0f)), str.length(), str.length() + str2.length(), 33);
        return spannableStringBuilder;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0045  */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX INFO: renamed from: e */
    public final SpannableStringBuilder m55519e(boolean z, String str, String str2, int i) {
        if (z) {
            SpannableStringBuilder spannableStringBuilder = this.f36054f;
            if (spannableStringBuilder != null) {
                if (!spannableStringBuilder.toString().equals(str + str2)) {
                    this.f36054f = m55518d(z, str, str2, i);
                }
            } else {
                this.f36054f = m55518d(z, str, str2, i);
            }
            return this.f36054f;
        }
        SpannableStringBuilder spannableStringBuilder2 = this.f36055g;
        if (spannableStringBuilder2 != null) {
            if (!spannableStringBuilder2.toString().equals(str + str2)) {
                this.f36055g = m55518d(z, str, str2, i);
            }
        } else {
            this.f36055g = m55518d(z, str, str2, i);
        }
        return this.f36055g;
    }

    @ColorInt
    /* JADX INFO: renamed from: f */
    public int m55520f(String str, boolean z) {
        str.getClass();
        switch (str) {
            case "superLikeMembership":
            case "tttVip":
            case "unlimitedSwipes":
            case "roaming":
            case "undoMembership":
                return getResources().getColor(h9c0.f108352V);
            case "svipPicksMembership":
            case "svip":
            case "picksMembership":
                return getResources().getColor(h9c0.f108351U);
            default:
                return getResources().getColor(h9c0.f108334D);
        }
    }

    @DrawableRes
    /* JADX INFO: renamed from: g */
    public int m55521g(C8928d.a aVar, boolean z) {
        String string = aVar.m54762f().toString();
        string.getClass();
        switch (string) {
            case "superLikeMembership":
            case "tttVip":
            case "unlimitedSwipes":
            case "roaming":
            case "undoMembership":
                if (z && aVar.m54735H()) {
                    return jbc0.f119422U3;
                }
                return aVar.m54735H() ? jbc0.f119356P3 : jbc0.f119300L3;
            case "svipPicksMembership":
            case "svip":
            case "picksMembership":
                if (z && aVar.m54735H()) {
                    return jbc0.f119396S3;
                }
                return aVar.m54735H() ? jbc0.f119356P3 : jbc0.f119272J3;
            default:
                return 0;
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.purchase.showcase.AnimBorderSectionView
    public List<View> getAnimBackgroundList() {
        return jyb.m147507f0(this.f36050b);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m55517c(this);
    }

    public NewUIPurchaseSectionViewAutoPay(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
